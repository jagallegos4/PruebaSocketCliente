package Vista;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import socket_conexion_cliente.Asiento;
import socket_conexion_cliente.Cliente;
import socket_conexion_cliente.Cuentas;

public class CabeceraConta extends javax.swing.JFrame {

    /**
     * Creates new form CabeceraConta
     */
    private DefaultTableModel modeloAsiento;
    ArrayList<Asiento> listaAsientos = new ArrayList<>();

    public CabeceraConta() {
        initComponents();
        actualizarComboBoxCuentas(comboCuentas);
        inicializarTablaAsiento();
        txtDebe.setText("0");
        txtHaber.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleAsiento = new javax.swing.JTable();
        txtNComp = new javax.swing.JTextField();
        txtHaber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboCuentas = new javax.swing.JComboBox<>();
        txtCalendar = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtPreriodo = new javax.swing.JTextField();
        txtDebe = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAgregarAsiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(2000, 900));
        setMinimumSize(new java.awt.Dimension(1200, 600));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tablaDetalleAsiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Fecha", "Código Cuenta", "Cuentas", "Detalle", "DEBE", "HABER", "Acción"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalleAsiento);
        if (tablaDetalleAsiento.getColumnModel().getColumnCount() > 0) {
            tablaDetalleAsiento.getColumnModel().getColumn(0).setResizable(false);
        }

        txtNComp.setEnabled(false);

        txtHaber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHaberKeyTyped(evt);
            }
        });

        jLabel1.setText("Periodo:");

        jLabel2.setText("Comprobante diario N°:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Cuenta:");

        jLabel5.setText("DEBE:");

        jLabel6.setText("HABER:");

        comboCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Cuenta" }));

        txtCalendar.setDateFormatString("yyyy-MM-dd");

        txtDetalle.setColumns(20);
        txtDetalle.setRows(5);
        jScrollPane2.setViewportView(txtDetalle);

        jLabel7.setText("Detalle:");

        txtDebe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDebeKeyTyped(evt);
            }
        });

        jButton1.setText("Guardar");

        btnAgregarAsiento.setText("Agregar asiento");
        btnAgregarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDebe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHaber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(txtNComp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPreriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarAsiento)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)
                        .addGap(61, 61, 61)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Contabilidad().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtDebeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebeKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtDebe.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDebeKeyTyped

    private void txtHaberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHaberKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtHaber.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHaberKeyTyped

    private void btnAgregarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsientoActionPerformed
        String fecha = ((JTextField) txtCalendar.getDateEditor().getUiComponent()).getText();
        String nombreCuenta = comboCuentas.getSelectedItem().toString();
        String detalle = txtDetalle.getText();
        int idCuenta = encontrarIdCuenta(nombreCuenta);
        double debe = Double.parseDouble(txtDebe.getText());
        double haber = Double.parseDouble(txtHaber.getText());
        Asiento asiento = new Asiento(0, 0, idCuenta, nombreCuenta, fecha, detalle, debe, haber);

        if (nombreCuenta.equalsIgnoreCase("Seleccionar Cuenta")) {
            JOptionPane.showMessageDialog(null, "Seleccione una cuenta", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaAsientos.add(asiento);
            JOptionPane.showMessageDialog(null, "Asiento Agregado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            txtDetalle.setText("");
            txtDebe.setText("0");
            txtHaber.setText("0");
        }
        cargarTablaAsientos();
    }//GEN-LAST:event_btnAgregarAsientoActionPerformed

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
            java.util.logging.Logger.getLogger(CabeceraConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CabeceraConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CabeceraConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CabeceraConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CabeceraConta().setVisible(true);
            }
        });
    }

    private void actualizarComboBoxCuentas(JComboBox<String> comboBox) {
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            List<Cuentas> cuentas = cliente.obtenerCuentas();

            for (Cuentas cuenta : cuentas) {
                comboBox.addItem(cuenta.getNombreCuenta());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int encontrarIdCuenta(String objeto) {
        int idEncontrado = 0;
        try {
            Cliente cliente = new Cliente("localhost", 5000);
            idEncontrado = cliente.buscarIdCuenta(objeto);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return idEncontrado;
    }

    private void inicializarTablaAsiento() {
        modeloAsiento = new DefaultTableModel();
        //añadir columnas
        modeloAsiento.addColumn("N°");
        modeloAsiento.addColumn("Fecha");
        modeloAsiento.addColumn("Código Cuenta");
        modeloAsiento.addColumn("Cuentas");
        modeloAsiento.addColumn("Detalle");
        modeloAsiento.addColumn("Debe");
        modeloAsiento.addColumn("Haber");
        modeloAsiento.addColumn("Acción");
        //agregar los datos del modelo a la tabla
        this.tablaDetalleAsiento.setModel(modeloAsiento);
    }

    private void cargarTablaAsientos() {

        this.modeloAsiento.setRowCount(listaAsientos.size()); //modeloAsiento está declarado al inicio

        for (int i = 0; i < listaAsientos.size(); i++) {
            modeloAsiento.setValueAt(i + 1, i, 0);
            modeloAsiento.setValueAt(listaAsientos.get(i).getFecha(), i, 1);
            modeloAsiento.setValueAt(listaAsientos.get(i).getIdCuenta(), i, 2);
            modeloAsiento.setValueAt(listaAsientos.get(i).getCuenta(), i, 3);
            modeloAsiento.setValueAt(listaAsientos.get(i).getDetalle(), i, 4);
            modeloAsiento.setValueAt(listaAsientos.get(i).getDebe(), i, 5);
            modeloAsiento.setValueAt(listaAsientos.get(i).getHaber(), i, 6);
            modeloAsiento.setValueAt("Eliminar", i, 7);

        }
        tablaDetalleAsiento.setModel(modeloAsiento);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAsiento;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboCuentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetalleAsiento;
    private com.toedter.calendar.JDateChooser txtCalendar;
    private javax.swing.JTextField txtDebe;
    private javax.swing.JTextArea txtDetalle;
    private javax.swing.JTextField txtHaber;
    private javax.swing.JTextField txtNComp;
    private javax.swing.JTextField txtPreriodo;
    // End of variables declaration//GEN-END:variables
}
