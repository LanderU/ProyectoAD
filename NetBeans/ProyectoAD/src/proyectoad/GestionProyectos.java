/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author albertonieto
 */
public class GestionProyectos extends javax.swing.JFrame {

    /**
     * Creates new form GestionProyectos
     */
    DatosConexionBD datosConexion = null;

    public GestionProyectos() {
        
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        botLimpiarProyecto = new javax.swing.JButton();
        botInsertarProyecto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botEliminarProyecto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botModificarProyecto = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        botInicioProyecto = new javax.swing.JButton();
        botAtrasProyecto = new javax.swing.JButton();
        botAdelanteProyecto = new javax.swing.JButton();
        botFinalProyecto = new javax.swing.JButton();
        botCargarProyecto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("CODIGO DE PROYECTO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("CIUDAD:");

        botLimpiarProyecto.setText("LIMPIAR");
        botLimpiarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimpiarProyectoActionPerformed(evt);
            }
        });

        botInsertarProyecto.setText("INSERTAR");
        botInsertarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInsertarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botLimpiarProyecto)
                .addGap(18, 18, 18)
                .addComponent(botInsertarProyecto)
                .addGap(217, 217, 217))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botLimpiarProyecto)
                    .addComponent(botInsertarProyecto))
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("Gestion de Proyectos", jPanel1);

        jLabel2.setBackground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("LISTA DE PROYECTOS");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("CODIGO DE PROYECTO:");

        botEliminarProyecto.setText("ELIMINAR");
        botEliminarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarProyectoActionPerformed(evt);
            }
        });

        jLabel9.setText("NOMBRE:");

        jLabel10.setText("CIUDAD:");

        botModificarProyecto.setText("MODIFICAR");
        botModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botModificarProyectoActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);

        botInicioProyecto.setText("<<");
        botInicioProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botInicioProyectoActionPerformed(evt);
            }
        });

        botAtrasProyecto.setText("<");
        botAtrasProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAtrasProyectoActionPerformed(evt);
            }
        });

        botAdelanteProyecto.setText(">");
        botAdelanteProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAdelanteProyectoActionPerformed(evt);
            }
        });

        botFinalProyecto.setText(">>");
        botFinalProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFinalProyectoActionPerformed(evt);
            }
        });

        botCargarProyecto.setText("CARGAR PROYECTOS");
        botCargarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCargarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(botInicioProyecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botAtrasProyecto)
                                .addGap(18, 18, 18)
                                .addComponent(botAdelanteProyecto)
                                .addGap(18, 18, 18)
                                .addComponent(botFinalProyecto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(botEliminarProyecto)
                                .addGap(18, 18, 18)
                                .addComponent(botModificarProyecto)
                                .addGap(50, 50, 50)))
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botCargarProyecto)
                        .addGap(207, 207, 207))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel7)
                    .addContainerGap(572, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(62, 62, 62)
                .addComponent(botCargarProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botInicioProyecto)
                    .addComponent(botAtrasProyecto)
                    .addComponent(botAdelanteProyecto)
                    .addComponent(botFinalProyecto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botEliminarProyecto)
                    .addComponent(botModificarProyecto))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Listado de Proyectos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane2)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane2)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private int contador = 0;
    ResultSet resultado = null;
    private void botLimpiarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimpiarProyectoActionPerformed
        //Vaciamos los textFields
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

    }//GEN-LAST:event_botLimpiarProyectoActionPerformed

    private void botInsertarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInsertarProyectoActionPerformed

        //Boton de insertar nuevo proyecto
        //Comprobar que los text fields necesarios esten repletos
        if (jTextField1.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduce el codigo de proyecto");
        } else if (jTextField1.getText().length() > 6) {
            JOptionPane.showMessageDialog(null, "El código no puede superar los 6 caracteres");
        } else if (jTextField2.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduce el nombre de proyecto");
        } else if (jTextField2.getText().length() > 40) {
            JOptionPane.showMessageDialog(rootPane, "El nombre no puede superar los 20 caracteres");
        } else if (jTextField3.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduce la ciudad de proyecto");
        } else if (jTextField3.getText().length() > 40) {
            JOptionPane.showMessageDialog(rootPane, "El campo ciudad no puede superar los 30 caracteres");

        } else {

            //Llamar a la funcion que haga la insercion
            datosConexion = new DatosConexionBD();

            Connection con = null;
            try {
                //Abrimos la conexion
                con = DriverManager.getConnection(datosConexion.getCONNECTION_SCHEMA(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());

                //Llamar al procedimiento para insertar un proyecto
                String sql = "{call insertar_proyecto(?,?,?)}";
                CallableStatement insercion = con.prepareCall(sql);

                // Añadimos los valores a la sentencia
                insercion.setString(1, jTextField1.getText());
                insercion.setString(2, jTextField2.getText());
                insercion.setString(3, jTextField3.getText());

                int ok = insercion.executeUpdate();

                //Comprobamos que se ejecute la inserción
                if (ok != 0) {

                    JOptionPane.showMessageDialog(null, "Proyecto añadido a la BD");
                    insercion.close();
                    con.close();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");

                } else {

                    JOptionPane.showMessageDialog(null, "Error al añadir el Proyecto a la BD");
                    insercion.close();
                    con.close();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha sido imposible añadir el Proyecto " + e.getMessage());
                System.out.println("Error->" + e.getMessage());
            }

        }

    }//GEN-LAST:event_botInsertarProyectoActionPerformed

    private void botEliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarProyectoActionPerformed

        //BOTON DE ELIMINAR
        //Comprobamos que haya un proyecto cargado
        if (jTextField8.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "No hay ningun proyecto cargado, por favor dale al boton de cargar o inserta un proyecto!!");
        } else {
            //Llamar a la funcion que haga el borrado
            datosConexion = new DatosConexionBD();

            Connection con = null;
            try {
                //Abrimos la conexion
                con = DriverManager.getConnection(datosConexion.getCONNECTION_SCHEMA(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());

                //Llamar al procedimiento para eliminar un proyecto
                String sql = "{call eliminar_proyecto(?)}";
                CallableStatement borrar = con.prepareCall(sql);

                // Añadimos los valores a la sentencia
                borrar.setString(1, jTextField8.getText());
                int ok = borrar.executeUpdate();

                //Comprobamos que se ejecute el borrado
                if (ok != 0) {
                    JOptionPane.showMessageDialog(null, "proyecto  borrado");
                    borrar.close();
                    con.close();

                } else {

                    JOptionPane.showMessageDialog(null, "Error al eliminar al proyecto de la BD");
                    borrar.close();
                    con.close();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha sido imposible añadir al proyecto " + e.getMessage());
                System.out.println("Error->" + e.getMessage());
            }

        }
        //Cargamos los proyectos para refrescar
        botCargarProyecto.doClick();
    }//GEN-LAST:event_botEliminarProyectoActionPerformed

    private void botModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botModificarProyectoActionPerformed

        //BOTON DE modificar
        //Comprobamos que haya un proyecto cargado
        if (jTextField8.getText().contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "No hay ningun proyecto cargado, por favor dale al boton de cargar o inserta un proyecto!!");
        } else {
            //Llamar a la funcion que haga la modificacion
            datosConexion = new DatosConexionBD();

            Connection con = null;
            try {
                //Abrimos la conexion
                con = DriverManager.getConnection(datosConexion.getCONNECTION_SCHEMA(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());

                //Llamar al procedimiento para modificar un proyecto
                String sql = "{call modificar_proyecto(?,?,?)}";
                CallableStatement modificar = con.prepareCall(sql);

                // Añadimos los valores a la sentencia
                modificar.setString(1, jTextField8.getText());
                modificar.setString(2, jTextField5.getText());
                modificar.setString(3, jTextField6.getText());

                //Comprobamos que se ejecute la modificación
                int ok = modificar.executeUpdate();

                if (ok != 0) {
                    JOptionPane.showMessageDialog(null, "proyecto  modificado");
                    modificar.close();
                    con.close();

                } else {

                    JOptionPane.showMessageDialog(null, "Error al modificar al proyecto de la BD");
                    modificar.close();
                    con.close();
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha sido imposible modificar al proyecto " + e.getMessage());
                System.out.println("Error->" + e.getMessage());
            }

        }
        //Cargar otra vez los proveedores
        botCargarProyecto.doClick();

    }//GEN-LAST:event_botModificarProyectoActionPerformed

    private void botCargarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCargarProyectoActionPerformed

        //Boton de cargar proyectos
        datosConexion = new DatosConexionBD();
        try {
            Class.forName(datosConexion.getFOR_NAME());

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Recuerda insertar el driver");
        }

        try {

            //se crea la conexión 
            Connection con = DriverManager.getConnection(datosConexion.getCONNECTION_SCHEMA(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());

            Statement query = con.createStatement();
            String sql = "SELECT * FROM proyecto ORDER BY codigo;";
            resultado = query.executeQuery(sql);

            //Rellenamos los textFields con los valores recogidos de la sentencia
            if (resultado.next()) {
                System.out.println(resultado.getString(1));
                System.out.println(resultado.getString(2));

                this.jTextField8.setText(resultado.getString(1));
                this.jTextField5.setText(resultado.getString(2));
                this.jTextField6.setText(resultado.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botCargarProyectoActionPerformed

    private void botInicioProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botInicioProyectoActionPerformed
        // Ir a la primera posición
        if (resultado != null) {
            try {
                resultado.first();
                contador = resultado.getRow();
                this.jTextField8.setText(resultado.getString("codigo"));
                this.jTextField5.setText(resultado.getString("nombre"));
                this.jTextField6.setText(resultado.getString("ciudad"));
            } catch (SQLException ex) {
                Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cargue los datos para navegar entre ellos");
        }
            }//GEN-LAST:event_botInicioProyectoActionPerformed

    private void botAtrasProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAtrasProyectoActionPerformed

        //boton de retroceder uno atras
        boolean primero = false;
        try {
            primero = resultado.isFirst();
        } catch (SQLException ex) {
            Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (primero) {
            JOptionPane.showMessageDialog(null, "Ya estás en el primero");
        } else {
            try {

                contador--;
                resultado.absolute(contador);
                this.jTextField8.setText(resultado.getString("codigo"));
                this.jTextField5.setText(resultado.getString("nombre"));
                this.jTextField6.setText(resultado.getString("ciudad"));

            } catch (SQLException ex) {
                Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    }//GEN-LAST:event_botAtrasProyectoActionPerformed

    private void botAdelanteProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAdelanteProyectoActionPerformed
        // Boton de avanzar una posicion
        boolean ultimo = false;
        try {
            ultimo = resultado.isLast();
        } catch (SQLException ex) {
            Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ultimo) {
            JOptionPane.showMessageDialog(null, "Ya estás en el último");
        } else {
            try {

                contador++;
                resultado.absolute(contador);
                this.jTextField8.setText(resultado.getString("codigo"));
                this.jTextField5.setText(resultado.getString("nombre"));
                this.jTextField6.setText(resultado.getString("ciudad"));

            } catch (SQLException ex) {
                Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    }//GEN-LAST:event_botAdelanteProyectoActionPerformed

    private void botFinalProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFinalProyectoActionPerformed
        // Boton de ir al final

        if (resultado != null) {
            try {
                resultado.last();
                contador = resultado.getRow();
                this.jTextField8.setText(resultado.getString("codigo"));
                this.jTextField5.setText(resultado.getString("nombre"));
                this.jTextField6.setText(resultado.getString("ciudad"));
            } catch (SQLException ex) {
                Logger.getLogger(GestionProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cargue los datos para navegar entre ellos");
        }
    }//GEN-LAST:event_botFinalProyectoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAdelanteProyecto;
    private javax.swing.JButton botAtrasProyecto;
    private javax.swing.JButton botCargarProyecto;
    private javax.swing.JButton botEliminarProyecto;
    private javax.swing.JButton botFinalProyecto;
    private javax.swing.JButton botInicioProyecto;
    private javax.swing.JButton botInsertarProyecto;
    private javax.swing.JButton botLimpiarProyecto;
    private javax.swing.JButton botModificarProyecto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
