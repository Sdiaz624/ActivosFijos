package com.app.daoImpl;

import java.sql.Date;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.beans.Activo;
import com.app.dao.ActivoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Implementación de los comportamientos de un activo al comunicarse
 * con la base de datos
 * @author Sergio
 */
@Repository
public class ActivoDaoImpl implements ActivoDao {

	@Autowired
	private DataSource dataSource;	
	
        /**
         * Permite registrar en la base de datos un producto
         * @param activo
         * @throws Exception 
         */
	public void Registrar(Activo activo) throws Exception {
            
            Connection con= null;
            
            if (activo.getPersona()>0){
                String sqlpersona = "Insert "
                    + "         INTO activos(Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color,Persona)"
                    + "          values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlpersona);
			ps.setString(1,activo.getNombre());
			ps.setInt(2,activo.getNumeroInt());
			ps.setString(3,activo.getDescription());
                        ps.setString(4,activo.getTipo());
			ps.setString(5,activo.getSerial());
                        ps.setFloat(6, activo.getPeso());
                        ps.setFloat(7, activo.getAlto());
                        ps.setFloat(8, activo.getLargo());
                        ps.setFloat(9, activo.getValor());                        
                        ps.setDate(10,activo.getFechaCompra());
                        ps.setDate(11,activo.getFechaBaja());
                        ps.setString(12,activo.getEstado());
                        ps.setString(13,activo.getColor());
                        ps.setInt(14,activo.getPersona());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con!=null) {
				con.close();
			}
		}
            }else if (activo.getArea()>0){
                
                String sqlpersona = "Insert "
                    + "         INTO activos(Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color,Area)"
                    + "          values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlpersona);
			ps.setString(1,activo.getNombre());
			ps.setInt(2,activo.getNumeroInt());
			ps.setString(3,activo.getDescription());
                        ps.setString(4,activo.getTipo());
			ps.setString(5,activo.getSerial());
                        ps.setFloat(6, activo.getPeso());
                        ps.setFloat(7, activo.getAlto());
                        ps.setFloat(8, activo.getLargo());
                        ps.setFloat(9, activo.getValor());                        
                        ps.setDate(10,activo.getFechaCompra());
                        ps.setDate(11,activo.getFechaBaja());
                        ps.setString(12,activo.getEstado());
                        ps.setString(13,activo.getColor());
                        ps.setInt(14,activo.getArea());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con!=null) {
				con.close();
			}   
		}
                
            }else{
                
                String sqlpersona = "Insert "
                    + "         INTO activos(Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color)"
                    + "          values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlpersona);
			ps.setString(1,activo.getNombre());
			ps.setInt(2,activo.getNumeroInt());
			ps.setString(3,activo.getDescription());
                        ps.setString(4,activo.getTipo());
			ps.setString(5,activo.getSerial());
                        ps.setFloat(6, activo.getPeso());
                        ps.setFloat(7, activo.getAlto());
                        ps.setFloat(8, activo.getLargo());
                        ps.setFloat(9, activo.getValor());                        
                        ps.setDate(10,activo.getFechaCompra());
                        ps.setDate(11,activo.getFechaBaja());
                        ps.setString(12,activo.getEstado());
                        ps.setString(13,activo.getColor());
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

	public void Actualizar(Activo activo) throws Exception {
            
            Connection con= null;
            
            if (activo.getPersona()>0){
                String sqlpersona = "UPDATE activos "
                    + "             set (Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color,Persona)"
                    + "          values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlpersona);
			ps.setString(1,activo.getNombre());
			ps.setInt(2,activo.getNumeroInt());
			ps.setString(3,activo.getDescription());
                        ps.setString(4,activo.getTipo());
			ps.setString(5,activo.getSerial());
                        ps.setFloat(6, activo.getPeso());
                        ps.setFloat(7, activo.getAlto());
                        ps.setFloat(8, activo.getLargo());
                        ps.setFloat(9, activo.getValor());                        
                        ps.setDate(10,activo.getFechaCompra());
                        ps.setDate(11,activo.getFechaBaja());
                        ps.setString(12,activo.getEstado());
                        ps.setString(13,activo.getColor());
                        ps.setInt(14,activo.getPersona());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con!=null) {
				con.close();
			}
		}
            }else if (activo.getArea()>0){
                
                String sqlpersona = "Insert "
                    + "         INTO Producto(Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color,Area)"
                    + "          values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlpersona);
			ps.setString(1,activo.getNombre());
			ps.setInt(2,activo.getNumeroInt());
			ps.setString(3,activo.getDescription());
                        ps.setString(4,activo.getTipo());
			ps.setString(5,activo.getSerial());
                        ps.setFloat(6, activo.getPeso());
                        ps.setFloat(7, activo.getAlto());
                        ps.setFloat(8, activo.getLargo());
                        ps.setFloat(9, activo.getValor());                        
                        ps.setDate(10,activo.getFechaCompra());
                        ps.setDate(11,activo.getFechaBaja());
                        ps.setString(12,activo.getEstado());
                        ps.setString(13,activo.getColor());
                        ps.setInt(14,activo.getArea());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con!=null) {
				con.close();
			}   
		}
                
            }else{
                
                String sqlpersona = "Insert "
                    + "         INTO Producto(Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color)"
                    + "          values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlpersona);
			ps.setString(1,activo.getNombre());
			ps.setInt(2,activo.getNumeroInt());
			ps.setString(3,activo.getDescription());
                        ps.setString(4,activo.getTipo());
			ps.setString(5,activo.getSerial());
                        ps.setFloat(6, activo.getPeso());
                        ps.setFloat(7, activo.getAlto());
                        ps.setFloat(8, activo.getLargo());
                        ps.setFloat(9, activo.getValor());                        
                        ps.setDate(10,activo.getFechaCompra());
                        ps.setDate(11,activo.getFechaBaja());
                        ps.setString(12,activo.getEstado());
                        ps.setString(13,activo.getColor());
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

	public ArrayList<Activo> ListarTodas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Activo> ListarTipo(String tipo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Activo> ListarFecha(Date fechaIni, Date fechaFin) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Activo> ListarSerial(String serial) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
