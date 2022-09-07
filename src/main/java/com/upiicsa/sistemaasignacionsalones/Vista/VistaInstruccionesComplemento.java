package com.upiicsa.sistemaasignacionsalones.Vista;
/**
 * 
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class VistaInstruccionesComplemento extends javax.swing.JFrame {
   
    public VistaInstruccionesComplemento() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paneBackground = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblMinimizar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(78, 209, 248));

        paneBackground.setBackground(new java.awt.Color(78, 209, 248));
        paneBackground.setPreferredSize(new java.awt.Dimension(830, 4150));
        paneBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\paso3.png")); // NOI18N
        paneBackground.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 4010));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        paneBackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 20, 4110));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        paneBackground.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 4110));

        lblMinimizar.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\minimizar.png")); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paneBackground.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 40));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paneBackground.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 4060, 250, 40));

        lblCerrar.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\cerrar.png")); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paneBackground.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, 40));

        jScrollPane1.setViewportView(paneBackground);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblMinimizar;
    public javax.swing.JPanel paneBackground;
    // End of variables declaration//GEN-END:variables
}