package proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoFinalWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Datos mínimos de la primera cocina
		public static String modelo0 = "Mabe EMP6120PG0";
		public static double precio0 = 949.0;
		public static double fondo0 = 58.6;
		public static double ancho0 = 60.0;
		public static double alto0 = 91.0;
		public static int quemadores0 = 4;
		// Datos mínimos de la segunda cocina
		public static String modelo1 = "Indurama Parma";
		public static double precio1 = 1089.0;
		public static double ancho1 = 80.0;
		public static double alto1 = 94.0;
		public static double fondo1 = 67.5;
		public static int quemadores1 = 6;
		// Datos mínimos de la tercera cocina
		public static String modelo2 = "Sole COSOL027";
		public static double precio2 = 850.0;
		public static double ancho2 = 60.0;
		public static double alto2 = 90.0;
		public static double fondo2 = 50.0;
		public static int quemadores2 = 4;
		// Datos mínimos de la cuarta cocina
		public static String modelo3 = "Coldex CX602";
		public static double precio3 = 629.0;
		public static double ancho3 = 61.6;
		public static double alto3 = 95.0;
		public static double fondo3 = 51.5;
		public static int quemadores3 = 5;
		// Datos mínimos de la quinta cocina
		public static String modelo4 = "Reco Dakota";
		public static double precio4 = 849.0;
		public static double ancho4 = 75.4;
		public static double alto4 = 94.5;
		public static double fondo4 = 66.0;
		public static int quemadores4 = 5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoFinalWindow frame = new ProyectoFinalWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProyectoFinalWindow() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuProyecto = new JMenuBar();
		menuProyecto.setBounds(12, 0, 795, 23);
		contentPane.add(menuProyecto);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuProyecto.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuProyecto.add(mnMantenimiento);
		
		JMenuItem mntmConsultarCocina = new JMenuItem("Consultar cocina");
		mntmConsultarCocina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarCocina windowConsultarCocina = new ConsultarCocina();
				windowConsultarCocina.setLocationRelativeTo(mntmConsultarCocina);
				windowConsultarCocina.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmConsultarCocina);
		
		JMenuItem mntmModificarCocina = new JMenuItem("Modificar cocina");
		mnMantenimiento.add(mntmModificarCocina);
		
		JMenuItem mntmListarCocinas = new JMenuItem("Listar cocinas");
		mnMantenimiento.add(mntmListarCocinas);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuProyecto.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		JMenu mnGenerarReportes = new JMenu("Generar reportes");
		mnVentas.add(mnGenerarReportes);
		
		JMenu mnConfiguracion = new JMenu("Configuración");
		menuProyecto.add(mnConfiguracion);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuProyecto.add(mnAyuda);
	}
}
