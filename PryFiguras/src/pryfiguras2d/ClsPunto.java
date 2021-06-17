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

/**
 * atributos
 * _cx,_cy E R
 * constructores
 * ClsPunto(cx,cy)
 * Clspunto()
 * ClsPunto (ClsPunto)
 * metodos get y set
 * get cx
 * set cx(valor)
 * get cy
 * set cy(valor)
 * metodos de usuario
 * mover(x,y)
 * moverx(valor)
 * movery(x,y)
 * string polar(longitud, angulo)
 * float angulo ()
 * float longitud ()
 * string rectangular ()
 * @author Usuario
 */
public class ClsPunto {
    // Atributos
    private float _cy;
    private float _cx;
    //constructores
   public ClsPunto(float cx,float cy){
       _cx=cx;
       _cy=cy;
   }
   public ClsPunto(){
       _cx=0;
       _cy=0;
   }
   public ClsPunto(ClsPunto p){
       _cx=p._cx;
       _cy=p._cy;        
   }

    ClsPunto(double px, double py) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   //metodos gets y set
   public float cx(){return _cx;}
   public void cx(float valor){ _cx=valor;}
   public float cy(){return _cy;}
   public void cy(float valor){ _cy=valor;}
   //metodos de usuario
   public void moverx(float valor){_cx+=valor;}
   public void movery(float valor){_cy+=valor;}
   public void mas(ClsPunto d){
   _cx+=d._cx;
   _cy+=d._cy;}
   public void menos(ClsPunto d){
   _cx-=d._cx;
   _cy-=d._cy;}
   public void por(ClsPunto d){
   _cx*=d._cx;
   _cy*=d._cy;}
   public void para(ClsPunto d){
   _cx/=d._cx;
   _cy/=d._cy;}
   public float angulo(){
       return (float) Math.atan(_cy/_cx);}
   /**
    * public float angulo(){
    *   float ang;
    *   ang=(float)Math.atan(_cy/_cx);
    *   return ang;
    * }
    * 
    * public float angulo(){
    *   float ang=(float)Math.atan(_cy/_cx);
    *   return ang;
    * }
    **/
   public float hipo(){
       float pit=(float)Math.sqrt(_cx*_cx+_cy*_cy);
       return pit;
   }
   //Float.parsefloat(txtcx.getText);
   public String polar(){
       String p="Coordenadas Polares: angulo= "+angulo()+" distancia= "+hipo();
       return p;
   }
   public String rect(){
       String r="Coordenadas Rectangulares: x= "+_cx+" y= "+_cy;
       return r;
   }
   public String punt(){
       String j="("+_cx + ","+ _cy +")";
       return j;
   }
}
