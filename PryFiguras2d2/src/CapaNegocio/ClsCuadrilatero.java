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
public class ClsCuadrilatero extends ClsFiguras2d2{
    private float _largo;
    private float _ancho;

    
    public ClsCuadrilatero (int x,int y, float largo, float ancho){
        super(x,y);
        _largo=largo;
        _ancho=ancho;
    }

    public float getLargo() {
        return _largo;
    }

    public void setLargo(float _largo) {
        this._largo = _largo;
    }

    public float getAncho() {
        return _ancho;
    }

    public void setAncho(float _ancho) {
        this._ancho = _ancho;
    }

   
    public double perimetro(){
        double perimetro;
        if (_largo == _ancho){
            perimetro = _largo*4;
        }
        else
        {
            perimetro = (_ancho+_ancho)+(_largo+_largo);
        }
        return perimetro;
    }
    
    public double area(){
        return (_largo*_ancho);
    }
    
    public String ver(){
        String tip="";
        if (_largo == _ancho){
            tip= "CUADRADO: "+_largo+ "," + _ancho;
        }
        else
        {
            tip= "RECTANGULO: "+_largo+ "," + _ancho;
        }
        return tip;
    }
    
}
