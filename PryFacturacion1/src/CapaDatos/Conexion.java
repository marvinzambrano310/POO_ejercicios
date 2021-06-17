/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;
import CapaNegocio.Cliente;
import CapaNegocio.DetalleFactura;
import CapaNegocio.Factura;
import CapaNegocio.Producto;
import CapaNegocio.Vendedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Conexion {
    Connection _base= null;
    Statement _tabla;
    ResultSet datos;
    String dirbase;

    public Conexion (String dirbase) throws SQLException{
        try{
            _base=DriverManager.getConnection("jdbc:ucanaccess://"+dirbase);
            _tabla=_base.createStatement(ResultSet.FETCH_UNKNOWN,ResultSet.TYPE_SCROLL_SENSITIVE);
            System.out.print("******CONEXION EXITOSA******");
        }
        catch (SQLException err){
            System.out.print("*****CONEXION ERRADA******"+err);
        }
    }

    public ResultSet getDatos() {
        return datos;
    }
    
	public boolean registrar(Cliente cliente) {
		boolean registrar = false;
		String sql="INSERT INTO TbCliente values ("+cliente.getId()+"','"+cliente.getCedula()+"','"+cliente.getNombre()+"','"+cliente.getApellido()+"','"+cliente.getFechaNacimiento()+"','"+cliente.getDireccion()+"','"+cliente.getTelefono()+"','"+cliente.getCelular()+"','"+cliente.getEmail()+"')";
		try {
                    datos=null;
                    _tabla.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}
		return registrar;
	}
 
	public List<Cliente> obtener() {
            String sql="SELECT * FROM TbCliente";
		
            List<Cliente> listaCliente= new ArrayList<Cliente>();
            try {			
                datos=_tabla.executeQuery(sql);
		while (datos.next()) {
                    Cliente c=new Cliente();
                    c.setId(datos.getInt(1));
                    c.setCedula(datos.getString(2));
                    c.setNombre(datos.getString(3));
                    c.setApellido(datos.getString(4));
                    c.setFechaNacimiento(datos.getString(5));
                    c.setDireccion(datos.getString(6));
                    c.setTelefono(datos.getString(7));
                    c.setCelular(datos.getString(8));
                    c.setEmail(datos.getString(9));
                    listaCliente.add(c);
                    }
		} catch (SQLException e) {
                    System.out.println("Error"+e);
		}
		return listaCliente;
	}
        
	public boolean actualizar(Cliente cliente) {
		boolean actualizar=false;		
		String sql="UPDATE TbCliente SET cedCliente='"+cliente.getNombre()+"' nomCliente='"+cliente.getNombre()+"', apelCliente='"+cliente.getApellido()+"', fechaCliente='"+cliente.getFechaNacimiento()+"', dirCliente='"+cliente.getDireccion()+"', telfCliente='"+cliente.getTelefono()+"', celCliente='"+cliente.getCelular()+"', emailCliente='"+cliente.getEmail()+"' WHERE ID="+cliente.getId();
		try {
                        
			_tabla.executeQuery(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return actualizar;
	}

	public boolean eliminar(Cliente cliente) {
		boolean eliminar=false;		
		String sql="DELETE FROM TbCliente WHERE clvCliente="+cliente.getId();
		try {
			_tabla.executeQuery(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
			e.printStackTrace();
		}		
		return eliminar;
	}
        
        public boolean registrar(Vendedor vendedor) {
		boolean registrar = false;
		String sql="INSERT INTO TbVendedor values ("+vendedor.getId()+"','"+vendedor.getCedula()+"','"+vendedor.getNombre()+"','"+vendedor.getApellido()+"','"+vendedor.getDireccion()+"','"+vendedor.getTelefono()+"','"+vendedor.getCelular()+"')";
		try {
                    datos=null;
                    _tabla.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}
		return registrar;
	}
 
	public List<Vendedor> obtenerv() {
            String sql="SELECT * FROM TbVendedor";
		
            List<Vendedor> listaVendedor= new ArrayList<Vendedor>();
            try {			
                datos=_tabla.executeQuery(sql);
		while (datos.next()) {
                    Vendedor c=new Vendedor();
                    c.setId(datos.getInt(1));
                    c.setCedula(datos.getString(2));
                    c.setNombre(datos.getString(3));
                    c.setApellido(datos.getString(4));
                    c.setDireccion(datos.getString(5));
                    c.setTelefono(datos.getString(6));
                    c.setCelular(datos.getString(7));
                    listaVendedor.add(c);
                    }
		} catch (SQLException e) {
                    System.out.println("Error"+e);
		}
		return listaVendedor;
	}
        
	public boolean actualizar(Vendedor vendedor) {
		boolean actualizar=false;		
		String sql="UPDATE TbCliente SET cedVendedor= '"+vendedor.getCedula()+"', nomVendedor='"+vendedor.getNombre()+"', apelCliente='"+vendedor.getApellido()+"', dirCliente='"+vendedor.getDireccion()+"', telfCliente='"+vendedor.getTelefono()+"', celCliente='"+vendedor.getCelular()+"' WHERE ID="+vendedor.getId();
		try {
                        
			_tabla.executeQuery(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return actualizar;
	}

	public boolean eliminar(Vendedor vendedor) {
		boolean eliminar=false;		
		String sql="DELETE FROM TbVendedor WHERE clvVendedor="+vendedor.getId();
		try {
			_tabla.executeQuery(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return eliminar;
	}

        public boolean registrar(Producto producto) {
		boolean registrar = false;
		String sql="INSERT INTO TbProducto values ("+producto.getId()+"','"+producto.getNombre()+"','"+producto.getPrecio()+"','"+producto.getStock()+"')";
		try {
                    datos=null;
                    _tabla.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}
		return registrar;
	}
 
	public List<Producto> obtenerp () {
            String sql="SELECT * FROM TbProducto";
		
            List<Producto> listaProducto= new ArrayList<Producto>();
            try {			
                datos=_tabla.executeQuery(sql);
		while (datos.next()) {
                    Producto c=new Producto();
                    c.setId(datos.getInt(1));
                    c.setNombre(datos.getString(3));
                    c.setPrecio(datos.getInt(4));
                    c.setStock(datos.getInt(5));
                    listaProducto.add(c);
                    }
		} catch (SQLException e) {
                    System.out.println("Error"+e);
		}
		return listaProducto;
	}
        
	public boolean actualizar(Producto producto) {
		boolean actualizar=false;		
		String sql="UPDATE TbProducto SET nomProducto= '"+producto.getNombre()+"', nomPrecio='"+producto.getPrecio()+"', cantProdcuto='"+producto.getStock()+"' WHERE clvProducto="+producto.getId();
		try {
                        
			_tabla.executeQuery(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return actualizar;
	}

	public boolean eliminar(Producto producto) {
		boolean eliminar=false;		
		String sql="DELETE FROM TbProducto WHERE clvproducto="+producto.getId();
		try {
			_tabla.executeQuery(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return eliminar;
	}

        public boolean registrar(Factura factura) {
		boolean registrar = false;
		String sql="INSERT INTO TbCabFactura values ("+factura.getId()+"','"+factura.getDate()+"','"+factura.getClvProduto()+"','"+factura.getClvVendedor()+"')";
		try {
                    datos=null;
                    _tabla.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}
		return registrar;
	}
 
	public List<Factura> obtenerF () {
            String sql="SELECT * FROM TbCabFactura";
		
            List<Factura> listaFactura= new ArrayList<Factura>();
            try {			
                datos=_tabla.executeQuery(sql);
		while (datos.next()) {
                    Factura c=new Factura();
                    c.setId(datos.getInt(1));
                    c.setDate(datos.getString(2));
                    c.setClvProduto(datos.getInt(3));
                    c.setClvVendedor(datos.getInt(4));
                    listaFactura.add(c);
                    }
		} catch (SQLException e) {
                    System.out.println("Error"+e);
		}
		return listaFactura;
	}
        
	public boolean actualizar(Factura factura) {
		boolean actualizar=false;		
		String sql="UPDATE TbCabFactura SET fechaFactura= '"+factura.getDate()+"', clvProducto='"+factura.getClvProduto()+"', clvVendedor='"+factura.getClvVendedor()+"' WHERE clvFactura="+factura.getId();
		try {
                        
			_tabla.executeQuery(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return actualizar;
	}

	public boolean eliminar(Factura factura) {
		boolean eliminar=false;		
		String sql="DELETE FROM TbCabFactura WHERE clvFactura="+factura.getId();
		try {
			_tabla.executeQuery(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return eliminar;
	}
        
        public boolean registrar(DetalleFactura detalle) {
		boolean registrar = false;
		String sql="INSERT INTO TbDetFactura values ("+detalle.getId()+"','"+detalle.getClvProduto()+"','"+detalle.getCantrProducto()+"')";
		try {
                    datos=null;
                    _tabla.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}
		return registrar;
	}
 
	public List<DetalleFactura> obtenerD () {
            String sql="SELECT * FROM TbDetFactura";
		
            List<DetalleFactura> listaDetalle= new ArrayList<DetalleFactura>();
            try {			
                datos=_tabla.executeQuery(sql);
		while (datos.next()) {
                    DetalleFactura c=new DetalleFactura();
                    c.setId(datos.getInt(1));
                    c.setClvProduto(datos.getInt(2));
                    c.setCantrProducto(datos.getInt(3));
                    listaDetalle.add(c);
                    }
		} catch (SQLException e) {
                    System.out.println("Error"+e);
		}
		return listaDetalle;
	}
        
	public boolean actualizar(DetalleFactura detalle) {
		boolean actualizar=false;		
		String sql="UPDATE TbDetFactura SET clvProducto= '"+detalle.getClvProduto()+"', cantProducto='"+detalle.getCantrProducto()+"' WHERE clvFactura="+detalle.getId();
		try {
                        
			_tabla.executeQuery(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return actualizar;
	}

	public boolean eliminar(DetalleFactura detalle) {
		boolean eliminar=false;		
		String sql="DELETE FROM TbDetFactura WHERE clvFactura="+detalle.getId();
		try {
                    _tabla.executeQuery(sql);
                    eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error"+e);
		}		
		return eliminar;
	}
        
        public boolean busqueda(Cliente cliente) throws SQLException{
        String comando="SELECT * FROM TbVliente WHERE clvCliente = "+ cliente.getId() ;
        datos=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        datos=_tabla.getResultSet();
        if (datos!=null){
            respuesta=true;
        }
        return respuesta;
        }
        
        public boolean busqueda(Vendedor vendedor) throws SQLException{
        String comando="SELECT * FROM TbVendedor WHERE clvVendedor = "+ vendedor.getId() ;
        datos=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        datos=_tabla.getResultSet();
        if (datos!=null){
            respuesta=true;
        }
        return respuesta;
        }
        
        public boolean busqueda(Producto producto) throws SQLException{
        String comando="SELECT * FROM TbProducto WHERE clvProducto = "+ producto.getId() ;
        datos=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        datos=_tabla.getResultSet();
        if (datos!=null){
            respuesta=true;
        }
        return respuesta;
        }
        
        public boolean busqueda(Factura factura) throws SQLException{
        String comando="SELECT * FROM TbCabFactura WHERE clvFactura = "+ factura.getId() ;
        datos=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        datos=_tabla.getResultSet();
        if (datos!=null){
            respuesta=true;
        }
        return respuesta;
        }
        
        public boolean busqueda(DetalleFactura detalle) throws SQLException{
        String comando="SELECT * FROM TbDetFactura WHERE clvFactura = "+ detalle.getId() ;
        datos=null;
        boolean respuesta=false;
        _tabla.execute(comando);
        datos=_tabla.getResultSet();
        if (datos!=null){
            respuesta=true;
        }
        return respuesta;
        }
        
}

