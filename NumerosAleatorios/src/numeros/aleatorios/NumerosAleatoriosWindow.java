package numeros.aleatorios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class NumerosAleatoriosWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumerosAleatoriosWindow frame = new NumerosAleatoriosWindow();
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
	public NumerosAleatoriosWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 63, 426, 197);
		contentPane.add(scrollPane);
		
		JTextArea textAreaOutput = new JTextArea();
		scrollPane.setViewportView(textAreaOutput);
		
		JButton btnLanzar = new JButton("Lanzar");
		btnLanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecureRandom secureRandom = new SecureRandom();
				Integer valor;
				
				textAreaOutput.setText("");
				do {
					valor = secureRandom.nextInt(61) + 10;
					textAreaOutput.append(valor.toString() + "\n");
				} while((valor % 2 != 0) || (valor <= 35 || valor >= 45));
			}
		});
		btnLanzar.setBounds(170, 12, 105, 27);
		contentPane.add(btnLanzar);
	}
}
