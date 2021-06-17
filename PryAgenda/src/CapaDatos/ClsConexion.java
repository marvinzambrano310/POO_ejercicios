/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ClsConexion {
    private Connection _base;
    private Statement _tabla;
    private ResultSet _registro;
    public ClsConexion (String dirbase) throws SQLException{
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
    
    public void siguiente () throws SQLException{
        try{
            if(!(_registro.next())){
                _registro.first();
            }
        }
        catch (SQLException err){
            System.out.print("******ERROR RECORRER: 404 NOT FOUND******");
        }
        
    }
    public void anterior() throws SQLException{
        try{
            if(!(_registro.previous())){
                _registro.last();
            }
        }
        catch (SQLException err){
            System.out.print("******ERROR RECORRER: 404 NOT FOUND******");
        }
    }
    
    public boolean Consulta1(int clave) throws SQLException{
        String comando="SELECT * FROM TbTelefono WHERE ClvContacto = " + clave;
        _registro=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        _registro=_tabla.getResultSet();
        if (_registro!=null){
            respuesta=true;
        }
        return respuesta;
    }
}
