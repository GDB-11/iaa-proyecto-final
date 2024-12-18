package proyectofinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import application.core.interfaces.IOperacionesCocina;
import infrastructure.core.models.Cocina;
import proyectofinal.helpers.ElementosHelper;


public class ModificarCocinaDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;

	/**
	 * Create the dialog.
	 */
	public ModificarCocinaDialog(IOperacionesCocina operacionesCocina) {		
		setTitle("Modificar cocina");
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
				/*
				if (cocina == null) {
					ElementosHelper.setTextFieldValue(txtPrecio, "");
					ElementosHelper.setTextFieldValue(txtAncho, "");
					ElementosHelper.setTextFieldValue(txtAlto, "");
					ElementosHelper.setTextFieldValue(txtFondo, "");
					ElementosHelper.setTextFieldValue(txtQuemadores, "");

					return;
				}
				*/
				
				ElementosHelper.setTextFieldValue(txtPrecio, cocina.getPrecio());
				ElementosHelper.setTextFieldValue(txtAncho, cocina.getAncho());
				ElementosHelper.setTextFieldValue(txtAlto, cocina.getAlto());
				ElementosHelper.setTextFieldValue(txtFondo, cocina.getFondo());
				ElementosHelper.setTextFieldValue(txtQuemadores, cocina.getQuemadores());
			}
		});
		//comboxModelo.setModel(new DefaultComboBoxModel(new String[] {"[--Seleccione--]", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboxModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboxModelo.setBounds(110, 7, 142, 26);
		getContentPane().add(comboxModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(110, 39, 142, 21);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setBounds(110, 68, 142, 21);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setBounds(110, 97, 142, 21);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setBounds(110, 126, 142, 21);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setBounds(110, 155, 142, 21);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);
		
		// Establecer por defecto primer valor de cocina
		Cocina primeraCocina = operacionesCocina.listarCocinas().getFirst();	
		ElementosHelper.setTextFieldValue(txtPrecio, primeraCocina.getPrecio());
		ElementosHelper.setTextFieldValue(txtAncho, primeraCocina.getAncho());
		ElementosHelper.setTextFieldValue(txtAlto, primeraCocina.getAlto());
		ElementosHelper.setTextFieldValue(txtFondo, primeraCocina.getFondo());
		ElementosHelper.setTextFieldValue(txtQuemadores, primeraCocina.getQuemadores());
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(300, 7, 105, 27);
		getContentPane().add(btnCerrar);
		
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String modelo;
				Double precio;
				Double fondo;
				Double ancho;
				Double alto;
				Integer quemadores;
				Cocina cocinaAModificar;
				
				modelo = ElementosHelper.getComboboxTexto(comboxModelo);
				cocinaAModificar = operacionesCocina.obtenerCocina(modelo);
				precio = ElementosHelper.getTextFieldDblValue(txtPrecio);
				ancho = ElementosHelper.getTextFieldDblValue(txtAncho);
				alto = ElementosHelper.getTextFieldDblValue(txtAlto);
				fondo = ElementosHelper.getTextFieldDblValue(txtFondo);
				quemadores = ElementosHelper.getTextFieldIntValue(txtQuemadores);
				
				actualizarDatos(cocinaAModificar, precio, ancho, alto, fondo, quemadores);
				dispose();
			}
		});
		btnGrabar.setBounds(300, 40, 105, 27);
		getContentPane().add(btnGrabar);
	}
	
	void actualizarDatos(Cocina cocinaAModificar, Double precio, Double ancho, Double alto, Double fondo, Integer quemadores){
		cocinaAModificar.setPrecio(precio);
		cocinaAModificar.setAncho(ancho);
		cocinaAModificar.setAlto(alto);
		cocinaAModificar.setFondo(fondo);
		cocinaAModificar.setQuemadores(quemadores);
	}

}
