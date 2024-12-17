package infrastructure.core.models.Reporte;

import java.math.BigDecimal;

public class DatosReporteVentasPrecioPromedio {
    private String Modelo;
    private BigDecimal Precio;

    public DatosReporteVentasPrecioPromedio(String modelo, BigDecimal precio) {
        super();
        this.Modelo = modelo;
        this.Precio = precio;
    }

    public DatosReporteVentasPrecioPromedio(String modelo, Double precio) {
        super();
        this.Modelo = modelo;
        this.Precio = new BigDecimal(precio);
    }

    public String getModelo() {
        return this.Modelo;
    }

    public String getPrecio(BigDecimal precioPromedio) {
        if (this.Precio.compareTo(precioPromedio) > 0) {
            return "S/ " + this.Precio + "(Mayor al promedio)";
        }
        else if (this.Precio.compareTo(precioPromedio) < 0) {
            return "S/ " + this.Precio + "(Menor al promedio)";
        }
        else {
            return "S/ " + this.Precio + "(Igual al promedio)";
        }
    }
}
