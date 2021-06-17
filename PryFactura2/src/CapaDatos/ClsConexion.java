/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Usuario
 */
public class ClsConexion {
    Connection _base= null;
    Statement _tabla;
    //resulset por clase
    ResultSet _cliente;
    ResultSet _vendedor;
    ResultSet _producto;
    //general
    ResultSet _datos;
    //String dirbase;

    public ClsConexion (String dirbase) throws SQLException{
        try{
            _base=DriverManager.getConnection("jdbc:ucanaccess://"+dirbase);
            System.out.print("******CONEXION EXITOSA******");
        }
        catch (SQLException err){
            System.out.print("*****CONEXION ERRADA******"+err);
        }
    }
    
    public ResultSet Consulta1(String tabla) throws SQLException{
        _tabla=_base.createStatement(ResultSet.FETCH_UNKNOWN,ResultSet.TYPE_SCROLL_SENSITIVE);
        String comando= "SELECT * FROM "+ tabla;
        //_tabla.execute(comando);
        _datos=_tabla.executeQuery(comando);
        _tabla.close();
        return _datos;
    }
    
    public boolean InsertarVendedor(RegVendedor vendedor) throws SQLException{
        boolean insertavendedor= false;
        String insertar= "INSERT INTO TbVendedor VALUES(";
        _tabla=_base.createStatement();
        insertar+=vendedor._claveV+",'"+vendedor._nombreV+"','"+vendedor._apellidoV+"','"+vendedor._direccion+"','"+vendedor._telefonoV+"','"+vendedor._celularV+"')";
        insertavendedor=_tabla.execute(insertar);
        _tabla.close();
        return insertavendedor;
    }
    
    public boolean InsertarCliente(RegCliente c) throws SQLException{
        boolean insertac= false;
        String insertar= "INSERT INTO TbCliente VALUES(";
        _tabla=_base.createStatement();
        insertar+=c._claveC+",'"+c._nombreC+"','"+c._apellidoC+"','"+c._direccionC+"','"+c._fechaN+"','"+c._telefonoC+"','"+c._celularC+"','"+c._email+"')";
        insertac=_tabla.execute(insertar);
        _tabla.close();
        return insertac;
    }
    
    public boolean InsertarItem(RegProducto p) throws SQLException{
        boolean insertap= false;
        String insertar= "INSERT INTO TbProducto VALUES(";
        _tabla=_base.createStatement();
        insertar+=p._claveP+"',"+p._descripcion+"',"+p._cantidad+","+p._precio+")";
        insertap=_tabla.execute(insertar);
        _tabla.close();
        return insertap;
    }
    
    public boolean BorrarCliente(int clave) throws SQLException{
        boolean borrarc= false;
        String borrar= "DELETE FROM TbCliente WHERE clvCliente = ";
        _tabla=_base.createStatement();
        borrar+=clave;
        borrarc=_tabla.execute(borrar);
        _tabla.close();
        return borrarc;
    }
    
    public boolean BorrarVendedor(int clave) throws SQLException{
        boolean borrarv= false;
        String borrar= "DELETE FROM TbVendedor WHERE clvVendedor = ";
        _tabla=_base.createStatement();
        borrar+=clave;
        borrarv=_tabla.execute(borrar);
        _tabla.close();
        return borrarv;
    }
    
    public boolean BorrarProducto(int clave) throws SQLException{
        boolean borrarp= false;
        String borrar= "DELETE FROM TbProducto WHERE ClvProducto = ";
        _tabla=_base.createStatement();
        borrar+=clave;
        borrarp=_tabla.execute(borrar);
        _tabla.close();
        return borrarp;
    }
    
    public boolean ActualizaCliente(RegCliente c) throws SQLException{
        boolean actualizac= false;
        String actualizar= "UPDATE TbCliente SET ";
        _tabla=_base.createStatement();
        actualizar+=" nomCliente = '"+c._nombreC+"', apellCliente = '"+c._apellidoC+"', dirCliente ='"+c._direccionC+"', fechaCliente ='"+c._fechaN+"', telfCliente ='"+c._telefonoC+"', celCliente='"+c._celularC+"', emailCliente= '"+c._email+"' WHERE clvCliente = "+c._claveC;
        actualizac=_tabla.execute(actualizar);
        _tabla.close();
        return actualizac;
    }
    
    public boolean ActualizarVendedor(RegVendedor vendedor) throws SQLException{
        boolean actualizarv= false;
        String actualizar= "UPDATE TbCliente SET ";
        _tabla=_base.createStatement();
        actualizar+=" nomVendedor ='"+vendedor._nombreV+"', apellVendedor='"+vendedor._apellidoV+"', dirVendedor='"+vendedor._direccion+"', tlfVendedor= '"+vendedor._telefonoV+"', celVendedor='"+vendedor._celularV+"' WHERE clvVendedor = "+vendedor._claveV;
        actualizarv=_tabla.execute(actualizar);
        _tabla.close();
        return actualizarv;
    }
    
    public boolean ActualizarItem(RegProducto p) throws SQLException{
        boolean actualizarp= false;
        String actualizar= "UPDATE TbProducto SET ";
        _tabla=_base.createStatement();
        actualizar+="nomProducto='"+p._descripcion+"', cantProducto="+p._cantidad+", precioProducto"+p._precio+" WHERE ClvProducto ="+p._claveP;
        actualizarp=_tabla.execute(actualizar);
        _tabla.close();
        return actualizarp;
    }
    
    public boolean InsertarCabFactura(int clvVendedor, int clvCliente, String fechaventa) throws SQLException{
        String comando= "INSERT INTO TbCabFactura VALUES(";
        boolean cabecera=false;
        _tabla=_base.createStatement();
        comando+="ClvVendedor= "+clvVendedor+", clvCliente="+clvCliente+", fechaFactura='"+fechaventa+"')";
        cabecera=_tabla.execute(comando);
        return cabecera;       
    }
    
    public boolean InsertarDetFactura(int clvFactura, int clvProducto, int cantidad) throws SQLException{
        String comando= "INSERT INTO TbDetfactura VALUES(";
        boolean cabecera=false;
        _tabla=_base.createStatement();
        comando+="ClvFactura= "+clvFactura+", ClvProducto="+clvProducto+", cantProducto='"+cantidad+"')";
        cabecera=_tabla.execute(comando);
        return cabecera;       
    }
    
    
}
