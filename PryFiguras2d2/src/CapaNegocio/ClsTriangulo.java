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
public class ClsTriangulo extends ClsFiguras2d2 {
    private float _lado1;
    private float _lado2;
    private float _lado3;
    
    public ClsTriangulo(int x, int y, float L1, float L2, float L3){
        super(x,y);
        _lado1=L1;
        _lado2=L2;
        _lado3=L3;   
    }

    public float getLado1() {
        return _lado1;
    }

    public void setLado1(float _lado1) {
        this._lado1 = _lado1;
    }

    public float getLado2() {
        return _lado2;
    }

    public void setLado2(float _lado2) {
        this._lado2 = _lado2;
    }

    public float getLado3() {
        return _lado3;
    }

    public void setLado3(float _lado3) {
        this._lado3 = _lado3;
    }
    
    public double perimetro(){
        return _lado1+_lado2+_lado3;
    }
    
    public double area(){
        double sp=perimetro()/2;
        return Math.sqrt(sp*(sp-_lado1)*(sp-_lado2)*(sp-_lado3));
    }
    
    public String ver(){
        return "TRIANGULO: " +_lado1+","+_lado2+","+_lado3;
    }
}
