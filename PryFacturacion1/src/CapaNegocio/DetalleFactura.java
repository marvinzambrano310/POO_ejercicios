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
public class DetalleFactura {
    private int id;
    private int _clvProduto;
    private int _cantrProducto;

    public DetalleFactura(int id, int _clvProduto, int _cantrProducto) {
        this.id = id;
        this._clvProduto = _clvProduto;
        this._cantrProducto = _cantrProducto;
    }
    
    public DetalleFactura(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClvProduto() {
        return _clvProduto;
    }

    public void setClvProduto(int _clvProduto) {
        this._clvProduto = _clvProduto;
    }

    public int getCantrProducto() {
        return _cantrProducto;
    }

    public void setCantrProducto(int _cantrProducto) {
        this._cantrProducto = _cantrProducto;
    }
    
    @Override
    public String toString(){
        return this.id+", "+this._clvProduto+", "+this._cantrProducto;
    }
}
