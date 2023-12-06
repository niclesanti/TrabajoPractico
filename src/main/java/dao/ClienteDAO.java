package dao;

import dto.ClienteDTO;
import java.util.List;
import models.entities.Cliente;

public interface ClienteDAO {
    
    void alta(Cliente cliente);
    //List<Cliente> buscarAll ();
    List<Cliente> buscar(ClienteDTO cDTO);
    //List<Cliente> buscarByID (String id);
    void modificar(Cliente cliente);
    void baja(int id);
    
}