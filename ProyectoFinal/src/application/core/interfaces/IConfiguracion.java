package application.core.interfaces;

import java.math.BigDecimal;

public interface IConfiguracion {
    public BigDecimal obtenerDescuento(Integer cantidad);
    public String obtenerObsequio(Integer cantidad);
    public Integer obtenerCantidadOptimaVentas();
    public BigDecimal obtenerCuotaDiariaVentas();
    public void cambiarCantidadOptimaVentas(Integer nuevaCantidadOptimaVentas);
    public void cambiarCuotaDiariaVentas(Double nuevaCuotaDiariaVentas);
}
