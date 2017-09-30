package com.app.serviceImpl;

import java.util.ArrayList;

import com.app.beans.Activo;
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
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		try {
			personas = daoPersona.ListarTodas();
		}catch(Exception e){
			throw e;
		}
		return personas;
	}

	public void Registrar(String persona) throws Exception {
		// TODO Auto-generated method stub
		try {
			daoPersona.Registrar(persona);
		}catch(Exception e){
			throw e;
		}
		
	}

}
