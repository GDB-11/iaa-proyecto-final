package dados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class DadosWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosWindow frame = new DadosWindow();
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
	public DadosWindow() {
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
				Integer valor;
				
				do {
					valor = generateRandomNumber();
					textAreaOutput.append(valor.toString() + "\n");
				} while(valor < 6);
			}
		});
		btnLanzar.setBounds(170, 12, 105, 27);
		contentPane.add(btnLanzar);
	}
	
	public static int generateRandomNumber() {
		Random random = new Random();
		return random.nextInt(6) + 1;		
	}
}
