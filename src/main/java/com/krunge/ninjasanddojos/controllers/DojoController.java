package com.krunge.ninjasanddojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krunge.ninjasanddojos.models.Dojo;
import com.krunge.ninjasanddojos.models.Ninja;
import com.krunge.ninjasanddojos.services.DojoService;
import com.krunge.ninjasanddojos.services.NinjaService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	@GetMapping("")
	public String rDojoShow(
			Model model,
			@ModelAttribute("dojo") Dojo dojo
			) {
		List<Dojo> dojos = dService.getAll();
		
		model.addAttribute("dojos", dojos);
		
		return "dojos.jsp";
	}
	
	@GetMapping("/{id}")
	public String rViewDojo(
			@PathVariable("id") Long id,
			@ModelAttribute("dojo") Dojo dojo,
			@ModelAttribute("ninja")Ninja ninja
			) {
		List<Ninja> ninjas = nService.getByDojoId();
		
	}
	
	
	
	@PostMapping("")
	public String pDojoCreate(
			@Valid @ModelAttribute("dojo")Dojo dojo,
			BindingResult result,
			Model model
			)
	{
		if (result.hasErrors()) {
			model.addAttribute("dojo", dService.getAll());
			return "dojos.jsp";
		}
		dService.createOrUpdate(dojo);
		return "redirect:/dojos";
	}
	
}
	
	
