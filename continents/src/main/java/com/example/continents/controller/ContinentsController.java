package com.example.continents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.continents.model.Continents;
import com.example.continents.service.ContinentsService;

@RestController
@RequestMapping("/api/")
public class ContinentsController {
	
	 @Autowired
	    private ContinentsService continentService;

	    @GetMapping("/fetch")
	    public String fetchContinents() {
	        continentService.fetchAndSaveContinents();
	        return "Continents data fetched and saved successfully!";
	    }

	    @GetMapping("/all")
	    public List<Continents> getAllContinents() {
	        return continentService.getAllContinents();
	    }	

}
