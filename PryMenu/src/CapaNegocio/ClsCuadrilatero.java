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
public class ClsCuadrilatero {
    //atributos
    private float _largo, _ancho;
    
    //constructores

    public ClsCuadrilatero(float _largo, float _ancho) {
        this._largo = _largo;
        this._ancho = _ancho;
    }
    public ClsCuadrilatero() {
        this._largo = 0;
        this._ancho = 0;
    }
    public ClsCuadrilatero(ClsCuadrilatero c) {
        this._largo = c._largo;
        this._ancho = c._ancho;
    }
    //getters and setters

    public float Largo() {
        return _largo;
    }

    public void Largo(float _largo) {
        this._largo = _largo;
    }

    public float Ancho() {
        return _ancho;
    }

    public void Ancho(float _ancho) {
        this._ancho = _ancho;
    }
    //metodos
    //tipo
    public String tipoc(){
        String tip="";
        if (_largo == _ancho){
            tip= "Los datos ingresados forman un CUADRADO";
        }
        else
        {
            tip= "Los datos ingresados forman un RECTANGULO";
        }
        return tip;
    }
    //area
    public float areac(){
        float superficiec;
        if (_largo == _ancho){
            superficiec = _largo*_largo;
        }
        else
        {
            superficiec = _largo*_ancho;
        }
        return superficiec;
    }
    //perimetro
    public float perimetroc(){
        float perimetroc;
        if (_largo == _ancho){
            perimetroc = _largo*4;
        }
        else
        {
            perimetroc = (_ancho+_ancho)+(_largo+_largo);
        }
        return perimetroc;
    }
}
