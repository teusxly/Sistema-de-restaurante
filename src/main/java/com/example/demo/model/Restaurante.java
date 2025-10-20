package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Restaurantes")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal taxaFrete;
	private boolean ativo;
	
	
	
	
	public Long getId() {	return id;}
	public void setId(Long id) {	this.id = id;}
	public String getNome() {	return nome;}
	public void setNome(String nome) {	this.nome = nome;}
	public BigDecimal getTaxaFrete() {	return taxaFrete;}
	public void setTaxaFrete(BigDecimal taxaFrete) {	this.taxaFrete = taxaFrete;}
	public boolean isAtivo() {	return ativo;}
	public void setAtivo(boolean ativo) {	this.ativo = ativo;}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ativo);
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
		return ativo == other.ativo;
	}
	
	
	
}
