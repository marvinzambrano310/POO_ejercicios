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
public class ClsPoligono extends ClsFiguras2d2{
    private int _numlados;
    private float _apotema;
    private float _lado;
    
    public ClsPoligono(int x, int y, int numlados, float apotema,float lado){
        super(x,y);
        _numlados=numlados;
        _apotema=apotema;
        _lado=lado;
    }

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
    
    public double perimetro(){
        return (_numlados*_lado);
    }
    
    public double area(){
        return (perimetro()*_apotema);
    }
    
    public String ver(){
        String tipop=" ";
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
}
