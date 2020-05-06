package com.analistas.clientesapp.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.analistas.clientesapp.model.entities.Cliente;
import com.analistas.clientesapp.model.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	ClienteRepository repo = new ClienteRepository();

	@Override
	public List<Cliente> buscarTodo() {
		return repo.getClientes();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Cliente cliente) {
		repo.addCliente(cliente);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
