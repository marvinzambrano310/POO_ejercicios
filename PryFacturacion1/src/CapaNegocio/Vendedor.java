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
public class Vendedor {
    private int id;
	
	private String _cedula;
	private String _nombre;
	private String _apellido;
        private String _direccion;
        
        private String _telefono;
        private String _celular;
	
	public Vendedor() {
	}
	
	public Vendedor(String cedula, String nombre, String apellido, String direccion, String telefono,String celular) {
		this.id = id;
		this._cedula = cedula;
		this._nombre = nombre;
		this._apellido = apellido;
                this._direccion=direccion;
                this._telefono=telefono;
                this._celular=celular;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getCedula() {
		return _cedula;
	}
 
	public void setCedula(String cedula) {
		this._cedula = cedula;
	}
 
	public String getNombre() {
            return _nombre;
	}
 
	public void setNombre(String nombre) {
		this._nombre = nombre;
	}
 
	public String getApellido() {
		return _apellido;
	}
 
	public void setApellido(String apellido) {
		this._apellido = apellido;
	}

        public String getDireccion() {
            return _direccion;
        }

        public void setDireccion(String _direccion) {
            this._direccion = _direccion;
        }

        public String getTelefono() {
            return _telefono;
        }

        public void setTelefono(String _telefono) {
            this._telefono = _telefono;
        }

        public String getCelular() {
            return _celular;
        }

        public void setCelular(String _celular) {
            this._celular = _celular;
        }

	@Override
	public String toString() {
		return this.id+", "+this._cedula+", "+this._nombre+", "+this._apellido+", "+this._direccion+", "+this._telefono+", "+this._celular;
	}
}
