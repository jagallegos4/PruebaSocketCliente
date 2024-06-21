package Vista;

import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import socket_conexion_cliente.Cliente;
import socket_conexion_cliente.Usuarios;

public class CrearUsuario extends javax.swing.JFrame {

    public CrearUsuario() {
        initComponents();
        cargarUsuarios(tablaUsuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Cedula = new javax.swing.JTextField();
        txt_Usuario = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAR NUEVO USUARIO");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Cedula:");

        jLabel5.setText("Usuario:");

        jLabel6.setText("Password:");

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CedulaActionPerformed(evt);
            }
        });
        txt_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CedulaKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cédula", "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

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

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel7.setText("Lista de Usuarios");

        jLabel8.setText("ID:");

        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Cedula))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Usuario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txt_Nombre)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Password))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Apellido)))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int idUsuario = 0;
        String nombre = txt_Nombre.getText();
        String apellido = txt_Apellido.getText();
        String cedula = txt_Cedula.getText();
        String username = txt_Usuario.getText();
        String password = txt_Password.getText();

        Usuarios usuario = new Usuarios(idUsuario, nombre, apellido, cedula, username, password);

        try {
            Cliente cliente = new Cliente("localhost", 5000);
            boolean agregado = cliente.agregarUsuario(usuario);

            if (agregado) {
                JOptionPane.showMessageDialog(null, "Usuario agregado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                //addUserFrame.dispose();
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_Cedula.setText("");
                txt_Usuario.setText("");
                txt_Password.setText("");
                cargarUsuarios(tablaUsuarios);
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el usuario!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txt_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CedulaKeyTyped

        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txt_CedulaKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int idUsuario = Integer.parseInt(txt_Id.getText());
        String nombre = txt_Nombre.getText();
        String apellido = txt_Apellido.getText();
        String cedula = txt_Cedula.getText();
        String username = txt_Usuario.getText();
        String password = txt_Password.getText();

        //cambiar el nombre de la variable de la clase Usuarios
        Usuarios usuarios = new Usuarios(idUsuario, nombre, apellido, cedula, username, password);
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            boolean editado = cliente.editarUsuario(usuarios);

            if (editado) {
                JOptionPane.showMessageDialog(null, "Usuario editado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                txt_Id.setText("");
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_Cedula.setText("");
                txt_Usuario.setText("");
                txt_Password.setText("");
                cargarUsuarios(tablaUsuarios);
                //actualizarTablaUsuarios(tablaUsuarios);
            } else {
                JOptionPane.showMessageDialog(null, "Error al editar el usuario!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*int selectedRow = tablaUsuarios.getSelectedRow();
        if (selectedRow != -1) {
                    int idUsuario = (int) tablaUsuarios.getValueAt(selectedRow, 0);
                    try {
                        Cliente cliente = new Cliente("localhost", 5000);
                        boolean eliminado = cliente.eliminarUsuario(idUsuario);

                        if (eliminado) {
                            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            cargarUsuarios(tablaUsuarios);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona un usuario para eliminar!", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }*/
        int idUsuario = Integer.parseInt(txt_Id.getText());

        try {
            Cliente cliente = new Cliente("localhost", 5000);
            boolean eliminado = cliente.eliminarUsuario(idUsuario);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarUsuarios(tablaUsuarios);
                txt_Id.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el usuario!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CedulaActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed

    }//GEN-LAST:event_txt_IdActionPerformed

    private void txt_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txt_IdKeyTyped

    private static void cargarUsuarios(JTable tablaUsuarios) {
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            List<Usuarios> usuarios = cliente.obtenerUsuarios();

            String[] columnNames = {"ID", "Nombre", "Apellido", "Cédula", "Usuario"};
            Object[][] data = new Object[usuarios.size()][5];

            for (int i = 0; i < usuarios.size(); i++) {
                Usuarios usuario = usuarios.get(i);
                data[i][0] = usuario.getIdUsuario();
                data[i][1] = usuario.getNombre();
                data[i][2] = usuario.getApellido();
                data[i][3] = usuario.getCedula();
                data[i][4] = usuario.getUser();
                //data[i][5] = usuario.getPassword();
            }

            tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
