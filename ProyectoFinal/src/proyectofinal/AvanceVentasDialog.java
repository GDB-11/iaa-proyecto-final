package proyectofinal;

import javax.swing.*;

import proyectofinal.helpers.MathHelper;

import java.awt.*;
import java.math.BigDecimal;

public class AvanceVentasDialog extends JDialog {
    public AvanceVentasDialog(Integer cantidadVentas, 
    BigDecimal importeTotalGeneralAcumulado, 
    BigDecimal aporteCuotaDiariaGeneral) {
        super();
        setTitle("Avance de ventas");
        
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel iconLabel = new JLabel(UIManager.getIcon("OptionPane.informationIcon"));
        mainPanel.add(iconLabel, BorderLayout.WEST);
        
        JPanel infoPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        
        JLabel ventaLabel = new JLabel("Venta Nro. " + cantidadVentas);
        JLabel importeLabel = new JLabel("Importe total general acumulado: S/ " + MathHelper.formatDecimal(importeTotalGeneralAcumulado));
        JLabel porcentajeLabel = new JLabel("Porcentaje de la cuota diaria: " + MathHelper.formatPercentage(aporteCuotaDiariaGeneral));
        
        infoPanel.add(ventaLabel);
        infoPanel.add(importeLabel);
        infoPanel.add(porcentajeLabel);
        
        mainPanel.add(infoPanel, BorderLayout.CENTER);
        
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
