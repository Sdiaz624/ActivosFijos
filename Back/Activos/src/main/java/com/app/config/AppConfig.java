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

/**
 * 
 * @author Sergio
 */

@Configuration
public class AppConfig {

    
        /**
         * Obtiene un objeto de tipo ActivoDao
         * @return 
         */
	@Bean
	public ActivoDao ActivoBeanDao() {
		return new ActivoDaoImpl();
	}
        
        /**
         * Obtiene un objeto de tipo AreaDao
         * @return 
         */
	@Bean
	public AreaDao AreaBeanDao() {
		return new AreaDaoImpl();
	}
	
        /**
         * Obtiene un objeto de tipo PersonaDao
         * @return 
         */
	@Bean
	public PersonaDao PersonaBeanDao() {
		return new PersonaDaoImpl();
	}
	
        /**
         * Obtiene un objeto ActivoSer
         * @return 
         */
	@Bean
	public ActivoSer ActivoBean() {
		
		ActivoSerImpl activo = new ActivoSerImpl();
		activo.setDaoActivo(ActivoBeanDao());
		return activo;
	}
	
        /**
         * Obtiene un objeto de tipo AreaSer
         * @return 
         */
	@Bean
	public AreaSer AreaBean() {
		
		AreaSerImpl area = new AreaSerImpl();
		area.setDaoArea(AreaBeanDao());
		return area;
	}
	
        
        /**
         * Obtiene un objeto de tipo PersonaSer
         * @return 
         */
	@Bean
	public PersonaSer PersonaBean() {
		
		PersonaServImpl persona = new PersonaServImpl();
		persona.setDaoPersona(PersonaBeanDao());
		return persona;
	}
	
	
	
}
