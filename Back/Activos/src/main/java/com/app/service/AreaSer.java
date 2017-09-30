package com.app.service;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.app.beans.Area;

@Path("/Area")
public interface AreaSer {

	
    @GET
    @Path("/Consulta")
    @Produces({"application/json;charset=UTF-8"})
    public ArrayList<Area> ListarTodas() throws Exception;
	
    @POST
    @Path("/Registrar")
    @Consumes({"application/json;charset=UTF-8"})
    // TODO RETORNO
    public boolean Registrar(Area area) throws Exception;
	
}
