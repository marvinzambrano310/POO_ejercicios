/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;
import CapaNegocio.*;
/**
 *
 * @author user
 */
public class WinComplejos extends javax.swing.JFrame {
    int codigo;
    float parr,pari;
    ClsComplejos A,B;
    
    /**
     * Creates new form WinComplejos
     */
    public WinComplejos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtDisplay = new javax.swing.JTextField();
        BtnConjugada = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnMulti = new javax.swing.JButton();
        BtnImag = new javax.swing.JButton();
        BtnReal = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnDivi = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Complejos");

        BtnConjugada.setText("Conjugada");
        BtnConjugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConjugadaActionPerformed(evt);
            }
        });

        BtnSuma.setText("Suma");
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnResta.setText("Resta");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnMulti.setText("Multiplicacion");
        BtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiActionPerformed(evt);
            }
        });

        BtnImag.setText("Parte Imaginaria");
        BtnImag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImagActionPerformed(evt);
            }
        });

        BtnReal.setText("Parte Real");
        BtnReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Marvin Zambrano V 1.01");

        BtnDivi.setText("Division");
        BtnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiviActionPerformed(evt);
            }
        });

        BtnIgual.setText("Igual");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtDisplay)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnReal)
                        .addGap(139, 139, 139)
                        .addComponent(BtnImag))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSuma)
                        .addGap(18, 18, 18)
                        .addComponent(BtnResta)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMulti)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDivi)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnIgual)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnConjugada)
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnReal)
                    .addComponent(BtnImag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnConjugada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSuma)
                    .addComponent(BtnResta)
                    .addComponent(BtnMulti)
                    .addComponent(BtnDivi))
                .addGap(18, 18, 18)
                .addComponent(BtnIgual)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar)
                    .addComponent(BtnSalir))
                .addGap(5, 5, 5)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealActionPerformed
        parr=Float.parseFloat(TxtDisplay.getText());
        BtnReal.setEnabled(false);
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnRealActionPerformed

    private void BtnImagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImagActionPerformed
        pari=Float.parseFloat(TxtDisplay.getText());
        BtnReal.setEnabled(true);
        B=new ClsComplejos (parr,pari);
        TxtDisplay.setText(B.resultado());
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnImagActionPerformed

    private void BtnConjugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConjugadaActionPerformed
       TxtDisplay.setText(B.Conjugada());
       TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnConjugadaActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsComplejos(B);
        codigo=1;
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsComplejos(B);
        codigo=2;
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsComplejos(B);
        codigo=3;
    }//GEN-LAST:event_BtnMultiActionPerformed

    private void BtnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiviActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsComplejos(B);
        codigo=4;
    }//GEN-LAST:event_BtnDiviActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        switch (codigo ){
            case 1:
            {
                B=A.Suma(B);
                break;
            }
            case 2:
            {
                B=A.Resta(B);
                break;
            } 
            case 3:
            {
                B=A.Multiplicacion(B);
                break;
            }
            case 4:
            {
                B=A.Division(B);
                break;
            }
        }
        TxtDisplay.setText(B.resultado());
        TxtDisplay.requestFocus();
        
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinComplejos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConjugada;
    private javax.swing.JButton BtnDivi;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnImag;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMulti;
    private javax.swing.JButton BtnReal;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JTextField TxtDisplay;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}