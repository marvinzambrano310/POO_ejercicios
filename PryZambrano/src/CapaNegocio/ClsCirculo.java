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
public class ClsCirculo {
    //atributos
    private float _radio;
    //constructor

    public ClsCirculo(float _radio) {
        this._radio = _radio;
    }
    public ClsCirculo() {
        this._radio = 0;
    }
    public ClsCirculo(ClsCirculo r) {
        this._radio = r._radio;
    }
    //getters and setters

    public float Radio() {
        return _radio;
    }
    public void Radio(float _radio) {
        this._radio = _radio;
    }
    //metodos area 
    
    public float area(){
        float superficiec=(float)(Math.PI* Math.pow(_radio,2));
        return superficiec;
    }
    //circunferencia
    public float circunferencia(){
        float circunferencia=(float) (2*Math.PI *_radio);
        return circunferencia;
    }
}
