package com.app.daoImpl;

import java.sql.Date;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.beans.Activo;
import com.app.dao.ActivoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Implementación de los comportamientos de un activo al comunicarse
 * con la base de datos
 * @author Sergio
 */

public class ActivoDaoImpl implements ActivoDao {

	@Autowired
	private DataSource dataSource;	
	
        /**
         * Permite registrar en la base de datos un activo
         * @param activo objeto de tipo activo
         * @throws Exception lanza excepción
         */
	public void Registrar(Activo activo) throws Exception {
            
            Connection con= null;
            
            if (activo.getPersona()>0){
                String sqlpersona = "Insert "
                    + "         INTO activos(Nombre,NumeroInt,Descripcion,Tipo,"
                    + "                       Serial,Peso,Alto,Largo,Valor,"
                    + "                       FechaCompra,FechaBaja,Estado"
                    + "                       Color,Persona)"
                    + "          values (?,?,?,?,?,?,?,?,?,DATE(?),DATE(?),?,?,?)";
                
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
                    + "          values (?,?,?,?,?,?,?,?,?,DATE(?),DATE(?),?,?,?)";
                
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
                    + "          values (?,?,?,?,?,?,?,?,?,DATE(?),DATE(?),?,?)";
                
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

        /**
         * Permite actualizar un activo
         * @param activo
         * @throws Exception lanza excepción
         */
	public void Actualizar(Activo activo) throws Exception {
            
            Connection con= null;
            
            if (activo.getPersona()>0){
                String sqlpersona = "UPDATE activos "
                    + "              SET Nombre = ?,"
                    + "                  NumeroInt = ?,"
                    + "                  Descripcion = ?,"
                    + "                  Tipo = ?,"
                    + "                  Serial = ?,"
                    + "                  Peso = ?,"
                    + "                  Alto = ?,"
                    + "                  Largo = ?,"
                    + "                  Valor = ?,"
                    + "                  FechaCompra = DATE (?),"
                    + "                  FechaBaja = DATE (?),"
                    + "                  Estado = ?"
                    + "                  Color = ?,"
                    + "                  Persona = ?,"
                    + "                  Area = null)"
                    + "               WHERE id = ?";
                
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
                        ps.setInt(15,activo.getId());                        
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
                
                String sqlpersona = "UPDATE activos "
                    + "              SET Nombre = ?,"
                    + "                  NumeroInt = ?,"
                    + "                  Descripcion = ?,"
                    + "                  Tipo = ?,"
                    + "                  Serial = ?,"
                    + "                  Peso = ?,"
                    + "                  Alto = ?,"
                    + "                  Largo = ?,"
                    + "                  Valor = ?,"
                    + "                  FechaCompra = DATE(?),"
                    + "                  FechaBaja = DATE(?),"
                    + "                  Estado = ?"
                    + "                  Color = ?,"
                    + "                  Persona = null,"
                    + "                  Area = ?)"
                    + "               WHERE id = ?";
                
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
                        ps.setInt(15,activo.getId());                        
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
                
                String sqlpersona = "UPDATE activos "
                    + "              SET Nombre = ?,"
                    + "                  NumeroInt = ?,"
                    + "                  Descripcion = ?,"
                    + "                  Tipo = ?,"
                    + "                  Serial = ?,"
                    + "                  Peso = ?,"
                    + "                  Alto = ?,"
                    + "                  Largo = ?,"
                    + "                  Valor = ?,"
                    + "                  FechaCompra = DATE(?),"
                    + "                  FechaBaja = DATE(?),"
                    + "                  Estado = ?"
                    + "                  Color = ?,"
                    + "                  Persona = null,"
                    + "                  Area = null)"
                    + "               WHERE id = ?";
                
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
                        ps.setInt(14,activo.getId());                        
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

        /**
         * Permite listar todos los activos fijos 
         * @return lista de todos los activos fijos
         * @throws Exception lanza excepción
         */
	public ArrayList<Activo> ListarTodas() throws Exception {
	
            ArrayList<Activo> activos = new ArrayList<Activo>();
		
            String sql = "SELECT * FROM activos ";
            Connection con= null;
            ResultSet r;
                try {
                    con = dataSource.getConnection();
                    PreparedStatement ps = con.prepareStatement(sql);
                    r = ps.executeQuery();
						
			while (r.next()) {
				
				Activo activo = new Activo();
								
				activo.setId(r.getInt("id"));
				activo.setNombre(r.getString("Nombre"));
                                activo.setNumeroInt(r.getInt("NumeroInt"));
				activo.setDescription(r.getString("Descripcion"));
                                activo.setTipo(r.getString("Tipo"));
                                activo.setSerial(r.getString("Serial"));
                                activo.setPeso(r.getFloat("Peso"));
                                activo.setAlto(r.getFloat("Alto"));
                                activo.setLargo(r.getFloat("Largo"));
                                activo.setValor(r.getFloat("Valor"));
                                activo.setFechaBaja(r.getDate("FechaBaja"));
                                activo.setFechaCompra(r.getDate("FechaCompra"));
				activo.setEstado(r.getString("Estado"));
                                activo.setColor(r.getString("Color"));
                                activo.setPersona(r.getInt("Persona"));
                                activo.setArea(r.getInt("Area"));
				
				activos.add(activo);
			}
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con!=null) {
				con.close();
			}
		}
				
		return activos;            
	}

        /**
         * permite listar los activos fijos por tipo
         * @param tipo tipo de activo que se desea listar
         * @return lista de todos los activos de un tipo
         * @throws Exception lanza excepción
         */
public ArrayList<Activo> ListarTipo(String tipo) throws Exception {


    ArrayList<Activo> activos = new ArrayList<Activo>();

    String sql = "SELECT * FROM activos WHERE Tipo = ? ";
    Connection con= null;
    ResultSet r;
        try {
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,tipo);
            r = ps.executeQuery();

                while (r.next()) {

                        Activo activo = new Activo();

                        activo.setId(r.getInt("id"));
                        activo.setNombre(r.getString("Nombre"));
                        activo.setNumeroInt(r.getInt("NumeroInt"));
                        activo.setDescription(r.getString("Descripcion"));
                        activo.setTipo(r.getString("Tipo"));
                        activo.setSerial(r.getString("Serial"));
                        activo.setPeso(r.getFloat("Peso"));
                        activo.setAlto(r.getFloat("Alto"));
                        activo.setLargo(r.getFloat("Largo"));
                        activo.setValor(r.getFloat("Valor"));
                        activo.setFechaBaja(r.getDate("FechaBaja"));
                        activo.setFechaCompra(r.getDate("FechaCompra"));
                        activo.setEstado(r.getString("Estado"));
                        activo.setColor(r.getString("Color"));
                        activo.setPersona(r.getInt("Persona"));
                        activo.setArea(r.getInt("Area"));

                        activos.add(activo);
                }
                ps.close();
        }catch(Exception e) {
                throw e;
        }finally {
                if(con!=null) {
                        con.close();
                }
        }

        return activos;            

}

/**
 * permite listar los activos fijos por un rango de fecha
 * de compra 
 * @param fechaIni fecha de inicio de rango de compra
 * @param fechaFin fecha de fin de rango de compra
 * @return lista de todos los activos de un rango de fechas
 * @throws Exception lanza excepción
 */
public ArrayList<Activo> ListarFecha(Date fechaIni, Date fechaFin) throws Exception {
		// TODO Auto-generated method stub
	 
            ArrayList<Activo> activos = new ArrayList<Activo>();
		
            String sql = "SELECT * FROM activos WHERE FechaCompra between DATE (?) and DATE(?) ";
            Connection con= null;
            ResultSet r;
                try {
                    con = dataSource.getConnection();
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setDate(1,fechaIni);
                    ps.setDate(2,fechaFin);
                    r = ps.executeQuery();
						
			while (r.next()) {
				
				Activo activo = new Activo();
								
				activo.setId(r.getInt("id"));
				activo.setNombre(r.getString("Nombre"));
                                activo.setNumeroInt(r.getInt("NumeroInt"));
				activo.setDescription(r.getString("Descripcion"));
                                activo.setTipo(r.getString("Tipo"));
                                activo.setSerial(r.getString("Serial"));
                                activo.setPeso(r.getFloat("Peso"));
                                activo.setAlto(r.getFloat("Alto"));
                                activo.setLargo(r.getFloat("Largo"));
                                activo.setValor(r.getFloat("Valor"));
                                activo.setFechaBaja(r.getDate("FechaBaja"));
                                activo.setFechaCompra(r.getDate("FechaCompra"));
				activo.setEstado(r.getString("Estado"));
                                activo.setColor(r.getString("Color"));
                                activo.setPersona(r.getInt("Persona"));
                                activo.setArea(r.getInt("Area"));
				
				activos.add(activo);
			}
			ps.close();
		}catch(Exception e) {
			throw e;
		}finally {
			if(con!=null) {
				con.close();
			}
		}
				
            return activos;            
            
	}

/**
 * Permite listar todos los activos fijos por serial
 * @param serial serial quese desea buscar
 * @return lista de todos los activos de un serial
 * @throws Exception lanza excepción
 */
public ArrayList<Activo> ListarSerial(String serial) throws Exception {

    ArrayList<Activo> activos = new ArrayList<Activo>();

    String sql = "SELECT * FROM activos WHERE Serial = ? ";
    Connection con= null;
    ResultSet r;
        try {
            con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,serial);

            r = ps.executeQuery();

                while (r.next()) {

                        Activo activo = new Activo();

                        activo.setId(r.getInt("id"));
                        activo.setNombre(r.getString("Nombre"));
                        activo.setNumeroInt(r.getInt("NumeroInt"));
                        activo.setDescription(r.getString("Descripcion"));
                        activo.setTipo(r.getString("Tipo"));
                        activo.setSerial(r.getString("Serial"));
                        activo.setPeso(r.getFloat("Peso"));
                        activo.setAlto(r.getFloat("Alto"));
                        activo.setLargo(r.getFloat("Largo"));
                        activo.setValor(r.getFloat("Valor"));
                        activo.setFechaBaja(r.getDate("FechaBaja"));
                        activo.setFechaCompra(r.getDate("FechaCompra"));
                        activo.setEstado(r.getString("Estado"));
                        activo.setColor(r.getString("Color"));
                        activo.setPersona(r.getInt("Persona"));
                        activo.setArea(r.getInt("Area"));

                        activos.add(activo);
                }
                ps.close();
        }catch(Exception e) {
                throw e;
        }finally {
                if(con!=null) {
                        con.close();
                }
        }

        return activos;            
            
    }
    
/**
 * Valida que el numero interno no se encuentre en la base de datos
 * @param Numero numero internoa validar 
 * @return Retorna true si esta asociada a un activo
 * @throws Exception Lanza excepcion
 */
public boolean validaNumInterno(int Numero) throws Exception {
        
    String sql = "SELECT * FROM activos WHERE  NumeroInt = ?";
    Connection con= null;
    ResultSet r;

    boolean exists = false;

    try {
        con = dataSource.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,Numero);
        r = ps.executeQuery();

        while (r.next()) {
            exists = true;
        }
        ps.close();
    }catch(Exception e) {
        throw e;
    }finally {
        if(con!=null) {
            con.close();
        }
    }

    return exists;
}

}
