/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsConexion;

import CpapNegocio.ClsEstudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class ClsConexion {
    private Connection _base;
    private Statement _tabla;
    private ResultSet _registro,_registronotas;
    ClsEstudiante regest;
    public ClsConexion (String dirbase) throws SQLException{
        try{
            _base=DriverManager.getConnection("jdbc:ucanaccess://"+dirbase);
            _tabla=_base.createStatement(ResultSet.FETCH_UNKNOWN,ResultSet.TYPE_SCROLL_SENSITIVE);
            
            System.out.print("******CONEXION EXITOSA******");
        }
        catch (SQLException err){
            System.out.print("*****CONEXION ERRADA******"+err);
        }
        regest =new ClsEstudiante();
    }
    
    public ResultSet Consulta (String tabla) throws SQLException{
        String comando="SELECT * FROM "+ tabla;
        _registro=null;
        _tabla.executeQuery(comando);
        _registro=_tabla.getResultSet();
        return _registro;
    }
    
    public ResultSet Consulta1(int clave) throws SQLException {
        String comando = "SELECT * FROM TbNotas WHERE Clave = "+clave;
        _registronotas=null;
        _tabla.execute(comando);
        _registronotas=_tabla.getResultSet();
        return _registronotas;
    }
    
    public ClsEstudiante anteriorest(ResultSet rs)throws SQLException{
        try{
           if (!(_registro.previous())){
               _registro.last();
               
           }
       }catch(SQLException err){
             System.out.println("*** error recorrer ***" + err);
        }
        cargarest(rs);
        regest.setNota(this.vector(regest.getClave()));
        return regest;
    }
    public ClsEstudiante siguienteest(ResultSet rs)throws SQLException{
       _registro=rs;
       try{
           if (!(_registro.next())){
               _registro.first();
               
           }
       }catch(SQLException err){
             System.out.println("*** error recorrer ***" + err);
       }
       cargarest(rs);
       regest.setNota(this.vector(regest.getClave()));
       return regest;
    }

    public ResultSet getRegistro() {
        return _registro;
    }
    
    
    public void cargarest(ResultSet rs) throws SQLException{
        regest.setNombre(rs.getString("Nombre"));
        regest.setClave(rs.getInt("Clave"));
        
    }
    
    public float[] vector( int clave ) throws SQLException{
        float []notas = null;
        int n=0;
        String comando = "SELECT * FROM TbNotas WHERE Clave = "+clave;
        _registro=null;
        _tabla.execute(comando);
        _registronotas=_tabla.getResultSet();
        notas = new float[10];
            for(int i=0;_registronotas.next();i++){
                notas[i]=(_registro.getFloat("Nota"));
                n++;
            }
            regest.setNumnotas(n);
            
        return notas;
    }
}
