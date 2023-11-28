package dao;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import models.entities.EstadoCivil;


public class EstadoCivilDAOImpl implements EstadoCivilDAO {

    private final EntityManager entityManager;
    
    public EstadoCivilDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public List<EstadoCivil> buscarAll() {
        String consulta = "SELECT ec FROM EstadoCivil ec";
        TypedQuery<EstadoCivil> query = (TypedQuery<EstadoCivil>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<EstadoCivil> buscarByID(Integer id) {
        /*
        String consulta = "SELECT t FROM EstadoCivil WHERE t.id LIKE :id";
        TypedQuery<EstadoCivil> query = entityManager.createQuery(consulta, EstadoCivil.class);
        query.setParameter("id", "%" + id + "%");
        return query.getResultList();
        */
        return Collections.emptyList();
    }
    
    @Override
    public List<EstadoCivil> buscarByEspecificacion(String especificacion){
        /*
        String consulta = "SELECT t FROM EstadoCivil WHERE t.especificacion LIKE :especificacion";
        TypedQuery<EstadoCivil> query = entityManager.createQuery(consulta, EstadoCivil.class);
        query.setParameter("especificacion", "%" + especificacion + "%");
        return query.getResultList();
        */
        return Collections.emptyList();
    }
}