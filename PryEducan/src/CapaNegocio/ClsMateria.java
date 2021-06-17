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
public class ClsMateria {
    private String _nombre;
    private ClsEstudiante []_lista;
    private int _numest;

    public ClsMateria(String nombre) {
        this._nombre = nombre;
        _lista=new ClsEstudiante[30];
        _numest=0;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public ClsEstudiante[] getLista() {
        return _lista;
    }

    public void setLista(ClsEstudiante[] _lista) {
        this._lista = _lista;
    }

    public int getNumest() {
        return _numest;
    }

    public void setNumest(int _numest) {
        this._numest = _numest;
    }
    
    public int inscripcion(String ced, String nom){
        _numest+=1;
        _lista[_numest].setNombre(nom);
        _lista[_numest].setCedula(ced);
        _lista[_numest].nota();
        return _numest;
    }
    public float promediomateria(){
        float promedio=0;
        for(int i=0;i<_numest;i++){
            promedio+=_lista[i].promedio();
        }
        promedio/=_numest;
        return promedio;
    }
    public String notaAlta(){
        String notaAlta="";
        float nota=_lista[0].promedio();
        int n=0;
        for(int i=1; i<_numest;i++){
            if(_lista[i].promedio()>nota){
                nota=_lista[i].promedio();
                n=i;
            }
        }
        notaAlta+="El estudiante con mayor nota es: "+ _lista[n].getNombre() +" y su nota es: "+ nota;
        return notaAlta;
    }
}
