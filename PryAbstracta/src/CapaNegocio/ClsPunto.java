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
public class ClsPunto extends ClsOperaciones{
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
   //metodos gets y set
   public float cx(){return _cx;}
   public void cx(float valor){ _cx=valor;}
   public float cy(){return _cy;}
   public void cy(float valor){ _cy=valor;}
   //metodos de usuario
   public void moverx(float valor){_cx+=valor;}
   public void movery(float valor){_cy+=valor;}
   public float angulo(){
       return (float)(Math.atan(_cy/_cx)*(180/Math.PI));}
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
   public String rectangular(){
       String r="Coordenadas Rectangulares: x= "+_cx+" y= "+_cy;
       return r;
   }

   

    @Override
    public Object menos(Object op) {
        ClsPunto r= new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx-d._cx;
        r._cy=_cy-d._cy;
        return r;
    }

    @Override
    public Object por(Object op) {
        ClsPunto r= new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx*d._cx;
        r._cy=_cy*d._cy;
        return r;
    }

    @Override
    public Object para(Object op) {
        ClsPunto r= new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx/d._cx;
        r._cy=_cy/d._cy;
        return r;
    }

    @Override
    public Object mas(Object op) {
        ClsPunto r= new ClsPunto();
        ClsPunto d=(ClsPunto)op;
        r._cx=_cx+d._cx;
        r._cy=_cy+d._cy;
        return r;
    }

    @Override
    public String toString(){
        return rectangular();
    }

}
