
package prycalculadorenteros;
    

public class ClsOperaciones {
    //Atributos
    private long _x;
    //constructores
    public ClsOperaciones(long x){
        _x=x;
    }
    public ClsOperaciones(){
        _x=0;
    }
    public ClsOperaciones(ClsOperaciones a){
        _x=a._x;
    }
    //Gets y sets
    public long x(){return _x;}
    public void x(long valor){ _x=valor;}
    //Metodos del usuario
    public String ParImpar(){
        if (_x % 2 == 0){
            return "EL Numero Es PAR";
        }
        else
        {   
           return "El Numero Ingresado es IMPAR";
        }
    }
    public String Primo(){
        int i=0,cant;
        for (cant=0;cant<_x;cant++)
        {
            if (_x % cant == 0)
            {
                i++;
            }
        }
        if (i<=2) 
        {
            return "EL Numero es PRIMO";
        }
        else
        {
            return "El Numero NO es Primo";
        }
    }
    public long Factorial(long valor)
    {
        long fact=1;
        long i=1;
        for (i=1;i<=_x;i++)
        {
          fact*=i;  
        }
        return fact;
    }
    public ClsOperaciones mas(ClsOperaciones op){
        _x+=op._x;
        return this;
    }
    public ClsOperaciones menos(ClsOperaciones op){
        _x-=op._x;
        return this;
    }
    public ClsOperaciones por(ClsOperaciones op){
        _x*=op._x;
        return this;
    }
    public ClsOperaciones para(ClsOperaciones op){
        _x/=op._x;
        return this;
    }
    public ClsOperaciones residuo(ClsOperaciones op){
        _x%=op._x;
        return this;
    }
    public ClsOperaciones elevado(ClsOperaciones op){
        _x=Math.pow(_x,op._x);
        return this;
    }
    
    
    
    
}
