package com.uca.capas.services;

import java.util.List;

import com.uca.capas.domain.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	
	public void saveProducto(Producto cliente);
}
