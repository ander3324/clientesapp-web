package com.analistas.clientesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/clientes"})
public class ClienteController {

	@GetMapping({"", "/list"})
	public String listar(Model m) {
		
		m.addAttribute("titulo", "Listado de Clientes");
		
		return "clientes/list";
	}
}
