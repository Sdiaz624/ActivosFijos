package com.app.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.app.beans.Activo;


public interface ActivoDao {

	
	public void Registrar(Activo activo) throws Exception; 
	
	public void Actualizar(Activo activo) throws Exception;
	
	public ArrayList<Activo> ListarTodas() throws Exception;
	
	public ArrayList<Activo> ListarTipo(String tipo) throws Exception;
	
	public ArrayList<Activo> ListarFecha(Date fecha) throws Exception;
	
	public ArrayList<Activo> ListarSerial(String serial) throws Exception;
	
	
	
}
