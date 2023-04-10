package com.krunge.ninjasanddojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.krunge.ninjasanddojos.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long> {

	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Ninja Long);
}
