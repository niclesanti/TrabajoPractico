package dao;

import java.util.List;
import models.entities.Domicilio;

public interface DomicilioDAO {
    
    void alta(Domicilio domicilio);
    List<Domicilio> buscarAll ();
    List<Domicilio> buscarByID (Integer id);
    void modificar(Domicilio domicilio);
    void baja(int id);
    
}