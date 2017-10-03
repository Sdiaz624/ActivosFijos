package com.app.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import com.app.beans.Activo;
import com.app.dao.ActivoDao;
import com.app.service.ActivoSer;

/**
 * Implementación de la logica del negocio del activo
 * @author Sergio
 */
public class ActivoSerImpl implements ActivoSer{

    /**
     *  set del tipo ActivoDao
     * @param daoActivo
     */
    public void setDaoActivo(ActivoDao daoActivo) {
            this.daoActivo = daoActivo;
    }

    private ActivoDao daoActivo;

    /**
     * Registra un nuevo activo
     * @param activo Objeto del tipo activo
     * @throws Exception lanza excepción
     */
    public void Registrar(Activo activo) throws Exception {
       
                
        try {
            if(!daoActivo.validaNumInterno(activo.getNumeroInt())){
                if (activo.getFechaCompra().before(activo.getFechaBaja())){
                    daoActivo.Registrar(activo);
                }               
            }
        }catch(Exception e){
                throw e;
        }

    }	

    /**
     * actualiza un activo
     * @param activo Objeto de tipo activo
     * @throws Exception lanza excepción
     */
    public void Actualizar(Activo activo) throws Exception {

        try {
		    if(!daoActivo.validaNumInterno(activo.getNumeroInt())){	
		        if (activo.getFechaCompra().before(activo.getFechaBaja())){
		            daoActivo.Actualizar(activo);
		        }  
		    }
        }catch(Exception e){
                throw e;
        }
    }
    
    /**
     * lista todos los activos
     * @return lista de todos los activos
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarTodas() throws Exception {
       
        ArrayList<Activo> activos = new ArrayList<Activo>();

        try {
                activos = daoActivo.ListarTodas();
        }catch(Exception e){
                throw e;
        }
        return activos;
    }
    /**
     * lista todos losactivos por tipo
     * @param tipo tipo de activos a listar
     * @return lista con los activos que son de un tipo
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarTipo(String tipo) throws Exception {
            
        ArrayList<Activo> activos = new ArrayList<Activo>();

        try {
                activos = daoActivo.ListarTipo(tipo);
        }catch(Exception e){
                throw e;
        }
        return activos;
    }
    /**
     * Lista todos los activos por serial
     * @param serial Serial delos activos a buscar
     * @return Lista con los activos que tienen el serial
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarSerial(String serial) throws Exception {
            
        ArrayList<Activo> activos = new ArrayList<Activo>();

        try {
                activos = daoActivo.ListarSerial(serial);
        }catch(Exception e){
                throw e;
        }
        return activos;
    }

    /**
     * Lista todos los activos comprados en un rango de fecha
     * @param fechaIni fecha inicial del rango de compra
     * @param fechaFin fecha final del rango de compra
     * @return lista con los activos comprados en un rango de fechas
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarFecha(Date fechaIni, Date fechaFin) throws Exception {
            
        ArrayList<Activo> activos = new ArrayList<Activo>();

        try {
                activos = daoActivo.ListarFecha(fechaIni,fechaFin);
        }catch(Exception e){
                throw e;
        }
        return activos;
    }   

}
