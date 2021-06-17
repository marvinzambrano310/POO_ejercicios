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
public class ClsTriangulo {
    //atributos
    private float _lado1;
    private float _lado2;
    private float _lado3;
    //constructores
    public ClsTriangulo(float _lado1, float _lado2, float _lado3) {
        this._lado1 = _lado1;
        this._lado2 = _lado2;
        this._lado3 = _lado3;
    }
    public ClsTriangulo(){
        _lado1 = 0;
        _lado2 = 0;
        _lado3 = 0;
    }
    public ClsTriangulo(ClsTriangulo a){
        _lado1=a._lado1;
        _lado2=a._lado2;
        _lado3=a._lado3;
    }

    //getters and setters
    public float Lado1() {
        return _lado1;
    }
    public void Lado1(float _lado1) {
        this._lado1 = _lado1;
    }
    public float Lado2() {
        return _lado2;
    }
    public void Lado2(float _lado2) {
        this._lado2 = _lado2;
    }
    public float Lado3() {
        return _lado3;
    }
    public void Lado3(float _lado3) {
        this._lado3 = _lado3;
    }
    
    //metodos de usuario
    //estrinagulo
    public String estriangulo(){
        String si="";
        if (((_lado1 + _lado2) > _lado3)||((_lado2 + _lado3) > _lado1) || ((_lado1 + _lado3) > _lado2) ){
           si="Los datos ingresados FORMAN UN TRIANGULO";
        }
        else{
            si="Los datos ingresados NO FORMAN UN TRIANGULO";
        }
        return si;
    }
    //tipo
    public String Tipo(){
        String es ="";
        if(_lado1 == _lado2 && _lado1==_lado3 && _lado2 ==_lado3){
            es+= "Los datos ingresados corresponden a un TRIANGULO EQUILATERO";
        }
        else if ((_lado1 == _lado2 && _lado3!=_lado1) || (_lado3 == _lado1 && _lado2 != _lado3) || (_lado2== _lado3 && _lado1 != _lado2)){
            es+= "Los datos ingresados corresponden a un TRIANGULO ISOCELES";
        }
        else if (_lado1 != _lado2 && _lado1 != _lado3 && _lado3 != _lado2 ){
            es+= "Los datos ingresados corresponden a un TRIANGULO ESCALENO";
        }
        else if ((Math.pow(_lado1, 2)+ Math.pow(_lado2,2)== Math.pow(_lado3,2)) || (Math.pow(_lado2, 2)+ Math.pow(_lado3,2)== Math.pow(_lado1,2)) || (Math.pow(_lado1, 2)+ Math.pow(_lado3,2)== Math.pow(_lado2,2))){
            es+= "Los datos ingresados corresponden a un TRIANGULO RECTANGULO";
        }
        return es;
    }
    //area
    public float area(){
        float superficie;
        float semiperimetro= (_lado1+_lado2+_lado3)/2;
        superficie=(float)(Math.sqrt(semiperimetro*(semiperimetro-_lado1)*(semiperimetro-_lado2)*(semiperimetro-_lado3)));
        return superficie;
    }    
    //perimetro
    public float perimetro(){
        float distancia=_lado2+_lado1+_lado3;
        return distancia;
    }
    
}
