import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio window = new VentanaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnBaseDeDatos = new JMenu("Base de Datos");
		menuBar.add(mnBaseDeDatos);
		
		JMenuItem mntmCrearBaseDe = new JMenuItem("Crear base de Datos");
		mntmCrearBaseDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hola");
			}
		});
		mnBaseDeDatos.add(mntmCrearBaseDe);
		
		JMenuItem mntmBorrarBaseDe = new JMenuItem("Borrar base de Datos");
		mnBaseDeDatos.add(mntmBorrarBaseDe);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnBaseDeDatos.add(mntmSalir);
		
		JMenu mnProveedores = new JMenu("Proveedores");
		menuBar.add(mnProveedores);
		
		JMenuItem mntmGestionDeProveedores = new JMenuItem("Gestion de Proveedores");
		mnProveedores.add(mntmGestionDeProveedores);
		
		JMenu mnConsultaDeProveedores = new JMenu("Consulta de Proveedores");
		mnProveedores.add(mnConsultaDeProveedores);
		
		JMenuItem mntmPorCodigo = new JMenuItem("Por codigo");
		mnConsultaDeProveedores.add(mntmPorCodigo);
		
		JMenuItem mntmPorNombre = new JMenuItem("Por nombre");
		mnConsultaDeProveedores.add(mntmPorNombre);
		
		JMenuItem mntmPorDireccion = new JMenuItem("Por direccion");
		mnConsultaDeProveedores.add(mntmPorDireccion);
		
		JMenu mnPiezas = new JMenu("Piezas");
		menuBar.add(mnPiezas);
		
		JMenuItem mntmGestionDePiezas = new JMenuItem("Gestion de Piezas");
		mnPiezas.add(mntmGestionDePiezas);
		
		JMenu mnConsultaDePiezas = new JMenu("Consulta de piezas");
		mnPiezas.add(mnConsultaDePiezas);
		
		JMenuItem mntmPorCodigo_1 = new JMenuItem("Por Codigo");
		mnConsultaDePiezas.add(mntmPorCodigo_1);
		
		JMenuItem mntmPorNombre_1 = new JMenuItem("Por Nombre");
		mnConsultaDePiezas.add(mntmPorNombre_1);
		
		JMenuItem mntmPorPrecio = new JMenuItem("Por Precio");
		mnConsultaDePiezas.add(mntmPorPrecio);
		
		JMenu mnProyectos = new JMenu("Proyectos");
		menuBar.add(mnProyectos);
		
		JMenuItem mntmGestionDeProyectos = new JMenuItem("Gestion de Proyectos");
		mnProyectos.add(mntmGestionDeProyectos);
		
		JMenu mnConsultaDeProyectos = new JMenu("Consulta de Proyectos");
		mnProyectos.add(mnConsultaDeProyectos);
		
		JMenuItem mntmPorCodigo_2 = new JMenuItem("Por codigo");
		mnConsultaDeProyectos.add(mntmPorCodigo_2);
		
		JMenuItem mntmPorNombre_2 = new JMenuItem("Por Nombre");
		mnConsultaDeProyectos.add(mntmPorNombre_2);
		
		JMenu mnGestionGlobal = new JMenu("Gestion Global");
		menuBar.add(mnGestionGlobal);
		
		JMenuItem mntmPiezasProveedoresY = new JMenuItem("Piezas, Proveedores y Proyectos");
		mnGestionGlobal.add(mntmPiezasProveedoresY);
		
		JMenuItem mntmSuministrosPorProveedor = new JMenuItem("Suministros por Proveedor");
		mnGestionGlobal.add(mntmSuministrosPorProveedor);
		
		JMenuItem mntmSuministrosPorPiezas = new JMenuItem("Suministros por Piezas");
		mnGestionGlobal.add(mntmSuministrosPorPiezas);
		
		JMenuItem mntmEstadsticas = new JMenuItem("Estadísticas");
		mnGestionGlobal.add(mntmEstadsticas);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de...");
		mnAyuda.add(mntmAcercaDe);
	}

}
