package com.example.continents.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Continents {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private Long areaSqKm;
    private Long population;
    private Integer countries;

    @ElementCollection
    private List<String> geoLines;

    @ElementCollection
    private List<String> oceans;

    @ElementCollection
    private List<String> developedCountries;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAreaSqKm() {
		return areaSqKm;
	}

	public void setAreaSqKm(Long areaSqKm) {
		this.areaSqKm = areaSqKm;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Integer getCountries() {
		return countries;
	}

	public void setCountries(Integer countries) {
		this.countries = countries;
	}

	public List<String> getGeoLines() {
		return geoLines;
	}

	public void setLines(List<String> geoLines) {
		this.geoLines = geoLines;
	}

	public List<String> getOceans() {
		return oceans;
	}

	public void setOceans(List<String> oceans) {
		this.oceans = oceans;
	}

	public List<String> getDevelopedCountries() {
		return developedCountries;
	}

	public void setDevelopedCountries(List<String> developedCountries) {
		this.developedCountries = developedCountries;
	}
    
    
    


}
