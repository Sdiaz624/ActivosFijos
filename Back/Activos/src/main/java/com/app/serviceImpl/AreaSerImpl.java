package com.app.serviceImpl;

import java.util.ArrayList;

import com.app.beans.Area;
import com.app.dao.AreaDao;
import com.app.service.AreaSer;

/**
 * Implementacion de la logica del negocio del area
 * @author Sergio
 */
public class AreaSerImpl implements AreaSer {

    /**
     * set del tipo AreaDao
     * @param daoArea 
     */
    public void setDaoArea(AreaDao daoArea) {
            this.daoArea = daoArea;
    }

    private AreaDao daoArea;


    /**
     * Permite listar todas las areas
     * @return lista con todas las areas
     * @throws Exception lanza excepción
     */
    public ArrayList<Area> ListarTodas() throws Exception {

        ArrayList<Area> areas = new ArrayList<Area>();

        try {
                areas = daoArea.ListarTodas();
        }catch(Exception e){
                throw e;
        }
        return areas;
    }

    /**
     * Registra un area 
     * @param area Objeto del tipo area
     * @return retorna true si registro o false si no
     * @throws Exception lanza excepción
     */
    public boolean Registrar(Area area) throws Exception {

        System.out.println("registrar area");
        try {
            if(!daoArea.validaCiudad(area.getCiudad())){
                daoArea.Registrar(area);
                return true;
            }

        }catch(Exception e){
                throw e;
        }
        return false;    
    }

}
