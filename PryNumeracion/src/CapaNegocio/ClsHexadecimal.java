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
public class ClsHexadecimal extends ClsNumero {
    private String o;

    public ClsHexadecimal(String o, int _base, long numero) {
        super(_base,numero);
        this.o = o;
    }
    
    public ClsHexadecimal (ClsHexadecimal B, int _base, long numero){
        super(_base,numero);
        this.o=B.o;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
    
    
    public long conversionDe(){
       return Long.parseLong(o, 2);
    }
    public String suma(ClsHexadecimal B){
        long suma= this.conversionDe()+B.conversionDe();
        String num=Long.toBinaryString(suma);
        ClsHexadecimal C= new ClsHexadecimal(num,16,suma);
        return C.o;
    }
    public String resta(ClsHexadecimal B){
        long suma= this.conversionDe()-B.conversionDe();
        String num=Long.toBinaryString(suma);
        ClsHexadecimal C= new ClsHexadecimal(num,16,suma);
        return C.o;
    }
    public String multiplicacion(ClsHexadecimal B){
        long suma= this.conversionDe()*B.conversionDe();
        String num=Long.toBinaryString(suma);
        ClsHexadecimal C= new ClsHexadecimal(num,16,suma);
        return C.o;
    }
    public String division(ClsHexadecimal B){
        long suma=0;
        if (B.conversionDe()>0)
        {
            suma= this.conversionDe()/B.conversionDe();
        }
        String num=Long.toBinaryString(suma);
        ClsHexadecimal C= new ClsHexadecimal(num,16,suma);
        return C.o;
    }
    public String conversion(int b){
        String conversion;
        switch (b){
            case 2:
            {
                conversion=Long.toBinaryString(this.conversionDe());
                break;
            }
            case 4:
            {
                conversion=Long.toString(this.conversionDe(), 4);
                break;
            }
            case 8:
            {
                conversion=Long.toHexString(this.conversionDe());
                break;
            }
            case 10:
            {
                conversion= String.valueOf(conversionDe());
                break;
            }
            case 16:
            {
                
                conversion= o;
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
