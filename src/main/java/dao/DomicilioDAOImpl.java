package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import models.entities.Domicilio;

public class DomicilioDAOImpl implements DomicilioDAO {

    private final EntityManager entityManager;
    
    public DomicilioDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Domicilio domicilio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Domicilio> buscarAll () {
        /*
        String consulta = "SELECT c FROM Cliente c";
        TypedQuery<Domicilio> query = entityManager.createQuery(consulta, Domicilio.class);
        return query.getResultList();
        */
        return null;
    }
    
    @Override
    public List<Domicilio> buscarByID (Integer id) {
        /*
        String consulta = "SELECT d FROM Domicilio d WHERE d.id LIKE :id";
        TypedQuery<Domicilio> query = entityManager.createQuery(consulta, Domicilio.class);
        query.setParameter("nombre", "%" + id + "%");
        return query.getResultList();
        */
        return null;
    }
    
    @Override
    public void modificar(Domicilio domicilio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}