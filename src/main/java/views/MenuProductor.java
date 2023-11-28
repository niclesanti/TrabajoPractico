package views;

import javax.persistence.EntityManager;
import javax.swing.JFrame;
import messages.Util;

public class MenuProductor extends javax.swing.JFrame {

    private EntityManager entityManager;
    
    public MenuProductor() {
        initComponents();
    }
    
    public MenuProductor (EntityManager entityManager) {
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

        btnAltaPoliza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultarPoliza = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnPropuestaRenovación = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConsultarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnActualizarFactores = new javax.swing.JButton();
        btnAltaCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAltaPoliza.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\AltaPoliza-icon.png")); // NOI18N
        btnAltaPoliza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAltaPoliza.setFocusable(false);
        btnAltaPoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaPolizaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Alta Póliza");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Consultar Póliza");

        btnConsultarPoliza.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\ConsultarPoliza-icon.png")); // NOI18N
        btnConsultarPoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPolizaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Generar Propuesta");

        btnPropuestaRenovación.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\GenerarPropuestaRenovacion-icon.png")); // NOI18N
        btnPropuestaRenovación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropuestaRenovaciónActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Alta Cliente");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Consultar Cliente");

        btnConsultarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\ConsultarCliente-icon.png")); // NOI18N
        btnConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Actualizar Factores");

        btnActualizarFactores.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\ActualizarFactores-icon.png")); // NOI18N
        btnActualizarFactores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarFactoresActionPerformed(evt);
            }
        });

        btnAltaCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\AltaCliente-icon.png")); // NOI18N
        btnAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaClienteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\gerva\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoPractico\\src\\main\\java\\views\\images\\ElAsegurado -  Logo.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("El Asegurado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("de Características");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("de Renovación");

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAltaPoliza)
                    .addComponent(btnAltaCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnConsultarPoliza))
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(btnConsultarCliente))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPropuestaRenovación)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(15, 15, 15))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnActualizarFactores)
                        .addGap(15, 15, 15)))
                .addGap(86, 86, 86))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPropuestaRenovación)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addGap(23, 23, 23)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAltaPoliza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addComponent(btnConsultarPoliza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnAltaCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnConsultarCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarFactores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(50, 50, 50)
                .addComponent(btnSalir)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            if ( Util.mensajeConfirmacion("Confirmación", "¿Está seguro que desea salir?") ){
                this.setVisible(false);
                this.dispose();
            }
        } catch (Exception e){
            Util.mensajeError("Error", e.getMessage());
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAltaPolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaPolizaActionPerformed
        JFrame pantalla;
        pantalla = new MenuAltaPoliza1(entityManager);
        this.setVisible(false);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAltaPolizaActionPerformed

    private void btnConsultarPolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPolizaActionPerformed
        Util.mensajeInformacion("Proximamente", "Lo sentimos, esta opción aún no está disponible");
    }//GEN-LAST:event_btnConsultarPolizaActionPerformed

    private void btnPropuestaRenovaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropuestaRenovaciónActionPerformed
        Util.mensajeInformacion("Proximamente", "Lo sentimos, esta opción aún no está disponible");
    }//GEN-LAST:event_btnPropuestaRenovaciónActionPerformed

    private void btnAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaClienteActionPerformed
        Util.mensajeInformacion("Proximamente", "Lo sentimos, esta opción aún no está disponible");
    }//GEN-LAST:event_btnAltaClienteActionPerformed

    private void btnConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarClienteActionPerformed
        Util.mensajeInformacion("Proximamente", "Lo sentimos, esta opción aún no está disponible");
    }//GEN-LAST:event_btnConsultarClienteActionPerformed

    private void btnActualizarFactoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarFactoresActionPerformed
        Util.mensajeInformacion("Proximamente", "Lo sentimos, esta opción aún no está disponible");
    }//GEN-LAST:event_btnActualizarFactoresActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        JFrame pantalla;
        pantalla = new MenuInicioSesion(entityManager);
        this.setVisible(false);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(MenuProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarFactores;
    private javax.swing.JButton btnAltaCliente;
    private javax.swing.JButton btnAltaPoliza;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarPoliza;
    private javax.swing.JButton btnPropuestaRenovación;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
