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
public class ClsPolinomios {
    private int []_datos;
    private int _cont;
    //constructores
    public ClsPolinomios(int[] _datos, int _cont) {
        this._datos = _datos;
        this._cont = _cont;
    }
    public ClsPolinomios(int _cont){
        this._cont=_cont;
        _datos= new int[this._cont];
    }
    public ClsPolinomios (int[] poli){
        this._cont=poli.length;
        _datos=poli;
    }
    public ClsPolinomios (ClsPolinomios a){
        this._cont=a._cont;
        this._datos=a._datos;
    }

    public ClsPolinomios( int _cont,int[] _datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //getters and setters
    public int[] Datos() {
        return _datos;
    }
    public void Datos(int[] _datos) {
        this._datos = _datos;
    }
    public int Cont() {
        return _cont;
    }
    public void Cont(int _cont) {
        this._cont = _cont;
    }
    public int Dato(int indice){
        return _datos[indice];
    }
    public void Elem(int indice,int valor) {
        _datos[indice]=valor;
    }
    //metodos de usuario
    //Operaciones unarias
    public long evaluar (long val){
        int h=_cont-1;
        double igual=0;
        for (int i=0;i<_cont-1;i++){
            igual+=(_datos[i]*Math.pow(val,h));
            
            h--;
        }
        igual+=_datos[_cont-1];
        val=(long)igual;
        return val;
    }
    
    public String Resultado(){
        String r = " ";
        int k=_cont-1;
        for (int i=0;i<_cont-1;i++)
        {
            r+=_datos[i]+" X^"+k +" + ";
            k--;
        } 
        r+=_datos[_cont-1]+" =0";
        return r;
    }
    public ClsPolinomios suma(ClsPolinomios a ){
        ClsPolinomios s=new ClsPolinomios (this._cont);
        System.arraycopy(_datos, 0, s._datos, 0, this._cont);
        int k=0,j;
        for (int i=0;i<_cont;i++){
            for (j=0;j<a._cont;j++){
                if (i==j){
                    s._datos[k++]=a._datos[i]+_datos[j];
                }
            }  
        }
        s._cont=k--;
        return s;
    }
    public ClsPolinomios resta(ClsPolinomios a ){
        ClsPolinomios s=new ClsPolinomios (this._cont);
        //System.arraycopy(_datos, 0, s._datos, 0, this._cont);
        int k=0,j;
        for (int i=0;i<_cont;i++){
            for (j=0;j<a._cont;j++){
                if (i==j){
                    s._datos[k++]=a._datos[i]-_datos[j];
                }
            }  
        }
        s._cont=k--;
        return s;
    }
    public ClsPolinomios multi(ClsPolinomios a ){
        ClsPolinomios s=new ClsPolinomios ((this._cont*2)-1);
        //System.arraycopy(_datos, 0, s._datos, 0, this._cont);
        int k=0,j;
        for (int i=0;i<_cont;i++){
            for (j=0;j<a._cont;j++){
                s._datos[i+j]=a._datos[i]*_datos[j];
            }  
        }
        return s;
    }
}
