package com.app.serviceImpl;

import java.util.ArrayList;

import com.app.beans.Persona;
import com.app.dao.ActivoDao;
import com.app.dao.PersonaDao;
import com.app.service.PersonaSer;

public class PersonaServImpl implements PersonaSer{

	public void setDaoPersona(PersonaDao daoPersona) {
		this.daoPersona = daoPersona;
	}

	private PersonaDao daoPersona;

	
	public ArrayList<Persona> ListarTodas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void Registrar(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
