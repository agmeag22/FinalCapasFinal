package com.uca.capas.services;

import java.util.List;

import com.uca.capas.domain.OrdenCompra;

public interface OrdenCompraService {

	public List<OrdenCompra> findAll();
	
	public void saveOrdenCompra(OrdenCompra cliente);
}
