package infrastructure.core.models.Reporte;

import java.math.BigDecimal;

public class DatosReportePromediosMayoresMenores {
    private BigDecimal PrecioPromedio;
    private BigDecimal PrecioMayor;
    private BigDecimal PrecioMenor;
    private Double AnchoPromedio;
    private Double AnchoMayor;
    private Double AnchoMenor;

    public DatosReportePromediosMayoresMenores(BigDecimal precioPromedio, BigDecimal precioMayor, BigDecimal precioMenor, Double anchoPromedio, Double anchoMayor, Double anchoMenor) {
        super();
        this.PrecioPromedio = precioPromedio;
        this.PrecioMayor = precioMayor;
        this.PrecioMenor = precioMenor;
        this.AnchoPromedio = anchoPromedio;
        this.AnchoMayor = anchoMayor;
        this.AnchoMenor = anchoMenor;
    }

    public BigDecimal getPrecioPromedio() {
        return this.PrecioPromedio;
    }

    public BigDecimal getPrecioMayor() {
        return this.PrecioMayor;
    }

    public BigDecimal getPrecioMenor() {
        return this.PrecioMenor;
    }

    public Double getAnchoPromedio() {
        return this.AnchoPromedio;
    }

    public Double getAnchoMayor() {
        return this.AnchoMayor;
    }

    public Double getAnchoMenor() {
        return this.AnchoMenor;
    }
}
