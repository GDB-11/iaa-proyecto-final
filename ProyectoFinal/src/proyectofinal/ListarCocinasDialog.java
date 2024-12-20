package proyectofinal;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

import application.core.interfaces.IOperacionesCocina;
import infrastructure.core.models.Cocina;
import proyectofinal.helpers.ElementosHelper;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ListarCocinasDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public ListarCocinasDialog(IOperacionesCocina operacionesCocina) {
		setTitle("Listar cocinas");
		setBounds(100, 100, 450, 333);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 203);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(259, 247, 89, 23);
		getContentPane().add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				ElementosHelper.printTextAreaNewLine(textArea, "LISTADO DE COCINAS" );
				ElementosHelper.printTextAreaNewLine(textArea, " " );
				
				List<Cocina> cocinas = operacionesCocina.listarCocinas();
				
				for (Integer i=0; i < cocinas.size(); i++) {
					Cocina cocina = cocinas.get(i);
					ElementosHelper.printTextAreaNewLine(textArea, "Modelo: " + cocina.getModelo());
					ElementosHelper.printTextAreaNewLine(textArea, "Precio: S/." + cocina.getPrecio());
					ElementosHelper.printTextAreaNewLine(textArea, "Profundidad: " + cocina.getFondo() + " cm");
					ElementosHelper.printTextAreaNewLine(textArea, "Alto: " + cocina.getAlto() + " cm");
					ElementosHelper.printTextAreaNewLine(textArea, "Ancho: " + cocina.getAncho() + " cm");
					ElementosHelper.printTextAreaNewLine(textArea, "Quemadores: " + cocina.getQuemadores());
					ElementosHelper.printTextAreaNewLine(textArea, " " );
				}
			}
		});
		btnListar.setBounds(85, 247, 89, 23);
		getContentPane().add(btnListar);

	}
}
