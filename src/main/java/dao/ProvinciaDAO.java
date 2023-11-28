package dao;

import java.util.List;
import models.entities.Pais;
import models.entities.Provincia;

public interface ProvinciaDAO {
    
    void alta(Provincia provincia);
    List<Provincia> buscarAll();
    List<Provincia> buscarByPais (Pais pais);
    List<Provincia> buscarByID (String id);
    List<Provincia> buscarByNombre (String nombre);
    void modificar(Provincia provincia);
    void baja(int id);
    
}
