package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesController {

	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model){
		model.addAttribute("titulo", "PATHVARIABLE");
		model.addAttribute("resultado","La variable enviada por parametro es: "+texto);
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto,@PathVariable String numero, Model model){
		model.addAttribute("titulo", "PATHVARIABLE");
		model.addAttribute("resultado","La variable enviada por parametro es: "+texto+" y el numero es :"+numero);
		return "variables/ver";
	}
}
