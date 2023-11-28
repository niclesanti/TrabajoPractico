package dao;

import java.util.List;
import models.entities.Marca;
import models.entities.Modelo;

public interface ModeloDAO {
    
    void alta(Modelo modelo);
    List<Modelo> buscarAll ();
    List<Modelo> buscarByMarca (Marca marca);
    List<Modelo> buscarByID(String id);
    List<Modelo> buscarByNombre(String nombre);
    void modificar(Modelo modelo);
    void baja(int id);
    
}
