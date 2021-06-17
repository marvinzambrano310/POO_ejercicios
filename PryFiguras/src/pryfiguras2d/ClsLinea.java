/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryfiguras2d;

/**
 *
 * @author Usuario
 */
public class ClsLinea {
   //atributos de la clase
    ClsPunto _pini,_pfin;
    //Constrcutores

    public ClsLinea(ClsPunto _pini, ClsPunto _pfin) {
        this._pini = _pini;
        this._pfin = _pfin;
    }
    
    public ClsLinea(ClsPunto _pfin){
        this._pini=new ClsPunto ();
        this._pfin=_pfin;     
    }
    public ClsLinea(float Longitud, float angulo){
        this._pini=new ClsPunto ();
        float px=(float) (Longitud*Math.cos(angulo));
        float py=(float) (Longitud*Math.sin(angulo));
        this._pfin=new ClsPunto (px,py);
    }
    public ClsLinea(ClsLinea l){
        this._pini=l._pini;
        this._pfin=l._pfin;
    }
    
    //getters and Setters

    public ClsPunto Pini() {
        return _pini;
    }

    public void Pini(ClsPunto _pini) {
        this._pini = _pini;
    }

    public ClsPunto Pfin() {
        return _pfin;
    }

    public void Pfin(ClsPunto _pfin) {
        this._pfin = _pfin;
    }
    
    //metodos del usuario;
    
    public double longitud (){
        double c=(Math.sqrt(Math.pow(_pfin.cx()-_pini.cx(),2)+Math.pow(_pfin.cy()-_pini.cy(),2)));
        return c;
    }
    
    public double angulo(){
        double c=(Math.atan((_pfin.cy()-_pini.cy())/(_pfin.cx()-_pini.cx())));
        double g=c*(180/Math.PI);
        return g;
    }
    
    public String verlinea(){
        String res="longitud: "+longitud()+", Grados "+angulo();
        return res;
    }
    
    public float pendiente(){
        float k =((_pfin.cy()-_pini.cy())/(_pfin.cx()-_pini.cx()));
        return k;
    }
    
    public float indep(){
        float razon=_pini.cy()-(((_pfin.cy()-_pini.cy())/(_pfin.cx()-_pini.cx()))*_pini.cx());
        return razon;
    }
    
    public String ecuacion(){
        String ecua= pendiente() +"X";
        if (indep()>0){
            ecua+=" + ";
        }
        ecua+=indep();
        return ecua;
    }
    
    public String toString(){
        String coor= "Pi=";
        coor+="("+_pini.cx()+","+_pini.cy()+")";
        coor+="     Pf= ("+_pfin.cx()+","+_pfin.cy()+")";
        return coor;
        
    }
    
     public ClsLinea Suma(ClsLinea l){
        double m= this.pendiente()+l.pendiente();
        double b= this.indep()+ l.indep();
        ClsPunto p1 = new ClsPunto(0, (float) b);
        ClsPunto p2 = new ClsPunto((float) (-b/m),0);
        ClsLinea u = new ClsLinea(p1,p2);
        return u;
    }
    public ClsLinea Resta(ClsLinea l){
        double m= this.pendiente()-l.pendiente();
        double b= this.indep()- l.indep();
        ClsPunto p1 = new ClsPunto(0, (float) b);
        ClsPunto p2 = new ClsPunto((float) (-b/m),0);
        ClsLinea u = new ClsLinea(p1,p2);
        return u;
    }  
    
    
    
}
