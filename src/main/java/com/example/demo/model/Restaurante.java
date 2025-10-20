package com.example.demo.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Restaurantes")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private BigDecimal taxaFrete;
	
	@ManyToOne
	@JoinColumn(name = "cozinha_id", nullable = false )
	private Cozinha cozinha;
	
	@ManyToMany
	@JoinTable(name = "restaurante_forma_pagamento",
	    joinColumns = @JoinColumn(name = "restaurante_id"),
	    inverseJoinColumns = @JoinColumn(name = "forma_pagamento_id"))
	private List<FormaPagamento> formasPagamentos;
	
	public Long getId() {	return id;}
	public void setId(Long id) {	this.id = id;}
	public String getNome() {	return nome;}
	public void setNome(String nome) {	this.nome = nome;}
	public BigDecimal getTaxaFrete() {	return taxaFrete;}
	public void setTaxaFrete(BigDecimal taxaFrete) {	this.taxaFrete = taxaFrete;}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

	
	
	
}
