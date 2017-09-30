package com.app.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import com.app.beans.Activo;
import com.app.dao.ActivoDao;
import com.app.service.ActivoSer;

public class ActivoSerImpl implements ActivoSer{

	
	/**
	 *  
	 * @param daoActivo
	 */
	public void setDaoActivo(ActivoDao daoActivo) {
		this.daoActivo = daoActivo;
	}

	/**
	 * 
	 */
	private ActivoDao daoActivo;

	/**
	 * 
	 */
	public void Registrar(Activo activo) throws Exception {
		// TODO Auto-generated method stub
		try {
			daoActivo.Registrar(activo);
		}catch(Exception e){
			throw e;
		}
		
	}

	/**
	 * 
	 */
	public void Actualizar(Activo activo) throws Exception {
		// TODO Auto-generated method stub
		try {
			daoActivo.Actualizar(activo);
		}catch(Exception e){
			throw e;
		}
	}

	
	/**
	 * 
	 */
	public ArrayList<Activo> ListarTodas() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Activo> activos = new ArrayList<Activo>();
		
		try {
			activos = daoActivo.ListarTodas();
		}catch(Exception e){
			throw e;
		}
		return activos;
	}

	
	/**
	 * 
	 */
	public ArrayList<Activo> ListarTipo(String tipo) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Activo> activos = new ArrayList<Activo>();
		
		try {
			activos = daoActivo.ListarTipo(tipo);
		}catch(Exception e){
			throw e;
		}
		return activos;
	}

	/**
	 * 
	 */
	public ArrayList<Activo> ListarSerial(String serial) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Activo> activos = new ArrayList<Activo>();
		
		try {
			activos = daoActivo.ListarSerial(serial);
		}catch(Exception e){
			throw e;
		}
		return activos;
	}

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
