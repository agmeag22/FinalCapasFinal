package com.uca.capas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( schema="public", name="producto")
public class Producto {

	
	
	@Id
	@GeneratedValue(generator="producto_c_producto_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="producto_c_producto_seq",sequenceName="producto_c_producto_seq",allocationSize=1)
	@Column(name="c_producto")
	private int cproducto;
	
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="inventario")
	private int inventario;
	
	@Column(name="fecha_ingreso")
	private Date fechaingreso;
	
	@Column(name="b_activo")
	private boolean bactivo;
	
	@Column(name="n_precio")
	private int nprecio;

	public int getCproducto() {
		return cproducto;
	}

	public void setCproducto(int cproducto) {
		this.cproducto = cproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public boolean isBactivo() {
		return bactivo;
	}

	public void setBactivo(boolean bactivo) {
		this.bactivo = bactivo;
	}

	public int getNprecio() {
		return nprecio;
	}

	public void setNprecio(int nprecio) {
		this.nprecio = nprecio;
	}

	public Producto(int cproducto, String nombre, String descripcion, int inventario, Date fechaingreso,
			boolean bactivo, int nprecio) {
		super();
		this.cproducto = cproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.inventario = inventario;
		this.fechaingreso = fechaingreso;
		this.bactivo = bactivo;
		this.nprecio = nprecio;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
