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
public class ClsPoligono {
    //atributos 
    private int _numlados;
    private float _apotema;
    private float _lado;
    //constructor

    public ClsPoligono(int _numlados, float _apotema, float _lado) {
        this._numlados = _numlados;
        this._apotema = _apotema;
        this._lado = _lado;
    }
    public ClsPoligono() {
        this._numlados = 0;
        this._apotema = 0;
        this._lado = 0;
    }
    public ClsPoligono(ClsPoligono p) {
        this._numlados = p._numlados;
        this._apotema = p._apotema;
        this._lado = p._lado;
    }
    
    //getters and setters

    public int getNumlados() {
        return _numlados;
    }

    public void setNumlados(int _numlados) {
        this._numlados = _numlados;
    }

    public float getApotema() {
        return _apotema;
    }

    public void setApotema(float _apotema) {
        this._apotema = _apotema;
    }

    public float getLado() {
        return _lado;
    }

    public void setLado(float _lado) {
        this._lado = _lado;
    }
    
    //funcion es poligono
    public String espoli(){
        String poli="";
        if (_numlados > 4){
           poli="La cantidad de lados Forman un POLIGONO";
        }
        else if(_numlados == 4){
           poli="La cantidad de lados Forman un CUADRADO y NO es un POLIGONO"; 
        }
        else if(_numlados == 3){
           poli="La cantidad de lados Forman un TRIANGULO y NO es un POLIGONO"; 
        }
        else if(_numlados < 3){
           poli="La cantidad de lados NO FORMAN un POLIGONO"; 
        }
        return poli;
    }
    //tipo --->pentagono,hexagono, heptagono, octagono, nonogono, decagono
    public String tipopoli(){
        String tipop="";
        switch(_numlados){
            case 1:
            {
                tipop=" NO ES POLIGONO";
                break;
            }
            case 2:
            {
                tipop=" NO ES POLIGONO";
                break;
            }
            case 3:
            {
                tipop=" NO ES POLIGONO, pero es un TRINAGULO";
                break;
            }
            case 4:
            {
                tipop=" NO ES POLIGONO, pero es un CUADRADO";
                break;
            }
            case 5:
            {
                tipop="Es un CUADRADO";
                break;
            }
            case 6:
            {
                tipop="Es un HEXAGONO";
                break;
            }
            case 7:
            {
                tipop="Es un HEPTAGONO";
                break;
            }
            case 8:
            {
                tipop="Es un OCTAGONO";
                break;
            }
            case 9:
            {
                tipop="Es un NONAGONO";
                break;
            }
            case 10:
            {
                tipop="Es un DECAGONO";
                break;
            }
            case 11:
            {
                tipop="Es un ENDECAGONO";
                break;
            }
            case 12:
            {
                tipop="Es un DODECAGONO";
                break;
            }
            default:
            {
                tipop="Es un POLIGONO DE "+ _numlados + " lados";
                break;
            }
        }
        return tipop;
    }
    //area
    public float poliarea(){
        
        float poliare= poliperimetro()*_apotema;
        return poliare;
    }
    //perimetro
    public float poliperimetro(){
        float per= _lado*_numlados;
        return per;
    }
}
