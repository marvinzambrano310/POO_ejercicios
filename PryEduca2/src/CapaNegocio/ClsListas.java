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
public class ClsListas {
    public ClsEstudiante []_lstest;
    public ClsMateria []_lstmat;
    public int numeroest;
    public int numeromat;
    //constructor
    public ClsListas(){
        _lstest=new ClsEstudiante[50];
        _lstmat=new ClsMateria[10];
        numeroest=0;
        numeromat=0;
    }

    public ClsListas(ClsEstudiante[] _lstest, ClsMateria[] _lstmat) {
        this._lstest = _lstest;
        this._lstmat = _lstmat;
    }
            
    
}
