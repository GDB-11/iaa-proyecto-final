package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;

public class AcercaTiendaDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public AcercaTiendaDialog() {
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienda.setFont(new Font("Dialog", Font.BOLD, 24));
		lblTienda.setBounds(12, 12, 426, 41);
		getContentPane().add(lblTienda);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(99, 130, 191));
		separator.setBounds(12, 65, 426, 2);
		getContentPane().add(separator);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAutores.setBounds(12, 79, 426, 28);
		getContentPane().add(lblAutores);
		
		JLabel lblGianfrancoDazBadoino = new JLabel("Gianfranco Díaz Badoino");
		lblGianfrancoDazBadoino.setHorizontalAlignment(SwingConstants.CENTER);
		lblGianfrancoDazBadoino.setBounds(12, 119, 426, 17);
		getContentPane().add(lblGianfrancoDazBadoino);
		
		JLabel lblPabloJosuCuenca = new JLabel("Pablo Josué Cuenca Gutiérrez");
		lblPabloJosuCuenca.setHorizontalAlignment(SwingConstants.CENTER);
		lblPabloJosuCuenca.setBounds(12, 148, 426, 17);
		getContentPane().add(lblPabloJosuCuenca);
		
		JLabel lblFelicidadConchoyAragn = new JLabel("Felicidad Conchoy Aragón");
		lblFelicidadConchoyAragn.setHorizontalAlignment(SwingConstants.CENTER);
		lblFelicidadConchoyAragn.setBounds(12, 177, 426, 17);
		getContentPane().add(lblFelicidadConchoyAragn);
		
		JLabel lblJorgeZevallos = new JLabel("Jorge Zevallos");
		lblJorgeZevallos.setHorizontalAlignment(SwingConstants.CENTER);
		lblJorgeZevallos.setBounds(12, 206, 426, 17);
		getContentPane().add(lblJorgeZevallos);

	}
}
