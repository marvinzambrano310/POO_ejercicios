/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;
import CapaNegocio.*;
import java.awt.Color;
/**
 *
 * @author Usuario
 */
public class WinPoligono extends javax.swing.JFrame {
    int numero,x,y;
    float apotema,lado;
    ClsPoligono j;
    /**
     * Creates new form WinPoligono
     */
    public WinPoligono() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(123,123,123));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        TxtApotema = new javax.swing.JTextField();
        Txtvalor = new javax.swing.JTextField();
        TxtDisplay = new javax.swing.JLabel();
        BtnVer = new javax.swing.JButton();
        BtnArea = new javax.swing.JButton();
        BtnPerimetro = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        txtentrada1 = new javax.swing.JLabel();
        TxtX = new javax.swing.JTextField();
        txtentrada2 = new javax.swing.JLabel();
        TxtY = new javax.swing.JTextField();
        BtnPerimetro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Poligono");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Numero de lados:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Apotema");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Longitud de lado:");

        BtnVer.setText("Ver");
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

        BtnArea.setText("Area");
        BtnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAreaActionPerformed(evt);
            }
        });

        BtnPerimetro.setText("Perimetro");
        BtnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerimetroActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        txtentrada1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtentrada1.setText("Coordenada X:");

        txtentrada2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtentrada2.setText("Coordenada Y:");

        BtnPerimetro1.setText("Magnitud y angulo");
        BtnPerimetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerimetro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtentrada1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtX, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtentrada2)
                .addGap(18, 18, 18)
                .addComponent(TxtY, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BtnPerimetro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnVer)
                                .addGap(28, 28, 28)
                                .addComponent(BtnArea)
                                .addGap(26, 26, 26)
                                .addComponent(BtnPerimetro1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(Txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TxtApotema, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtentrada1)
                    .addComponent(TxtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtentrada2)
                    .addComponent(TxtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVer)
                    .addComponent(BtnArea)
                    .addComponent(BtnPerimetro1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPerimetro)
                    .addComponent(BtnLimpiar)
                    .addComponent(BtnRegresar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        String texto= TxtNumero.getText();
        numero = Integer.parseInt(texto);
        String texto1= TxtApotema.getText();
        apotema= Float.parseFloat(texto1);
        String texto2= Txtvalor.getText();
        lado = Float.parseFloat(texto2);
        x= Integer.parseInt(TxtX.getText());
        y= Integer.parseInt(TxtY.getText());
        j = new ClsPoligono(x,y,numero,apotema,lado);
        TxtDisplay.setText(j.ver());
    }//GEN-LAST:event_BtnVerActionPerformed

    private void BtnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAreaActionPerformed
        
        TxtDisplay.setText(String.valueOf(j.area()));
    }//GEN-LAST:event_BtnAreaActionPerformed

    private void BtnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerimetroActionPerformed
        
        TxtDisplay.setText(String.valueOf(j.perimetro()));
    }//GEN-LAST:event_BtnPerimetroActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtNumero.setText(null);
        TxtApotema.setText(null);
        Txtvalor.setText(null);
        TxtDisplay.setText(null);
        TxtX.setText(null);
        TxtY.setText(null);
        TxtX.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        this.setVisible(false);
        WinMenu d= new WinMenu();
        d.setVisible(true);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnPerimetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerimetro1ActionPerformed
        TxtDisplay.setText("Magnitud: "+String.valueOf(j.magnitud())+" Grado: "+String.valueOf(j.angulo()));
    }//GEN-LAST:event_BtnPerimetro1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinPoligono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPoligono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPoligono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPoligono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPoligono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnArea;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPerimetro;
    private javax.swing.JButton BtnPerimetro1;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTextField TxtApotema;
    private javax.swing.JLabel TxtDisplay;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtX;
    private javax.swing.JTextField TxtY;
    private javax.swing.JTextField Txtvalor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txtentrada1;
    private javax.swing.JLabel txtentrada2;
    // End of variables declaration//GEN-END:variables
}
