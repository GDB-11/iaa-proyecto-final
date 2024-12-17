package infrastructure.core.models.Reporte;

public class DatosReporteVentasVentaOptima {
    private String Modelo;
    private Integer CantidadUnidadesVendidas;

    public DatosReporteVentasVentaOptima(String modelo) {
        super();
        this.Modelo = modelo;
        this.CantidadUnidadesVendidas = 0;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void addCantidadUnidadesVendidas(Integer cantidadUnidadesVendidas) {
        this.CantidadUnidadesVendidas += cantidadUnidadesVendidas;
    }

    public String getCantidadVentas(Integer cantidadOptima) {
        if (this.CantidadUnidadesVendidas > cantidadOptima) {
            return this.CantidadUnidadesVendidas + " (" + (this.CantidadUnidadesVendidas - cantidadOptima) + " más que la cantidad óptima)";
        }
        else if (this.CantidadUnidadesVendidas == cantidadOptima) {
            return this.CantidadUnidadesVendidas + " (igual a la cantidad óptima)";
        }
        else {
            return this.CantidadUnidadesVendidas + " (" + (cantidadOptima - this.CantidadUnidadesVendidas) + " menos que la cantidad óptima)";
        }
    }
}
