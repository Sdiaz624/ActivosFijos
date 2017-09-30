package com.app.serviceImpl;

import java.sql.Date;
import java.util.ArrayList;
import com.app.beans.Activo;
import com.app.dao.ActivoDao;
import com.app.service.ActivoSer;

public class ActivoSerImpl implements ActivoSer{

	public void setDaoActivo(ActivoDao daoActivo) {
		this.daoActivo = daoActivo;
	}

	private ActivoDao daoActivo;

	
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
