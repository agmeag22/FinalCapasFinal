package com.uca.capas.domain;

import java.util.*;

import javax.persistence.*;


@Entity
@Table( schema="public", name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(generator="cliente_c_cliente_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="cliente_c_cliente_seq",sequenceName="cliente_c_cliente_seq",allocationSize=1)
	@Column(name="c_cliente")
	private int ccliente;
	
	@Column(name="s_nombres")
	private String nombres;

	@Column(name="s_apellidos")
	private String apellidos;
	
	@Column(name="b_activo")
	private boolean bactivo;

	public int getCcliente() {
		return ccliente;
	}

	public void setCcliente(int ccliente) {
		this.ccliente = ccliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isBactivo() {
		return bactivo;
	}

	public void setBactivo(boolean bactivo) {
		this.bactivo = bactivo;
	}

	public Cliente(int ccliente, String nombres, String apellidos, boolean bactivo) {
		super();
		this.ccliente = ccliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.bactivo = bactivo;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}


