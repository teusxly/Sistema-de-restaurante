package com.example.demo.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String  nome;

	// Muitas cidades pertencem a um único estado
    @ManyToOne
    @JoinColumn(name = "estado_id")
	private Estado estado;

	public Long getId() {	return id;}
	public void setId(Long id) {	this.id = id;}
	public String getNome() {	return nome;}
	public void setNome(String nome) {	this.nome = nome;}
	
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
		Estado other = (Estado) obj;
		return Objects.equals(id, other.getId());
	}
	
	
	

}
