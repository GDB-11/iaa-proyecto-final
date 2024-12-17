package application.core.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import application.core.interfaces.IOperacionesCocina;
import infrastructure.core.models.Cocina;

public class OperacionesCocina implements IOperacionesCocina
{
    //DECLARACIÓN DE VARIABLES GLOBALES
    private List<Cocina> cocinas = new ArrayList<Cocina>();

    public OperacionesCocina()
    {
        super();
        //DECLARACIÓN DE VALORES INICIALES
        cocinas.add(new Cocina("Mabe EMP6120PG0", new BigDecimal(949), 58.6D, 60D, 91D, 4));
        cocinas.add(new Cocina("Indurama Parma", new BigDecimal(1089), 80D, 94D, 67.5D, 6));
        cocinas.add(new Cocina("Sole COSOL027", new BigDecimal(850), 60D, 90D, 50D, 4));
        cocinas.add(new Cocina("Coldex CX602", new BigDecimal(629), 61.6D, 95D, 51.5D, 5));
        cocinas.add(new Cocina("Reco Dakota", new BigDecimal(849), 75.4D, 94.5D, 66D, 5));
    }

    public List<Cocina> listarCocinas()
    {
        return cocinas;
    }

    public Cocina obtenerCocina(String modelo)
    {
        for(int i = 0; i < cocinas.size(); i++)
        {
            Cocina cocina = cocinas.get(i);

            if (cocina.getModelo().equals(modelo)) {
                return cocina;
            }
        }

        return null;
    }

    public BigDecimal obtenerPrecioPromedio() {
        BigDecimal sumaPrecios = new BigDecimal(0);

        for (int i = 0; i < cocinas.size(); i++) {
            Cocina cocina = cocinas.get(i);

            sumaPrecios = sumaPrecios.add(cocina.getPrecio());
        }

        return sumaPrecios.divide(new BigDecimal(cocinas.size()), 10, RoundingMode.HALF_UP);
    }
}
