package controllers;

import dao.ClienteDAOImpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.entities.Cliente;

public class GestorCliente {
    
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("PersistenciaTP");
    EntityManager manager = managerFactory.createEntityManager();
    
    ClienteDAOImpl clienteImpl;
    
    public List<Cliente> mostrarCliente (String numeroCliente) {
        clienteImpl = new ClienteDAOImpl(manager);
        return clienteImpl.buscarByID(numeroCliente);
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
