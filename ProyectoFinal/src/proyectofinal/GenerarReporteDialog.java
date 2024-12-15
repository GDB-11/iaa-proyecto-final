package proyectofinal;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenerarReporteDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	
	//VENTAS POR MODELO
	private String reporteinicial = "Ventas por modelo";
		
	
	//VENTAS EN RELACION A LA VENTA OPTIMA
	private String ventasoptimas = "Ventas en relacion a la venta optima";

	
	//PRECIO EN RELACION AL PRECIO PROMEDIO
	private String preciopromedio = "Precios en relacion al precio promedio";		

	
	//PROMEDIOS MAYORES Y MENORES
	private String promediosmn = "Promedios, menores y mayores";
		
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReporteDialog dialog = new GenerarReporteDialog();
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
	public GenerarReporteDialog() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 536, 399);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Reporte ");
		lblNewLabel.setBounds(31, 46, 111, 14);
		getContentPane().add(lblNewLabel);
		
		JComboBox cbTipoReporte = new JComboBox();
		cbTipoReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VARIABLES LOCALES
				String reporte;
				
				//ENTRADA DE DATOS
				reporte = cbTipoReporte.getSelectedItem().toString();
				
				//IMPRIMIR RESULTADOS
				
				if (reporte.equals("[--Seleccione--]")) {
				    textArea.setText("Por favor, seleccione un tipo de reporte.");
				
				}else if (reporte == reporteinicial) {
					
					textArea.setText("VENTAS POR MODELO" + "\n\n");
					textArea.append("Modelo			: Mabe EMP6120PG0 " + "\n");
					textArea.append("Cantidad de Ventas		:  " + "\n");
					textArea.append("Cantidad de Unidades Vendidas	:  " + "\n");
					textArea.append("Importe total Vendido		:  " + "\n");
					textArea.append("Aporte a la Cuota Diaria		:  " + "\n\n");
					
					textArea.append("Modelo			: Indurama Parma " + "\n");
					textArea.append("Cantidad de Ventas		:  " + "\n");
					textArea.append("Cantidad de Unidades Vendidas	:  " + "\n");
					textArea.append("Importe total Vendido		:  " + "\n");
					textArea.append("Aporte a la Cuota Diaria		:  " + "\n\n");
					
					textArea.append("Modelo			: Sole COSOL027 " + "\n");
					textArea.append("Cantidad de Ventas		:  " + "\n");
					textArea.append("Cantidad de Unidades Vendidas	:  " + "\n");
					textArea.append("Importe total Vendido		:  " + "\n");
					textArea.append("Aporte a la Cuota Diaria		:  " + "\n\n");
					
					textArea.append("Modelo			: Coldex CX602 " + "\n");
					textArea.append("Cantidad de Ventas		:  " + "\n");
					textArea.append("Cantidad de Unidades Vendidas	:  " + "\n");
					textArea.append("Importe total Vendido		:  " + "\n");
					textArea.append("Aporte a la Cuota Diaria		:  " + "\n\n");
					
					textArea.append("Modelo			: Reco Dakota " + "\n");
					textArea.append("Cantidad de Ventas		:  " + "\n");
					textArea.append("Cantidad de Unidades Vendidas	:  " + "\n");
					textArea.append("Importe total Vendido		:  " + "\n");
					textArea.append("Aporte a la Cuota Diaria		:  " + "\n");


					
				}else if (reporte == ventasoptimas){
					
					textArea.setText("VENTAS EN RELACION A LA VENTA OPTIMA" + "\n\n");
					textArea.append("Modelo			: Mabe EMP6120PG0 " + "\n");
					textArea.append("Cantidad de Unidades vendidas	:  " + "\n\n");
					
					textArea.append("Modelo			: Indurama Parma " + "\n");
					textArea.append("Cantidad de Unidades vendidas	:  " + "\n\n");
					
					textArea.append("Modelo			: Sole COSOL027 " + "\n");
					textArea.append("Cantidad de Unidades vendidas	:  " + "\n\n");
					
					textArea.append("Modelo			: Coldex CX602 " + "\n");
					textArea.append("Cantidad de Unidades vendidas	:  " + "\n\n");
					
					textArea.append("Modelo			: Reco Dakota " + "\n");
					textArea.append("Cantidad de Unidades vendidas	:  " + "\n");		
					
					
				}else if (reporte == preciopromedio) {
					
					textArea.setText("PRECIOS EN RELACIÓN AL PRECIO PROMEDIO" + "\n\n");
					textArea.append("Modelo		: Mabe EMP6120PG0 " + "\n");
					textArea.append("Precio		:  " + "\n\n");
					
					textArea.append("Modelo		: Indurama Parma " + "\n");
					textArea.append("Precio		:  " + "\n\n");
					
					textArea.append("Modelo		: Sole COSOL027 " + "\n");
					textArea.append("Precio		:  " + "\n\n");
					
					textArea.append("Modelo		: Coldex CX602 " + "\n");
					textArea.append("Precio		:  " + "\n\n");
					
					textArea.append("Modelo		: Reco Dakota " + "\n");
					textArea.append("Precio		:  " + "\n");		
					
					
				}else if (reporte == promediosmn) {
					
					textArea.setText("PROMEDIOS, MENORES Y MAYORES" + "\n\n");
					textArea.append("Precio Promedio	:" + "\n");
					textArea.append("Precio menor		:  " + "\n");
					textArea.append("Precio mayor		:" + "\n\n");
					
					textArea.append("Ancho Promedio	:  " + "\n");
					textArea.append("Ancho menor		:" + "\n");
					textArea.append("Ancho mayor		:  " + "\n\n");
					
				}
				
			}
		});
		cbTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"[--Seleccione--]", "Ventas por modelo", "Ventas en relacion a la venta optima", "Precios en relacion al precio promedio", "Promedios, menores y mayores"}));
		cbTipoReporte.setBounds(152, 42, 175, 22);
		getContentPane().add(cbTipoReporte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 98, 471, 251);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton.setBounds(382, 42, 111, 23);
		getContentPane().add(btnNewButton);

	}
}
