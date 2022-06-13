package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index","/",""})
	
	public String index(Model model) {
		model.addAttribute("titulo", "Este es el titulo de la pagina Index");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario(); //Instanciamos el usuario
		usuario.setNombre("Raul");
		usuario.setApellido("Vazquez");
		usuario.setEmail("raul@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de: "+(usuario.getNombre()+" "+(usuario.getApellido())));
		return "perfil";
	}
	
	@RequestMapping("/listado")
	public String listar(Model model) {
		List<Usuario> usuario = new ArrayList<>();
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuario);
		
		return "lista";
	}
	
}
