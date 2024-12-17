package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import application.core.interfaces.IConfiguracion;
import application.core.interfaces.IOperacionesCocina;
import application.core.interfaces.IVentas;
import application.core.services.Configuracion;
import application.core.services.OperacionesCocina;
import application.core.services.Ventas;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoFinalWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public IOperacionesCocina operacionesCocina = new OperacionesCocina();
	public IConfiguracion configuracion = new Configuracion();
	public IVentas ventas = new Ventas(configuracion, operacionesCocina);

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
		mntmModificarCocina.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				ModificarCocinaDialog dialogModificarCocina = new ModificarCocinaDialog(operacionesCocina);
				dialogModificarCocina.setLocationRelativeTo(mntmModificarCocina);
				dialogModificarCocina.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmModificarCocina);
		
		JMenuItem mntmListarCocinas = new JMenuItem("Listar cocinas");
		mntmListarCocinas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ListarCocinasDialog dialogListarCocinas = new ListarCocinasDialog(operacionesCocina);
				dialogListarCocinas.setLocationRelativeTo(mntmListarCocinas);
				dialogListarCocinas.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmListarCocinas);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuProyecto.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenderDialog windowVenderDialog = new VenderDialog(operacionesCocina, ventas);
				windowVenderDialog.setLocationRelativeTo(mntmVender);
				windowVenderDialog.setVisible(true);
			}
		});
		mnVentas.add(mntmVender);
		
		JMenuItem mntmReportes = new JMenuItem("Generar Reportes");
		mntmReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				GenerarReporteDialog windowReporteDialog = new GenerarReporteDialog(ventas, configuracion, operacionesCocina);
				windowReporteDialog.setLocationRelativeTo(mntmReportes);
				windowReporteDialog.setVisible(true);
			}
		});
		mnVentas.add(mntmReportes);
		
		JMenu mnConfiguracion = new JMenu("Configuración");
		menuProyecto.add(mnConfiguracion);
		
		JMenuItem mntmDescuentos = new JMenuItem("Configurar Descuentos");
		mntmDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConfigurarDescuentosDialog windowDescuentosDialog = new ConfigurarDescuentosDialog(configuracion);
				windowDescuentosDialog.setLocationRelativeTo(mntmDescuentos);
				windowDescuentosDialog.setVisible(true);
			}
		});
		mnConfiguracion.add(mntmDescuentos);
		
		JMenuItem mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConfigurarObsequiosDialog windowConfigurarObsequiosDialog = new ConfigurarObsequiosDialog(configuracion);
				windowConfigurarObsequiosDialog.setLocationRelativeTo(mntmConfigurarObsequios);
				windowConfigurarObsequiosDialog.setVisible(true);
			}
		});
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		JMenuItem mntmConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad Óptima");
		mntmConfigurarCantidadOptima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarCantidadOptimaDialog configurarCantidadOptimaDialog = new ConfigurarCantidadOptimaDialog(configuracion);
				configurarCantidadOptimaDialog.setLocationRelativeTo(mntmConfigurarCantidadOptima);
				configurarCantidadOptimaDialog.setVisible(true);
			}
		});
		mnConfiguracion.add(mntmConfigurarCantidadOptima);
		
		JMenuItem mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuProyecto.add(mnAyuda);
	}
}
