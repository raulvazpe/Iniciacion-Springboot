package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/index")
	public String index() {
		return "/params/index";
		
	}

	@GetMapping("/string")
	public String param(@RequestParam(name ="texto",defaultValue = "Todavia no hay ningun valor") String texto, Model model) {
		model.addAttribute("resultado","el parametro enviado por url es: "+texto);
		return "params/ver";
	}
}
