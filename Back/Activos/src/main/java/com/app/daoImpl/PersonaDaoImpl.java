package com.app.daoImpl;

import java.util.ArrayList;
import com.app.beans.Persona;
import com.app.dao.PersonaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaDaoImpl implements PersonaDao {

    @Autowired
    private DataSource dataSource;	
    
    /**
     * Lista todas las personas
     * @return una lista con todas las personas
     * @throws Exception lanza excepción
     */
    public ArrayList<Persona> ListarTodas() throws Exception {
    
        ArrayList<Persona> personas = new ArrayList<Persona>();
		
        String sql = "SELECT * FROM persona";
        Connection con= null;
        ResultSet r;

        try {
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            r = ps.executeQuery();

            while (r.next()) {

                Persona persona = new Persona();
                persona.setId(r.getInt("id"));
                persona.setNombre(r.getString("nombre"));
                personas.add(persona);
            }
            ps.close();
        }catch(Exception e) {
                throw e;
        }finally {
                if(con!=null) {
                        con.close();
                }
        }

        return personas;        
    }

    /**
     * Permite registrar una nueva persona
     * @param persona Nombre de la nueva persona
     * @throws Exception lanza excepción
     */
    public void Registrar(String persona) throws Exception {

        String sql = "Insert INTO persona(nombre) values (?)";
        Connection con= null;

        try {
                con = dataSource.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,persona);
                ps.executeUpdate();
                ps.close();
        }catch(Exception e) {
                  throw e;
        }finally {
            if(con!=null) {
                con.close();
            }
        }  

    }

}
