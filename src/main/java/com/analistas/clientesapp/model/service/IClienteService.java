package com.analistas.clientesapp.model.service;

import java.util.List;

import com.analistas.clientesapp.model.entities.Cliente;

public interface IClienteService {

	public List<Cliente> buscarTodo();
	
	public Cliente buscarPorId(Integer id);
	
	public void guardar(Cliente cliente);
	
	public void borrar(Integer id);
	
}
