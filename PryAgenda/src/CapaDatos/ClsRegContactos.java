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
 * @author Usuario
 */
public class ClsRegContactos {
    private int _clvContacto;
    private String _nomContacto;
    private String _dirContacto;
    private String _descContacto;
    
    
    public ClsRegContactos(){
        _clvContacto=0;
        _nomContacto=null;
        _dirContacto=null;
        _descContacto=null;
    }

    public int getClvContacto() {
        return _clvContacto;
    }

    public void setClvContacto(int _clvContacto) {
        this._clvContacto = _clvContacto;
    }

    public String getNomContacto() {
        return _nomContacto;
    }

    public void setNomContacto(String _nomContacto) {
        this._nomContacto = _nomContacto;
    }

    public String getDirContacto() {
        return _dirContacto;
    }

    public void setDirContacto(String _dirContacto) {
        this._dirContacto = _dirContacto;
    }

    public String getDescContacto() {
        return _descContacto;
    }

    public void setDescContacto(String _descContacto) {
        this._descContacto = _descContacto;
    }
    
    public void leer(ResultSet contacto) throws SQLException{
        _clvContacto=contacto.getInt("ClvContacto");
        _nomContacto=contacto.getString("NomContacto");
        _dirContacto=contacto.getString("DirContacto");
        _descContacto=contacto.getString("DescContacto");
        
    }
    
}
