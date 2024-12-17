package infrastructure.core.models;

import java.math.BigDecimal;

public class ConfiguracionVenta {
    private Integer CantidadOptimaVentas;
    private BigDecimal CuotaDiariaVentas;

    public ConfiguracionVenta(Integer cantidadOptimaVentas, BigDecimal cuotaDiariaVentas) {
        super();
        this.CantidadOptimaVentas = cantidadOptimaVentas;
        this.CuotaDiariaVentas = cuotaDiariaVentas;
    }

    public ConfiguracionVenta(Integer cantidadOptimaVentas, Double cuotaDiariaVentas) {
        super();
        this.CantidadOptimaVentas = cantidadOptimaVentas;
        this.CuotaDiariaVentas = new BigDecimal(cuotaDiariaVentas);
    }

    public void setCantidadOptimaVentas(Integer cantidadOptimaVentas) {
        this.CantidadOptimaVentas = cantidadOptimaVentas;
    }

    public void setCuotaDiariaVentas(Double cuotaDiariaVentas) {
        this.CuotaDiariaVentas = new BigDecimal(cuotaDiariaVentas);
    }

    public Integer getCantidadOptimaVentas() {
        return this.CantidadOptimaVentas;
    }

    public BigDecimal getCuotaDiariaVentas() {
        return this.CuotaDiariaVentas;
    }
}