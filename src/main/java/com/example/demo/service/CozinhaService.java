package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Cozinha;
import com.example.demo.repository.CozinhaRepository;

import jakarta.validation.Valid;

@Service
public class CozinhaService {

	private CozinhaRepository cozinhaRepository;
	
	public CozinhaService(CozinhaRepository cozinhaRepository) {
		this.cozinhaRepository = cozinhaRepository;
	}
	
	public List<Cozinha> cozinhas () {
		return cozinhaRepository.findAll();
	}
	
	public Cozinha addCozinha(@Valid @RequestBody Cozinha cozinha) {
		return cozinhaRepository.save(cozinha);
	}
	
	public ResponseEntity<Cozinha> atualizarCozinha (@RequestParam Long id ,@RequestBody Cozinha u) {
		Optional<Cozinha>  cozinhaExistente = cozinhaRepository.findById(id);
		if(cozinhaExistente.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Cozinha cozinha = cozinhaExistente.get();
		cozinha.setNome(u.getNome());
		
		Cozinha atualizarCozinha = cozinhaRepository.save(cozinha);
		return ResponseEntity.ok(atualizarCozinha);
	}
	
	
	public ResponseEntity<Void> deletarCozinha (@PathVariable  Long id) {
		Optional<Cozinha>  cozinhaExistente = cozinhaRepository.findById(id);
		
		if(cozinhaExistente.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		 cozinhaRepository.delete(cozinhaExistente.get());
		 return ResponseEntity.noContent().build(); 
		 
	}
	
	
	
	
	
	
}
