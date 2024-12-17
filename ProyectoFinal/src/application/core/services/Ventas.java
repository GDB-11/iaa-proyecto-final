package application.core.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import application.core.helpers.Constants;
import application.core.interfaces.IConfiguracion;
import application.core.interfaces.IOperacionesCocina;
import application.core.interfaces.IVentas;
import infrastructure.core.models.Cocina;
import infrastructure.core.models.Venta;
import infrastructure.core.models.Reporte.DatosReportePromediosMayoresMenores;
import infrastructure.core.models.Reporte.DatosReporteVentasPorModelo;
import infrastructure.core.models.Reporte.DatosReporteVentasPrecioPromedio;
import infrastructure.core.models.Reporte.DatosReporteVentasVentaOptima;

public class Ventas implements IVentas {
    //DECLARACIÓN DE VARIABLES GLOBALES
    private List<Venta> ventas = new ArrayList<Venta>();

    private IConfiguracion _configuracion;
    private IOperacionesCocina _operacionesCocina;

    public Ventas(IConfiguracion configuracion, IOperacionesCocina operacionesCocina) {
        super();
        _configuracion = configuracion;
        _operacionesCocina = operacionesCocina;
    }

    public List<Venta> listarVentas() {
        return ventas;
    }

    public Venta agregarVenta(String modelo, BigDecimal precioUnitario, Integer cantidad) {
        //DECLARACIÓN DE VARIABLES LOCALES
        Venta venta;
        BigDecimal porcentajeDescuento = _configuracion.obtenerDescuento(cantidad);
        String obsequio = _configuracion.obtenerObsequio(cantidad);

        //PROCESO
        venta = new Venta(modelo, precioUnitario, porcentajeDescuento, cantidad, obsequio); 

        ventas.add(venta);

        //RETORNAR RESULTADO
        return venta;
    }

    public List<DatosReporteVentasPorModelo> obtenerDatosReporteVentasPorModelo() {
        //DECLARACIÓN DE VARIABLES LOCALES
        List<DatosReporteVentasPorModelo> datosReporte = new ArrayList<DatosReporteVentasPorModelo>();
        DatosReporteVentasPorModelo datoCocinaMabe = new DatosReporteVentasPorModelo(Constants.CocinaMabe);
        DatosReporteVentasPorModelo datoCocinaIndurama = new DatosReporteVentasPorModelo(Constants.CocinaIndurama);
        DatosReporteVentasPorModelo datoCocinaSole = new DatosReporteVentasPorModelo(Constants.CocinaSole);
        DatosReporteVentasPorModelo datoCocinaColdex = new DatosReporteVentasPorModelo(Constants.CocinaColdex);
        DatosReporteVentasPorModelo datoCocinaReco = new DatosReporteVentasPorModelo(Constants.CocinaReco);

        //PROCESO
        for (int i = 0; i < ventas.size(); i++) {
            Venta venta = ventas.get(i);

            switch (venta.getModelo()) {
                case Constants.CocinaMabe:
                    datoCocinaMabe.addCantidadUnidadesVendidas(venta.getCantidad());
                    datoCocinaMabe.addCantidadVentas(1);
                    datoCocinaMabe.addImporteTotalVendido(venta.getImportePagar());
                    break;
                case Constants.CocinaIndurama:
                    datoCocinaIndurama.addCantidadUnidadesVendidas(venta.getCantidad());
                    datoCocinaIndurama.addCantidadVentas(1);
                    datoCocinaIndurama.addImporteTotalVendido(venta.getImportePagar());
                    break;
                case Constants.CocinaSole:
                    datoCocinaSole.addCantidadUnidadesVendidas(venta.getCantidad());
                    datoCocinaSole.addCantidadVentas(1);
                    datoCocinaSole.addImporteTotalVendido(venta.getImportePagar());
                    break;
                case Constants.CocinaColdex:
                    datoCocinaColdex.addCantidadUnidadesVendidas(venta.getCantidad());
                    datoCocinaColdex.addCantidadVentas(1);
                    datoCocinaColdex.addImporteTotalVendido(venta.getImportePagar());
                    break;
                case Constants.CocinaReco:
                    datoCocinaReco.addCantidadUnidadesVendidas(venta.getCantidad());
                    datoCocinaReco.addCantidadVentas(1);
                    datoCocinaReco.addImporteTotalVendido(venta.getImportePagar());
                    break;
                default:
                    break;
            }
        }

        datosReporte.add(datoCocinaMabe);
        datosReporte.add(datoCocinaIndurama);
        datosReporte.add(datoCocinaSole);
        datosReporte.add(datoCocinaColdex);
        datosReporte.add(datoCocinaReco);

        //RETORNAR RESULTADO
        return datosReporte;
    }

