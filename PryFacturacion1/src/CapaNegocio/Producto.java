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
public class Producto {
    private int id;
    private String _nombre;
    private float _precio; 
    private int _Stock;

    public Producto(){
    }
    
    public Producto(int id, String _nombre, float _precio, int _Stock) {
        this.id = id;
        this._nombre = _nombre;
        this._precio = _precio;
        this._Stock = _Stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float getPrecio() {
        return _precio;
    }

    public void setPrecio(float _precio) {
        this._precio = _precio;
    }

    public int getStock() {
        return _Stock;
    }

    public void setStock(int _Stock) {
        this._Stock = _Stock;
    }
    
    @Override
    public String toString() {
	return this.id+", "+this._nombre+", "+this._precio+", "+this._Stock;
    }

    
}
