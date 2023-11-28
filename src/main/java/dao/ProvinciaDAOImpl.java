package dao;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.Pais;
import models.entities.Provincia;

public class ProvinciaDAOImpl implements ProvinciaDAO {

    private final EntityManager entityManager;

    public ProvinciaDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Provincia provincia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Provincia> buscarAll() {
        String consulta = "SELECT p FROM Provincia p ORDER BY p.nombre ASC";
        TypedQuery<Provincia> query = (TypedQuery<Provincia>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<Provincia> buscarByPais(Pais pais) {
        try {
            String consulta = "SELECT p FROM Provincia p WHERE p.id_pais = :id ORDER BY p.nombre ASC";
            TypedQuery<Provincia> query = (TypedQuery<Provincia>) entityManager.createQuery(consulta);
            query.setParameter("id", pais.getId());
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<Provincia> buscarByID(String id) {
        try {
            Integer identificador = Integer.parseInt(id);
            String consulta = "SELECT p FROM Provincia p WHERE p.id = :id ORDER BY p.nombre ASC";
            TypedQuery<Provincia> query = (TypedQuery<Provincia>) entityManager.createQuery(consulta);
            query.setParameter("id", identificador);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    @Override
    public List<Provincia> buscarByNombre(String nombre) {
        try {
            String consulta = "SELECT p FROM Provincia p WHERE p.nombre= :nombre ORDER BY p.nombre ASC";
            TypedQuery<Provincia> query = (TypedQuery<Provincia>) entityManager.createQuery(consulta);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public void modificar(Provincia provincia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
