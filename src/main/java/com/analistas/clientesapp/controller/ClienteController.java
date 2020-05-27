package com.analistas.clientesapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String prepararNuevo(Model m) {
		
		m.addAttribute("cliente", new Cliente());
		m.addAttribute("tituloForm", "Nuevo Cliente");
		
		return "clientes/form";
	}
	
	@GetMapping({"/form/{id}"})
	public String prepararEdicion(@PathVariable Integer id, Model m) {
		
		Cliente cliente = clienteService.buscarPorId(id);
		
		m.addAttribute("cliente", cliente);
		m.addAttribute("tituloForm", "Editar Cliente");
		
		return "clientes/form";
	}
	
	@PostMapping("/form")
	public String guardar(@Valid Cliente cliente, Model m, RedirectAttributes flash) {
		clienteService.guardar(cliente);
		flash.addFlashAttribute("success", "Cliente guardado correctamente.");
		
		return "redirect:list";
	}


}
