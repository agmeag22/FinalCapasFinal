package com.uca.capas.services;

import java.util.List;

import com.uca.capas.domain.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();
	
	public void saveCliente(Cliente cliente);
}
