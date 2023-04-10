package com.krunge.ninjasanddojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krunge.ninjasanddojos.models.Dojo;
import com.krunge.ninjasanddojos.models.Ninja;
import com.krunge.ninjasanddojos.services.DojoService;
import com.krunge.ninjasanddojos.services.NinjaService;



@Controller
@RequestMapping("/ninja")
public class NinjaController {
	@Autowired
	private NinjaService nService;
	@Autowired
	private DojoService dService;
	
	@GetMapping ("")
	public String rNinja(Model model,
			@ModelAttribute("dojo")Dojo dojo,
			@ModelAttribute("ninja")Ninja ninja
			){
		List<Dojo> dojos = dService.getAll();
		model.addAttribute("dojos", dojos);
		return "ninja.jsp";
	}
	
	@PostMapping ("")
	public String pNinjaCreate(
			@Valid @ModelAttribute("ninja")Ninja ninja,
			BindingResult result,
			Model model
			)
	{
		if (result.hasErrors()) {
			model.addAttribute("dojos", dService.getAll());
			return "ninja.jsp";
		}
		nService.createOrUpdate(ninja);
		return "redirect:/dojos/";
	}
	
	
}
