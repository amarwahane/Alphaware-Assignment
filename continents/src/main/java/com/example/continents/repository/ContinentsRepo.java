package com.example.continents.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.continents.model.Continents;

public interface ContinentsRepo extends JpaRepository<Continents, Long>{
	

}
