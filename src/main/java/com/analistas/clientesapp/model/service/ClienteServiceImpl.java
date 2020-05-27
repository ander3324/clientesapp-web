package com.analistas.clientesapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analistas.clientesapp.model.entities.Cliente;
import com.analistas.clientesapp.model.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	IClienteRepository repo;

	@Override
	public List<Cliente> buscarTodo() {
		return repo.findAll();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Cliente cliente) {
		repo.save(cliente);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
