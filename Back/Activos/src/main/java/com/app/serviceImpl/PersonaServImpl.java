package com.app.serviceImpl;

import java.util.ArrayList;

import com.app.beans.Activo;
import com.app.beans.Persona;
import com.app.dao.ActivoDao;
import com.app.dao.PersonaDao;
import com.app.service.PersonaSer;

/**
 * Implementación de la logica del negocio de la persona
 * @author Sergio
 */
public class PersonaServImpl implements PersonaSer{
    
    /**
     * set del tipo PersonaDao
     * @param daoPersona 
     */
    public void setDaoPersona(PersonaDao daoPersona) {
            this.daoPersona = daoPersona;
    }

    private PersonaDao daoPersona;

    /**
     * Lista todas las personas  
     * @return retorna una lista con todas las personas
     * @throws Exception lanza excepción
     */
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
    
    /**
     * Registra una nueva persona 
     * @param persona nombre de la persona
     * @throws Exception lanza excepción
     */
    public void Registrar(String persona) throws Exception {
            // TODO Auto-generated method stub
            try {
                    daoPersona.Registrar(persona);
            }catch(Exception e){
                    throw e;
            }

    }

}
