package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.dao.ActivoDao;
import com.app.dao.AreaDao;
import com.app.dao.PersonaDao;
import com.app.daoImpl.ActivoDaoImpl;
import com.app.daoImpl.AreaDaoImpl;
import com.app.daoImpl.PersonaDaoImpl;
import com.app.service.ActivoSer;
import com.app.service.AreaSer;
import com.app.service.PersonaSer;
import com.app.serviceImpl.ActivoSerImpl;
import com.app.serviceImpl.AreaSerImpl;
import com.app.serviceImpl.PersonaServImpl;

@Configuration
public class AppConfig {

	@Bean
	public ActivoDao ActivoBeanDao() {
		return new ActivoDaoImpl();
	}
	
	@Bean
	public AreaDao AreaBeanDao() {
		return new AreaDaoImpl();
	}
	
	@Bean
	public PersonaDao PersonaBeanDao() {
		return new PersonaDaoImpl();
	}
	
	@Bean
	public ActivoSer ActivoBean() {
		
		ActivoSerImpl activo = new ActivoSerImpl();
		activo.setDaoActivo(ActivoBeanDao());
		return activo;
	}
	
	@Bean
	public AreaSer AreaBean() {
		
		AreaSerImpl area = new AreaSerImpl();
		area.setDaoArea(AreaBeanDao());
		return area;
	}
	
	@Bean
	public PersonaSer PersonaBean() {
		
		PersonaServImpl persona = new PersonaServImpl();
		persona.setDaoPersona(PersonaBeanDao());
		return persona;
	}
	
	
	
}
