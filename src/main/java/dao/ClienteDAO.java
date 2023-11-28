package dao;

import java.util.List;
import models.entities.Cliente;

public interface ClienteDAO {
    
    void alta(Cliente cliente);
    List<Cliente> buscarAll ();
    List<Cliente> buscarByID (String id);
    void modificar(Cliente cliente);
    void baja(int id);
    
}