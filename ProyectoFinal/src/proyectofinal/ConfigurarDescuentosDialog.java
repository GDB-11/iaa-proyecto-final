package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarDescuentosDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField tf1a5;
	private JTextField tf6a10;
	private JTextField tf11a15;
	private JTextField tf15mas;
	
	//PORCENTAJES DE DESCUENTOS
	private Double porcentaje1 = 7.5;
	private Double porcentaje2 = 10.0;
	private Double porcentaje3 = 12.5;
	private Double porcentaje4 = 15.0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuentosDialog dialog = new ConfigurarDescuentosDialog();
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
	public ConfigurarDescuentosDialog() {
		setTitle("Configurar Porcentajes de  Descuentos");
		setBounds(100, 100, 560, 255);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(25, 29, 117, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("6 a 10 unidades");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(25, 70, 117, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("11 a 15 unidades");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(25, 109, 117, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mas de 15 unidades");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(25, 157, 117, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(277, 29, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(277, 70, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(277, 109, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(277, 157, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		tf1a5 = new JTextField();
		tf1a5.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf1a5.setBounds(152, 26, 115, 20);
		getContentPane().add(tf1a5);
		tf1a5.setColumns(10);
		tf1a5.setText(porcentaje1.toString()); 
		
		tf6a10 = new JTextField();
		tf6a10.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf6a10.setBounds(152, 67, 115, 20);
		getContentPane().add(tf6a10);
		tf6a10.setColumns(10);
		tf6a10.setText(porcentaje2.toString());
		
		tf11a15 = new JTextField();
		tf11a15.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf11a15.setBounds(152, 106, 115, 20);
		getContentPane().add(tf11a15);
		tf11a15.setColumns(10);
		tf11a15.setText(porcentaje3.toString()); 
		
		tf15mas = new JTextField();
		tf15mas.setFont(new Font("Tahoma", Font.BOLD, 12));
		tf15mas.setBounds(152, 154, 115, 20);
		getContentPane().add(tf15mas);
		tf15mas.setColumns(10);
		tf15mas.setText(porcentaje4.toString()); 
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(394, 25, 110, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(394, 77, 110, 23);
		getContentPane().add(btnNewButton_1);

	}
}
