/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaModelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ClsClienteAntiguo extends ClsCliente {

    private Double descuento;

    public ClsClienteAntiguo() {
    }

    public ClsClienteAntiguo(Double descuento, String cedula, String nombre, String apellido, String telefono, String direccion, String tipo) {
        super(cedula, nombre, apellido, telefono, direccion, tipo);
        this.descuento = descuento;
    }

    /**
     * @return the descuento
     */
    public Double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public void llenarTabla(DefaultTableModel m, ResultSet r) throws SQLException {
        String[] dato = new String[]{"Cedula", "Nombres", "Apellidos", "Tipo Cliente", "Telefono", "Direccion"};
        m.setColumnIdentifiers(dato);
        while (r.next()) {
            dato[0] = r.getString(1);
            dato[1] = r.getString(2);
            dato[2] = r.getString(3);
            dato[3] = r.getString(4);
            dato[4] = r.getString(5);
            dato[5] = r.getString(6);
            m.addRow(dato);
        }
    }
}
