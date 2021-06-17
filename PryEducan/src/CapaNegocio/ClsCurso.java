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
public class ClsCurso {
    private int _nivel;
    private ClsMateria[] _curr;
    private int _numat;

    public ClsCurso(int nm) {
        this._nivel = nm;
        _curr= new ClsMateria[15];
        _numat=0;
    }
    public int curr(ClsMateria nomat){
        _numat+=1;
        _curr[_numat]=nomat;
        return _numat;
    }
    public float promedio(){
        float promedio=0;
        for (int i=0; i<_numat;i++){
            promedio+=_curr[i].promediomateria();
        }
        promedio/=_numat;
        return promedio;
    }
}
