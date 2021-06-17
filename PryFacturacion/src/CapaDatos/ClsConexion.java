/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Fredd
 */
public class ClsConexion {
    private Connection _bd;
    private Statement _tabla;
    private ResultSet _registros;
    private ResultSet _cliente;
    private ResultSet _Vende;
    private ResultSet _producto;
    public ClsConexion(String ubicacion) throws SQLException{
        try{
            _bd=DriverManager.getConnection("jdbc:ucanaccess://"+ubicacion);
            _tabla=_bd.createStatement(ResultSet.FETCH_UNKNOWN,ResultSet.TYPE_SCROLL_SENSITIVE);
            System.out.println("*****CONEXION EXITOSA*****");
        }catch(SQLException err){
        System.out.println("*****CONEXION ERRADA*****"+err);
        }
    }

    public ResultSet getRegistros() {
        return _registros;
    }
    public boolean consulta(String tabla) throws SQLException{
        boolean resp=false;
        String cadena= "SELECT * FROM "+tabla;
        _registros=null;
        _tabla.execute(cadena);
        _registros=_tabla.getResultSet();
        if(_registros!=null){
            resp=true;
        }
        return resp;
    }
    public void consulta1(String Tabla) throws SQLException{
        String Cadena="SELECT * FROM"+Tabla;
        _tabla.execute(Cadena);
        _registros=_tabla.getResultSet();
        
        
    }
    public void insertarP(String tabla,String nomP, String precioP, int cantidadP, String unidades) throws SQLException{
        String valores="'"+nomP+"','"+precioP+"','"+cantidadP+"','"+unidades+"'";
        String cadena="INSERT INTO "+tabla+"(nomProducto,precioProducto,cantProducto,unidadProducto) VALUES ("+valores+")";
        _tabla.executeUpdate(cadena);
        _registros=_tabla.getResultSet();  
        actualizarP(tabla);
    }
    public void actualizarP(String tabla) throws SQLException{
        String cadena="SELECT FROM "+tabla;
        _tabla.execute(cadena);
        _registros=_tabla.getResultSet();
    }
    public void modificarP(String tabla,String nomP, String precioP, int cantidadP, String unidades, int clave) throws SQLException{
        String cadena="UPDATE "+tabla+ " SET "+"nomProducto='"+nomP+"', precioProducto='"+precioP+"', cantProducto='"+cantidadP+"', unidadProducto='"+unidades+"' WHERE clvProducto='"+clave+"'";
        _tabla.executeUpdate(cadena);
    }
    public void eliminarP(String tabla, int clave) throws SQLException{
        String cadena= "DELETE FROM "+tabla+" WHERE clvCliente="+clave;
        _tabla.executeUpdate(cadena);
    }
    public void anterior()throws SQLException{
            try{
           if (!(_registros.previous())){
               _registros.last();
           }
       }catch(SQLException err){
             System.out.println("*** error recorrer ***" + err);
        }
    }    
    public void siguiente()throws SQLException{
       try{
           if (!(_registros.next())){
               _registros.first();
           }
       }catch(SQLException err){
             System.out.println("*** error recorrer ***" + err);
        }        
    }
    public void insertarC(String tabla,String nomC,String apelC, String fechaNacC, String dirC, String telC, String celC,String emailC) throws SQLException{
        String valores="'"+nomC+"','"+apelC+"','"+fechaNacC+"','"+dirC+"','"+telC+"','"+celC+"','"+emailC+"'";
        String cadena="INSERT INTO "+tabla+"(nomCliente,apellCliente,fechanacCliente,dirCliente,telfCliente,celCliente,emailCliente) VALUES ("+valores+")";
        _tabla.executeUpdate(cadena);
        _registros=_tabla.getResultSet();     
    }    
    public void actualizarC(String tabla,String nomC,String apelC, String fechaNacC, String dirC, String telC, String celC,String emailC, int clave) throws SQLException{
        String cadena="UPDATE "+tabla+ " SET "+"nomCliente='"+nomC+"', apellCliente='"+apelC+"', fechanacCliente='"+fechaNacC+"', dirCliente='"+dirC+"', telfCliente='"+telC+"', celCliente='"+celC+"', emailCliente='"+emailC+"' WHERE clvCliente='"+clave+"'";
        _tabla.executeUpdate(cadena);
    }    
    public void eliminarC(String tabla, int clave) throws SQLException{
        String cadena= "DELETE FROM "+tabla+" WHERE clvCliente="+clave;
        _tabla.executeUpdate(cadena);
    }    
    public void insertarV(String tabla,String nomV,String apelV,  String dirV, String telV, String celV) throws SQLException{
        String valores="'"+nomV+"','"+apelV+"','"+dirV+"','"+telV+"','"+celV+"'";
        String cadena="INSERT INTO "+tabla+"(nomVendedor,apellVendedor,dirVendedor,tlfVendedor,celVendedor) VALUES ("+valores+")";
        _tabla.executeUpdate(cadena);
        _registros=_tabla.getResultSet();     
    }   
    public void actualizarV(String tabla,String nomV,String apelV,  String dirV, String telV, String celV, int clave) throws SQLException{
        String cadena="UPDATE "+tabla+ " SET "+"nomVendedor='"+nomV+"', apellVendedor='"+apelV+"', dirVendedor='"+dirV+"', tlfVendedor='"+telV+"', celVendedor='"+celV+"' WHERE clvVendedor='"+clave+"'";
        _tabla.executeUpdate(cadena);
    }
    public void eliminarV(String tabla, int clave) throws SQLException{
        String cadena= "DELETE FROM "+tabla+" WHERE clvVendedor="+clave;
        _tabla.executeUpdate(cadena);
    }  
    public ArrayList<String> llenarclientes() throws SQLException{
        ArrayList<String> lista=new ArrayList<>();
        String q= "SELECT * FROM TbClientes";
        try{
            _registros=_tabla.executeQuery(q);
        }catch(SQLException err){
            System.out.println(err);
        }
        try{
            while(_registros.next()){
                lista.add(Integer.toString(_registros.getInt("ClvCliente")));
            }
        }catch(SQLException err){
            System.out.println(err);
        }
        return lista;
    }
    public ArrayList<String> llenarvende() throws SQLException{
        ArrayList<String> lista=new ArrayList<>();
        String q= "SELECT * FROM TbVendedor";
        try{
            _registros=_tabla.executeQuery(q);
        }catch(SQLException err){
            System.out.println(err);
        }
        try{
            while(_registros.next()){
                lista.add(Integer.toString(_registros.getInt("clvVendedor")));
            }
        }catch(SQLException err){
            System.out.println(err);
        }
        return lista;
    }    
    public ArrayList<String> llenarPro() throws SQLException{
        ArrayList<String> lista=new ArrayList<>();
        String q= "SELECT * FROM TbProducto";
        try{
            _registros=_tabla.executeQuery(q);
        }catch(SQLException err){
            System.out.println(err);
        }
        try{
            while(_registros.next()){
                lista.add(_registros.getString("clvProducto")+", "+_registros.getString("nomProducto"));
            }
        }catch(SQLException err){
            System.out.println(err);
        }
        return lista;
    }   
    public ArrayList<String> llenarDet() throws SQLException{
        ArrayList<String> lista=new ArrayList<>();
        String q= "SELECT * FROM TbCabFactura";
        try{
            _registros=_tabla.executeQuery(q);
        }catch(SQLException err){
            System.out.println(err);
        }
        try{
            while(_registros.next()){
                lista.add(_registros.getString("clvFactura"));
            }
        }catch(SQLException err){
            System.out.println(err);
        }
        return lista;
    }      
    public void insertarCabF(String fechaF,int claveC, int claveV) throws SQLException{
        String valores="'"+fechaF+"','"+claveC+"','"+claveV+"'";
        String cadena="INSERT INTO TbCabFactura (fechaFactura,clvCliente,clvVendedor) VALUES ("+valores+")";
        _tabla.executeUpdate(cadena);    
    }   
    public void RestaPro(int cantidad,int pro) throws SQLException{
        String cadena= "UPDATE TbProducto SET cantProducto='"+cantidad+"' WHERE clvProducto='"+pro+"'";
        _tabla.executeUpdate(cadena);
    }
    public void GuardaDet(int clvFac,int clvP, int can) throws SQLException{
        
        String valores="'"+clvFac+"','"+clvP+"','"+can+"'";
        String cadena="INSERT INTO TbDetFactura (clvFactura,clvProducto,cantProducto) VALUES ("+valores+")";
        _tabla.executeUpdate(cadena);
        _registros=_tabla.getResultSet();
        
    }
    public int RetornaCantidad(int clave) throws SQLException{
        int a = 0;
        try{
            String valores= "SELECT * FROM TbProducto WHERE clvProducto='"+clave+"'";
            _tabla.executeQuery(valores);
            _registros=_tabla.getResultSet();
            a=_registros.getInt("cantProducto");
        }catch(SQLException err){
            System.out.println(err);
        }
        return a;
    }
}
