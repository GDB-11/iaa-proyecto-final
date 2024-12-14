package application.core.interfaces;

import java.util.List;

import infrastructure.core.models.Cocina;

public interface IOperacionesCocina {
    public List<Cocina> listarCocinas();
    public Cocina obtenerCocina(String modelo);
}
