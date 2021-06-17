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
public class ClsFraccion implements Operaciones {
   private int a;
   private int b;
   //constructores

    public ClsFraccion(int a, int b) {
        this.a = a;
        if (b!=0){
        this.b = b;
        }
    }
   public ClsFraccion(ClsFraccion p){
       a=p.a;
       b=p.b;      
   }
   public ClsFraccion(){
       a=0;
       b=1;
   }
   //getters and setters

    public int A() {
        return a;
    }
    public void A(int a) {
        this.a = a;
    }
    public int B() {
        return b;
    }
    public void B(int b) {
        this.b = b;
    }
   //metodos de usuarios
    public double valor(){
       double k;
       k=(double)a/b;
       return k;
    }
    public void simplificar()
    {
        int div=2;
        
        while(a>=div && b>=div){
            while (a%div==0 && b%div==0){
                a/=div;
                b/=div;
            }
            div++;
        }
    }
    public String Resultado(){
        String r="";
        //simplificar();
        if (a>b){
          r=(int)a/b+" ";  
        }
        r+=a%b+"/"+b;
        return r;
    }

    @Override
    public Object mas(Object op) {
       ClsFraccion rp=new ClsFraccion ();
       ClsFraccion res=(ClsFraccion)op;
       rp.b=(b*res.b);
       rp.a=(a*res.b+b*res.a);
       return rp;
    }

    @Override
    public Object menos(Object op) {
       ClsFraccion rp=new ClsFraccion ();
       ClsFraccion res=(ClsFraccion)op;
       rp.b=(b*res.b);
       rp.a=(a*res.b-b*res.a);
       return rp;
    }

    @Override
    public Object por(Object op) {
       ClsFraccion r=new ClsFraccion ();
       ClsFraccion res=(ClsFraccion)op;
       r.b=(b*res.b);
       r.a=(a*res.a);
       return r;
    }

    @Override
    public Object para(Object op) {
       ClsFraccion r=new ClsFraccion ();
       ClsFraccion res=(ClsFraccion)op;
       r.b=(b*res.a);
       r.a=(a*res.b); 
       return r;
    }

    @Override
    public void valor(Object op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString(){
        return Resultado();
    }
}
