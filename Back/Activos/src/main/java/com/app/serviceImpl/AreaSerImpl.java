package com.app.serviceImpl;

import java.util.ArrayList;

import com.app.beans.Area;
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
		return null;
	}

	public void Registrar(Area area) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
