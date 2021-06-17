/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;

import CapaNegocio.ClsBinario;

/**
 *
 * @author Usuario
 */
public class WinBinario extends javax.swing.JFrame {
    ClsBinario A,B;
    String num;
    int base;
    int dato;
    int codigo;
    /**
     * Creates new form WinBinario
     */
    public WinBinario() {
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

        BtnSuma = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        BtnMulti = new javax.swing.JButton();
        TxtDisplay = new javax.swing.JTextField();
        BtnConver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtBase = new javax.swing.JTextField();
        BtnIgual = new javax.swing.JButton();
        BtnNumero = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        CBtnBinario = new javax.swing.JRadioButton();
        CBtnCuatro = new javax.swing.JRadioButton();
        CBtnOctal = new javax.swing.JRadioButton();
        CBtnDecimal = new javax.swing.JRadioButton();
        CBtnHexa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación de Números ");

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

        BtnDiv.setText("Division");
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });

        BtnMulti.setText("Multiplicacion");
        BtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiActionPerformed(evt);
            }
        });

        BtnConver.setText("Conversion");
        BtnConver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConverActionPerformed(evt);
            }
        });

        jLabel1.setText("Base:");

        BtnIgual.setText("Igual");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnNumero.setText("Guardar Numero");
        BtnNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNumeroActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jButton1.setText("Factorial");

        jButton3.setText("Primo");

        jButton4.setText("Par");

        jButton5.setText("+ / -");

        jButton6.setText("1 / N");

        CBtnBinario.setText("Binario");

        CBtnCuatro.setText("Cuatro");

        CBtnOctal.setText("Octal");

        CBtnDecimal.setText("Decimal");

        CBtnHexa.setText("Hexadecimal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtDisplay)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnConver)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnMulti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnDiv))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(BtnIgual))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnSuma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnResta)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(BtnNumero)))
                        .addGap(148, 148, 148)))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton5)
                                .addGap(36, 36, 36)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BtnLimpiar)
                                .addGap(51, 51, 51)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(TxtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(CBtnBinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBtnCuatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBtnOctal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBtnDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBtnHexa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBtnBinario)
                    .addComponent(CBtnCuatro)
                    .addComponent(CBtnOctal)
                    .addComponent(CBtnDecimal)
                    .addComponent(CBtnHexa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConver)
                    .addComponent(BtnNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSuma)
                    .addComponent(BtnResta)
                    .addComponent(BtnDiv)
                    .addComponent(BtnMulti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnIgual)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        TxtDisplay.setText(null);
        TxtBase.setText(null);
        A= new ClsBinario(B,base,dato);
        codigo=1;      
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        String resulta;
        switch (codigo){
            case 1:
            {
                resulta= A.suma(B);
                B=new ClsBinario(resulta,base,dato);
                break;
            }
            case 2:
            {
                resulta= A.resta(B);
                B=new ClsBinario(resulta,base,dato);
                break;
            }
            case 3:
            {
                resulta= A.resta(B);
                B=new ClsBinario(resulta,base,dato);
                break;
            }
            case 4:
            {
                resulta= A.resta(B);
                B=new ClsBinario(resulta,base,dato);
                break;
            }
        }
        TxtDisplay.setText(B.getB1());
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNumeroActionPerformed
        num=TxtDisplay.getText();
        base = Integer.parseInt(TxtBase.getText());
        dato=Integer.parseInt(TxtDisplay.getText());
        B= new ClsBinario(num,base,dato);
        
    }//GEN-LAST:event_BtnNumeroActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        TxtDisplay.setText(null);
        TxtBase.setText(null);
        A= new ClsBinario(B,base,dato);
        codigo=2; 
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiActionPerformed
        TxtDisplay.setText(null);
        TxtBase.setText(null);
        A= new ClsBinario(B,base,dato);
        codigo=3; 
    }//GEN-LAST:event_BtnMultiActionPerformed

    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
        TxtDisplay.setText(null);
        TxtBase.setText(null);
        A= new ClsBinario(B,base,dato);
        codigo=4; 
    }//GEN-LAST:event_BtnDivActionPerformed

    private void BtnConverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConverActionPerformed
        base = Integer.parseInt(TxtBase.getText());
        TxtDisplay.setText(B.conversion(base));
    }//GEN-LAST:event_BtnConverActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtDisplay.setText(null);
        TxtBase.setText(null);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConver;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMulti;
    private javax.swing.JButton BtnNumero;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JRadioButton CBtnBinario;
    private javax.swing.JRadioButton CBtnCuatro;
    private javax.swing.JRadioButton CBtnDecimal;
    private javax.swing.JRadioButton CBtnHexa;
    private javax.swing.JRadioButton CBtnOctal;
    private javax.swing.JTextField TxtBase;
    private javax.swing.JTextField TxtDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
