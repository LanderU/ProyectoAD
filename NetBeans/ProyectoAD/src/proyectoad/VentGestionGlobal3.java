/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author albertonieto
 */
public class VentGestionGlobal3 extends javax.swing.JFrame {

    // Variables globales
    DatosConexionBD datosCon = new DatosConexionBD();
    Statement query = null;
    Connection con = null;
    ResultSet resul = null;
    String sql = "";
    static DefaultTableModel dtm;
    static ResultSetMetaData rsmd;

    public VentGestionGlobal3() {

        initComponents();

        jComboBox1.removeAllItems();

        try {

            try {
                Class.forName(datosCon.getFOR_NAME());

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Recuerda insertar el driver");
            }

            Connection con = DriverManager.getConnection(datosCon.getCONNECTION_SCHEMA(), datosCon.getUSERNAME(), datosCon.getPASSWORD());
            query = con.createStatement();
            String sql = "select * from pieza";
            resul = query.executeQuery(sql);

            while (resul.next()) {
                jComboBox1.addItem(resul.getString(1));

            }

            //Cerrando conexiones
            resul.close();
            query.close();
            con.close();

        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pieza: ");

        jLabel2.setText("Numero de proyectos: ");

        jLabel3.setText("Nº de Proveedores que la suministran: ");

        jLabel4.setText("Cantidad total suministrada: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Ver piezas suministradas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel5.setText("PIEZAS SUMINISTRADAS A PROYECTOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Proveedor", "Nombre Proveedor", "Apellidos", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        //Cuando se elige un item del combobox1
        if (jComboBox1.getItemCount() > 1) {
            try {
                Class.forName(datosCon.getFOR_NAME());
                con = DriverManager.getConnection(datosCon.getCONNECTION_SCHEMA(), datosCon.getUSERNAME(), datosCon.getPASSWORD());
                query = con.createStatement();
                sql = "Select * from pieza where codigo ='" + jComboBox1.getSelectedItem() + "'";
                resul = query.executeQuery(sql);

                if (resul.next()) {
                    jTextField1.setText(resul.getString(1));
                    jTextField2.setText(resul.getString(2));

                }
                resul.close();
                query.close();
                con.close();
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Introduzca el driver");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage().toString());
            }
        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(datosCon.getFOR_NAME());
            con = DriverManager.getConnection(datosCon.getCONNECTION_SCHEMA(), datosCon.getUSERNAME(), datosCon.getPASSWORD());
            query = con.createStatement();
            sql = "Select count(*) from gestion where cod_pieza ='" + jComboBox1.getSelectedItem() + "'";
            resul = query.executeQuery(sql);

            if (resul.next()) {
                jTextField3.setText(resul.getString(1));

            } else {
                jTextField3.setText("-");
            }
            sql = "select count(*)\n"
                    + "from gestion\n"
                    + "where cod_pieza = '" + jComboBox1.getSelectedItem() + "'\n"
                    + "ORDER BY cod_proveedor";
            resul = query.executeQuery(sql);
            if (resul.next()) {
                jTextField4.setText(resul.getString(1));

            } else {
                jTextField4.setText("-");
            }

            sql = "select sum(cantidad)\n"
                    + "from gestion\n"
                    + "where cod_pieza = '" + jComboBox1.getSelectedItem() + "'";
            resul = query.executeQuery(sql);
            if (resul.next()) {
                jTextField5.setText(resul.getString(1));

            } else {
                jTextField5.setText("-");
            }
            sql = "select *\n"
                    + "from proveedor, gestion\n"
                    + "where cod_proveedor = codigo\n"
                    + "and cod_pieza = '" + jComboBox1.getSelectedItem() + "'";
            resul = query.executeQuery(sql);
            rsmd = resul.getMetaData();
            try {
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    dtm.removeRow(i);
                    i -= 1;
                }
                // Aquí
                ArrayList<Object[]> datos = new ArrayList<>();
                if (resul.isBeforeFirst()) {
                    while (resul.next()) {
                        Object[] filas = new Object[rsmd.getColumnCount()];
                        for (int i = 0; i < filas.length; i++) {
                            filas[i] = resul.getObject(i + 1);

                        }
                        datos.add(filas);
                    }
                    dtm = (DefaultTableModel) jTable1.getModel();
                    for (int i = 0; i < datos.size(); i++) {
                        dtm.addRow(datos.get(i));
                    }
                } else {
                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        dtm.removeRow(i);
                        i -= 1;
                    }
                }

            } catch (Exception e) {
            }

            resul.close();
            query.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentGestionGlobal3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Introduzca el driver");
        }



         try {
                Class.forName(datosCon.getFOR_NAME());
                con = DriverManager.getConnection(datosCon.getCONNECTION_SCHEMA(), datosCon.getUSERNAME(), datosCon.getPASSWORD());
                query = con.createStatement();
                sql = "Select count(*) from gestion where cod_pieza ='" + jComboBox1.getSelectedItem() + "'";
                resul = query.executeQuery(sql);
 
                if (resul.next()) {
                    jTextField3.setText(resul.getString(1));
 
                }else{
                    jTextField3.setText("-");
                }
                sql = "select count(*)\n" +
                      "from gestion\n" +
                      "where cod_pieza = '"+jComboBox1.getSelectedItem()+"'\n" +
                      "ORDER BY cod_proveedor";
                resul = query.executeQuery(sql);
                if (resul.next()) {
                    jTextField4.setText(resul.getString(1));
 
                }else{
                    jTextField4.setText("-");
                }
                
                sql = "select sum(cantidad)\n" +
                      "from gestion\n" +
                       "where cod_pieza = '"+jComboBox1.getSelectedItem()+"'";
                resul = query.executeQuery(sql);
                   if (resul.next()) {
                    jTextField5.setText(resul.getString(1));
 
                }else{
                    jTextField5.setText("-");
                }     
                resul.close();
                query.close();
                con.close();
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Introduzca el driver");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage().toString());
            }
        
        

         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentGestionGlobal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentGestionGlobal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentGestionGlobal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentGestionGlobal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentGestionGlobal3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
