package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarCocina extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	
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
					ConsultarCocina dialog = new ConsultarCocina();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarCocina() {
		setTitle("Consultar cocina");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(12, 12, 80, 17);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(12, 41, 80, 17);
		getContentPane().add(lblPrecios);
		
		JLabel lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setBounds(12, 70, 80, 17);
		getContentPane().add(lblAnchocm);
		
		JLabel lblAltocm = new JLabel("Alto (cm)");
		lblAltocm.setBounds(12, 99, 80, 17);
		getContentPane().add(lblAltocm);
		
		JLabel lblFondocm = new JLabel("Fondo (cm)");
		lblFondocm.setBounds(12, 128, 80, 17);
		getContentPane().add(lblFondocm);
		
		JLabel lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(12, 157, 80, 17);
		getContentPane().add(lblQuemadores);
		
		JComboBox comboxModelo = new JComboBox();
		comboxModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DECLARACIÓN DE VARIABLES
				String nombreModelo;
				
				//ENTRADA DE DATOS
				nombreModelo = comboxModelo.getSelectedItem().toString();
				
				//PROCESO
				if (nombreModelo == modelo0)
				{
					txtPrecio.setText(String.valueOf(precio0));
					txtAncho.setText(String.valueOf(ancho0));
					txtAlto.setText(String.valueOf(alto0));
					txtFondo.setText(String.valueOf(fondo0));
					txtQuemadores.setText(String.valueOf(quemadores0));
				}
				if (nombreModelo == modelo1)
				{
					txtPrecio.setText(String.valueOf(precio1));
					txtAncho.setText(String.valueOf(ancho1));
					txtAlto.setText(String.valueOf(alto1));
					txtFondo.setText(String.valueOf(fondo1));
					txtQuemadores.setText(String.valueOf(quemadores1));
				}
				if (nombreModelo == modelo2)
				{
					txtPrecio.setText(String.valueOf(precio2));
					txtAncho.setText(String.valueOf(ancho2));
					txtAlto.setText(String.valueOf(alto2));
					txtFondo.setText(String.valueOf(fondo2));
					txtQuemadores.setText(String.valueOf(quemadores2));
				}
				if (nombreModelo == modelo3)
				{
					txtPrecio.setText(String.valueOf(precio3));
					txtAncho.setText(String.valueOf(ancho3));
					txtAlto.setText(String.valueOf(alto3));
					txtFondo.setText(String.valueOf(fondo3));
					txtQuemadores.setText(String.valueOf(quemadores3));
				}
				if (nombreModelo == modelo4)
				{
					txtPrecio.setText(String.valueOf(precio4));
					txtAncho.setText(String.valueOf(ancho4));
					txtAlto.setText(String.valueOf(alto4));
					txtFondo.setText(String.valueOf(fondo4));
					txtQuemadores.setText(String.valueOf(quemadores4));
				}
			}
		});
		comboxModelo.setModel(new DefaultComboBoxModel(new String[] {"[--Seleccione--]", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboxModelo.setBounds(110, 7, 142, 26);
		getContentPane().add(comboxModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(110, 39, 142, 21);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(110, 68, 142, 21);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(110, 97, 142, 21);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(110, 126, 142, 21);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setBounds(110, 155, 142, 21);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(333, 7, 105, 27);
		getContentPane().add(btnCerrar);

	}
}
