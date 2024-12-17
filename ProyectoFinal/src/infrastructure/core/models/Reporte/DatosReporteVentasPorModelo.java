package infrastructure.core.models.Reporte;

import java.math.BigDecimal;

public class DatosReporteVentasPorModelo {
    private String Modelo;
    private Integer CantidadVentas;
    private Integer CantidadUnidadesVendidas;
    private BigDecimal ImporteTotalVendido;

    public DatosReporteVentasPorModelo(String modelo) {
        super();
        this.Modelo = modelo;
        this.CantidadVentas = 0;
        this.CantidadUnidadesVendidas = 0;
        this.ImporteTotalVendido = new BigDecimal(0);
    }

    public void addCantidadVentas(Integer cantidadVentas) {
        this.CantidadVentas += cantidadVentas;
    }

    public void addCantidadUnidadesVendidas(Integer unidadesVendidas) {
        this.CantidadUnidadesVendidas += unidadesVendidas;
    }

    public void addImporteTotalVendido(Double importeTotalVendido) {
        this.ImporteTotalVendido = ImporteTotalVendido.add(new BigDecimal(importeTotalVendido));
    }

    public void addImporteTotalVendido(BigDecimal importeTotalVendido) {
        this.ImporteTotalVendido = ImporteTotalVendido.add(importeTotalVendido);
    }

    public String getModelo() {
        return this.Modelo;
    }

    public Integer getCantidadVentas() {
        return this.CantidadVentas;
    }

    public Integer getCantidadUnidadesVendidas() {
        return this.CantidadUnidadesVendidas;
    }

    public BigDecimal getImporteTotalVendido() {
        return this.ImporteTotalVendido;
    }

    public BigDecimal getAporteCuotaDiaria(BigDecimal cuotaDiariaVentas) {
        if (this.ImporteTotalVendido.compareTo(new BigDecimal(0)) == 0) {
            return new BigDecimal(0);
        }
        return getImporteTotalVendido().divide(cuotaDiariaVentas);
    }
}
