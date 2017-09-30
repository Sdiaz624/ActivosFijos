package com.app.service;

import java.sql.Date;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.app.beans.Activo;

@Path("/Activo")
public interface ActivoSer {

	@POST
        @Path("/Registrar")
        @Consumes({"application/json;charset=UTF-8"})
	public void Registrar(Activo activo) throws Exception; 
	
	@POST
        @Path("/Actualizar")
        @Consumes({"application/json;charset=UTF-8"})
	public void Actualizar(Activo activo) throws Exception;
	
	@GET
        @Path("/Consulta")
        @Produces({"application/json;charset=UTF-8"})
	public ArrayList<Activo> ListarTodas() throws Exception;
			
	@GET
        @Path("/ConsultaTipo/{tipo}")
        @Produces({"application/json;charset=UTF-8"})
	public ArrayList<Activo> ListarTipo(@PathParam("tipo") String tipo) throws Exception;
	
	@GET
        @Path("/ConsultaFecha/{fecha}")
        @Produces({"application/json;charset=UTF-8"})
	public ArrayList<Activo> ListarFecha(@PathParam("fecha") Date fechaIni,
                                             @PathParam("fecha") Date fechaFin) throws Exception;
	
	@GET
        @Path("/ConsultaSerial/{serial}")
        @Produces({"application/json;charset=UTF-8"})
	public ArrayList<Activo> ListarSerial(@PathParam("serial") String serial) throws Exception;
	
}