    public List<DatosReporteVentasVentaOptima> obtenerDatosReporteVentasVentaOptima() {
        //DECLARACIÓN DE VARIABLES LOCALES
        List<DatosReporteVentasVentaOptima> datosReporte = new ArrayList<DatosReporteVentasVentaOptima>();
        DatosReporteVentasVentaOptima datoCocinaMabe = new DatosReporteVentasVentaOptima(Constants.CocinaMabe);
        DatosReporteVentasVentaOptima datoCocinaIndurama = new DatosReporteVentasVentaOptima(Constants.CocinaIndurama);
        DatosReporteVentasVentaOptima datoCocinaSole = new DatosReporteVentasVentaOptima(Constants.CocinaSole);
        DatosReporteVentasVentaOptima datoCocinaColdex = new DatosReporteVentasVentaOptima(Constants.CocinaColdex);
        DatosReporteVentasVentaOptima datoCocinaReco = new DatosReporteVentasVentaOptima(Constants.CocinaReco);

        //PROCESO
        for (int i = 0; i < ventas.size(); i++) {
            Venta venta = ventas.get(i);

            switch (venta.getModelo()) {
                case Constants.CocinaMabe:
                    datoCocinaMabe.addCantidadUnidadesVendidas(venta.getCantidad());
                    break;
                case Constants.CocinaIndurama:
                    datoCocinaIndurama.addCantidadUnidadesVendidas(venta.getCantidad());
                    break;
                case Constants.CocinaSole:
                    datoCocinaSole.addCantidadUnidadesVendidas(venta.getCantidad());
                    break;
                case Constants.CocinaColdex:
                    datoCocinaColdex.addCantidadUnidadesVendidas(venta.getCantidad());
                    break;
                case Constants.CocinaReco:
                    datoCocinaReco.addCantidadUnidadesVendidas(venta.getCantidad());
                    break;
                default:
                    break;
            }
        }

        datosReporte.add(datoCocinaMabe);
        datosReporte.add(datoCocinaIndurama);
        datosReporte.add(datoCocinaSole);
        datosReporte.add(datoCocinaColdex);
        datosReporte.add(datoCocinaReco);

        //RETORNAR RESULTADO
        return datosReporte;
    }

    public List<DatosReporteVentasPrecioPromedio> obtenerDatosReporteVentasPrecioPromedio() {
        //DECLARACIÓN DE VARIABLES LOCALES
        List<DatosReporteVentasPrecioPromedio> datosReporte = new ArrayList<DatosReporteVentasPrecioPromedio>();
        List<Cocina> cocinas = _operacionesCocina.listarCocinas();

        //PROCESO
        for (int i = 0; i < cocinas.size(); i++) {
            Cocina cocina = cocinas.get(i);

            datosReporte.add(new DatosReporteVentasPrecioPromedio(cocina.getModelo(), cocina.getPrecio()));
        }

        //RETORNAR RESULTADO
        return datosReporte;
    }

    public DatosReportePromediosMayoresMenores obtenerDatosReportePromediosMayoresMenores() {
        List<Cocina> cocinas = _operacionesCocina.listarCocinas();
        BigDecimal sumaPrecio;
        BigDecimal precioPromedio = new BigDecimal(0);
        BigDecimal precioMayor = new BigDecimal(0);
        BigDecimal precioMenor = new BigDecimal(0);
        Double sumaAncho;
        Double anchoPromedio = 0D;
        Double anchoMayor = 0D;
        Double anchoMenor = 0D;
        
        if (cocinas.isEmpty()) {
            return new DatosReportePromediosMayoresMenores(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, 0D, 0D, 0D);
        }
    
        Cocina primeraCocina = cocinas.get(0);
        sumaPrecio = primeraCocina.getPrecio();
        precioMayor = primeraCocina.getPrecio();
        precioMenor = primeraCocina.getPrecio();
        sumaAncho = primeraCocina.getAncho();
        anchoMayor = primeraCocina.getAncho();
        anchoMenor = primeraCocina.getAncho();
    
        for (int i = 1; i < cocinas.size(); i++) {
            Cocina cocina = cocinas.get(i);
            
            sumaPrecio = sumaPrecio.add(cocina.getPrecio());
            sumaAncho += cocina.getAncho();
            
            precioMayor = precioMayor.max(cocina.getPrecio());
            precioMenor = precioMenor.min(cocina.getPrecio());
            anchoMayor = Math.max(anchoMayor, cocina.getAncho());
            anchoMenor = Math.min(anchoMenor, cocina.getAncho());
        }

        precioPromedio = sumaPrecio.divide(new BigDecimal(cocinas.size()), 2, RoundingMode.HALF_UP);
        anchoPromedio = sumaAncho / cocinas.size();

        //RETORNAR RESULTADO
        return new DatosReportePromediosMayoresMenores(
            precioPromedio,
            precioMayor,
            precioMenor,
            anchoPromedio,
            anchoMayor,
            anchoMenor
        );
    }
}
