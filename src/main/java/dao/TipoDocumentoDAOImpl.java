package dao;

import models.entities.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import models.entities.TipoDocumento;


public class TipoDocumentoDAOImpl implements TipoDocumentoDAO{

    private final EntityManager entityManager;
    
    public TipoDocumentoDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public List<TipoDocumento> buscar() {
        /*
        String consulta = "SELECT t FROM TipoDocumento t";
        TypedQuery<TipoDocumento> query = entityManager.createQuery(consulta, TipoDocumento.class);
        return query.getResultList();
        */
        return null;
    }
    
    @Override
    public List<TipoDocumento> buscar(Integer id) {
        /*
        String consulta = "SELECT t FROM TipoDocumento WHERE t.id LIKE :id";
        TypedQuery<TipoDocumento> query = entityManager.createQuery(consulta, TipoDocumento.class);
        query.setParameter("id", "%" + id + "%");
        return query.getResultList();
        */
        return null;
    }
}