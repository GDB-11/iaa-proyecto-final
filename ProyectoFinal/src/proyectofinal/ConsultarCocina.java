package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import application.core.interfaces.IOperacionesCocina;
import infrastructure.core.models.Cocina;
import proyectofinal.helpers.ElementosHelper;

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

	/**
	 * Create the dialog.
	 */
	public ConsultarCocina(IOperacionesCocina operacionesCocina) {
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
				//DECLARACIÓN DE VARIABLES LOCALES
				String nombreModelo;
				
				//ENTRADA DE DATOS
				nombreModelo = ElementosHelper.getComboboxTexto(comboxModelo);
				
				//PROCESO
				Cocina cocina = operacionesCocina.obtenerCocina(nombreModelo);

				//MOSTRAR RESULTADOS
				if (cocina == null) {
					ElementosHelper.setTextFieldValue(txtPrecio, "");
					ElementosHelper.setTextFieldValue(txtAncho, "");
					ElementosHelper.setTextFieldValue(txtAlto, "");
					ElementosHelper.setTextFieldValue(txtFondo, "");
					ElementosHelper.setTextFieldValue(txtQuemadores, "");

					return;
				}
				
				ElementosHelper.setTextFieldValue(txtPrecio, cocina.getPrecio());
				ElementosHelper.setTextFieldValue(txtAncho, cocina.getAncho());
				ElementosHelper.setTextFieldValue(txtAlto, cocina.getAlto());
				ElementosHelper.setTextFieldValue(txtFondo, cocina.getFondo());
				ElementosHelper.setTextFieldValue(txtQuemadores, cocina.getQuemadores());
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
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(333, 7, 105, 27);
		getContentPane().add(btnCerrar);

	}
}
