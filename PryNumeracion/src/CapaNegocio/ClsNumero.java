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
public abstract class ClsNumero {
    private int _base;
    private long numero;

    public ClsNumero(int _base, long numero) {
        this._base = _base;
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getBase() {
        return _base;
    }

    public void setBase(int _base) {
        this._base = _base;
    }
    
    public String ver(){
        return "La base del numero es: "+_base;
    }
    
    public long Factorial(){
        long fact=1;
        for (int i=0; i<numero; i++){
            fact*=fact;
        }
        return fact;
    }
    public long inverso(){
        long inverso=1/numero;
        return inverso;
        
    }
    public long masmenos(){
        if (numero<0){
            numero*=-1;
        }
        if (numero>0){
            numero*=-1;
        }
        return numero;
    }
    public String primo(){
        String primo="";
        int cont=0;
        for (int i=0;i>numero;i++){
            if (numero%i== 0){
                cont+=1;
            }
            
        }
        if (cont<=1){
            primo="El numero Ingresado es Primo";
        }
        else {
            primo="El numero Ingresado no es Primo";
        }
        return primo;
    }   
    public String par(){
        String par="";
        if (numero%2==0){
            par="El numero Ingresado es Par";
        }
        else{
            par="El numero Ingresado es Impar";
        }
        return par;
    }
    public abstract String suma();
    public abstract String resta();
    public abstract String multiplicacion();
    public abstract String division();
    public abstract String conversion(int b);
    
}
