package dao;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.Marca;

public class MarcaDAOImpl implements MarcaDAO{

    private final EntityManager entityManager;

    public MarcaDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Marca marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Marca> buscarAll () {
        String consulta = "SELECT m FROM Marca m ORDER BY m.nombre ASC";
        TypedQuery<Marca> query = (TypedQuery<Marca>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<Marca> buscarByID(String id) {
        try {
            Integer identificador = Integer.parseInt(id);
            String consulta = "SELECT m FROM Marca m WHERE m.id = :id";
            TypedQuery<Marca> query = (TypedQuery<Marca>) entityManager.createQuery(consulta);
            query.setParameter("id", identificador);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    @Override
    public List<Marca> buscarByNombre(String nombre) {
        try {
            String consulta = "SELECT m FROM Marca m WHERE m.nombre = :nombre";
            TypedQuery<Marca> query = (TypedQuery<Marca>) entityManager.createQuery(consulta);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error (DAO)", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public void modificar(Marca marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
