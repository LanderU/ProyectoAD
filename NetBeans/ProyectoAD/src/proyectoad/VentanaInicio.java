/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author albertonieto
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public static void crearDataBase() {

        DatosConexionBD datosConexion = new DatosConexionBD();
        BufferedReader input = null;

        //Cargamos el scrip para crear la BD
        try {
            input = new BufferedReader(new FileReader(new File("createTables.sql")));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El script de creación no existe");
        }

        //Se crea un string builder para cargar todo el script con sus saltos de linea
        String linea = null;
        StringBuilder crearSentencia = new StringBuilder();
        String salto = System.getProperty("line.separator");
        try {
            while ((linea = input.readLine()) != null) {
                crearSentencia.append(linea);
                crearSentencia.append(salto);
            }// end while
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al procesar el fichero");
        }

        String sql = crearSentencia.toString();

        try {
            Class.forName(datosConexion.getFOR_NAME());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Inserte el driver MySQL");
        }

        //creamos la conexion
        Connection con = null;
        try {
            con = DriverManager.getConnection(datosConexion.getCONNECTION(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());
            Statement sentencia = con.createStatement();

            //Ejecutamos la sentencia con el sript de creación
            int ok = sentencia.executeUpdate(sql);

            //Comprobamos que se haya creado la BD
            if (ok != 0) {

                JOptionPane.showMessageDialog(null, "Base De datos creada");
                sentencia.close();
                con.close();

            } else {

                JOptionPane.showMessageDialog(null, "Error al crear la BD");
                sentencia.close();
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Imposible realizar la conexión con la BD");
            System.out.println(e.getMessage());
        }

    }// end crearDatabase

    public boolean checkDataBase() {

        //Comprobamos si la base de datos está creada
        boolean flag = false;
        try {

            //Creamos una conexion
            DatosConexionBD datosCon = new DatosConexionBD();
            try {
                Class.forName(datosCon.getFOR_NAME());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = null;
            try {
                con = DriverManager.getConnection(datosCon.getCONNECTION(), datosCon.getUSERNAME(), datosCon.getPASSWORD());
            } catch (SQLException ex) {
                Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            DatabaseMetaData metaDatos = null;
            try {
                metaDatos = con.getMetaData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la BD");
            }
            ResultSet auditar = metaDatos.getCatalogs();
            while (auditar.next()) {
                if (auditar.getString("TABLE_CAT").equals("proyectoAd")) {
                    return true;
                }
            }
            // Cerramos la BD
            auditar.close();
            // Stream
            con.close();
        }//checkDataBase
        catch (SQLException ex) {
            Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }// end checkDataBase

    public VentanaInicio() {

        //Arranque de la ventana
        initComponents();

        //Comprobamos si la BD está creada para Habilitar o no, los botones/pestañas correspondientes
        if (checkDataBase()) {
            this.jMenuItem1.setEnabled(false);
            this.jMenu2.setEnabled(true);
            this.jMenu3.setEnabled(true);
            this.jMenu4.setEnabled(true);
            this.jMenu5.setEnabled(true);
            this.jMenu6.setEnabled(true);
            this.jMenu7.setEnabled(true);
            this.jMenu8.setEnabled(true);
            this.jMenu9.setEnabled(true);
        } else {
            this.jMenuItem2.setEnabled(false);
            this.jMenu2.setEnabled(false);
            this.jMenu3.setEnabled(false);
            this.jMenu4.setEnabled(false);
            this.jMenu5.setEnabled(false);
            this.jMenu6.setEnabled(false);
            this.jMenu7.setEnabled(false);
            this.jMenu8.setEnabled(false);
            this.jMenu9.setEnabled(false);
        }

        //Cargamos la imagen de fondo
        setBounds(100, 100, 650, 400);
        PanelImagen p = new PanelImagen();
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        p.setLayout(new BorderLayout(0, 0));
        setContentPane(p);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Base de Datos");

        jMenuItem1.setText("Crear Base de Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar Base de Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proveedores");

        jMenuItem5.setText("Gestion de Proveedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu7.setText("Consulta de proveedores");

        jMenuItem6.setText("Por Codigo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setText("Por Nombre");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Por Dirección");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Piezas");

        jMenuItem9.setText("Gestión de Piezas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenu8.setText("Consulta de Piezas");

        jMenuItem10.setText("Por Codigo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenuItem11.setText("Por Nombre");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuItem12.setText("Por Precio");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem12);

        jMenu3.add(jMenu8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Proyectos");

        jMenuItem13.setText("Gestión de Proyecto");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenu9.setText("Consulta de Proyectos");

        jMenuItem14.setText("Por Codigo");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem14);

        jMenuItem15.setText("Por Nombre");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem15);

        jMenu4.add(jMenu9);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Gestion Global");

        jMenuItem16.setText("Piezas, Proveedores y Proyectos");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Suministros por Proveedor");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("Suministros por Piezas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("Estadisticas");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ayuda");

        jMenuItem20.setText("Acerca de...  los desarrolladores");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        //Ventana de gestion de proveedores
        GestionProveedores gp = new GestionProveedores();
        gp.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        //Consulta de proveedores por codigo
        VentProvCodigo vpc = new VentProvCodigo();
        vpc.setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        //Consulta de proveedores pòr nombre
        VentProvNombre vpn = new VentProvNombre();
        vpn.setVisible(true);


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        //Consulta de proveedores por direccion
        VentProvDireccion vpd = new VentProvDireccion();
        vpd.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        //Consulta de piezas por codigo
        VentPiezaCodigo vpic = new VentPiezaCodigo();
        vpic.setVisible(true);


    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

        //Consulta de piezas por nombre
        VentPiezaNombre vpin = new VentPiezaNombre();
        vpin.setVisible(true);

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        //Consulta de Piezas por precio
        VentPiezaPrecio vpip = new VentPiezaPrecio();
        vpip.setVisible(true);

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

        //Consulta de proyectos por codigo
        VentProyCodigo vpcod = new VentProyCodigo();
        vpcod.setVisible(true);


    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

        // Consulta de proyectos por nombre
        VentProyNombre vpnom = new VentProyNombre();
        vpnom.setVisible(true);

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        // Ventana de gestion de piezas
        GestionPiezas gp = new GestionPiezas();
        gp.setVisible(true);


    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

        // Llamar a ventana de gestion de proyectos
        GestionProyectos gProy = new GestionProyectos();
        gProy.setVisible(true);


    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

        // Llamar a la ventana de Acerca de los desarrolladores
        VentAcercaDe vac = new VentAcercaDe();
        vac.setVisible(true);


    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //Boton de crear BD
        //Llamamos al metodo de crear la BD
        crearDataBase();
        //Desabilitamos el boton de crear BD y Habilitamos el de eliminar BD
        this.jMenuItem1.setEnabled(false);
        this.jMenuItem2.setEnabled(true);

        //Habilitar todos los demás botones cuando se crea la bd
        this.jMenu2.setEnabled(true);
        this.jMenu3.setEnabled(true);
        this.jMenu4.setEnabled(true);
        this.jMenu5.setEnabled(true);
        this.jMenu6.setEnabled(true);
        this.jMenu7.setEnabled(true);
        this.jMenu8.setEnabled(true);
        this.jMenu9.setEnabled(true);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        // Boton de Salir
        //Creamos una conexión para hacer un commit y asegurarnos de que no se pierde nada de lo ejecutado
        DatosConexionBD datosConexion = new DatosConexionBD();

        Connection con = null;
        try {
            con = DriverManager.getConnection(datosConexion.getCONNECTION(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());
            Statement sentencia = con.createStatement();

            //Creamos la sentencia que hace commit a la BD y la ejecutamos
            String sql = "commit;";
            boolean ok1 = sentencia.execute(sql);
            System.out.println(sql);

            //Comprobamos la ejecución de la sentencia
            if (ok1) {

                System.out.println("Información guardada antes de cerrar el programa...");
                con.close();

            } else {

                JOptionPane.showMessageDialog(null, "Error al guardar la información en la BD");
                con.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha sido imposible guardar la BD");
        }

        //Pedimos confirmación para salir del programa
        int confirm = JOptionPane.showConfirmDialog(null, "¿Realmente deseas Salir?");

        if (confirm == 0) {
            System.exit(0);
        }


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        //Boton de eliminar base de datos
        //Creamos la conexión
        DatosConexionBD datosConexion = new DatosConexionBD();

        Connection con = null;
        try {
            con = DriverManager.getConnection(datosConexion.getCONNECTION(), datosConexion.getUSERNAME(), datosConexion.getPASSWORD());
            Statement sentencia = con.createStatement();

            //Creamos la sentencia que borra la BD y la ejecutamos
            String sql = "drop schema proyectoAd;";
            int ok = sentencia.executeUpdate(sql);
            System.out.println(sql);

            //Comprobamos la ejecución de la sentencia
            if (ok != 0) {

                JOptionPane.showMessageDialog(null, "Base De datos Borrada");
                con.close();

            } else {

                JOptionPane.showMessageDialog(null, "Error al borrar la BD");
                con.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha sido imposible borrar la BD");
        }

        //Habilitar boton de crear base de datos y desabilitar el de borrarla
        this.jMenuItem1.setEnabled(true);
        this.jMenuItem2.setEnabled(false);

        //deshabilitar todos los botones cuando se crea la bd
        this.jMenu2.setEnabled(false);
        this.jMenu3.setEnabled(false);
        this.jMenu4.setEnabled(false);
        this.jMenu5.setEnabled(false);
        this.jMenu6.setEnabled(false);
        this.jMenu7.setEnabled(false);
        this.jMenu8.setEnabled(false);
        this.jMenu9.setEnabled(false);


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

        //Ventana de gestionGlobal (Piezas, proveedores y proyectos).
        VentGestionGlobal1 v1 = new VentGestionGlobal1();
        v1.setVisible(true);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed

        //Ventana de gestionGlobal (Suministros por proveedor).
        VentGestionGlobal2 v2 = new VentGestionGlobal2();
        v2.setVisible(true);

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

        //Ventana de gestionGlobal (Suministros por piezas).
        VentGestionGlobal3 v3 = new VentGestionGlobal3();
        v3.setVisible(true);

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed

        //Ventana de gestionGlobal (Estadisticas).
        VentGestionGlobal4 v4 = new VentGestionGlobal4();
        v4.setVisible(true);

    }//GEN-LAST:event_jMenuItem19ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
