package com.app.dao;

import java.util.ArrayList;

import com.app.beans.Persona;;

public interface PersonaDao {

	public ArrayList<Persona> ListarTodas() throws Exception;
	
	public void Registrar(Persona persona) throws Exception;
	
}
