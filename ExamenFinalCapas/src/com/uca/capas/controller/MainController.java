package com.uca.capas.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Cliente;
import com.uca.capas.domain.OrdenCompra;
import com.uca.capas.domain.Producto;
import com.uca.capas.repositories.ClienteRepository;
import com.uca.capas.repositories.ProductoRepository;
import com.uca.capas.services.ClienteService;
import com.uca.capas.services.OrdenCompraService;
import com.uca.capas.services.ProductoService;

@Controller
public class MainController {

	@Autowired
	ClienteService clienteServ;
	@Autowired
	ProductoService productoServ;
	@Autowired
	OrdenCompraService ordencompraServ;
	@Autowired
	ClienteRepository clienteServ2;
	
	@Autowired
	ProductoRepository productoServ2;
	
	@RequestMapping("/")
	public ModelAndView mains() {
		ModelAndView mav=new ModelAndView();
		List<Cliente> clientes= clienteServ.findAll();
		mav.addObject("clientes",clientes);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/crearCompra")
	public ModelAndView crearCompra() {
		ModelAndView mav=new ModelAndView();
		List<Producto> productos=productoServ.findAll();
		List<Cliente> clientes= clienteServ.findAll();
		mav.addObject("productos",productos);
		mav.addObject("clientes",clientes);
		mav.setViewName("crearCompra");
		
		return mav;
	}
	
	@RequestMapping(value="/crearCompradone")
	public ModelAndView crearCompradone(@RequestParam(name="producto")int producto,@RequestParam(name="cliente")int cliente,@RequestParam(name="cantidad")int cantidad) {
		ModelAndView mav=new ModelAndView();
		Cliente cliente2=clienteServ2.getOne(cliente);
		Producto producto2=productoServ2.getOne(producto);
		OrdenCompra ordenCompra=null;
		ordenCompra.setCantidad(cantidad);
		ordenCompra.setFcompra(Calendar.getInstance().getTime());
		ordenCompra.setTotal(cantidad*producto2.getNprecio());
		ordenCompra.setCliente(cliente2);
		ordenCompra.setProducto(producto2);
		ordencompraServ.saveOrdenCompra(ordenCompra);
		mav.addObject("orden",ordenCompra);
		mav.setViewName("crearCompra2");
		return mav;
	}
	
	
	@RequestMapping(value="/verCompras")
	public ModelAndView verCompras() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("verCompras");
		return mav;
	}
}
