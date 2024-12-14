package infrastructure.core.models;

import java.math.BigDecimal;

public class Cocina {
    private String Modelo;
    private BigDecimal Precio;
    private Double Fondo;
    private Double Ancho;
    private Double Alto;
    private Integer Quemadores;

    public Cocina(String modelo, BigDecimal precio, double fondo, double ancho, double alto, int quemadores) {
        super();
        this.Modelo = modelo;
        this.Precio = precio;
        this.Fondo = fondo;
        this.Ancho = ancho;
        this.Alto = alto;
        this.Quemadores = quemadores;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public BigDecimal getPrecio() {
        return this.Precio;
    }

    public Double getFondo() {
        return this.Fondo;
    }

    public Double getAncho() {
        return this.Ancho;
    }

    public Double getAlto() {
        return this.Alto;
    }

    public Integer getQuemadores() {
        return this.Quemadores;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.Precio = new BigDecimal(precio);
    }

    public void setFondo(Double fondo) {
        this.Fondo = fondo;
    }

    public void setAncho(Double ancho) {
        this.Ancho = ancho;
    }

    public void setAlto(Double alto) {
        this.Alto = alto;
    }

    public void setQuemadores(Integer quemadores) {
        this.Quemadores = quemadores;
    }
}
