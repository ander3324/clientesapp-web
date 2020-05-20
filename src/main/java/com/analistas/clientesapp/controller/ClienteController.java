package com.analistas.clientesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analistas.clientesapp.model.entities.Cliente;
import com.analistas.clientesapp.model.service.IClienteService;

@Controller
@RequestMapping({"", "/clientes"})
public class ClienteController {
	
	//En Spring teniamos IoC, acá no.
	//ClienteServiceImpl clienteService = new ClienteServiceImpl();
	
	//IoC implemetado con sPRING (Dependence Injection)
	@Autowired
	IClienteService clienteService;
	
	List<Cliente> clientes;

	@GetMapping({"", "/list"})
	public String listar(Model m) {

		clientes = clienteService.buscarTodo();
		
		m.addAttribute("titulo", "Listado de Clientes");
		m.addAttribute("clientes", clientes);
		
		return "clientes/list";
	}
	
	@GetMapping({"/form"})
	public String form(Model m) {
		
		m.addAttribute("mensaje", "Segunda página");
		
		return "clientes/form";
	}
}
