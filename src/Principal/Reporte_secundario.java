/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;



/**
 *
 * @author PRINCIPAL
 */
public class Reporte_secundario extends javax.swing.JFrame {

    /**
     * Creates new form Reporte_secundario
     */
    public Reporte_secundario() {
        initComponents();
        jComboBoxTarjetasSecundario.addItem("Efectivo");
        jComboBoxTarjetasSecundario.addItem("Visa");
        jComboBoxTarjetasSecundario.addItem("Mastercard");
        jComboBoxTarjetasSecundario.addItem("BAC");
        jComboBoxTarjetasSecundario.addItem("BCR");
        Fecha();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtNombre_Secundario = new javax.swing.JTextField();
        TxtApellido_Secundario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TxtTotalCompraSecundaria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPago_Secundario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCambio_Secundario = new javax.swing.JTextField();
        TxtSubSecundario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtFecha_Secundario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTarjetasSecundario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("nombre del cliente");

        jLabel12.setText("apellido del cliente");

        TxtNombre_Secundario.setEditable(false);

        TxtApellido_Secundario.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Total de la compra.");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Ingresar el pago.");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        TxtTotalCompraSecundaria.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Subtotal de la compra.");

        TxtPago_Secundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPago_SecundarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Metodo de pago.");

        TxtCambio_Secundario.setEditable(false);

        TxtSubSecundario.setEditable(false);
        TxtSubSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSubSecundarioActionPerformed(evt);
            }
        });

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Fecha:");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtFecha_Secundario.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Cambio:");

        jComboBoxTarjetasSecundario.setToolTipText("");
        jComboBoxTarjetasSecundario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTarjetasSecundarioItemStateChanged(evt);
            }
        });
        jComboBoxTarjetasSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTarjetasSecundarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApellido_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSubSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxTarjetasSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtCambio_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(43, 43, 43)
                                    .addComponent(TxtTotalCompraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(55, 55, 55)
                                .addComponent(TxtPago_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(TxtFecha_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFecha_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtNombre_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtApellido_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtTotalCompraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPago_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCambio_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtSubSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTarjetasSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(38, 38, 38)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void tarjetas() {
        Double iva = 0.13;
        Double Visa = 0.10;
        Double Mastercard = 0.15;
        Double BAC = 0.13;
        Double BCR = 0.09;
        
        

        String descuentos = (String) jComboBoxTarjetasSecundario.getSelectedItem();

        //PAGO EN EFECTIVO
        if (descuentos.equals("Efectivo")) {
            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());
            double totaliva = totalcompra * iva;
            double total = totalcompra + totaliva;
            TxtTotalCompraSecundaria.setText(String.valueOf(total));
        }

        //DESCUENTO TARJETA VISA
        if (descuentos.equals("Visa")) {

            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentovisa = totalcompra * Visa;
            double totaldescuentovisa = totalcompra - descuentovisa;

            double totaliva = totaldescuentovisa * iva;
            double total = totaldescuentovisa + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 10% en la compra por el pago con Tarjeta VISA", "Descuento Visa", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA MASTERCARD
        if (descuentos.equals("Mastercard")) {

            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentomastercard = totalcompra * Mastercard;
            double totaldescuentomastercard = totalcompra - descuentomastercard;

            double totaliva = totaldescuentomastercard * iva;
            double total = totaldescuentomastercard + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 15% en la compra por el pago con Tarjeta Mastercard", "Descuento Mastercard", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA BAC
        if (descuentos.equals("BAC")) {
            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentoBAC = totalcompra * BAC;
            double totaldescuentoBAC = totalcompra - descuentoBAC;

            double totaliva = totaldescuentoBAC * iva;
            double total = totaldescuentoBAC + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 13% en la compra por el pago con Tarjeta BAC", "Descuento BAC", JOptionPane.INFORMATION_MESSAGE);
        }

        //DESCUENTO TARJETA BCR
        if (descuentos.equals("BCR")) {
            double totalcompra = Double.parseDouble(TxtSubSecundario.getText().trim());

            double descuentoBCR = totalcompra * BCR;
            double totaldescuentoBCR = totalcompra - descuentoBCR;

            double totaliva = totaldescuentoBCR * iva;
            double total = totaldescuentoBCR + totaliva;

            TxtTotalCompraSecundaria.setText(String.valueOf(total));
            JOptionPane.showMessageDialog(rootPane, "Se realizo un descuento de un 9% en la compra por el pago con Tarjeta BCR", "Descuento BCR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void Fecha (){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/YYYY");

        TxtFecha_Secundario.setText(formatoFecha.format(fecha));

        Calendar calendario = Calendar.getInstance();

        calendario.setTime(fecha);

        String dia = calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("es", "ES"));

        int horas = calendario.get(Calendar.HOUR);
        int minutos = calendario.get(Calendar.MINUTE);

        TxtFecha_Secundario.setText("Día:   " + dia + "   Hora:  " + horas + "  con  " + minutos + "   Minutos.   ");
    }
    private void TxtSubSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSubSecundarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSubSecundarioActionPerformed

    private void jComboBoxTarjetasSecundarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTarjetasSecundarioItemStateChanged

    }//GEN-LAST:event_jComboBoxTarjetasSecundarioItemStateChanged

    private void jComboBoxTarjetasSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTarjetasSecundarioActionPerformed

    }//GEN-LAST:event_jComboBoxTarjetasSecundarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tarjetas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtPago_SecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPago_SecundarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPago_SecundarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Double.parseDouble(TxtPago_Secundario.getText().trim()) < Double.parseDouble(TxtTotalCompraSecundaria.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El monto digitado es menor al total de la compra", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            TxtPago_Secundario.setText("");
            TxtCambio_Secundario.setText("");

        } else {
            Double pago = Double.parseDouble(TxtPago_Secundario.getText().trim());
            Double total = Double.parseDouble(TxtTotalCompraSecundaria.getText());
            Double cambio = pago - total;

            TxtCambio_Secundario.setText(String.valueOf(cambio));

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_secundario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtApellido_Secundario;
    private javax.swing.JTextField TxtCambio_Secundario;
    private javax.swing.JTextField TxtFecha_Secundario;
    private javax.swing.JTextField TxtNombre_Secundario;
    private javax.swing.JTextField TxtPago_Secundario;
    public static javax.swing.JTextField TxtSubSecundario;
    private javax.swing.JTextField TxtTotalCompraSecundaria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox<String> jComboBoxTarjetasSecundario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
