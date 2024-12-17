package application.core.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import application.core.interfaces.IConfiguracion;
import infrastructure.core.models.ConfiguracionVenta;
import infrastructure.core.models.Descuento;
import infrastructure.core.models.Obsequio;

public class Configuracion implements IConfiguracion {
    //DECLARACIÓN DE VARIABLES GLOBALES
    private ConfiguracionVenta configuracionVenta;
    private List<Descuento> descuentos = new ArrayList<Descuento>();
    private List<Obsequio> obsequios = new ArrayList<Obsequio>();

    public Configuracion() {
        super();
        //DECLARACIÓN DE VALORES INICIALES
        descuentos.add(new Descuento(1, 5, 0.075));
        descuentos.add(new Descuento(6, 10, 0.1));
        descuentos.add(new Descuento(11, 15, 0.125));
        descuentos.add(new Descuento(16, Integer.MAX_VALUE, 0.15));

        obsequios.add(new Obsequio(1, 1, "Cafetera"));
        obsequios.add(new Obsequio(2, 5, "Licuadora"));
        obsequios.add(new Obsequio(6, Integer.MAX_VALUE, "Extractor"));

        configuracionVenta = new ConfiguracionVenta(30, 75000D);
    }

    public BigDecimal obtenerDescuento(Integer cantidad) {
        for (int i = 0; i < descuentos.size(); i++) {
            Descuento descuento = descuentos.get(i);

            if (cantidad >= descuento.getCantidadMinima() && cantidad <= descuento.getCantidadMaxima()) {
                return descuento.getValor();
            }
        }

        return new BigDecimal(0);
    }

    public String obtenerObsequio(Integer cantidad) {
        for (int i = 0; i < obsequios.size(); i++) {
            Obsequio obsequio = obsequios.get(i);

            if (cantidad >= obsequio.getCantidadMinima() && cantidad <= obsequio.getCantidadMaxima()) {
                return obsequio.getNombreObsequio();
            }
        }

        return "";
    }

    public Integer obtenerCantidadOptimaVentas() {
        return configuracionVenta.getCantidadOptimaVentas();
    }

    public BigDecimal obtenerCuotaDiariaVentas() {
        return configuracionVenta.getCuotaDiariaVentas();
    }
}