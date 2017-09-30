package com.app.dao;

import java.util.ArrayList;

import com.app.beans.Persona;;

/**
 * Interface de PersonaDao, define los comportamientos
 * que tendra un persona al comunicarse con la base de datos
 * @author Sergio
 */
public interface PersonaDao {

        /**
         * Lista todas las persona 
         * @return
         * @throws Exception lanza excepción 
         */
	public ArrayList<Persona> ListarTodas() throws Exception;
	
        /**
         * Registra una nueva persona 
         * @param persona nombre de la persona
         * @throws Exception lanza excepción
         */
	public void Registrar(String persona) throws Exception;
	
}
