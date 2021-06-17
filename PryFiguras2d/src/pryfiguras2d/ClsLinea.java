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
    ClsPunto _pi, _pf;
    //Construcotres
    public ClsLinea(ClsPunto pf){
        _pi= new ClsPunto();
        _pf=pf;
    }
    public ClsLinea(ClsPunto pi, ClsPunto pf) {
        this._pi = pi;
        this._pf = pf;
    }
    public ClsLinea(float longitud, float angulo){
    float xf= (float) (longitud*(Math.cos(angulo)));
    float yf= (float) (longitud*(Math.sin(angulo)));
    _pi= new ClsPunto();
    _pf= new ClsPunto(xf,yf);
    }
    public ClsLinea(ClsLinea l){
        _pi=l._pi;
        _pf=l._pf;
    }
    //Getters and Setters
    public ClsPunto getPi() {
        return _pi;
    }
    public void setPi(ClsPunto _pi) {
        this._pi = _pi;
    }
    public ClsPunto getPf() {
        return _pf;
    }
    public void setPf(ClsPunto _pf) {
        this._pf = _pf;
    }
    //Metodos del Usuarios
    public double Longitud(){
        return Math.sqrt((Math.pow(_pf.cx()-_pi.cx(), 2))+ Math.pow(_pf.cy()-_pi.cy(), 2));
    }
    public double angulo(){
        double alp=Math.atan((_pf.cy()-_pi.cy())/(_pf.cx()-_pi.cx()));
        double grados=alp*(180/Math.PI);
        return grados;
    }
    public double pendiente(){
        Double m;
        m= (double)((_pf.cy()-_pi.cy())/(_pf.cx()-_pi.cx()));
        return m;
    }
    public double pregunta (){
      double pregunta;
      pregunta=_pi.cy()-(this.pendiente()*_pi.cx());  
      return pregunta;
    }
    public String VerLinea(){
        String resp=" Longitud: " + Longitud() + " Angulo: " + angulo();
        return resp;
    }
    public String VerEcuacion(){
        String respuesta;
        if (this.pregunta()>0){
            respuesta= (this.pendiente() + "X+" + this.pregunta());
        }
        else{
            respuesta= (this.pendiente() + "X-" + this.pregunta());
        }
        return respuesta;
    }
    public String Coordenadas(ClsPunto uno, ClsPunto dos){
        String resp="Coordenadas de la Linea: ";
        resp+="(" + uno.cx() + "," + uno.cy() + ")";
        return resp+= " (" + dos.cx() + "," + dos.cy() + ")";
    }
    public String Polares(){
        String resp="Coordenadas Polares de la Linea: ";
        resp+= "magnitud: " + this.Longitud() + " Angulo de Inclinaci+on: " + this.angulo();
        return resp;
    }
    public ClsLinea Suma(ClsLinea l){
        double m= this.pendiente()+l.pendiente();
        double b= this.pregunta()+ l.pregunta();
        ClsPunto p1 = new ClsPunto(0, (float) b);
        ClsPunto p2 = new ClsPunto((float) (-b/m),0);
        ClsLinea u = new ClsLinea(p1,p2);
        return u;
    }
    public ClsLinea Resta(ClsLinea l){
        double m= this.pendiente()-l.pendiente();
        double b= this.pregunta()- l.pregunta();
        ClsPunto p1 = new ClsPunto(0, (float) b);
        ClsPunto p2 = new ClsPunto((float) (-b/m),0);
        ClsLinea u = new ClsLinea(p1,p2);
        return u;
    }  
    public ClsLinea Multiplicacion(float val){
        double m= this.pendiente()*val;
        double b= this.pregunta()*val;
        ClsPunto p1 = new ClsPunto(0, (float) b);
        ClsPunto p2 = new ClsPunto((float) (-b/m),0);
        ClsLinea u = new ClsLinea(p1,p2);
        return u;
    } 
    public ClsLinea Division(float val){
        double m= this.pendiente()/val;
        double b= this.pregunta()/val;
        ClsPunto p1 = new ClsPunto(0, (float) b);
        ClsPunto p2 = new ClsPunto((float) (-b/m),0);
        ClsLinea u = new ClsLinea(p1,p2);
        return u;
    }     
}
