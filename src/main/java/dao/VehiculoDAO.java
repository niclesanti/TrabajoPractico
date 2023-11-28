package dao;

import java.util.List;
import models.entities.Vehiculo;

public interface VehiculoDAO {
    
    void alta(Vehiculo vehiculo);
    List<Vehiculo> buscarAll ();
    List<Vehiculo> buscarByPatente (String patente);
    List<Vehiculo> buscarByChasis (String chasis);
    List<Vehiculo> buscarByMotor (String motor);
    void modificar(Vehiculo vehiculo);
    void baja();
    
}