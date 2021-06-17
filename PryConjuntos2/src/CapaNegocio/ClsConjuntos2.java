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
public  abstract class ClsConjuntos2 {
    private int _dimension;

    public ClsConjuntos2(int dimension) {
        this._dimension = dimension;
    }

    public int getDimension() {
        return _dimension;
    }

    public void setDimension(int _dimension) {
        this._dimension = _dimension;
    }
    
    public abstract String ver();
    public abstract String busqueda();
    public abstract ClsConjuntos2 union();
    public abstract ClsConjuntos2 inter();
    public abstract ClsConjuntos2 diferencia();
    public abstract ClsConjuntos2 cartesiano();
    
}
