package com.app.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.app.beans.Activo;

/**
 * Interface de ActivoDao, define los comportamientos
 * que tendra un activo al comunicarse con la base de datos
 * @author Sergio
 */
public interface ActivoDao {

    /**
     * Permite registrar un activo en la base de datos
     * @param activo objeto de tipo activo
     * @throws Exception lanza excepción
     */
    public void Registrar(Activo activo) throws Exception; 

    /**
     * Permite actualizar un activo enla base de datos
     * @param activo objeto de tipo activo
     * @throws Exception lanza excepción
     */
    public void Actualizar(Activo activo) throws Exception;

    /**
     * Obtiene todos los activos de la base de datos
     * @return ArrayList con activos
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarTodas() throws Exception;

    /**
     * Obtiene todos los activos de la base de datos de un tipo
     * @param tipo Tipo de activo a listar
     * @return ArrayList con activos de un tipo
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarTipo(String tipo) throws Exception;

    /**
     * Obtiene todos los activos de la base de datos en un ranfgo de fecha
     * @param fechaIni minima fecha de baja del activo
     * @param fechaFin maxima fecha de baja del activo
     * @return ArrayList con activos de un rango de fechas de baja 
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarFecha(Date fechaIni,Date fechaFin) throws Exception;

    /**
     * Obtiene todos los activos de la base de datos
     * @param serial serial del activo
     * @return ArrayList con activos de un serial
     * @throws Exception lanza excepción
     */
    public ArrayList<Activo> ListarSerial(String serial) throws Exception;

    /**
     * Valida que el numero interno no se encuentre en la base de datos
     * @param Numero numero internoa validar 
     * @return Retorna true si esta asociada a un activo
     * @throws Exception Lanza excepcion
     */
    public boolean validaNumInterno(int Numero) throws Exception;
	
}
