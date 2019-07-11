package com.uca.capas.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Producto;
import com.uca.capas.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	ProductoRepository clienteRepo;
	
	
	@Override
	public List<Producto> findAll() {
		return clienteRepo.findAll();
	}


	@Transactional
	public void saveProducto(Producto cliente) {
		clienteRepo.save(cliente);
		
	}

}
