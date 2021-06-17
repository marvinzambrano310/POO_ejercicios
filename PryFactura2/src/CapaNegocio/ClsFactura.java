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
public class ClsFactura {
    private int _clvVendedor;
    private int _clvCliente;
    private String _nombreCliente;
    private String _apellidoCliente;
    private String _dirCliente;
    private String _celCliente;
    ClsItemsVenta[] pv;

    public ClsFactura(int _clvVendedor, int _clvCliente, String _nombreCliente, String _apellidoCliente, String _dirCliente) {
        this._clvVendedor = _clvVendedor;
        this._clvCliente = _clvCliente;
        this._nombreCliente = _nombreCliente;
        this._apellidoCliente = _apellidoCliente;
        this._dirCliente = _dirCliente;
    }

    public int getClvVendedor() {
        return _clvVendedor;
    }

    public void setClvVendedor(int _clvVendedor) {
        this._clvVendedor = _clvVendedor;
    }

    public int getClvCliente() {
        return _clvCliente;
    }

    public void setClvCliente(int _clvCliente) {
        this._clvCliente = _clvCliente;
    }

    public String getNombreCliente() {
        return _nombreCliente;
    }

    public void setNombreCliente(String _nombreCliente) {
        this._nombreCliente = _nombreCliente;
    }

    public String getApellidoCliente() {
        return _apellidoCliente;
    }

    public void setApellidoCliente(String _apellidoCliente) {
        this._apellidoCliente = _apellidoCliente;
    }

    public String getDirCliente() {
        return _dirCliente;
    }

    public void setDirCliente(String _dirCliente) {
        this._dirCliente = _dirCliente;
    }

    public String getCelCliente() {
        return _celCliente;
    }

    public void setCelCliente(String _celCliente) {
        this._celCliente = _celCliente;
    }

    public ClsItemsVenta[] getPv() {
        return pv;
    }

    public void setPv(ClsItemsVenta[] pv) {
        this.pv = pv;
    }
    
    public ClsItemsVenta getPv(int i) {
        return pv[i];
    }

    public void setPv(int i, ClsItemsVenta pv) {
        this.pv[i] = pv;
    }
    
    public float calculoIVA(float Iva){
        return Importe()*Iva;
    }
    public float Importe(){
        float importe=0;
        for (int i=0;i<pv.length;i++){
            importe+=pv[i].Subtotal();
        }
        return importe;
    }
}
