package com.analistas.clientesapp.model.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.analistas.clientesapp.model.entities.Cliente;

public class ClienteRepository {

	private List<Cliente> clientes;

	public ClienteRepository() {

		clientes = new ArrayList<>();

		//Crear la colección para testing:
		//Borrar cuando se conecte a una BD...
		clientes.add(new Cliente(1, "Rodriguez", "Neymar", LocalDate.parse("1996-08-21")));
		clientes.add(new Cliente(2, "Lovisolo", "Julián", LocalDate.parse("1999-08-31")));
		clientes.add(new Cliente(3, "Toledo", "Claudinha", LocalDate.parse("1997-09-25")));
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
