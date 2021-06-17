/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaModelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ClsProveedorDAO {

    private static final String base = "C://Users//Fundamentos//Downloads//PryProyectoFinal//DBProyecto.accdb";

    public void llenarTabla(DefaultTableModel m, ResultSet r) throws SQLException {
        String[] dato = new String[]{"RUC", "Proveedor", "Telefono", "Direccion"};
        m.setColumnIdentifiers(dato);
        while (r.next()) {
            dato[0] = r.getString(4);
            dato[1] = r.getString(1);
            dato[2] = r.getString(2);
            dato[3] = r.getString(3);
            m.addRow(dato);
        }
    }

    public void agregar(ClsProveedor nuevo) throws SQLException {
        Connection con;
        con = ClsConexion.conectar(base);
        PreparedStatement ps = null;
        String comando = "INSERT INTO TblProveedores(Ruc,Proveedor,Telefono,Direccion) VALUES(?,?,?,?)";
        ps = con.prepareStatement(comando);
        ps.setString(1, nuevo.getRuc());
        ps.setString(2, nuevo.getNombre());
        ps.setString(3, nuevo.getTelefono());
        ps.setString(4, nuevo.getDireccion());
        int row = ps.executeUpdate();
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Ingreso Satisfactorio");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Ingresar Cliente");
        }
    }

    public void editar(ClsProveedor nuevo) throws SQLException {
        Connection con;
        con = ClsConexion.conectar(base);
        Statement stm;
        try {
            stm = con.createStatement();
            stm.execute("UPDATE TblProveedores SET Proveedor= '" + nuevo.getNombre() + "', Telefono='" + nuevo.getTelefono() + "', Direccion='" + nuevo.getDireccion() + "'" + " WHERE Ruc= '" + nuevo.getRuc()+ "'");
            JOptionPane.showMessageDialog(null, "Modificación Satisfactoria");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificación" + e);
        }
    }

    public void borrar(String ruc) {
        Connection con;
        con = ClsConexion.conectar(base);
        try {
            Statement a = con.createStatement();
            a.execute("Delete from TblProveedores where Ruc= '" + ruc + "'");
            a.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado Satisfactorio");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar" + ex);
        }
    }
}
