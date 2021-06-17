/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaModelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ClsProductoDAO {

    private static final String base = "C://Users//Fundamentos//Downloads//PryProyectoFinal//DBProyecto.accdb";

    public void llenarTabla(DefaultTableModel m, ResultSet r) throws SQLException {
        String[] dato = new String[]{"ID", "Nombre", "Tipo", "Precio", "Cantidad"};
        m.setColumnIdentifiers(dato);
        while (r.next()) {
            dato[0] = String.valueOf(r.getInt(1));
            dato[1] = r.getString(2);
            dato[2] = r.getString(3);
            dato[3] = String.valueOf(r.getDouble(4));
            dato[4] = String.valueOf(r.getInt(5));
            m.addRow(dato);
        }
    }

    public DefaultComboBoxModel llenarCmbBox(ResultSet r) throws SQLException {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        while (r.next()) {
            m.addElement(r.getString("Nombre"));
        }
        return m;
    }

    public void aviso(ResultSet r) throws SQLException {
        while (r.next()) {
            JOptionPane.showMessageDialog(null, "Se requiere adquirir: " + r.getString("Nombre") + " se cuenta con menos de 10 articulos.");
        }
    }

    public void editar(ClsProducto nuevo, int id) throws SQLException {
        Connection con;
        con = ClsConexion.conectar(base);
        Statement stm;
        try {
            stm = con.createStatement();
            stm.execute("UPDATE TblInventario SET Nombre= '" + nuevo.getNombre() + "', Tipo='" + nuevo.getTipoProducto() + "', Precio=" + nuevo.getPrecio() + ", Cantidad=" + nuevo.getCantidad() + " WHERE Id= '" + id + "'");
            JOptionPane.showMessageDialog(null, "Modificación Satisfactoria");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificación" + e);
        }
    }

    public void borrar(int id) {
        Connection con;
        con = ClsConexion.conectar(base);
        try {
            Statement a = con.createStatement();
            a.execute("Delete from TblInventario where id= '" + id + "'");
            a.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado Satisfactorio");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar" + ex);
        }
    }

    public void compras(ResultSet rs, int cantidad, String nombre) throws SQLException {
        int cnt = 0;
        while (rs.next()) {
            cnt = Integer.valueOf(rs.getString("Cantidad"));
        }
        int t = cnt + cantidad;
        Connection con;
        con = ClsConexion.conectar(base);
        Statement stm;
        try {
            stm = con.createStatement();
            stm.execute("UPDATE TblInventario SET Cantidad=" + t + " WHERE Nombre= '" + nombre + "'");
            JOptionPane.showMessageDialog(null, "Pedido Realizado Satisfactoriamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificación" + e);
        }
    }

    public void ventas(ResultSet rs, String nombre, int cantidad) throws SQLException {
        int cnt = 0;
        while (rs.next()) {
            cnt = Integer.valueOf(rs.getString("Cantidad"));
        }
        int t = cnt - cantidad;
        Connection con;
        con = ClsConexion.conectar(base);
        Statement stm;
        try {
            stm = con.createStatement();
            stm.execute("UPDATE TblInventario SET Cantidad=" + t + " WHERE Nombre= '" + nombre + "'");
            //JOptionPane.showMessageDialog(null, "Vent Satisfactoria");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificación" + e);
        }
    }

    public DefaultComboBoxModel llenarCmbBoxProv(ResultSet r) throws SQLException {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        while (r.next()) {
            m.addElement(r.getString("Proveedor"));
        }
        return m;
    }

    public void factura(DefaultTableModel m, ResultSet r, int cantidad) throws SQLException {
        String[] dato = new String[]{"Producto", "Cantidad", "Precio", "Total"};
        m.setColumnIdentifiers(dato);
        while (r.next()) {
            dato[0] = r.getString("Nombre");
            dato[1] = String.valueOf(cantidad);
            dato[2] = String.valueOf(r.getDouble("Precio"));
            Double total = cantidad * r.getDouble("Precio");
            total = (double) Math.round(total * 100d) / 100d;
            dato[3] = String.valueOf(total);
            m.addRow(dato);
        }
    }
}
