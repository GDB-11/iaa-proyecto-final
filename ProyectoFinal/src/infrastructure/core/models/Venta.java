package infrastructure.core.models;

import java.math.BigDecimal;

public class Venta {
    private String Modelo;
    private BigDecimal PrecioUnitario;
    //private BigDecimal ImporteDescuento;
    private BigDecimal PorcentajeDescuento;
    private Integer Cantidad;
    private String Obsequio;

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.PrecioUnitario = precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.PrecioUnitario = new BigDecimal(precioUnitario);
    }

    public void setCantidad(Integer cantidad) {
        this.Cantidad = cantidad;
    }

    public void setObsequio(String obsequio) {
        this.Obsequio = obsequio;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.PorcentajeDescuento = porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.PorcentajeDescuento = new BigDecimal(porcentajeDescuento);
    }

    public String getModelo() {
        return this.Modelo;
    }

    public BigDecimal getPrecioUnitario() {
        return this.PrecioUnitario;
    }

    public BigDecimal getImporteDescuento() {
        return this.PrecioUnitario.multiply(this.PorcentajeDescuento);
    }

    public Integer getCantidad() {
        return this.Cantidad;
    }

    public String getObsequio() {
        return this.Obsequio;
    }

    public BigDecimal getImporteTotal() {
        return this.PrecioUnitario.multiply(new BigDecimal(this.Cantidad));
    }

    public BigDecimal getImportePagar() {
        return getImporteTotal().subtract(getImporteDescuento());
    }
}
