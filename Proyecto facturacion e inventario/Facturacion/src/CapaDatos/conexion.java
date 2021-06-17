/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;
import java.sql.*;

/**
 *
 * @author ANDRES
 */
public class conexion {
    PreparedStatement psPrepararSentencia;
    Connection con = null;
    public conexion (String dirbase) throws SQLException{
        try{
            con=DriverManager.getConnection("jdbc:ucanaccess://"+dirbase);
            System.out.print("******CONEXION EXITOSA******");
        }
        catch (SQLException err){
            System.out.print("*****CONEXION ERRADA******"+err);
        }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    } 

    
}
