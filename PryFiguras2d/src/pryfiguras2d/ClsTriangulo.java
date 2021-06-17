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
    //Atributtos de la clase
    private float _lado1, _lado2, _lado3;
    //Constructores de la clase
    public ClsTriangulo (ClsPunto p, ClsPunto q, ClsPunto r){
        ClsLinea l1,l2,l3;
        l1= new ClsLinea(p,q);
        l2=new ClsLinea(p,r);
        l3= new ClsLinea(q,r);
        
        _lado1=(float) l1.Longitud();
        _lado2=(float) l2.Longitud();
        _lado3=(float) l3.Longitud();
    }
    
    //Metodos de la clase
    
}
