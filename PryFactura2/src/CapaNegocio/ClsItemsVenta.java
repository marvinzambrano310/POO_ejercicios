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
public class ClsItemsVenta {
    private int _clvVenta;
    private String descVenta;
    private int _cantVenta;
    private float _precioVenta;
    
    public ClsItemsVenta(int _clvVenta, String descVenta, int _cantVenta, float _precioVenta) {
        this._clvVenta = _clvVenta;
        this.descVenta = descVenta;
        this._cantVenta = _cantVenta;
        this._precioVenta = _precioVenta;
    }

    public int getClvVenta() {
        return _clvVenta;
    }

    public void setClvVenta(int _clvVenta) {
        this._clvVenta = _clvVenta;
    }

    public String getDescVenta() {
        return descVenta;
    }

    public void setDescVenta(String descVenta) {
        this.descVenta = descVenta;
    }

    public int getCantVenta() {
        return _cantVenta;
    }

    public void setCantVenta(int _cantVenta) {
        this._cantVenta = _cantVenta;
    }

    public float getPrecioVenta() {
        return _precioVenta;
    }

    public void setPrecioVenta(float _precioVenta) {
        this._precioVenta = _precioVenta;
    }

   public float Subtotal(){
       return (float)_cantVenta*_precioVenta;
   }
   
   
}
