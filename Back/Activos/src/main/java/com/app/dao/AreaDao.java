package com.app.dao;

import java.util.ArrayList;

import com.app.beans.Area;

/**
 * Interface de AreaDao, define los comportamientos
 * que tendra un area al comunicarse con la base de datos
 * @author Sergio
 */
public interface AreaDao {
        
        /**
         * Lista todas las areas
         * @return todas las areas que estan en la base de datos
         * @throws Exception lanza excepción
         */
	public ArrayList<Area> ListarTodas() throws Exception;
	
        /**
         * Registra un nuevo area
         * @param area Objeto del tipo area
         * @throws Exception lanza excepción
         */
	public void Registrar(Area area) throws Exception;
        
        /**
         * Valida si una ciudad ya esta asociada a un area
         * @param ciudad ciudad a validar
         * @return 
         * @throws Exception lanza excepción
         */
        public boolean validaCiudad(String ciudad) throws Exception;
	
}
