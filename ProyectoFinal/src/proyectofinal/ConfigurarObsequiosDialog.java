package proyectofinal;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import application.core.interfaces.IConfiguracion;
import proyectofinal.helpers.ElementosHelper;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequiosDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txt1Unidad;
	private JTextField txt1a5Unidades;
	private JTextField txt6aMasUnidades;

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequiosDialog(IConfiguracion configuracion) {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 158);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1 unidad");
		lblNewLabel.setBounds(21, 22, 97, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2 a 5 unidades");
		lblNewLabel_1.setBounds(21, 47, 105, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("6 a mas unidades");
		lblNewLabel_2.setBounds(21, 72, 105, 14);
		getContentPane().add(lblNewLabel_2);
		
		txt1Unidad = new JTextField();
		txt1Unidad.setBounds(136, 19, 86, 20);
		getContentPane().add(txt1Unidad);
		txt1Unidad.setColumns(10);
		txt1Unidad.setText(configuracion.obtenerPrimerObsequio());
		
		txt1a5Unidades = new JTextField();
		txt1a5Unidades.setBounds(136, 44, 86, 20);
		getContentPane().add(txt1a5Unidades);
		txt1a5Unidades.setColumns(10);
		txt1a5Unidades.setText(configuracion.obtenerSegundoObsequio());
		
		txt6aMasUnidades = new JTextField();
		txt6aMasUnidades.setBounds(136, 69, 86, 20);
		getContentPane().add(txt6aMasUnidades);
		txt6aMasUnidades.setColumns(10);
		txt6aMasUnidades.setText(configuracion.obtenerTercerObsequio());
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DECLARACIÓN DE VARIABLES LOCALES
				String obsequio1;
				String obsequio2;
				String obsequio3;

				//ENTRADA DE DATOS
				obsequio1 = ElementosHelper.getTextFieldValue(txt1Unidad);
				obsequio2 = ElementosHelper.getTextFieldValue(txt1a5Unidades);
				obsequio3 = ElementosHelper.getTextFieldValue(txt6aMasUnidades);

				//PROCESO
				configuracion.cambiarPrimerObsequio(obsequio1);
				configuracion.cambiarSegundoObsequio(obsequio2);
				configuracion.cambiarTercerObsequio(obsequio3);
				
				dispose();
			}
		});
		btnNewButton.setBounds(314, 18, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(314, 47, 89, 23);
		getContentPane().add(btnNewButton_1);

	}
}
