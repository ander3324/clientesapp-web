package com.analistas.clientesapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analistas.clientesapp.model.entities.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
