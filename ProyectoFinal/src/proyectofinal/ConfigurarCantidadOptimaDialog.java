package proyectofinal;

import javax.swing.JDialog;

import application.core.interfaces.IConfiguracion;
import proyectofinal.helpers.ElementosHelper;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ConfigurarCantidadOptimaDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtCantidadOptima;

	/**
	 * Create the dialog.
	 */
	public ConfigurarCantidadOptimaDialog(IConfiguracion configuracion) {
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 600, 125);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad óptima de unidades vendidas");
		lblNewLabel.setBounds(12, 12, 243, 17);
		getContentPane().add(lblNewLabel);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(273, 10, 114, 21);
		getContentPane().add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);

		JLabel lblError = new JLabel("");
		lblError.setForeground(new Color(224, 27, 36));
		lblError.setBounds(12, 46, 453, 17);
		getContentPane().add(lblError);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setText("");
				//DECLARACIÓN DE VARIABLES LOCALES
				Integer nuevaCantidadOptima;
				
				//ENTRADA DE DATOS
				nuevaCantidadOptima = ElementosHelper.getTextFieldIntValue(txtCantidadOptima);

				if (nuevaCantidadOptima <= 0) {
					lblError.setText("Debe ingresar un número entero mayor a 0.");
					return;
				}
				
				//PROCESO
				configuracion.cambiarCantidadOptimaVentas(nuevaCantidadOptima);

				dispose();
			}
		});
		btnAceptar.setBounds(483, 2, 105, 27);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(483, 41, 105, 27);
		getContentPane().add(btnCancelar);
	}
}
