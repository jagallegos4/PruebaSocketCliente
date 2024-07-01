package Vista;

import java.io.IOException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import socket_conexion_cliente.Cliente;
import socket_conexion_cliente.Cuentas;
import socket_conexion_cliente.TipoCuentas;

/**
 *
 * @author Andres Gallegos
 */
public class Cuenta extends javax.swing.JFrame {

    public Cuenta() {
        initComponents();
        cargarCuentas(tablaCuentas);
        actualizarComboBoxTipoCuentas(comboTipoC);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        comboTipoC = new javax.swing.JComboBox<>();
        txtIdCuentas = new javax.swing.JTextField();
        txtNombreCuentas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("CUENTAS");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipo:");

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Id tipo cuenta"
            }
        ));
        jScrollPane2.setViewportView(tablaCuentas);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        comboTipoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de cuenta" }));

        txtIdCuentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCuentasKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel5.setText("REGISTRAR CUENTA");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel6.setText("LISTAR CUENTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel4))
                                                .addGap(23, 23, 23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnRegresar)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtIdCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar))
                        .addGap(36, 36, 36)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idCuenta = Integer.parseInt(txtIdCuentas.getText());

        try {
            Cliente cliente = new Cliente("localhost", 5000);
            boolean eliminado = cliente.eliminarCuenta(idCuenta);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Tipo de cuenta eliminado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                txtIdCuentas.setText("");
                cargarCuentas(tablaCuentas);

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el tipo de cuenta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Contabilidad().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreCuenta = txtNombreCuentas.getText();
        String tipoCuentaSeleccionado = comboTipoC.getSelectedItem().toString();
        int idTypeAccount = encontrarTipoCuenta(tipoCuentaSeleccionado);

        if (tipoCuentaSeleccionado.equalsIgnoreCase("Seleccione el tipo de cuenta")) {
            JOptionPane.showMessageDialog(null, "Sleccione un tipo de cuenta", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Cliente cliente = new Cliente("localhost", 5000);
                boolean agregado = cliente.agregarCuenta(nombreCuenta, idTypeAccount);

                if (!agregado) {
                    JOptionPane.showMessageDialog(null, "Cuenta agregada correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    txtIdCuentas.setText("");
                    txtNombreCuentas.setText("");
                    cargarCuentas(tablaCuentas);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar la cuenta!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nombreCuenta = txtNombreCuentas.getText();
        int idCuenta = Integer.parseInt(txtIdCuentas.getText());
        String tipoCuentaSeleccionado = comboTipoC.getSelectedItem().toString();
        int idTypeAccount = encontrarTipoCuenta(tipoCuentaSeleccionado);
        //cambiar el nombre de la variable de la clase en uso
        Cuentas cuentas = new Cuentas(idCuenta, nombreCuenta, idTypeAccount);
        if (tipoCuentaSeleccionado.equalsIgnoreCase("Seleccione el tipo de cuenta")) {
            JOptionPane.showMessageDialog(null, "Sleccione un tipo de cuenta", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Cliente cliente = new Cliente("localhost", 5000);
                boolean editado = cliente.editarCuenta(cuentas);

                if (!editado) {
                    JOptionPane.showMessageDialog(null, "Tipo de cuenta editado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    txtIdCuentas.setText("");
                    txtNombreCuentas.setText("");
                    cargarCuentas(tablaCuentas);

                } else {
                    JOptionPane.showMessageDialog(null, "Error al editar el tipo de cuenta!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtIdCuentasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCuentasKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtIdCuentasKeyTyped

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
            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuenta().setVisible(true);
            }
        });
    }

    private void actualizarComboBoxTipoCuentas(JComboBox<String> comboBox) {
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            List<TipoCuentas> tiposCuentas = cliente.obtenerTipoCuentas();
            //comboBox.removeAllItems();
            for (TipoCuentas tipoCuenta : tiposCuentas) {
                comboBox.addItem(tipoCuenta.getNombreTipo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int encontrarTipoCuenta(String tipoCuenta) {
        int idEncontrado = 0;
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            idEncontrado = cliente.buscarIdTipo(tipoCuenta);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return idEncontrado;
    }

    private void cargarCuentas(JTable tabla) {
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            List<Cuentas> cuentas = cliente.obtenerCuentas();

            Object[][] data = new Object[cuentas.size()][3];
            for (int i = 0; i < cuentas.size(); i++) {
                data[i][0] = cuentas.get(i).getIdCuenta();
                data[i][1] = cuentas.get(i).getNombreCuenta();
                data[i][2] = cuentas.get(i).getIdTipoCuenta();
            }

            tabla.setModel(new javax.swing.table.DefaultTableModel(data, new String[]{"Código", "Nombre", "Id Tipo Cuenta"}));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboTipoC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tablaCuentas;
    private javax.swing.JTextField txtIdCuentas;
    private javax.swing.JTextField txtNombreCuentas;
    // End of variables declaration//GEN-END:variables
}
