package controller;

import elaprendiz.conection.BaseConexion;
import java.sql.SQLException;
import java.util.ArrayList;
import modelobd.Articulo;
import modelobd.Cliente;
import modelobd.IModelo;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class ArticuloController extends AbstractController{

    public static final Articulo artTmp = new Articulo();
    private static Articulo articulo;

    public static Articulo getArticulo() {
        if(articulo == null)
            articulo = new Articulo();
        return articulo;
    }

    public static void setArticulo(Articulo articulo) {
        ArticuloController.articulo = articulo;
    }
    
    @Override
    public int grabarRegistro(IModelo modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void grabarRegistro(ArrayList modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int actualizarRegistro(String id, IModelo modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actualizarRegistro(IModelo modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminarRegistro(String id, IModelo modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int eliminarRegistro(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Articulo> getRegistros(int tipoSeleccion, String cnd) {
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        Articulo art=null;
        try{
         switch(tipoSeleccion)
         {
             case TODO:
                 rs = BaseConexion.getStatement().executeQuery(Articulo.SELECT_ALL);
                 break;
             case POR_CONDICION:
                     if(cnd == null || cnd.isEmpty())
                     {
                         throw new NullPointerException("condicion vacia");
                     }else
                     {
                         rs = BaseConexion.getStatement().executeQuery(cnd);
                     }
               break;  
             
         }
         
         while(rs.next())
         {
            art = new Articulo();
            art.setId(rs.getString(1));
            art.setDescripcion(rs.getString(2));
            art.setMarca(rs.getString(3));
            art.setPais(rs.getString(4));
            art.setStock(rs.getInt(5));
            art.setPrecioVenta(rs.getDouble(6));
            art.setPrecioCompra(rs.getDouble(7));
            art.setMaximo(rs.getInt(8));
            art.setMinimo(rs.getInt(9));
            articulos.add(art);
            
         }
        }catch(SQLException ex){}       
        return articulos;
    }

    @Override
    public IModelo getRegistro(String id) {
        Articulo art=null;
        try{
           
         rs = BaseConexion.getStatement().executeQuery(new Articulo().SELECT_POR_CODIGO+"'"+id+"'");
         
         while(rs.next())
         {
            art = new Articulo();
            art.setId(rs.getString(1));
            art.setDescripcion(rs.getString(2));
            art.setMarca(rs.getString(3));
            art.setPais(rs.getString(4));
            art.setStock(rs.getInt(5));
            art.setPrecioVenta(rs.getDouble(6));
            art.setPrecioCompra(rs.getDouble(7));
            art.setMaximo(rs.getInt(8));
            art.setMinimo(rs.getInt(9));
            
         }
        }catch(SQLException ex){}        
        return art;
    }

    @Override
    public IModelo getRegistro(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
