/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaBase;

import CapaModelo.ClsClienteNuevo;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CtrCliente {

    ClsClienteNuevo nuevo = new ClsClienteNuevo();

    public CtrCliente() {
    }

    public void llenarTabla(DefaultTableModel m, ResultSet r) {
        try {
            nuevo.llenarTabla(m, r);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarDatos(JTextArea m, ResultSet r) {
        try {
            nuevo.llenarDatos(m, r);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregar(Date registro, String cedula, String nombre, String apellido, String telefono, String direccion, String tipo) {
        nuevo = new ClsClienteNuevo(registro, cedula, nombre, apellido, telefono, direccion, tipo);
        try {
            nuevo.agregar(nuevo);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrar(String id) {
        nuevo.borrar(id);
    }

    public void modificar(Date registro, String cedula, String nombre, String apellido, String telefono, String direccion, String tipo) {
        nuevo = new ClsClienteNuevo(registro, cedula, nombre, apellido, telefono, direccion, tipo);
        try {
            nuevo.editar(nuevo);
        } catch (SQLException ex) {
            Logger.getLogger(CtrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
