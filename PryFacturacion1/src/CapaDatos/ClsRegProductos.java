/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fredd
 */
public class ClsRegProductos {
    private int _clvProducto;
    private String _nomProducto;
    private String _precioProducto;
    private int _cantProducto;
    private String _unidadProducto;
    public ClsRegProductos(){
        _clvProducto=0;
        _cantProducto=0;
        _nomProducto=null;
        _precioProducto=null;
        _unidadProducto=null;
    }

    public int getClvProducto() {
        return _clvProducto;
    }

    public void setClvProducto(int _clvProducto) {
        this._clvProducto = _clvProducto;
    }

    public String getNomProducto() {
        return _nomProducto;
    }

    public void setNomProducto(String _nomProducto) {
        this._nomProducto = _nomProducto;
    }

    public String getPrecioProducto() {
        return _precioProducto;
    }

    public void setPrecioProducto(String _precioProducto) {
        this._precioProducto = _precioProducto;
    }

    public int getCantProducto() {
        return _cantProducto;
    }

    public void setCantProducto(int _cantProducto) {
        this._cantProducto = _cantProducto;
    }

    public String getUnidadProducto() {
        return _unidadProducto;
    }

    public void setUnidadProducto(String _unidadProducto) {
        this._unidadProducto = _unidadProducto;
    }
    public void leer(ResultSet prod) throws SQLException{
        _clvProducto=prod.getInt("clvProducto");
        _nomProducto=prod.getString("nomProducto");
        _precioProducto=prod.getString("precioProducto");
        _cantProducto=prod.getInt("cantProducto");
        _unidadProducto=prod.getString("cantidadProducto");
    }
}
