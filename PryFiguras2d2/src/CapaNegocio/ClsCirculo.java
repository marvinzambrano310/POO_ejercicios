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
public class ClsCirculo extends ClsFiguras2d2 {
    private float _radio;
    
    public ClsCirculo(int x, int y, float radio){
        super(x,y);
        _radio=radio;
    }    

    public float getRadio() {
        return _radio;
    }

    public void setRadio(float _radio) {
        this._radio = _radio;
    }

    public double perimetro(){
        return (Math.PI*2*_radio);
    }
    
    public double area(){
        return (_radio*_radio*Math.PI);
    }
    
    public String ver(){
        return "CIRCULO: "+_radio;
    }
    
}
