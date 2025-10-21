package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cozinha;

public interface CozinhaRepository extends JpaRepository<Cozinha, Long>{}
