package com.globalmatics.bike.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globalmatics.bike.models.Bike;
import com.globalmatics.bike.repositories.BikeRepository;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

	
	
	@Value("${app.version}")
	private String appVersion;
	
	@Autowired
	private BikeRepository  bikeRepository;
	
	@GetMapping
	public List<Bike> list(){
		
		System.out.println("List"+ bikeRepository.findAll());
		return bikeRepository.findAll();
		//List<Bike> bikes = new ArrayList<>();
		
		//return bikes;
	}
	
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		
		
		return bikeRepository.getOne(id);
		
		//return new Bike();
	}
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		
		bikeRepository.save(bike);
		
	}
	
	
	
	@GetMapping
	@RequestMapping("/")
	public Map GetVersion(){
		
		Map version = new HashMap<String,String>();
		
		version.put("app-version", appVersion);
		
		return version;
		
	}

	
	
	
}
