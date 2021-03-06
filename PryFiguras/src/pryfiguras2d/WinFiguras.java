/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryfiguras2d;

/**
 *
 * @author Usuario
 */
public class WinFiguras extends javax.swing.JFrame {
    ClsPunto p,q,r;
    ClsLinea l1,l2,l3;
    int punto=1;
    float x,y;
    ClsTriangulo lados;
    
    /**
     * Creates new form WinFiguras
     */
    public WinFiguras() {
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

        TxtPantalla = new javax.swing.JTextField();
        BtnCoordX = new javax.swing.JButton();
        BtnCoordY = new javax.swing.JButton();
        BtnAltura = new javax.swing.JButton();
        BtnAngulos = new javax.swing.JButton();
        BtnPerimetro = new javax.swing.JButton();
        BtnArea = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area y Perimetro del Triángulo");

        TxtPantalla.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        BtnCoordX.setText("Coordenada X");
        BtnCoordX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoordXActionPerformed(evt);
            }
        });

        BtnCoordY.setText("Coordenada Y");
        BtnCoordY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoordYActionPerformed(evt);
            }
        });

        BtnAltura.setText("Altura");
        BtnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlturaActionPerformed(evt);
            }
        });

        BtnAngulos.setText("Angulos ");
        BtnAngulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAngulosActionPerformed(evt);
            }
        });

        BtnPerimetro.setText("Perímetro");
        BtnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerimetroActionPerformed(evt);
            }
        });

        BtnArea.setText("Area");
        BtnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAreaActionPerformed(evt);
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

        jLabel1.setText("Autor Marvin Zambrano Version 1.03");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtPantalla)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnPerimetro)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnArea)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnAngulos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnAltura))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar)))
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalir)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCoordX)
                .addGap(33, 33, 33)
                .addComponent(BtnCoordY)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCoordX)
                    .addComponent(BtnCoordY))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAltura)
                    .addComponent(BtnAngulos))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPerimetro)
                    .addComponent(BtnArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnLimpiar))
                .addGap(29, 29, 29)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCoordXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoordXActionPerformed
        x=Float.parseFloat(TxtPantalla.getText());
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
        BtnCoordX.setEnabled (false);
    }//GEN-LAST:event_BtnCoordXActionPerformed

    private void BtnCoordYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoordYActionPerformed
        y=Float.parseFloat(TxtPantalla.getText());
        switch (punto) {
            case 1:
                p= new ClsPunto(x,y);
                TxtPantalla.setText(p.punt());
                punto=punto+1;
                break;
            case 2:
                q= new ClsPunto(x,y);
                TxtPantalla.setText(q.punt());
                l1=new ClsLinea(p,q);
                punto=1+punto;
                break;
            case 3:
                r= new ClsPunto(x,y);
                l2=new ClsLinea(p,r);
                l3=new ClsLinea(q,r);
                punto=punto+1;
                lados= new ClsTriangulo(p,q,r);
                TxtPantalla.setText(lados.distancia());
                break;
            default:
                break;
        }
            TxtPantalla.requestFocus();
            BtnCoordX.setEnabled(true);
    }//GEN-LAST:event_BtnCoordYActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnAngulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAngulosActionPerformed
        TxtPantalla.setText(lados.angulos());
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnAngulosActionPerformed

    private void BtnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlturaActionPerformed
        TxtPantalla.setText(String.valueOf(lados.altura()));
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnAlturaActionPerformed

    private void BtnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerimetroActionPerformed
        TxtPantalla.setText(String.valueOf(lados.perimetro()));
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnPerimetroActionPerformed

    private void BtnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAreaActionPerformed
        TxtPantalla.setText(String.valueOf(lados.area()));
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnAreaActionPerformed

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
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAltura;
    private javax.swing.JButton BtnAngulos;
    private javax.swing.JButton BtnArea;
    private javax.swing.JButton BtnCoordX;
    private javax.swing.JButton BtnCoordY;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPerimetro;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TxtPantalla;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
