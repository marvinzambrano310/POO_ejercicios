/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaBase;

import CapaModelo.ClsProveedor;
import CapaModelo.ClsProveedorDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CtrProveedor {

    ClsProveedorDAO nuevo = new ClsProveedorDAO();

    public CtrProveedor() {
    }

    public void llenarTabla(DefaultTableModel m, ResultSet r) {
        try {
            nuevo.llenarTabla(m, r);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregar(String ruc, String nombre, String telefono, String direccion) {
        ClsProveedor prov = new ClsProveedor(ruc, nombre, telefono, direccion);
        try {
            nuevo.agregar(prov);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrar(String id) {
        nuevo.borrar(id);
    }

    public void modificar(String ruc, String nombre, String telefono, String direccion) {
        ClsProveedor prov = new ClsProveedor(ruc, nombre, telefono, direccion);
        try {
            nuevo.editar(prov);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
