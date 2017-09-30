package com.app.daoImpl;

import java.sql.Date;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.beans.Activo;
import com.app.dao.ActivoDao;

@Repository
public class ActivoDaoImpl implements ActivoDao {

	@Autowired
	private DataSource dataSource;	
	
	public void Registrar(Activo activo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void Actualizar(Activo activo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Activo> ListarTodas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Activo> ListarTipo(String tipo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Activo> ListarFecha(Date fecha) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Activo> ListarSerial(String serial) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
