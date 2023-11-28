package dao;

import java.util.List;
import models.entities.Empleado;

public interface GerenciaDAO {

    List<Empleado> buscar(String usuario);
    
}
