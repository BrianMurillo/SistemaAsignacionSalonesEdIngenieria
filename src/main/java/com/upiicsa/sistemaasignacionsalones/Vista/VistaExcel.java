package com.upiicsa.sistemaasignacionsalones.Vista;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class VistaExcel extends javax.swing.JFrame {

    public VistaExcel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportar = new javax.swing.JButton();
        btnExportarSecuencias = new javax.swing.JButton();
        btnGenerarHorarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnImportarSecuencias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkBoxVerHorario = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtPeriodoEscolar = new javax.swing.JTextField();
        menuBarDisponibilidad = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuItemExportarExcel = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemLunes = new javax.swing.JMenuItem();
        menuItemMartes = new javax.swing.JMenuItem();
        menuItemMiercoles = new javax.swing.JMenuItem();
        menuItemJueves = new javax.swing.JMenuItem();
        menuItemViernes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuInstrucciones = new javax.swing.JMenu();
        menuItemPaso1 = new javax.swing.JMenuItem();
        menuItemPaso2 = new javax.swing.JMenuItem();
        menuItemPaso3 = new javax.swing.JMenuItem();
        menuItemPaso4 = new javax.swing.JMenuItem();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Importar_Exportar");
        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(1340, 740));

        btnImportar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnImportar.setText("Importar Archivo");
        btnImportar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnExportarSecuencias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnExportarSecuencias.setText("Generar Archivo Secuencias");
        btnExportarSecuencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnGenerarHorarios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGenerarHorarios.setText("Generar Archivo Horarios");
        btnGenerarHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtDatos);

        btnBorrar.setBackground(new java.awt.Color(204, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Limpiar");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnImportarSecuencias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnImportarSecuencias.setText("Importar Archivo Secuencia");
        btnImportarSecuencias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Asignación de Salones Edificio de Ingeniería UPIICSA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\logoipn.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\logo.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText(" 2022 - 2023 © CIENCIAS DE LA INFORMÁTICA UPIICSA");

        checkBoxVerHorario.setText("Generar Horario");
        checkBoxVerHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("PERIODO ESCOLAR    -");

        menuBarDisponibilidad.setBackground(new java.awt.Color(255, 255, 255));

        jMenu2.setText("Archivo");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuItemExportarExcel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemExportarExcel.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\excel.png")); // NOI18N
        menuItemExportarExcel.setText("Exportar excel");
        menuItemExportarExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.add(menuItemExportarExcel);

        menuBarDisponibilidad.add(jMenu2);

        jMenu1.setBackground(new java.awt.Color(204, 255, 204));
        jMenu1.setText("Disponibilidad");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuItemLunes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemLunes.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\dia.png")); // NOI18N
        menuItemLunes.setText("Lunes");
        menuItemLunes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(menuItemLunes);

        menuItemMartes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemMartes.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\dia.png")); // NOI18N
        menuItemMartes.setText("Martes");
        menuItemMartes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(menuItemMartes);

        menuItemMiercoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemMiercoles.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\dia.png")); // NOI18N
        menuItemMiercoles.setText("Miércoles");
        menuItemMiercoles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(menuItemMiercoles);

        menuItemJueves.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemJueves.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\dia.png")); // NOI18N
        menuItemJueves.setText("Jueves");
        menuItemJueves.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(menuItemJueves);

        menuItemViernes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemViernes.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\dia.png")); // NOI18N
        menuItemViernes.setText("Viernes");
        menuItemViernes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.add(menuItemViernes);

        menuBarDisponibilidad.add(jMenu1);

        jMenu3.setText("Ayuda");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuInstrucciones.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\ayuda.png")); // NOI18N
        menuInstrucciones.setText("Instrucciones");
        menuInstrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuItemPaso1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemPaso1.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\paso.png")); // NOI18N
        menuItemPaso1.setText("Paso 1");
        menuItemPaso1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuInstrucciones.add(menuItemPaso1);

        menuItemPaso2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemPaso2.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\paso.png")); // NOI18N
        menuItemPaso2.setText("Paso 2");
        menuItemPaso2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuInstrucciones.add(menuItemPaso2);

        menuItemPaso3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemPaso3.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\paso.png")); // NOI18N
        menuItemPaso3.setText("Paso 3");
        menuItemPaso3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuInstrucciones.add(menuItemPaso3);

        menuItemPaso4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemPaso4.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\paso.png")); // NOI18N
        menuItemPaso4.setText("Paso 4");
        menuItemPaso4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuInstrucciones.add(menuItemPaso4);

        jMenu3.add(menuInstrucciones);

        menuItemAcercaDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemAcercaDe.setIcon(new javax.swing.ImageIcon("C:\\imgsistemasalones\\acercade.png")); // NOI18N
        menuItemAcercaDe.setText("Acerca de");
        menuItemAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.add(menuItemAcercaDe);

        menuBarDisponibilidad.add(jMenu3);

        setJMenuBar(menuBarDisponibilidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnImportar)
                                .addGap(30, 30, 30)
                                .addComponent(btnExportarSecuencias)
                                .addGap(52, 52, 52)
                                .addComponent(btnImportarSecuencias)
                                .addGap(52, 52, 52)
                                .addComponent(btnGenerarHorarios)
                                .addGap(30, 30, 30)
                                .addComponent(btnBorrar))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(checkBoxVerHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPeriodoEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImportar)
                            .addComponent(btnExportarSecuencias)
                            .addComponent(btnGenerarHorarios)
                            .addComponent(btnBorrar)
                            .addComponent(btnImportarSecuencias))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(checkBoxVerHorario)
                    .addComponent(jLabel5)
                    .addComponent(txtPeriodoEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnExportarSecuencias;
    public javax.swing.JButton btnGenerarHorarios;
    public javax.swing.JButton btnImportar;
    public javax.swing.JButton btnImportarSecuencias;
    public javax.swing.JCheckBox checkBoxVerHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    public javax.swing.JMenuBar menuBarDisponibilidad;
    public javax.swing.JMenu menuInstrucciones;
    public javax.swing.JMenuItem menuItemAcercaDe;
    public javax.swing.JMenuItem menuItemExportarExcel;
    public javax.swing.JMenuItem menuItemJueves;
    public javax.swing.JMenuItem menuItemLunes;
    public javax.swing.JMenuItem menuItemMartes;
    public javax.swing.JMenuItem menuItemMiercoles;
    public javax.swing.JMenuItem menuItemPaso1;
    public javax.swing.JMenuItem menuItemPaso2;
    public javax.swing.JMenuItem menuItemPaso3;
    public javax.swing.JMenuItem menuItemPaso4;
    public javax.swing.JMenuItem menuItemViernes;
    public javax.swing.JTextField txtPeriodoEscolar;
    // End of variables declaration//GEN-END:variables
}