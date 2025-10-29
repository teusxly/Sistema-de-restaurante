package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Cozinha;
import com.example.demo.model.Restaurante;
import com.example.demo.repository.CozinhaRepository;
import com.example.demo.repository.RestauranteRepository;



@Service
public class RestauranteService {
	
	private RestauranteRepository restauranteRepository;
	private CozinhaRepository cozinhaRepository;
	
	public RestauranteService(RestauranteRepository restauranteRepository, CozinhaRepository cozinhaRepository) {
		this.restauranteRepository = restauranteRepository;
		this.cozinhaRepository = cozinhaRepository;
	}
	
	
	public List<Restaurante> listarRestaurantes(){
		return restauranteRepository.findAll();
	}
	
	public Restaurante criarRestaurante(Restaurante restaurante) {
	    if (restaurante.getCozinha() != null && restaurante.getCozinha().getId() != null) {
	        Long cozinhaId = restaurante.getCozinha().getId();
	        Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
	            .orElseThrow(() -> new RuntimeException("Cozinha não encontrada com ID: " + cozinhaId));
	        restaurante.setCozinha(cozinha);
	    }
	    return restauranteRepository.save(restaurante);
	}
	
	
	public Restaurante buscarRestaurante(@PathVariable Long id) {
		return restauranteRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Restaurante não encontrado!"));
	}
	
	public ResponseEntity<?> removerRestaurante(@PathVariable Long id) {
		Optional<Restaurante> restauranteExistente = restauranteRepository.findById(id);
		
		if(restauranteExistente.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		restauranteRepository.delete(restauranteExistente.get());
		return ResponseEntity.noContent().build();
		
	}
	
}
