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
public class Factura {
    private int id;
    private String _date;
    private int _clvProduto;
    private int _clvVendedor;

    public Factura(){} 
    
    public Factura(int id, String _date, int _clvProduto, int _clvVendedor) {
        this.id = id;
        this._date = _date;
        this._clvProduto = _clvProduto;
        this._clvVendedor = _clvVendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return _date;
    }

    public void setDate(String _date) {
        this._date = _date;
    }

    public int getClvProduto() {
        return _clvProduto;
    }

    public void setClvProduto(int _clvProduto) {
        this._clvProduto = _clvProduto;
    }

    public int getClvVendedor() {
        return _clvVendedor;
    }

    public void setClvVendedor(int _clvVendedor) {
        this._clvVendedor = _clvVendedor;
    }
    
    @Override
    public String toString(){
        return this.id+", "+this._date+", "+this._clvProduto+", "+this._clvVendedor;
    }
}
