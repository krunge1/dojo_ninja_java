package com.krunge.ninjasanddojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunge.ninjasanddojos.models.Dojo;
import com.krunge.ninjasanddojos.repositories.DojoRepo;

@Service
public class DojoService {
	@Autowired
	private DojoRepo dRepo;
	
// Create or Update Dojo
	public Dojo createOrUpdate(Dojo d) {
		return dRepo.save(d);
	}
	
	// Get all Dojos
	public List<Dojo> getAll(){
		return dRepo.findAll();
		
	}
	// Get Dojo by ID
	public Dojo getById(Long id) {
		return dRepo.findById(id).orElse(null);
	}
	
	
	
	// Delete Dojo
	public void deleteById(Long id) {
		dRepo.deleteById(id);
	}
}
