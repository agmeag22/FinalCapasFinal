package com.uca.capas.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.OrdenCompra;
import com.uca.capas.repositories.OrdenCompraRepository;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService{

	@Autowired
	OrdenCompraRepository clienteRepo;
	
	
	@Override
	public List<OrdenCompra> findAll() {
		return clienteRepo.findAll();
	}


	@Transactional
	public void saveOrdenCompra(OrdenCompra cliente) {
		clienteRepo.save(cliente);
		
	}

}
