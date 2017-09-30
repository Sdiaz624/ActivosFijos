package com.app.beans;

import java.util.ArrayList;

public class Area {

	private int id;
	private String ciudad;
	private ArrayList<Activo> activos;
		
	public Area() {
	
	}
	
	public Area(int id, String ciudad, ArrayList<Activo> activos) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.activos = activos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public ArrayList<Activo> getActivos() {
		return activos;
	}
	public void setActivos(ArrayList<Activo> activos) {
		this.activos = activos;
	}
	
	
}
