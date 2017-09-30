package com.app.beans;

import java.sql.Date;

public class Activo {
	
	private int id; 
	private String nombre;
	private int numeroInt;
	private String Description;
	private String tipo;
	private String serial;
	private float peso;
	private float alto;
	private float largo;
	private float valor;
	private Date fechaCompra;
	private Date fechaBaja;
	private String estado;
	private String color;
	
		
	public Activo() {
	}

	

	public Activo(int id, String nombre, int numeroInt, String description, String tipo, String serial, float peso,
			float alto, float largo, float valor, Date fechaCompra, Date fechaBaja, String estado, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeroInt = numeroInt;
		Description = description;
		this.tipo = tipo;
		this.serial = serial;
		this.peso = peso;
		this.alto = alto;
		this.largo = largo;
		this.valor = valor;
		this.fechaCompra = fechaCompra;
		this.fechaBaja = fechaBaja;
		this.estado = estado;
		this.color = color;
	}



	public int getNumeroInt() {
		return numeroInt;
	}

	public void setNumeroInt(int numeroInt) {
		this.numeroInt = numeroInt;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getLargo() {
		return largo;
	}
	public void setLargo(float largo) {
		this.largo = largo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	  
	

}
