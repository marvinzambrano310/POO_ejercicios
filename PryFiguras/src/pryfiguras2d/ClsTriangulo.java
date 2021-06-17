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
public class ClsTriangulo {
    //Atributos
    private float _lado1;
    private float _lado2;
    private float _lado3;
    
    //Constructores
    public ClsTriangulo(ClsPunto p, ClsPunto q, ClsPunto r){
        ClsLinea l1,l2,l3;
        l1= new ClsLinea(p,q);
        l2= new ClsLinea(p,r);
        l3= new ClsLinea(q,r);
        if (l1 != l2 && l2 != l3 && l1 != l3){
            _lado1=(float) l1.longitud();
            _lado2=(float) l2.longitud();
            _lado3=(float) l3.longitud();
        }
    }

    public float getLado1() {
        return _lado1;
    }

    public void setLado1(float _lado1) {
        this._lado1 = _lado1;
    }

    public float getLado2() {
        return _lado2;
    }

    public void setLado2(float _lado2) {
        this._lado2 = _lado2;
    }

    public float getLado3() {
        return _lado3;
    }

    public void setLado3(float _lado3) {
        this._lado3 = _lado3;
    }
          
    //Metodos
    public String distancia(){
       String d="lado 1= "+_lado1 + " lado 2= "+ _lado2 + " lado 3= "+ _lado3;
       return d;
    }
    public String angulos(){
        String r=" Alfa: ";
        double alfa= Math.acos((Math.pow(_lado1,2)+Math.pow(_lado2,2)-Math.pow(_lado3,2))/(2*_lado1*_lado2));
        alfa=((float) alfa*(180/Math.PI));
        double beta= Math.acos((Math.pow(_lado2,2)+Math.pow(_lado3,2)-Math.pow(_lado1,2))/(2*_lado2*_lado3));
        beta=((float) beta*(180/Math.PI));
        double gama=Math.cos((Math.pow(_lado1,2)+Math.pow(_lado3,2)-Math.pow(_lado2,2))/(2*_lado1*_lado3));
        gama=((float) gama*(180/Math.PI));
        r+=alfa + " Beta: "+ beta + " Gamma: "+gama;
        return r;
    }
    public float perimetro(){
        float perim= _lado1+_lado2+_lado3;
        return perim;
    }
    public float altura(){
        double angulo=Math.acos((Math.pow(_lado1,2)+Math.pow(_lado2,2)-Math.pow(_lado3,2))/(2*_lado1*_lado2));
        double j=Math.sin(angulo);
        double h=_lado1*(j);
        return (float) h;
    }
    public float area (){
        //area=base*altura
        float a= (_lado2*altura())/2;
        return a;
    }
}
