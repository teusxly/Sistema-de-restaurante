package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cozinha;
import com.example.demo.service.CozinhaService;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

	private CozinhaService cozinhaService;

	public CozinhaController(CozinhaService cozinhaService) {
		this.cozinhaService = cozinhaService;
	}

	@GetMapping
	public List<Cozinha> cozinhas () {
		return cozinhaService.cozinhas();
	}
	
	@PostMapping
	public Cozinha adicionar(@RequestBody Cozinha u) {
		return cozinhaService.addCozinha(u);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Cozinha> atualizarCozinha (@PathVariable Long id ,@RequestBody Cozinha u) {
		return cozinhaService.atualizarCozinha(id, u);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deletarCozinha(@PathVariable  Long id) {
		return cozinhaService.deletarCozinha(id);
	}

}
