package dao;

import java.util.List;
import models.entities.Empleado;

public interface ProductorDAO {
    
    List<Empleado> buscar(String usuario);
    
}
