package com.app.serviceImpl;

import java.util.ArrayList;

import com.app.beans.Area;
import com.app.beans.Persona;
import com.app.dao.ActivoDao;
import com.app.dao.AreaDao;
import com.app.service.AreaSer;

public class AreaSerImpl implements AreaSer {

	public void setDaoArea(AreaDao daoArea) {
		this.daoArea = daoArea;
	}

	private AreaDao daoArea;

	
	public ArrayList<Area> ListarTodas() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Area> areas = new ArrayList<Area>();
		
		try {
			areas = daoArea.ListarTodas();
		}catch(Exception e){
			throw e;
		}
		return areas;
	}

	public void Registrar(Area area) throws Exception {
		// TODO Auto-generated method stub
		try {
			daoArea.Registrar(area);
		}catch(Exception e){
			throw e;
		}
		
	}

}
