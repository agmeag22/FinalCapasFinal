package com.uca.capas.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Cliente;
import com.uca.capas.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository clienteRepo;
	
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepo.findAll();
	}


	@Transactional
	public void saveCliente(Cliente cliente) {
		clienteRepo.save(cliente);
		
	}

}
