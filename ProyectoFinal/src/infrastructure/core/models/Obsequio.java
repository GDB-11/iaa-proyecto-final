package infrastructure.core.models;

public class Obsequio {
    private String NombreObsequio;
    private Integer CantidadMinima;
    private Integer CantidadMaxima;

    public Obsequio(Integer cantidadMinima, Integer cantidadMaxima, String nombreObsequio) {
        this.CantidadMinima = cantidadMinima;
        this.CantidadMaxima = cantidadMaxima;
        this.NombreObsequio = nombreObsequio;
    }

    public void setNombreObsequio(String nombreObsequio) {
        this.NombreObsequio = nombreObsequio;
    }

    public String getNombreObsequio() {
        return this.NombreObsequio;
    }

    public Integer getCantidadMinima() {
        return this.CantidadMinima;
    }

    public Integer getCantidadMaxima() {
        return this.CantidadMaxima;
    }

    public String getRangoObsequio() {
        if (CantidadMaxima == Integer.MAX_VALUE) {
            return "Más de " + CantidadMinima;
        }
        else if (CantidadMinima == CantidadMaxima) {
            return CantidadMinima.toString();
        }

        return CantidadMinima + " a " + CantidadMaxima;
    }
}
