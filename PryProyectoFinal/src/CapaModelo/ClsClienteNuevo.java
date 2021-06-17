/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaModelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ClsClienteNuevo extends ClsCliente {

    private Date registro;
    private static String base = "C://Users//Fundamentos//Downloads//PryProyectoFinal//DBProyecto.accdb";

    public ClsClienteNuevo() {
    }

    public ClsClienteNuevo(Date registro, String cedula, String nombre, String apellido, String telefono, String direccion, String tipo) {
        super(cedula, nombre, apellido, telefono, direccion, tipo);
        this.registro = registro;
    }

    /**
     * @return the registro
     */
    public Date getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    @Override
    public void llenarTabla(DefaultTableModel m, ResultSet r) throws SQLException {
        String[] dato = new String[]{"Cedula", "Nombres", "Apellidos", "Tipo Cliente", "Telefono", "Direccion"};
        m.setColumnIdentifiers(dato);
        while (r.next()) {
            dato[0] = r.getString(6);
            dato[1] = r.getString(1);
            dato[2] = r.getString(2);
            dato[3] = r.getString(3);
            dato[4] = r.getString(4);
            dato[5] = r.getString(5);
            m.addRow(dato);
        }
    }

    public void llenarDatos(JTextArea m, ResultSet r) throws SQLException {
        while (r.next()) {
            m.append("Nombre: " + r.getString(1) + " " + r.getString(2) + "\n"
                    + "Telefono: " + r.getString(4) + "\n"
                    + "Direccion: " + r.getString(5));
        }
    }

    public void agregar(ClsClienteNuevo nuevo) throws SQLException {
        Connection con;
        con = ClsConexion.conectar(base);
        PreparedStatement ps = null;
        String comando = "INSERT INTO TblClientes(Cedula,Nombres,Apellidos,TipoClte,Telefono,Direccion) VALUES(?,?,?,?,?,?)";
        ps = con.prepareStatement(comando);
        ps.setString(1, nuevo.getCedula());
        ps.setString(2, nuevo.getNombre());
        ps.setString(3, nuevo.getApellido());
        ps.setString(4, nuevo.getTipo());
        ps.setString(5, nuevo.getTelefono());
        ps.setString(6, nuevo.getDireccion());
        int row = ps.executeUpdate();
        if (row > 0) {
            JOptionPane.showMessageDialog(null, "Ingreso Satisfactorio");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Ingresar Cliente");
        }
    }

    public void editar(ClsClienteNuevo nuevo) throws SQLException {
        Connection con;
        con = ClsConexion.conectar(base);
        Statement stm;
        try {
            stm = con.createStatement();
            stm.execute("UPDATE TblClientes SET Nombres='" + nuevo.getNombre() + "', Apellidos='" + nuevo.getApellido() + "', TipoClte='" + nuevo.getTipo() + "', Telefono='"
                    + nuevo.getTelefono() + "', Direccion='" + nuevo.getDireccion() + "'" + " WHERE Cedula= '" + nuevo.getCedula() + "'");
            JOptionPane.showMessageDialog(null, "Modificación Satisfactoria");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificación" + e);
        }
    }

    public void borrar(String cedula) {
        Connection con;
        con = ClsConexion.conectar(base);
        try {
            Statement a = con.createStatement();
            a.execute("Delete from TblClientes where Cedula= '" + cedula + "'");
            a.close();
            JOptionPane.showMessageDialog(null, "Registro eliminado Satisfactorio");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar" + ex);
        }
    }
}
