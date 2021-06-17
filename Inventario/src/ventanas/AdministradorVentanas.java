package ventanas;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

/**
 * importare
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class AdministradorVentanas {
    
    private static JFacturas ftc;
    private static VentanaRegistroCliente adminRegistro;
    private static RegistroVendedor rv;

    public static void mostrarVentanaFactura(JDesktopPane dp)
    {
        
        if(ftc != null && !ftc.isShowing())
       {
           ftc.show();
           dp.remove(ftc);
            try{
                dp.add(ftc, JLayeredPane.DEFAULT_LAYER); 
            }catch(IllegalArgumentException ex){               
                dp.add(ftc, JLayeredPane.DEFAULT_LAYER);                
            }    
       }
        
        if(ftc == null)
        {
          ftc = new JFacturas();
          dp.add(ftc, JLayeredPane.DEFAULT_LAYER);
        } 
       activarVentana(dp,ftc);     
    }
    
    
    public static void mostrarVentanaVendedor(JDesktopPane dp)
    {
         if(rv != null && !rv.isShowing())
       {
           rv.show();          
           dp.add(rv, JLayeredPane.DEFAULT_LAYER);
           rv.iniciarValores();
       }
        
        if(rv == null)
        {
          rv = new RegistroVendedor();
          dp.add(rv, JLayeredPane.DEFAULT_LAYER);
        } 
       activarVentana(dp,rv);
    }
    /**
     * 
     * @param dp panel padre
     * @param esNuevo true si se llama desde del menu
     */
    public static void mostrarClienteRegistro(JDesktopPane dp,boolean esNuevo)
    {
         if(adminRegistro != null && !adminRegistro.isShowing())
       {
           adminRegistro.show();
           dp.remove(adminRegistro);
            try{
                dp.add(adminRegistro, JLayeredPane.DEFAULT_LAYER); 
            }catch(IllegalArgumentException ex){
                dp.add(adminRegistro, JLayeredPane.DEFAULT_LAYER);                
            }
           
           adminRegistro.getPanelRegistro().habilitarPaginador(esNuevo);
       }else if(adminRegistro != null && adminRegistro.isShowing())
       {
           adminRegistro.getPanelRegistro().habilitarPaginador(esNuevo);
       }
         
         
        
        if(adminRegistro == null)
        {
          adminRegistro = new VentanaRegistroCliente(esNuevo); 
          dp.add(adminRegistro, JLayeredPane.DEFAULT_LAYER);
        }
        
       
        if(!esNuevo)
        {
            adminRegistro.getPanelRegistro().generarNuevoCliente();
        }else
        {
            adminRegistro.getPanelRegistro().iniciarValores();
        }
        activarVentana(dp,adminRegistro);
    } 
    private static void activarVentana(JDesktopPane dp,JInternalFrame vnt)
    {
        try {
            vnt.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AdministradorVentanas.class.getName()).log(Level.SEVERE, null, ex);
        }
        dp.setPosition(vnt, 0);
    }
    
    
}
