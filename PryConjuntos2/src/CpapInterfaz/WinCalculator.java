/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CpapInterfaz;
// importar la capa negocio
import CapaNegocio.*;
/**
 *
 * @author Usuario
 */
public class WinCalculator extends javax.swing.JFrame {

    ClsOperaciones A,B,C,D;
    int i,n,codigo,dimen;
    String k;
    String []e;
    
    /**
     * Creates new form WinCalculator
     */
    public WinCalculator() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCardinal = new javax.swing.JButton();
        BtnElemento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnUnion = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnInter = new javax.swing.JButton();
        BtnDiferencia = new javax.swing.JButton();
        BtnDiferencia1 = new javax.swing.JButton();
        BtnCartesiano = new javax.swing.JButton();
        TxtDisplay = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Calculadora de Conjuntos");
        setBackground(new java.awt.Color(255, 255, 255));

        BtnCardinal.setText("Cardinalidad");
        BtnCardinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCardinalActionPerformed(evt);
            }
        });

        BtnElemento.setText("Elemento [i]");
        BtnElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElementoActionPerformed(evt);
            }
        });

        jLabel1.setText("Autor: Marvin Zambrano V 2.0");

        BtnUnion.setText("Unión");
        BtnUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnionActionPerformed(evt);
            }
        });

        BtnIgual.setText("IGUAL");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnInter.setText("Interseccion");
        BtnInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInterActionPerformed(evt);
            }
        });

        BtnDiferencia.setText("Diferencia ");
        BtnDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiferenciaActionPerformed(evt);
            }
        });

        BtnDiferencia1.setText("Diferencia Simetrica");
        BtnDiferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiferencia1ActionPerformed(evt);
            }
        });

        BtnCartesiano.setText("Producto Cartesiano");
        BtnCartesiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCartesianoActionPerformed(evt);
            }
        });

        TxtDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtDisplay)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(BtnCartesiano)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(BtnUnion))
                                    .addComponent(BtnDiferencia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BtnInter)
                                        .addGap(8, 8, 8))
                                    .addComponent(BtnDiferencia1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCardinal)
                                .addGap(83, 83, 83)
                                .addComponent(BtnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(BtnElemento)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(BtnIgual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiar)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(TxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCardinal)
                    .addComponent(BtnElemento)
                    .addComponent(BtnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUnion)
                    .addComponent(BtnInter))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDiferencia)
                    .addComponent(BtnDiferencia1))
                .addGap(18, 18, 18)
                .addComponent(BtnCartesiano)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIgual)
                    .addComponent(BtnSalir)
                    .addComponent(BtnLimpiar))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCardinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCardinalActionPerformed
        n=Integer.parseInt(TxtDisplay.getText());
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        BtnCardinal.setEnabled(false);
        i=1;
        BtnElemento.setText("Elemento ["+ i +"]");
        e=new String[n];
    }//GEN-LAST:event_BtnCardinalActionPerformed

    private void BtnElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElementoActionPerformed
        e[i-1]=TxtDisplay.getText();
        i++;
        BtnElemento.setText("Elemento ["+ i +"]");
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        if(i>n)
        {
           BtnCardinal.setEnabled(true);
           BtnElemento.setText("Elemento [i]");
           B=new ClsOperaciones(dimen,e,n);
           TxtDisplay.setText(B.ver());
        }
    }//GEN-LAST:event_BtnElementoActionPerformed

    private void BtnUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnionActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsOperaciones(dimen,B);
        codigo=1;
    }//GEN-LAST:event_BtnUnionActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        switch(codigo)
        {
            case 1:
            {
                //Union de conjuntos
                B=A.union(B);
                break;
            }
            case 2:
            {
                //Interseccion de conjuntos
                B=A.inter(B);
                break;
            }
            case 3:
            {
                //Difernecia de conjuntos
                B=A.diferencia(B);
                break;
            }
            case 4:
            {
                //Difernecia Simetrica de conjuntos
                C=A.union(B);
                D=A.inter(B);
                B=C.diferencia(D);
                break;
            }
            case 5:
            {
                B=A.cartesiano(B);
                break;
            }
            
        }
        TxtDisplay.setText(B.Resultado());
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInterActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsOperaciones(dimen,B);
        codigo=2;
    }//GEN-LAST:event_BtnInterActionPerformed

    private void BtnDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiferenciaActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsOperaciones(dimen,B);
        codigo=3;
    }//GEN-LAST:event_BtnDiferenciaActionPerformed

    private void BtnDiferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiferencia1ActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsOperaciones(dimen,B);
        codigo=4;
    }//GEN-LAST:event_BtnDiferencia1ActionPerformed

    private void BtnCartesianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCartesianoActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
        A=new ClsOperaciones(dimen,B);
        codigo=5;
    }//GEN-LAST:event_BtnCartesianoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        k=TxtDisplay.getText();
        TxtDisplay.setText(B.busqueda(k));
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtDisplay.setText(null);
        TxtDisplay.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(WinCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCardinal;
    private javax.swing.JButton BtnCartesiano;
    private javax.swing.JButton BtnDiferencia;
    private javax.swing.JButton BtnDiferencia1;
    private javax.swing.JButton BtnElemento;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnInter;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnUnion;
    private javax.swing.JTextField TxtDisplay;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}