package dao;

import java.util.List;
import models.entities.AnioFabricacion;
import models.entities.Marca;
import models.entities.Modelo;

public interface AnioFabricacionDAO {
    
    List<AnioFabricacion> buscarAll ();
    List<AnioFabricacion> buscarByModelo (Modelo modelo);
    
}