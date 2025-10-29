package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurante;
import com.example.demo.service.RestauranteService;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

	private RestauranteService restauranteservice;

	public RestauranteController(RestauranteService restauranteservice) {
		this.restauranteservice = restauranteservice;
	}
	
	@GetMapping
	public List<Restaurante> listar () {
		return restauranteservice.listarRestaurantes();
	}
	
	@GetMapping("/{id}")
	public Restaurante buscarRestaurante(@PathVariable Long id) {
		return restauranteservice.buscarRestaurante(id);
	}
	
	@PostMapping
	public Restaurante criarRestaurante(@RequestBody Restaurante restaurante) {
		return restauranteservice.criarRestaurante(restaurante);
	}
	
	@DeleteMapping("/{id}")
	public  ResponseEntity<?> removerRestaurante(@PathVariable Long id) {
		return restauranteservice.removerRestaurante(id);
	}
	
	
}
