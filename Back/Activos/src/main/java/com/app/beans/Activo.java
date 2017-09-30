package com.app.beans;

import java.sql.Date;
/**
 * Objeto activo
 * @author Sergio
 */
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
        private int persona;
        private int area;
	
	/**
         * Constructor por defecto
         */	
	public Activo() {
	}

	
        /**
         * Constructor con parametors
         * @param id identificador del activo
         * @param nombre nombre delactivo
         * @param numeroInt numero interno del activo
         * @param Description descripción del activo
         * @param tipo tipo de activo 
         * @param serial serial del activo
         * @param peso peso del activo
         * @param alto altura del activo
         * @param largo largo del activo
         * @param valor valor delactivo
         * @param fechaCompra fecha de compra delactivo
         * @param fechaBaja fecha de baja del activo
         * @param estado (activo, dado de baja, en reparación, disponible, asignado),
         * @param color color del activo
         * @param persona 
         * @param area
         */    
	public Activo(int id, String nombre, int numeroInt, String Description, String tipo, String serial, float peso, float alto, float largo, float valor, Date fechaCompra, Date fechaBaja, String estado, String color, int persona, int area) {
		this.id = id;
		this.nombre = nombre;
		this.numeroInt = numeroInt;
		this.Description = Description;
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
		this.persona = persona;
                this.area = area;
	}

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
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
