/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author user
 */
public class ClsOperaciones extends ClsConjuntos2{
    private String []_elem;
    private int _card;
    
    //constructor de los elementos
    public ClsOperaciones(int dimension,String[] _elem, int _card) {
        super(dimension);
        this._elem = _elem;
        this._card = _card;
    }
    //constructor con la clase
    public ClsOperaciones (int dimension,ClsOperaciones p){
        super(dimension);
        this._card=p._card;
        this._elem=p._elem;
    }
    
    public ClsOperaciones(int dimension) {
        super(dimension);
        this._card = _card;
        _elem=new String[this._card];
    }
    
    //getters and setters
    public String Elem(int indice) {
        return _elem[indice];
    }

    public String[] getElem() {
        return _elem;
    }

    public void setElem(String[] _elem) {
        this._elem = _elem;
    }

    public int getCard() {
        return _card;
    }

    public void setCard(int _card) {
        this._card = _card;
    }

    public void Elem(int indice,String valor) {
        _elem[indice]=valor;
    }

    public int Card() {
        return _card;
    }

    public void Card(int valor) {
        this._card=valor;
    }
    public String Resultado(){
        String r="{";
        for (int i=0;i<_card-1;i++)
        {
            r+=_elem[i]+" ";
        } 
        r+=_elem[_card-1]+"}";
        return r;
    }
    public String busqueda(String val){
        boolean buscar;
        buscar=false;
        for (int i=0; i<_card;i++)
        {
            if (_elem[i].equals(val))
            {
                buscar=true;
            }
            
        }
        if (buscar)
        {
            val= val +" Existe y Pertence al conjunto";
        }
        else
        {
            val= val + " No Existe en el conjunto";
        }
        return val;
    }
    
    public ClsOperaciones union(ClsOperaciones s){
        ClsOperaciones u=new ClsOperaciones (this._card +s._card);
        System.arraycopy(_elem, 0, u._elem, 0, this._card);
        boolean existe;
        int k=_card;
        for (int i=0;i<s._card;i++)
        {
            existe=false;
            for(int j=0;j<_card;j++)
            {
                if(s._elem[i].equals(_elem[j]))
                {
                    existe=true;
                }
            }
            if (!existe )
            {
                
                u._elem[k++]=s.Elem(i);
            }
        }
        u._card=k--;
        return u;
    }
    public ClsOperaciones inter(ClsOperaciones s){
        ClsOperaciones u=new ClsOperaciones (this._card );
        //System.arraycopy(_elem, 0, u._elem, 0, this._card);
        boolean existe;
        int k=0;
        for (int i=0;i<s._card;i++)
        {
            existe=false;
            for(int j=0;j<_card;j++)
            {
                if(s._elem[i].equals(_elem[j]))
                {
                    existe=true;
                }
            }
            if (existe)
            {
                u._elem[k++]=s._elem[i];
            }
        }
        u._card=k--;
        return u;
    }
    
    public ClsOperaciones diferencia(ClsOperaciones s){
        ClsOperaciones u=new ClsOperaciones (this._card);
        //System.arraycopy(_elem, 0, u._elem, 0, this._card);
        boolean existe;
        int k=0;
        for (int i=0;i<_card;i++)
        {
            existe=false;
            for(int j=0;j<s._card;j++)
            {
                if(_elem[i].equals(s._elem[j]))
                {
                    existe=true;
                }
            }
            if (!existe)
            {
                u._elem[k++]=_elem[i];
            }
        }
        u._card=k--;
        return u;
    }
    public ClsOperaciones cartesiano(ClsOperaciones s){
        ClsOperaciones u= new ClsOperaciones(this._card*s._card);
        int k=0;
        for (int i=0; i<_card;i++)
        {
            for (int j=0;j<s._card;j++)
            {
                u._elem[k++]="(" + _elem[i] + "," +s._elem[j]+")";
            }
        }
        return u;
    }

    @Override
    public ClsConjuntos2 union() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClsConjuntos2 inter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClsConjuntos2 diferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClsConjuntos2 cartesiano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String busqueda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
