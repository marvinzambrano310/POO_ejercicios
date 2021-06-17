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
public abstract class ClsFiguras2d2 {
    private float _cx;
    private float _cy;
    
    public ClsFiguras2d2 (float x , float y){
        _cx=x;
        _cy=y;
    }

    public float Cx() {
        return _cx;
    }

    public void Cx(float _cx) {
        this._cx = _cx;
    }

    public float Cy() {
        return _cy;
    }

    public void Cy(float _cy) {
        this._cy = _cy;
    }
    
    public double magnitud(){
        return (Math.sqrt(_cx*_cx + _cy*_cy));
    }
    public double angulo(){
        double angulo = (double)(Math.atan((_cy/_cx)));
        double  grado= angulo*(180/Math.PI);
        return grado;
    }
    
    public abstract double area();
    public abstract double perimetro();
    public abstract String ver();
    
}
