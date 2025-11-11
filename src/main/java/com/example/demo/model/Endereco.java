package com.example.demo.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	
	@OneToOne
	@JoinColumn(name = "restaurante_id")
	private Restaurante restaurante;
	
	public Endereco() {}
	
	
	public Long getId() {	return id;}
	public void setId(Long id) {	this.id = id;}
	public String getCep() {	return cep;}
	public void setCep(String cep) {	this.cep = cep;}
	public String getLogradouro() {	return logradouro;}
	public void setLogradouro(String logradouro) {	this.logradouro = logradouro;}
	public String getNumero() {	return numero;}
	public void setNumero(String numero) {	this.numero = numero;}
	public String getComplemento() {	return complemento;}
	public void setComplemento(String complemento) {	this.complemento = complemento;}
	public String getBairro() {	return bairro;}
	public void setBairro(String bairro) {	this.bairro = bairro;}


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
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
