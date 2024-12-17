package infrastructure.core.models;

import java.math.BigDecimal;

public class Descuento {
    private Integer CantidadMinima;
    private Integer CantidadMaxima;
    private BigDecimal Valor;

    public Descuento(Integer cantidadMinima, Integer cantidadMaxima, Double valor) {
        super();
        this.CantidadMinima = cantidadMinima;
        this.CantidadMaxima = cantidadMaxima;
        this.Valor = new BigDecimal(valor);
    }

    public void setValor(Double valor) {
        this.Valor = new BigDecimal(valor);
    }

    public void setValor(BigDecimal valor) {
        this.Valor = valor;
    }

    public BigDecimal getValor() {
        return this.Valor;
    }

    public Integer getCantidadMinima() {
        return this.CantidadMinima;
    }

    public Integer getCantidadMaxima() {
        return this.CantidadMaxima;
    }

    public String getNombre() {
        if (CantidadMaxima == Integer.MAX_VALUE) {
            return "Más de " + CantidadMinima;
        }
        return CantidadMinima + " a " + CantidadMaxima;
    }
}
