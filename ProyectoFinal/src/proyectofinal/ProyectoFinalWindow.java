package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import application.core.interfaces.IOperacionesCocina;
import application.core.services.OperacionesCocina;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoFinalWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public IOperacionesCocina operacionesCocina = new OperacionesCocina();

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
				ConsultarCocina windowConsultarCocina = new ConsultarCocina(operacionesCocina);
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