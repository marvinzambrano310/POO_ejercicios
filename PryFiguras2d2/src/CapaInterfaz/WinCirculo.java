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
public class WinCirculo extends javax.swing.JFrame {
    float radio;
    int x,y;
    ClsCirculo c;
    /**
     * Creates new form WinCirculo
     */
    public WinCirculo() {
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

        txtentrada = new javax.swing.JLabel();
        BtnArea = new javax.swing.JButton();
        BtnPerimetro = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnRegreso = new javax.swing.JButton();
        TxtIngreso = new javax.swing.JTextField();
        TxtDisplay = new javax.swing.JLabel();
        txtentrada1 = new javax.swing.JLabel();
        TxtX = new javax.swing.JTextField();
        txtentrada2 = new javax.swing.JLabel();
        TxtY = new javax.swing.JTextField();
        BtnVer = new javax.swing.JButton();
        BtnPerimetro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Circulo");

        txtentrada.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtentrada.setText("Radio: ");

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

        BtnRegreso.setText("Regrasar");
        BtnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresoActionPerformed(evt);
            }
        });

        txtentrada1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtentrada1.setText("Coordenada X:");

        txtentrada2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        txtentrada2.setText("Coordenada Y:");

        BtnVer.setText("Ver");
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(txtentrada)
                        .addGap(18, 18, 18)
                        .addComponent(TxtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnArea)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPerimetro)
                        .addGap(19, 19, 19)
                        .addComponent(BtnVer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtentrada1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtX, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txtentrada2)))
                .addGap(18, 18, 18)
                .addComponent(TxtY, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnPerimetro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnRegreso)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtentrada1)
                    .addComponent(TxtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtentrada2)
                    .addComponent(TxtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtentrada)
                    .addComponent(TxtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnArea)
                    .addComponent(BtnPerimetro)
                    .addComponent(BtnVer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar)
                    .addComponent(BtnRegreso)
                    .addComponent(BtnPerimetro1))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresoActionPerformed
        this.setVisible(false);
        WinMenu d= new WinMenu();
        d.setVisible(true);
    }//GEN-LAST:event_BtnRegresoActionPerformed

    private void BtnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAreaActionPerformed
        String texto= TxtIngreso.getText();
        radio = Float.parseFloat(texto);
        x= Integer.parseInt(TxtX.getText());
        y= Integer.parseInt(TxtY.getText());
        c=new ClsCirculo(x , y, radio);
        TxtDisplay.setText(String.valueOf(c.area()));
    }//GEN-LAST:event_BtnAreaActionPerformed

    private void BtnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerimetroActionPerformed
        String texto= TxtIngreso.getText();
        radio = Float.parseFloat(texto);
        TxtDisplay.setText(String.valueOf(c.perimetro()));
    }//GEN-LAST:event_BtnPerimetroActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtIngreso.setText(null);
        TxtDisplay.setText(null);
        TxtX.setText(null);
        TxtY.setText(null);
        TxtX.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        TxtDisplay.setText(c.ver());
    }//GEN-LAST:event_BtnVerActionPerformed

    private void BtnPerimetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerimetro1ActionPerformed
        TxtDisplay.setText("Magnitud: "+String.valueOf(c.magnitud())+" Grado: "+String.valueOf(c.angulo()));
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
            java.util.logging.Logger.getLogger(WinCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCirculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinCirculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnArea;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPerimetro;
    private javax.swing.JButton BtnPerimetro1;
    private javax.swing.JButton BtnRegreso;
    private javax.swing.JButton BtnVer;
    private javax.swing.JLabel TxtDisplay;
    private javax.swing.JTextField TxtIngreso;
    private javax.swing.JTextField TxtX;
    private javax.swing.JTextField TxtY;
    private javax.swing.JLabel txtentrada;
    private javax.swing.JLabel txtentrada1;
    private javax.swing.JLabel txtentrada2;
    // End of variables declaration//GEN-END:variables
}
