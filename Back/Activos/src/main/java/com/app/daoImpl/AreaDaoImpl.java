package com.app.daoImpl;

import java.util.ArrayList;

import com.app.beans.Area;
import com.app.beans.Persona;
import com.app.dao.AreaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaDaoImpl implements AreaDao{

    @Autowired
    private DataSource dataSource;	
  
    /**
     * Lista todas las areas
     * @return lista con todas las areas
     * @throws Exception  lanza excepción
     */
    public ArrayList<Area> ListarTodas() throws Exception {
        
        ArrayList<Area> areas = new ArrayList<Area>();
		
        String sql = "SELECT * FROM area";
        Connection con= null;
        ResultSet r;

        try {
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            r = ps.executeQuery();

            while (r.next()) {

                Area area = new Area();
                area.setId(r.getInt("id"));
                area.setCiudad(r.getString("nombre"));
                area.setCiudad(r.getString("ciudad"));
                areas.add(area);
            }
            ps.close();
        }catch(Exception e) {
                throw e;
        }finally {
                if(con!=null) {
                        con.close();
                }
        }

        return areas;
    }

    /**
     * Permite registrar una nueva area
     * @param area Objeto del tipo area
     * @throws Exception lanza excepción
     */
    public void Registrar(Area area) throws Exception {
        
        String sql = "Insert INTO area (nombre) values (?)";
        Connection con= null;

        try {
                con = dataSource.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,area.getNombre());
                ps.setString(2,area.getCiudad());
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
