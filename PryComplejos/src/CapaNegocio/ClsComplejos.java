/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author user
 */
public class ClsComplejos {
    //atributos 
    private float _real;
    private float _imag;
    
    //constructores

    public ClsComplejos(float _real, float _imag) {
        this._real = _real;
        this._imag = _imag;
    }
    public ClsComplejos(){
         _real=0;
         _imag=0;
    }
    public ClsComplejos(ClsComplejos q){
        _real=q._real;
        _imag=q._imag;
    } 
    
    //getters and setters

    public float Real() {
        return _real;
    }

    public void Real(float _real) {
        this._real = _real;
    }

    public float Imag() {
        return _imag;
    }

    public void Imag(float _imag) {
        this._imag = _imag;
    }
    //metodods de usuarios 
    
    public ClsComplejos Suma(ClsComplejos r){
        ClsComplejos res=new  ClsComplejos();
        res._real=_real+res._real;
        res._imag=_imag+res._imag;
        return res;
    }
    public ClsComplejos Resta(ClsComplejos r){
        ClsComplejos res=new  ClsComplejos();
        res._real=_real-res._real;
        res._imag=_imag-res._imag;
        return res;
    }
    public String Conjugada(){
        String r;
        if (_imag>0)
       {   
            r = _real+ " + " + _imag + "i";
       }
       else
       {
           r = _real+ " - " + _imag + "i";
       }
        return r;
    }
    
    public ClsComplejos Multiplicacion(ClsComplejos r){
        ClsComplejos res=new  ClsComplejos();
        res._real = (_real*res._real)-(_imag*res._imag);
        res._imag= (_real*r._imag)+(_imag*r._real);
        return res;
        
    }
    public ClsComplejos Division(ClsComplejos r){
        ClsComplejos res=new ClsComplejos();
        res._real=(_real*res._real)+(_imag+res._imag)/((res._real * res._real)+(res._imag*res._imag));
        res._imag=(_imag*res._real)-(_real*res._imag)/((res._real * res._real)+(res._imag*res._imag));
        return r;
    }
    public String resultado(){
       String k;
       if (_imag>0)
       {   
            k = _real+ " + " + _imag + "i";
       }
       else
       {
           k = _real+ " - " + _imag + "i";
       }
       return k;
    }
}
