/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ClsEstudiante {
    private int _clave;
    private String _nombre;
    private float _Nota[];
    ResultSet r;

    public ClsEstudiante(int _clave, String _nombre, float[] _Nota) {
        this._clave = _clave;
        this._nombre = _nombre;
        this._Nota = new float[10];
    }

    public int getClave() {
        return _clave;
    }

    public void setClave(int _clave) {
        this._clave = _clave;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float[] getNota() {
        return _Nota;
    }

    public void setNota(float[] _Nota) {
        this._Nota = _Nota;
    }
    
    
    public double promedio () throws SQLException{
        double promedio=0;
        float suma=0;
        int n=0;
        for (int i =0;r.next();i++)
        {
            suma+=_Nota[i];
            n++;
        }
        return promedio=suma/n;
    }
    
    public boolean estado() throws SQLException{
        //promedio >=7 true
        //promedio <7 false;
        boolean bandera=false;
        if(promedio()>=7){
            bandera = true;
        }
        return bandera;
    }
    
    public String toString(){
        //liena nombre, nota[], aprueba o reprueba.
        String resultado = "Sr. "+_nombre+" con las Siguientes Notas: ";
        for(int i=0;i<10;i++){
            resultado+=_Nota[i]+" - ";
        }
        try {
            resultado += "Con el Promedio de: "+ promedio()+" es ";
        } catch (SQLException ex) {
            Logger.getLogger(ClsEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(estado()){
                resultado+= "Aprobado";
            }else{
                resultado+="Reprobado";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClsEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
}
