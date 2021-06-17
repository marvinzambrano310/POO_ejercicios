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
public class ClsBinario extends ClsNumero{
    private String b1;

    public ClsBinario(String b1, int _base,long numero) {
        super(_base,numero);
        this.b1 = b1;
    }
    
    public ClsBinario(ClsBinario B, int _base,long numero){
        super(_base, numero);
        this.b1=B.b1;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }
    
    public long conversionDe(){
       return Long.parseLong(b1, 2);
    }
    public String suma(ClsBinario B){
        long suma= this.conversionDe()+B.conversionDe();
        String num=Long.toBinaryString(suma);
        ClsBinario C= new ClsBinario(num,2,suma);
        return C.b1;
    }
    public String resta(ClsBinario B){
        long suma= this.conversionDe()-B.conversionDe();
        String num=Long.toBinaryString(suma);
        ClsBinario C= new ClsBinario(num,2,suma);
        return C.b1;
    }
    public String multiplicacion(ClsBinario B){
        long suma= this.conversionDe()*B.conversionDe();
        String num=Long.toBinaryString(suma);
        ClsBinario C= new ClsBinario(num,2,suma);
        return C.b1;
    }
    public String division(ClsBinario B){
        long suma=0;
        if (B.conversionDe()>0)
        {
            suma= this.conversionDe()/B.conversionDe();
        }
        String num=Long.toBinaryString(suma);
        ClsBinario C= new ClsBinario(num,2,suma);
        return C.b1;
    }
    public String conversion(int b){
        String conversion;
        switch (b){
            case 2:
            {
                conversion= b1;
                break;
            }
            case 4:
            {
                conversion=Long.toString(this.conversionDe(), 4);
                break;
            }
            case 8:
            {
                conversion=Long.toOctalString(this.conversionDe());
                break;
            }
            case 10:
            {
                conversion= String.valueOf(conversionDe());
                break;
            }
            case 16:
            {
                conversion=Long.toHexString(this.conversionDe());
                break;
            }
            default:
            {
                conversion= Long.toString(this.conversionDe(), b);
            }
        }
        return conversion;
    }

    @Override
    public String suma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String resta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String multiplicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String division() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
