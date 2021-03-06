/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;

import CapaDatos.ClsConexion;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class WinAgenda extends javax.swing.JFrame {
    ClsConexion agenda,telefono;
    ResultSet RsContactos,RsTelefonos;
    int clv;
    /**
     * Creates new form WinAgenda
     */
    public WinAgenda() {
        initComponents();
        ArchBase.setVisible(false);
        PnlRecorrer.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color (231,217,189));
        this.PnlRecorrer.setBackground(new Color (231,217,189));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlRecorrer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txtnombre = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        BtnSiguiente = new javax.swing.JButton();
        BtnPrevio = new javax.swing.JButton();
        CmbTelefono = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ArchBase = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuDatos = new javax.swing.JMenu();
        ItmAbrir = new javax.swing.JMenuItem();
        ItmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItmRecorrer = new javax.swing.JMenuItem();
        ItmNuevo = new javax.swing.JMenuItem();
        ItmBorrar = new javax.swing.JMenuItem();
        ItmModificar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ItmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicaci??n Gesti??n de Agenda Telef??nica");
        setBackground(new java.awt.Color(231, 217, 189));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlRecorrer.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Direcci??n:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Descripci??n:");

        Txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        TxtDireccion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });

        TxtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TxtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripcionActionPerformed(evt);
            }
        });

        BtnSiguiente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnPrevio.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BtnPrevio.setText("Previo");
        BtnPrevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrevioActionPerformed(evt);
            }
        });

        CmbTelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CmbTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Telefono de Contacto");

        javax.swing.GroupLayout PnlRecorrerLayout = new javax.swing.GroupLayout(PnlRecorrer);
        PnlRecorrer.setLayout(PnlRecorrerLayout);
        PnlRecorrerLayout.setHorizontalGroup(
            PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRecorrerLayout.createSequentialGroup()
                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRecorrerLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(BtnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPrevio))
                    .addGroup(PnlRecorrerLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(CmbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlRecorrerLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlRecorrerLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRecorrerLayout.createSequentialGroup()
                                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        PnlRecorrerLayout.setVerticalGroup(
            PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRecorrerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CmbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(PnlRecorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente)
                    .addComponent(BtnPrevio))
                .addGap(43, 43, 43))
        );

        getContentPane().add(PnlRecorrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 460, 390));

        ArchBase.setCurrentDirectory(new java.io.File("C:\\Users\\Usuario\\Equipo"));
        ArchBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchBaseActionPerformed(evt);
            }
        });
        getContentPane().add(ArchBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 510));

        MnuDatos.setText("Base de Datos");

        ItmAbrir.setText("Abrir");
        ItmAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAbrirActionPerformed(evt);
            }
        });
        MnuDatos.add(ItmAbrir);

        ItmSalir.setText("Salir");
        ItmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmSalirActionPerformed(evt);
            }
        });
        MnuDatos.add(ItmSalir);

        jMenuBar1.add(MnuDatos);

        jMenu2.setText("Contactos");

        ItmRecorrer.setText("Recorrer");
        ItmRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmRecorrerActionPerformed(evt);
            }
        });
        jMenu2.add(ItmRecorrer);

        ItmNuevo.setText("Nuevo");
        ItmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmNuevoActionPerformed(evt);
            }
        });
        jMenu2.add(ItmNuevo);

        ItmBorrar.setText("Borrar");
        jMenu2.add(ItmBorrar);

        ItmModificar.setText("Modificar");
        ItmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmModificarActionPerformed(evt);
            }
        });
        jMenu2.add(ItmModificar);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Ayuda");

        ItmAcerca.setText("Acerca de ");
        jMenu1.add(ItmAcerca);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmNuevoActionPerformed
        
    }//GEN-LAST:event_ItmNuevoActionPerformed

    private void ItmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItmModificarActionPerformed

    private void ItmAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAbrirActionPerformed
        ArchBase.setVisible(true);
    }//GEN-LAST:event_ItmAbrirActionPerformed

    private void ArchBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchBaseActionPerformed
        File f=ArchBase.getSelectedFile();
        String bd=f.getAbsolutePath();
        String h=null;
        ArchBase.setVisible(false);
        try {
            agenda=new ClsConexion(bd);
            telefono=new ClsConexion(bd);
            agenda.Consulta("TbContacto");
        } catch (SQLException ex) {
            Logger.getLogger(WinAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ArchBaseActionPerformed

    private void ItmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ItmSalirActionPerformed

    private void TxtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripcionActionPerformed

    private void ItmRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmRecorrerActionPerformed
        ArchBase.setVisible(false);
        PnlRecorrer.setVisible(true);
    }//GEN-LAST:event_ItmRecorrerActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        try {
            agenda.siguiente();
            Txtnombre.setText(agenda.getRegistro().getString("NomContacto"));
            TxtDireccion.setText(agenda.getRegistro().getString("DirContacto"));
            TxtDescripcion.setText(agenda.getRegistro().getString("DescContacto"));   
            clv=agenda.getRegistro().getInt("ClvContacto");
            telefono.Consulta1(clv);
            CmbTelefono.removeAllItems();
            for (int i=0;i<3;i++){
                telefono.siguiente();
                CmbTelefono.addItem(telefono.getRegistro().getString("NumTelefono")+" , "+telefono.getRegistro().getString("Horario"));
            }
            } catch (SQLException ex) {
            Logger.getLogger(WinAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnPrevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrevioActionPerformed
        try {
            agenda.anterior();
            Txtnombre.setText(agenda.getRegistro().getString("NomContacto"));
            TxtDireccion.setText(agenda.getRegistro().getString("DirContacto"));
            TxtDescripcion.setText(agenda.getRegistro().getString("DescContacto"));
            CmbTelefono.removeAllItems();
            for (int i=0;i<3;i++){
                telefono.siguiente();
                CmbTelefono.addItem(telefono.getRegistro().getString("NumTelefono")+" , "+telefono.getRegistro().getString("Horario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(WinAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnPrevioActionPerformed

    private void TxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ArchBase;
    private javax.swing.JButton BtnPrevio;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JComboBox<String> CmbTelefono;
    private javax.swing.JMenuItem ItmAbrir;
    private javax.swing.JMenuItem ItmAcerca;
    private javax.swing.JMenuItem ItmBorrar;
    private javax.swing.JMenuItem ItmModificar;
    private javax.swing.JMenuItem ItmNuevo;
    private javax.swing.JMenuItem ItmRecorrer;
    private javax.swing.JMenuItem ItmSalir;
    private javax.swing.JMenu MnuDatos;
    private javax.swing.JPanel PnlRecorrer;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField Txtnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
