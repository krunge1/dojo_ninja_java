package com.krunge.ninjasanddojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krunge.ninjasanddojos.models.Ninja;
import com.krunge.ninjasanddojos.repositories.NinjaRepo;


@Service
public class NinjaService {
	@Autowired
	private NinjaRepo nRepo;
	
// Create or Update Ninja
	public Ninja createOrUpdate(Ninja n) {
		return nRepo.save(n);
	}
	
	// Get all Ninjas
	public List<Ninja> getAll(){
		return nRepo.findAll();
		
	}
	// Get Ninja by ID
	public Ninja getById(Long id) {
		return nRepo.findById(id).orElse(null);
	}
	
	// Get Ninja by Dojo ID
	public Ninja getByDojoId(Long id) {
		optional<Ninja> result = nRepo.findAllByDojo(id);
		if(result.isPresent()) {
			return result.get();
		}
		else {
			return null;
		}
	}
	
	// Delete Ninja
	public void deleteById(Long id) {
		nRepo.deleteById(id);
	}
}

