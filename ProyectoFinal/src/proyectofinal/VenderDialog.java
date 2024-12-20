package proyectofinal;

import javax.swing.JDialog;

import application.core.interfaces.IOperacionesCocina;
import application.core.interfaces.IVentas;
import infrastructure.core.models.Cocina;
import infrastructure.core.models.Venta;
import proyectofinal.helpers.ElementosHelper;
import proyectofinal.helpers.MathHelper;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VenderDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;

	//DECLARACIÓN DE VARIABLES GLOBALES
	String cocinaSeleccionada;
	Cocina cocina;

	/**
	 * Create the dialog.
	 */
	public VenderDialog(IOperacionesCocina operacionesCocina, IVentas ventas) {
		setResizable(false);
		setTitle("Vender");
		setBounds(100, 100, 450, 428);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(12, 12, 60, 17);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(12, 41, 60, 17);
		getContentPane().add(lblPrecio);
		
		JComboBox comboxModelo = new JComboBox();
		comboxModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DECLARACIÓN DE VARIABLES LOCALES
				String nombreModelo;
				
				//ENTRADA DE DATOS
				nombreModelo = ElementosHelper.getComboboxTexto(comboxModelo);
				
				//PROCESO
				cocina = operacionesCocina.obtenerCocina(nombreModelo);

				if (cocina == null) {
					ElementosHelper.setTextFieldValue(txtPrecio, "");

					return;
				}

				//MOSTRAR RESULTADOS
				ElementosHelper.setTextFieldValue(txtPrecio, MathHelper.formatDecimal(cocina.getPrecio()));
			}
		});
		comboxModelo.setModel(new DefaultComboBoxModel(new String[] {"[--Seleccione--]", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		comboxModelo.setBounds(90, 7, 156, 26);
		getContentPane().add(comboxModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(90, 39, 156, 21);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 105, 426, 283);
		getContentPane().add(scrollPane);
		
		JTextArea textAreaOutput = new JTextArea();
		textAreaOutput.setEditable(false);
		scrollPane.setViewportView(textAreaOutput);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DECLARACIÓN DE VARIABLES LOCALES
				Venta venta;
				int cantidadVendida;
				//BigDecimal importeCompra = new BigDecimal(0);

				//ENTRADA DE DATOS
				cantidadVendida = ElementosHelper.getTextFieldIntValue(txtCantidad);				

				//PROCESO
				if (ElementosHelper.getComboboxSelectedIndex(comboxModelo) < 1) {
					ElementosHelper.setTextAreaNewValue(textAreaOutput, "Debe seleccionar una cocina para continuar.");
					return;
				}
				if (cantidadVendida < 1) {
					ElementosHelper.setTextAreaNewValue(textAreaOutput, "Debe ingresar un número entero mayor que cero.");
					return;
				}

				venta = ventas.agregarVenta(cocina.getModelo(), cocina.getPrecio(), cantidadVendida);
				//importeCompra = importeCompra.add(cocina.getPrecio().multiply(new BigDecimal(cantidadVendida)));

				//MOSTRAR RESULTADOS
				ElementosHelper.setTextAreaNewValue(textAreaOutput, "BOLETA DE VENTA");
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Modelo\t\t: " + cocina.getModelo());
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Precio \t\t: S/ " + MathHelper.formatDecimal(cocina.getPrecio()));
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Cantidad\t\t: " + cantidadVendida);
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Importe compra\t: S/ " + MathHelper.formatDecimal(venta.getImporteTotal()));
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Importe descuento\t: S/ " + MathHelper.formatDecimal(venta.getImporteDescuento()));
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Importe pagar\t\t: S/ " + MathHelper.formatDecimal(venta.getImportePagar()));
				ElementosHelper.printTextAreaNewLine(textAreaOutput, "Obsequio\t\t: " + venta.getObsequio());

				AvanceVentasDialog avanceVentasDialog = new AvanceVentasDialog(ventas.getCantidadVentas(), ventas.getImporteTotalGeneralAcumulado(), ventas.getAporteCuotaDiariaGeneral());
				avanceVentasDialog.setLocationRelativeTo(VenderDialog.this);
				avanceVentasDialog.setVisible(true);
			}
		});
		btnVender.setBounds(333, 7, 105, 27);
		getContentPane().add(btnVender);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(333, 36, 105, 27);
		getContentPane().add(btnCerrar);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(12, 70, 60, 17);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(90, 68, 156, 21);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

	}
}
