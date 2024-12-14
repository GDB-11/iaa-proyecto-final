package infrastructure.core.models;

import java.math.BigDecimal;

public class Venta {
    private String Modelo;
    private BigDecimal PrecioUnitario;
    private BigDecimal ImporteDescuento;
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

    public void setImporteDescuento(BigDecimal importeDescuento) {
        this.ImporteDescuento = importeDescuento;
    }

    public void setImporteDescuento(Double importeDescuento) {
        this.ImporteDescuento = new BigDecimal(importeDescuento);
    }

    public String getModelo() {
        return this.Modelo;
    }

    public BigDecimal getPrecioUnitario() {
        return this.PrecioUnitario;
    }

    public BigDecimal getImporteDescuento() {
        return this.ImporteDescuento;
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
        return getImporteTotal().subtract(ImporteDescuento);
    }
}
