package dao;

import java.util.List;
import models.entities.Empleado;

public interface EmpleadoDAO {
    
    void alta(Empleado empleado);
    List<Empleado> buscarAll();
    List<Empleado> buscarByUsuarioClave (String usuario, String clave);
    void modificar(Empleado empleado);
    void baja(int id);

}