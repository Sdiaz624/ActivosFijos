package com.app.dao;

import java.util.ArrayList;

import com.app.beans.Area;

public interface AreaDao {

	public ArrayList<Area> ListarTodas() throws Exception;
	
	public void Registrar(Area area) throws Exception;
	
}
