package proyectofinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import application.core.interfaces.IConfiguracion;
import application.core.interfaces.IOperacionesCocina;
import application.core.interfaces.IVentas;
import infrastructure.core.models.Reporte.DatosReportePromediosMayoresMenores;
import infrastructure.core.models.Reporte.DatosReporteVentasPorModelo;
import infrastructure.core.models.Reporte.DatosReporteVentasPrecioPromedio;
import infrastructure.core.models.Reporte.DatosReporteVentasVentaOptima;
import proyectofinal.helpers.MathHelper;

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
	 * Create the dialog.
	 */
	public GenerarReporteDialog(IVentas ventas, IConfiguracion configuracion, IOperacionesCocina operacionesCocina) {
		setTitle("Generar Reportes");
		setBounds(100, 100, 625, 399);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Reporte ");
		lblNewLabel.setBounds(31, 46, 111, 14);
		getContentPane().add(lblNewLabel);
		
		JComboBox cbTipoReporte = new JComboBox();
		cbTipoReporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//VARIABLES LOCALES
				List<DatosReporteVentasPorModelo> datosReporteVentasPorModelo;
				List<DatosReporteVentasVentaOptima> datosReporteVentasVentaOptima;
				List<DatosReporteVentasPrecioPromedio> datosReporteVentasPrecioPromedio;
				DatosReportePromediosMayoresMenores datosReportePromediosMayoresMenores;
				String reporte;
				
				//ENTRADA DE DATOS
				reporte = cbTipoReporte.getSelectedItem().toString();
				
				//IMPRIMIR RESULTADOS
				if (reporte.equals("[--Seleccione--]")) {
				    textArea.setText("Por favor, seleccione un tipo de reporte.");
				
				}else if (reporte == reporteinicial) {
					datosReporteVentasPorModelo = ventas.obtenerDatosReporteVentasPorModelo();
					textArea.setText("VENTAS POR MODELO" + "\n\n");

					for (int i = 0; i < datosReporteVentasPorModelo.size(); i++) {
						DatosReporteVentasPorModelo datos = datosReporteVentasPorModelo.get(i);

						textArea.append("Modelo\t\t: " + datos.getModelo() + "\n");
						textArea.append("Cantidad de Ventas\t: " + datos.getCantidadVentas() + "\n");
						textArea.append("Cantidad de Unidades Vendidas: " + datos.getCantidadUnidadesVendidas() + "\n");
						textArea.append("Importe total Vendido\t: S/ " + MathHelper.formatDecimal(datos.getImporteTotalVendido()) + "\n");
						textArea.append("Aporte a la Cuota Diaria\t: " + MathHelper.formatPercentage(datos.getAporteCuotaDiaria(configuracion.obtenerCuotaDiariaVentas())) + "\n\n");
					}
				}else if (reporte == ventasoptimas){
					datosReporteVentasVentaOptima = ventas.obtenerDatosReporteVentasVentaOptima();
					textArea.setText("VENTAS EN RELACION A LA VENTA OPTIMA" + "\n\n");

					for (int i = 0; i < datosReporteVentasVentaOptima.size(); i++) {
						DatosReporteVentasVentaOptima datos = datosReporteVentasVentaOptima.get(i);

						textArea.append("Modelo\t\t: " + datos.getModelo() + "\n");
						textArea.append("Cantidad de Unidades vendidas: " + datos.getCantidadVentas(configuracion.obtenerCantidadOptimaVentas())+ "\n\n");
					}
				}else if (reporte == preciopromedio) {
					datosReporteVentasPrecioPromedio = ventas.obtenerDatosReporteVentasPrecioPromedio();
					textArea.setText("PRECIOS EN RELACIÓN AL PRECIO PROMEDIO" + "\n\n");

					for (int i = 0; i < datosReporteVentasPrecioPromedio.size(); i++) {
						DatosReporteVentasPrecioPromedio datos = datosReporteVentasPrecioPromedio.get(i);

						textArea.append("Modelo\t: " + datos.getModelo() + "\n");
						textArea.append("Precio\t: " + datos.getPrecio(operacionesCocina.obtenerPrecioPromedio()) + "\n\n");
					}
					
				}else if (reporte == promediosmn) {
					datosReportePromediosMayoresMenores = ventas.obtenerDatosReportePromediosMayoresMenores();

					textArea.setText("PROMEDIOS, MENORES Y MAYORES" + "\n\n");
					textArea.append("Precio Promedio\t: S/ " + datosReportePromediosMayoresMenores.getPrecioPromedio() + "\n");
					textArea.append("Precio menor\t\t: S/ " + datosReportePromediosMayoresMenores.getPrecioMenor() + "\n");
					textArea.append("Precio mayor\t\t: S/ " + datosReportePromediosMayoresMenores.getPrecioMayor() + "\n\n");					
					textArea.append("Ancho Promedio\t: " + datosReportePromediosMayoresMenores.getAnchoPromedio() + "\n");
					textArea.append("Ancho menor\t\t: " + datosReportePromediosMayoresMenores.getAnchoMenor() + "\n");
					textArea.append("Ancho mayor\t\t: " + datosReportePromediosMayoresMenores.getAnchoMayor());
					
				}
				
			}
		});
		cbTipoReporte.setModel(new DefaultComboBoxModel(new String[] {"[--Seleccione--]", "Ventas por modelo", "Ventas en relacion a la venta optima", "Precios en relacion al precio promedio", "Promedios, menores y mayores"}));
		cbTipoReporte.setBounds(152, 42, 290, 22);
		getContentPane().add(cbTipoReporte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 98, 591, 251);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton.setBounds(502, 42, 111, 23);
		getContentPane().add(btnNewButton);

	}
}
