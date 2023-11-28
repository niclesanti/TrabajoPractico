package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import models.entities.Pais;

public class PaisDAOImpl implements PaisDAO{

    private final EntityManager entityManager;

    public PaisDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public List<Pais> buscarAll() {
        String consulta = "SELECT p FROM Pais p";
        TypedQuery<Pais> query = (TypedQuery<Pais>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
}
