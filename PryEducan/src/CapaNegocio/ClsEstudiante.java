/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Usuario
 */
public class ClsEstudiante {
    private String _cedula;
    private String _nombre;
    private float []_notas;
    public ClsEstudiante (String cedula, String nombre){
        _cedula=cedula;
        _nombre=nombre;
        _notas=new float[4];
    }

    
    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float[] getNotas() {
        return _notas;
    }

    public void setNotas(float[] _notas) {
        this._notas = _notas;
    }
    public void nota(){
        for(int i=0;i<4;i++){
            _notas[i]=(float) Math.random()*5+5;
        }        
    }
    public float nota(int k){
        return _notas[k];
    }
    
    
    public float promedio(){
        float promedio=0;
        for(int i=0; i<4; i++){
            promedio+=_notas[i];
        }
        promedio/=4;
        return promedio;
    }
    public String estado(){
        String estado="REPROBADO";
        if(promedio()>=7){
            estado+="APROBADO";
        }
        return estado;
    }
}
