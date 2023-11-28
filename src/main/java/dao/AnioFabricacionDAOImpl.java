package dao;


import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.AnioFabricacion;
import models.entities.Modelo;

public class AnioFabricacionDAOImpl implements AnioFabricacionDAO {

    private final EntityManager entityManager;

    public AnioFabricacionDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<AnioFabricacion> buscarAll() {
        try{
            String consulta = "SELECT af FROM AnioFabricacion af";
            TypedQuery<AnioFabricacion> query =  (TypedQuery<AnioFabricacion>) entityManager.createQuery(consulta);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error (DAO)", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<AnioFabricacion> buscarByModelo (Modelo modelo) {
        try {
            String consulta = "SELECT af FROM AnioFabricacion af WHERE :modelo MEMBER OF af.modelos ORDER BY af.anioFabricacion ASC";
            TypedQuery<AnioFabricacion> query = (TypedQuery<AnioFabricacion>) entityManager.createQuery(consulta);
            query.setParameter("modelo", modelo);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error (DAO)", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
