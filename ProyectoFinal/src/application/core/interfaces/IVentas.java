package application.core.interfaces;

import java.math.BigDecimal;
import java.util.List;

import infrastructure.core.models.Venta;
import infrastructure.core.models.Reporte.DatosReportePromediosMayoresMenores;
import infrastructure.core.models.Reporte.DatosReporteVentasPorModelo;
import infrastructure.core.models.Reporte.DatosReporteVentasPrecioPromedio;
import infrastructure.core.models.Reporte.DatosReporteVentasVentaOptima;

public interface IVentas {
    public List<Venta> listarVentas();
    public Venta agregarVenta(String modelo, BigDecimal precioUnitario, Integer cantidad);
    public List<DatosReporteVentasPorModelo> obtenerDatosReporteVentasPorModelo();
    public List<DatosReporteVentasVentaOptima> obtenerDatosReporteVentasVentaOptima();
    public List<DatosReporteVentasPrecioPromedio> obtenerDatosReporteVentasPrecioPromedio();
    public DatosReportePromediosMayoresMenores obtenerDatosReportePromediosMayoresMenores();
    public Integer getCantidadVentas();
    public BigDecimal getImporteTotalGeneralAcumulado();
    public BigDecimal getAporteCuotaDiariaGeneral();
}
