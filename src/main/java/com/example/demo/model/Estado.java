package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String  nome;

	 // Um estado tem várias cidades
    @OneToMany(mappedBy = "estado")
	private List<Cidade> cidades;
	
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
		return Objects.equals(id, other.id);
	}
	
	
	
}
