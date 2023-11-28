package dao;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.Localidad;
import models.entities.Provincia;

public class LocalidadDAOImpl implements LocalidadDAO {

    private final EntityManager entityManager;

    public LocalidadDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Localidad localidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Localidad> buscarAll () {
        String consulta = "SELECT l FROM Localidad l ORDER BY l.nombre DESC";
        TypedQuery<Localidad> query = (TypedQuery<Localidad>) entityManager.createQuery(consulta);
        return query.getResultList();
    }

    @Override
    public List<Localidad> buscarByProvincia (Provincia provincia) {
        try {
            String consulta = "SELECT l FROM Localidad l WHERE l.provincia = :provincia ORDER BY l.nombre ASC";
            TypedQuery<Localidad> query = (TypedQuery<Localidad>) entityManager.createQuery(consulta);
            query.setParameter("provincia", provincia);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    @Override
    public List<Localidad> buscarByID(String id) {
        try {
            Integer identificador = Integer.parseInt(id);
            String consulta = "SELECT l FROM Localidad l WHERE l.id = :id ORDER BY l.nombre DESC";
            TypedQuery<Localidad> query = (TypedQuery<Localidad>) entityManager.createQuery(consulta);
            query.setParameter("id", identificador);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<Localidad> buscarByNombre(String nombre) {
        try {
            String consulta = "SELECT l FROM Localidad l WHERE l.nombre = :nombre ORDER BY l.nombre DESC";
            TypedQuery<Localidad> query = (TypedQuery<Localidad>) entityManager.createQuery(consulta);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    @Override
    public void modificar(Localidad localidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
