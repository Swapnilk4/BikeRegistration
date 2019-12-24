package com.globalmatics.bike.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	}
	
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		
		return bikeRepository.getOne(id);

	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		
		bikeRepository.save(bike);
		
	}
	
	
	
	@GetMapping
	@RequestMapping("/version")
	public Map GetVersion(){
		
		Map version = new HashMap<String,String>();
		
		version.put("app-version", appVersion);
		
		return version;
		
	}
	
	 @RequestMapping(value="/{id}",method = RequestMethod.PUT) 
	 public Bike  update(@PathVariable Long id,@RequestBody Bike bike) {
	 
	 Bike existingBike = bikeRepository.getOne(id);
	  BeanUtils.copyProperties(bike, existingBike,"id"); 
	  return bikeRepository.saveAndFlush(existingBike); 
	  }
	 
	 
	  @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	  public void delete(@PathVariable Long id) {
	  
		bikeRepository.deleteById(id); 
		  }
	  

	
	
	
}
