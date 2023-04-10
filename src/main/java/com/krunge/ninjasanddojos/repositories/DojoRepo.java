package com.krunge.ninjasanddojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.krunge.ninjasanddojos.models.Dojo;

public interface DojoRepo extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();

}
