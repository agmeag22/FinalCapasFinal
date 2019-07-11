package com.uca.capas.domain;

import java.util.*;

import javax.persistence.*;

@Entity
@Table( schema="public", name="ordencompra")
public class OrdenCompra {

	@Id
	@GeneratedValue(generator="ordencompra_c_orden_compra_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="ordencompra_c_orden_compra_seq",sequenceName="ordencompra_c_orden_compra_seq",allocationSize=1)
	@Column(name="c_orden_compra")
	private int cordencompra;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="c_cliente",referencedColumnName="c_cliente")
	private Cliente cliente;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="c_producto",referencedColumnName="c_producto")
	private Producto producto;
	
	
	@Column(name="n_cantidad")
	private int cantidad;
	
	@Column(name="f_compra")
	private Date fcompra;

	@Column(name="n_total")
	private float total;

	public int getCordencompra() {
		return cordencompra;
	}

	public void setCordencompra(int cordencompra) {
		this.cordencompra = cordencompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFcompra() {
		return fcompra;
	}

	public void setFcompra(Date fcompra) {
		this.fcompra = fcompra;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public OrdenCompra(int cordencompra, Cliente cliente, Producto producto, int cantidad, Date fcompra, float total) {
		super();
		this.cordencompra = cordencompra;
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.fcompra = fcompra;
		this.total = total;
	}

	public OrdenCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
