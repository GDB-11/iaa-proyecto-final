package proyectofinal;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import application.core.interfaces.IConfiguracion;
import proyectofinal.helpers.ElementosHelper;
import proyectofinal.helpers.MathHelper;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;

public class ConfigurarCuotaDiariaDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtCuotaDiaria;

	/**
	 * Create the dialog.
	 */
	public ConfigurarCuotaDiariaDialog(IConfiguracion configuracion) {
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 481, 150);
		getContentPane().setLayout(null);
		
		JLabel lblCuotaDiariaEsperada = new JLabel("Cuota diaria esperada (S/)");
		lblCuotaDiariaEsperada.setBounds(12, 12, 165, 17);
		getContentPane().add(lblCuotaDiariaEsperada);
		
		txtCuotaDiaria = new JTextField();
		txtCuotaDiaria.setBounds(195, 10, 140, 21);
		getContentPane().add(txtCuotaDiaria);
		txtCuotaDiaria.setColumns(10);
		txtCuotaDiaria.setText(MathHelper.formatDecimal(configuracion.obtenerCuotaDiariaVentas()));
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DECLARACIÓN DE VARIABLES LOCALES
				Double cuotaDiaria;

				//ENTRADA DE DATOS
				cuotaDiaria = MathHelper.parseToDouble(txtCuotaDiaria.getText());

				//PROCESO
				configuracion.cambiarCuotaDiariaVentas(cuotaDiaria);

				dispose();
			}
		});
		btnAceptar.setBounds(360, 7, 105, 27);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(360, 46, 105, 27);
		getContentPane().add(btnCancelar);

	}
}
