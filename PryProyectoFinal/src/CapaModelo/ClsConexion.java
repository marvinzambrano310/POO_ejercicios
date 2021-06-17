/*
 * 
 */
package CapaModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Programacion Objetos
 */
public class ClsConexion {

    private Connection con = null;
    private static Statement st;
    private ResultSet rs;

    public ClsConexion(String base) {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + base);
            st = con.createStatement();
            System.out.println("Conexion exitosa!");
        } catch (SQLException e) {
            System.out.println("Error en conexion " + e);
        }
    }

    public static Connection conectar(String base) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + base);
            st = con.createStatement();
            System.out.println("Conexion exitosa!");
        } catch (SQLException e) {
            System.out.println("Error en conexion " + e);
        }
        return con;
    }

    public ClsConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet lista(String tabla) throws SQLException {
        String comando = "SELECT * FROM " + tabla;
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }

    public ResultSet datosCliente(String cedula) throws SQLException {
        String comando = "SELECT * FROM TblClientes where Cedula = '" + cedula + "'";
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }

    public ResultSet datosProveedor() throws SQLException {
        String comando = "SELECT Proveedor FROM TblProveedores";
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }

    public ResultSet listaProducto(String tipo) throws SQLException {
        String comando = "SELECT * FROM TblInventario where tipo = '" + tipo + "'";
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }

    public ResultSet listaNombreProducto(String tipo) throws SQLException {
        String comando = "SELECT Nombre FROM TblInventario where tipo = '" + tipo + "'";
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }

    public ResultSet aviso(String tipo) throws SQLException {
        String comando = "SELECT Nombre FROM TblInventario where Tipo = '" + tipo + "' and Cantidad < '" + 10 + "'";
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }

    public ResultSet compraVenta(String nombre) throws SQLException {
        String comando = "SELECT * FROM TblInventario where Nombre = '" + nombre + "'";
        st.execute(comando);
        rs = st.getResultSet();
        return rs;
    }
}
