/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capainterfez;
import ClsConexion.*;
import CpapNegocio.ClsEstudiante;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class WinEstudiante extends javax.swing.JFrame {
    ClsConexion datos;
    String bd;
    String nombre,direccion,sexo;
    ClsEstudiante datosestudiante;
    int clave;
    ResultSet r;/**
     * Creates new form WinEstudiante
     */
    public WinEstudiante() {
        initComponents();
        ArchBase.setVisible(false);
        PnlDatos.setVisible(false);
        PnlMateria.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color (231,217,189));
        this.PnlDatos.setBackground(new Color (231,217,189));
        this.PnlMateria.setBackground(new Color (231,217,189));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        BtnAnterior = new javax.swing.JButton();
        BtnRetornar = new javax.swing.JButton();
        TxtClave = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtSexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CmbNotas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtPromedio = new javax.swing.JTextField();
        TxtEstado = new javax.swing.JTextField();
        PnlMateria = new javax.swing.JPanel();
        CmbNombreEst = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstMateria = new javax.swing.JList<>();
        BtnAceptarDatos = new javax.swing.JButton();
        ArchBase = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItmAbrir = new javax.swing.JMenuItem();
        ItmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItmIndividual = new javax.swing.JMenuItem();
        ItmMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ItmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluación Final de Marvin Zambrano \"Ojala Y Pasemos\"");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Clave:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Sexo:");

        BtnSiguiente.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnAnterior.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        BtnAnterior.setText("Anterior");
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });

        BtnRetornar.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        BtnRetornar.setText("Retornar");
        BtnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetornarActionPerformed(evt);
            }
        });

        TxtClave.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        TxtNombre.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        TxtDireccion.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        TxtSexo.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Notas:");

        CmbNotas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Promedio");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setText("Estado:");

        TxtPromedio.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        TxtEstado.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        javax.swing.GroupLayout PnlDatosLayout = new javax.swing.GroupLayout(PnlDatos);
        PnlDatos.setLayout(PnlDatosLayout);
        PnlDatosLayout.setHorizontalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDatosLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(CmbNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlDatosLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(BtnSiguiente)
                                .addGap(39, 39, 39)
                                .addComponent(BtnAnterior)
                                .addGap(42, 42, 42)
                                .addComponent(BtnRetornar)))
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDatosLayout.createSequentialGroup()
                                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PnlDatosLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(30, 30, 30)
                                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtClave)
                                            .addComponent(TxtNombre)
                                            .addComponent(TxtDireccion)
                                            .addComponent(TxtSexo)))
                                    .addGroup(PnlDatosLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(45, 45, 45)))
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDatosLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)))
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        PnlDatosLayout.setVerticalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CmbNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente)
                    .addComponent(BtnAnterior)
                    .addComponent(BtnRetornar))
                .addGap(19, 19, 19))
        );

        getContentPane().add(PnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 630, 490));

        PnlMateria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlMateria.add(CmbNombreEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 290, 30));

        jScrollPane1.setViewportView(LstMateria);

        PnlMateria.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 380, 320));

        BtnAceptarDatos.setText("Aceptar");
        PnlMateria.add(BtnAceptarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        getContentPane().add(PnlMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 630, 480));

        ArchBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchBaseActionPerformed(evt);
            }
        });
        getContentPane().add(ArchBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 45, -1, 451));

        jMenu1.setText("Conexion");

        ItmAbrir.setText("Abrir Base de Datos");
        ItmAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(ItmAbrir);

        ItmSalir.setText("Salir");
        ItmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(ItmSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Estudiantes");

        ItmIndividual.setText("Individual");
        ItmIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmIndividualActionPerformed(evt);
            }
        });
        jMenu2.add(ItmIndividual);

        ItmMateria.setText("Materia");
        ItmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(ItmMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        ItmAcerca.setText("Acerca de");
        jMenu3.add(ItmAcerca);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ItmSalirActionPerformed

    private void ItmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmMateriaActionPerformed
        ArchBase.setVisible(false);
        PnlDatos.setVisible(false); 
        PnlMateria.setVisible(true);
        
    }//GEN-LAST:event_ItmMateriaActionPerformed

    private void ItmAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAbrirActionPerformed
        ArchBase.setVisible(true);
    }//GEN-LAST:event_ItmAbrirActionPerformed

    private void ArchBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchBaseActionPerformed
        File f=ArchBase.getSelectedFile();
        bd=f.getAbsolutePath();
        ArchBase.setVisible(false);
        try {
            datos=new ClsConexion(bd);
            datos.Consulta("TbEstudiante");
            r=datos.getRegistro();
        } catch (SQLException ex) {
            Logger.getLogger(WinEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ArchBaseActionPerformed

    private void ItmIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmIndividualActionPerformed
        ArchBase.setVisible(false);
        PnlDatos.setVisible(true);
    }//GEN-LAST:event_ItmIndividualActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
       try {
            datosestudiante=datos.siguienteest(r);
            TxtClave.setText(datosestudiante.getClave()+"");
            TxtNombre.setText(datosestudiante.getNombre());  
            CmbNotas.removeAllItems();
            for (int i=0;r.next();i++){
                CmbNotas.addItem(datosestudiante.getNota(i)+"/10");
            }
            TxtPromedio.setText(datosestudiante.promedio()+"");
            TxtEstado.setText(datosestudiante.estado()+"");
            } catch (SQLException ex) {
            Logger.getLogger(WinEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
        try{
            datosestudiante=datos.anteriorest(r);
            TxtClave.setText(datosestudiante.getClave()+"");
            TxtNombre.setText(datosestudiante.getNombre());  
            CmbNotas.removeAllItems();
            for (int i=0;r.next();i++){
                CmbNotas.addItem(datosestudiante.getNota(i)+"/10");
            }
            TxtPromedio.setText(datosestudiante.promedio()+"");
            TxtEstado.setText(datosestudiante.estado()+"");
            } 
            catch (SQLException ex) {
            Logger.getLogger(WinEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetornarActionPerformed
        PnlDatos.setVisible(false);
    }//GEN-LAST:event_BtnRetornarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ArchBase;
    private javax.swing.JButton BtnAceptarDatos;
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnRetornar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JComboBox<String> CmbNombreEst;
    private javax.swing.JComboBox<String> CmbNotas;
    private javax.swing.JMenuItem ItmAbrir;
    private javax.swing.JMenuItem ItmAcerca;
    private javax.swing.JMenuItem ItmIndividual;
    private javax.swing.JMenuItem ItmMateria;
    private javax.swing.JMenuItem ItmSalir;
    private javax.swing.JList<String> LstMateria;
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JPanel PnlMateria;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPromedio;
    private javax.swing.JTextField TxtSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
