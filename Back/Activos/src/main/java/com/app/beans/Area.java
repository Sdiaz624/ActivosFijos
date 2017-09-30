package com.app.beans;

import java.util.ArrayList;
/**
 * Objeto area
 * @author Sergio
 */
public class Area {

    private int id;
    private String ciudad;
    private String nombre;
    private ArrayList<Activo> activos;

    /**
     * Constructor por defecto
     */
    public Area() {

    }

    /**
     * Constructor con parametrso
     * @param id identificador del area
     * @param ciudad ciudad en la que esta el area
     * @param nombre nombre del area
     * @param activos activos que tiene el area
     */
    public Area(int id, String ciudad, String nombre, ArrayList<Activo> activos) {
        this.id = id;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.activos = activos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
