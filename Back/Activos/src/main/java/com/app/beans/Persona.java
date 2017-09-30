package com.app.beans;

import java.util.ArrayList;

/**
 * Objeto persona
 * @author Sergio
 */
public class Persona {
    
    private int id;
    private String nombre;
    private ArrayList<Activo> activos;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * Constructor con parametros
     * @param id identificador de la persona
     * @param nombre nombre de la persona
     * @param activos lista de activos de la persona
     */
    public Persona(int id, String nombre, ArrayList<Activo> activos) {    
        this.id = id;
        this.nombre = nombre;
        this.activos = activos;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ciudad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the ciudad to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
