/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDato;

import CapaNegocio.ClsEstudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ClsBdEstudiante {
    private Connection _base;
    private Statement _tabla;
    private ResultSet _registro;
    ClsEstudiante notas;
    public ClsBdEstudiante (String dirbase) throws SQLException{
        try{
            _base=DriverManager.getConnection("jdbc:ucanaccess://"+dirbase);
            _tabla=_base.createStatement(ResultSet.FETCH_UNKNOWN,ResultSet.TYPE_SCROLL_SENSITIVE);
            System.out.print("******CONEXION EXITOSA******");
        }
        catch (SQLException err){
            System.out.print("*****CONEXION ERRADA******"+err);
        }
    }

    public ResultSet getRegistro() {
        return _registro;
    }
    
    public boolean Consulta(String tabla) throws SQLException{
        String comando="SELECT * FROM "+ tabla;
        _registro=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        _registro=_tabla.getResultSet();
        if (_registro!=null){
            respuesta=true;
        }
        return respuesta;
    }
    
    public boolean Consulta1(int clave) throws SQLException {
        String comando = "SELECT * FROM TbNotas WHERE ClaveEst = "+clave;
        _registro=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        _registro=_tabla.getResultSet();
        if (_registro!=null)
        {
            respuesta=true;
        }
        return respuesta;
    }
    
     /*public ArrayList<String> llenarnotas(int clave) throws SQLException{
        ArrayList<String> lista=new ArrayList<>();
        String q= "SELECT * FROM TbNotas WHERE ClaveEst = "+ clave;
        try{
            _registro=_tabla.executeQuery(q);
        }catch(SQLException err){
            System.out.println(err);
        }
        float notas=0;
        try{
            while(_registro.next()){
                lista.add(Integer.toString(_registro.getInt("Nota")));
                
            }
        }catch(SQLException err){
            System.out.println(err);
        }
        return lista;
    }*/
     public void anterior()throws SQLException{
            try{
           if (!(_registro.previous())){
               _registro.last();
           }
       }catch(SQLException err){
             System.out.println("*** error recorrer ***" + err);
        }
    }
    public void siguiente()throws SQLException{
       try{
           if (!(_registro.next())){
               _registro.first();
           }
       }catch(SQLException err){
             System.out.println("*** error recorrer ***" + err);
        }        
    }
    
    public void insertarE(String tabla,String nombre, String Direccion, String Sexo) throws SQLException{
        String valores="'"+nombre+"','"+Direccion+"','"+Sexo+"'";
        String cadena="INSERT INTO "+tabla+"(Nombre,Direccion,Sexo) VALUES ("+valores+")";
        _tabla.executeUpdate(cadena);
        _registro=_tabla.getResultSet();     
    }
    
    public float[] vector( int clave ) throws SQLException{
        float notas[] = null;
        int i=0;
        Consulta1(clave);
        try{
            while(_registro.next()){
                notas[i]=(_registro.getFloat("Nota"));
                i++;
            }
        }catch(SQLException err){
            System.out.println(err);
        }
        return notas;
    }
}
