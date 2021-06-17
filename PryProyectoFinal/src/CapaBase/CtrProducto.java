/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaBase;

import CapaModelo.ClsProducto;
import CapaModelo.ClsProductoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CtrProducto {

    private ClsProductoDAO producto = new ClsProductoDAO();

    public CtrProducto() {
    }

    public void llenarTabla(DefaultTableModel m, ResultSet r) {
        try {
            producto.llenarTabla(m, r);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void aviso(ResultSet rs) {
        try {
            producto.aviso(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CtrProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultComboBoxModel llenarCmbBox(ResultSet r) {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        try {
            m = producto.llenarCmbBox(r);
        } catch (SQLException ex) {
            Logger.getLogger(CtrProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

    public DefaultComboBoxModel llenarCmbBoxProv(ResultSet r) {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        try {
            m = producto.llenarCmbBoxProv(r);
        } catch (SQLException ex) {
            Logger.getLogger(CtrProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

    public void borrar(int id) {
        producto.borrar(id);
    }

    public void modificar(String nombre, String tipo, Double precio, int cantidad, int id) {
        ClsProducto prod = new ClsProducto(nombre, tipo, precio, cantidad);
        try {
            producto.editar(prod, id);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void compra(ResultSet rs, String nombre, int cantidad) {
        try {
            producto.compras(rs, cantidad, nombre);
        } catch (SQLException ex) {
            Logger.getLogger(CtrProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void venta(ResultSet rs, String nombre, int cantidad) {
        try {
            producto.ventas(rs, nombre, cantidad);
        } catch (SQLException ex) {
            Logger.getLogger(CtrProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void factura(DefaultTableModel m, ResultSet r, int Cantidad) {
        try {
            producto.factura(m, r, Cantidad);
        } catch (SQLException ex) {
            Logger.getLogger(CtrProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
