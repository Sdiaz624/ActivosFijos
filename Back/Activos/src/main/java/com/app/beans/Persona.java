package com.app.beans;

/**
 * Objeto persona
 * @author Sergio
 */
public class Persona {
    
    private int id;
    private String nombre;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * Constructor con parametros
     * @param id identificador de la persona
     * @param nombre nombre de la persona
     */
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
