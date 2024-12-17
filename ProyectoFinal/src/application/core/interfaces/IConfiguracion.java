package application.core.interfaces;

import java.math.BigDecimal;

public interface IConfiguracion {
    public BigDecimal obtenerDescuento(Integer cantidad);
    public String obtenerObsequio(Integer cantidad);
    public Integer obtenerCantidadOptimaVentas();
    public BigDecimal obtenerCuotaDiariaVentas();
    public void cambiarCantidadOptimaVentas(Integer nuevaCantidadOptimaVentas);
    public void cambiarCuotaDiariaVentas(Double nuevaCuotaDiariaVentas);
    public BigDecimal obtenerPrimerDescuento();
    public BigDecimal obtenerSegundoDescuento();
    public BigDecimal obtenerTercerDescuento();
    public BigDecimal obtenerCuartoDescuento();
    public void cambiarPrimerDescuento(BigDecimal valor);
    public void cambiarSegundoDescuento(BigDecimal valor);
    public void cambiarTercerDescuento(BigDecimal valor);
    public void cambiarCuartoDescuento(BigDecimal valor);
    public String obtenerPrimerObsequio();
    public String obtenerSegundoObsequio();
    public String obtenerTercerObsequio();
    public void cambiarPrimerObsequio(String obsequio);
    public void cambiarSegundoObsequio(String obsequio);
    public void cambiarTercerObsequio(String obsequio);
}
