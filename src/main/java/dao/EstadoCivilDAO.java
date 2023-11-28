package dao;

import java.util.List;
import models.entities.EstadoCivil;

public interface EstadoCivilDAO {

    List<EstadoCivil> buscarAll();
    List<EstadoCivil> buscarByID(Integer id);
    List<EstadoCivil> buscarByEspecificacion(String especificacion);
    
}