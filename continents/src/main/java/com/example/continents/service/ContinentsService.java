package com.example.continents.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.continents.model.Continents;
import com.example.continents.repository.ContinentsRepo;

@Service
public class ContinentsService {
	
	@Autowired
    private ContinentsRepo continentRepo;

    public void fetchAndSaveContinents() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dummy-json.mock.beeceptor.com/continents";
        
        Continents[] continents = restTemplate.getForObject(url, Continents[].class);
        if (continents != null) {
            continentRepo.saveAll(Arrays.asList(continents));
        }
    }

    public List<Continents> getAllContinents() {
        return continentRepo.findAll();
    }

}
