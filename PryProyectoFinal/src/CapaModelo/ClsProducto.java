/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaModelo;

/**
 *
 * @author HP
 */
public class ClsProducto {

    private String nombre;
    private String tipoProducto;
    private Double precio;
    private int cantidad;

    public ClsProducto() {
    }

    public ClsProducto(String nombre, String tipoProducto, Double precio, int cantidad) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
