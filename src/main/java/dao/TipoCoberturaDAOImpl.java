package dao;


import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.TipoCobertura;

public class TipoCoberturaDAOImpl implements TipoCoberturaDAO{

    private final EntityManager entityManager;

    public TipoCoberturaDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public List<TipoCobertura> buscarAll () {
        try {
            String consulta = "SELECT tc FROM TipoCobertura tc";
            TypedQuery<TipoCobertura> query = (TypedQuery<TipoCobertura>) entityManager.createQuery(consulta);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
