package com.analistas.clientesapp.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int numero;
	
	@Column(name="ape", nullable = false, length = 35)
	private String apellido;
	
	@Column(name="nom", nullable = false, length = 35)
	private String nombre;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="fec_nac")
	private LocalDate fechaNacimiento;

	public Cliente() {
		fechaNacimiento = LocalDate.now();
	}

	public Cliente(int numero, String apellido, String nombre, LocalDate fechaNacimiento) {
		this.numero = numero;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return apellido + " " + nombre;
	}

}
