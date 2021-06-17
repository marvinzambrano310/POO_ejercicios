/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;

/**
 *
 * @author Usuario
 */
public class WinFiguras extends javax.swing.JFrame {

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

        BtnTriangulo = new javax.swing.JButton();
        BtnCuadrilatero = new javax.swing.JButton();
        BtnCirculo = new javax.swing.JButton();
        BtnPoligono = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Geométrica: Áreas y Perimetros");

        BtnTriangulo.setText("Triángulo");
        BtnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTrianguloActionPerformed(evt);
            }
        });

        BtnCuadrilatero.setText("Cuadrilátero");
        BtnCuadrilatero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuadrilateroActionPerformed(evt);
            }
        });

        BtnCirculo.setText("Círculo");
        BtnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCirculoActionPerformed(evt);
            }
        });

        BtnPoligono.setText("Polígono");
        BtnPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPoligonoActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Autor: Marvin Zambrano V 1.01");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("Bienvenidos!!! Elija su opción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnTriangulo)
                            .addComponent(BtnCirculo))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCuadrilatero)
                            .addComponent(BtnPoligono)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(BtnSalir)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTriangulo)
                    .addComponent(BtnCuadrilatero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCirculo)
                    .addComponent(BtnPoligono))
                .addGap(40, 40, 40)
                .addComponent(BtnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTrianguloActionPerformed
        this.setVisible(false);
        WinTriangulo c= new WinTriangulo();
        c.setVisible(true);
    }//GEN-LAST:event_BtnTrianguloActionPerformed

    private void BtnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCirculoActionPerformed
        this.setVisible(false);
        WinCirculo d= new WinCirculo();
        d.setVisible(true);
    }//GEN-LAST:event_BtnCirculoActionPerformed

    private void BtnCuadrilateroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuadrilateroActionPerformed
        this.setVisible(false);
        WinCuadrilatero h= new WinCuadrilatero();
        h.setVisible(true);
    }//GEN-LAST:event_BtnCuadrilateroActionPerformed

    private void BtnPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPoligonoActionPerformed
        this.setVisible(false);
        WinPoligono h= new WinPoligono();
        h.setVisible(true);
    }//GEN-LAST:event_BtnPoligonoActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCirculo;
    private javax.swing.JButton BtnCuadrilatero;
    private javax.swing.JButton BtnPoligono;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}