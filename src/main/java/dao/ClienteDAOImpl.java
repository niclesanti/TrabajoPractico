package dao;

import java.util.Collections;
import models.entities.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;

public class ClienteDAOImpl implements ClienteDAO {
    
    private final EntityManager entityManager;
    
    public ClienteDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> buscarAll () {
        String consulta = "SELECT c FROM Cliente c";
        TypedQuery<Cliente> query = (TypedQuery<Cliente>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<Cliente> buscarByID(String id) {
        try {
            Integer identificador = Integer.parseInt(id);
            String consulta = "SELECT c FROM Cliente c WHERE c.numeroCliente = :id";
            TypedQuery<Cliente> query = (TypedQuery<Cliente>) entityManager.createQuery(consulta);
            query.setParameter("id", identificador);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public void modificar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}