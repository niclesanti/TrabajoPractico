package controllers;

import dao.ClienteDAOImpl;
import dto.ClienteDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.entities.Cliente;

public class GestorCliente {
    
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("PersistenciaTP");
    EntityManager manager = managerFactory.createEntityManager();
    
    ClienteDAOImpl clienteImpl;
    
    public List<ClienteDTO> mostrarCliente (ClienteDTO cDTO) {
        clienteImpl = new ClienteDAOImpl(manager);
        List<Cliente> clientes = clienteImpl.buscar(cDTO);
        List<ClienteDTO> clientesDTO = new ArrayList();
        
        for(Cliente c: clientes){
            ClienteDTO cdto = new ClienteDTO();
            cdto.setNroCliente(c.getNumeroCliente());
            cdto.setNombre(c.getNombre());
            cdto.setApellido(c.getApellido());
            cdto.setTipoDoc(c.getTipoDocumento().getEspecificacion());
            cdto.setNroDoc(c.getNumeroDocumento());
            
            clientesDTO.add(cdto);
        }
        
        return clientesDTO;
    }
    
    public Cliente buscar(ClienteDTO cdto){
        Cliente c;
        clienteImpl = new ClienteDAOImpl(manager);
        List<Cliente> listaClientes = clienteImpl.buscar(cdto);
        //Falta crear un metodo public Cliente buscar(ClienteDTO){} en ClienteDTOimplementacion -> que devuelva un solo cliente que cumpla con todas los atributos del ClienteDTO
        c = listaClientes.get(0);
        
        return c;
    }
    
    /*public List<Provincia> mostrarProvincia () {
        provinciaImpl = new ProvinciaDAOImpl();
        return provinciaImpl.buscar();
    }*/
    
    /*public List<Localidad> mostrarLocalidad (String provincia) {
        provinciaImpl = new ProvinciaDAOImpl();
        localidadImpl = new LocalidadDAOImpl();
        return localidadImpl.buscar(provinciaImpl.buscar(provincia));
    }*/
    
}
