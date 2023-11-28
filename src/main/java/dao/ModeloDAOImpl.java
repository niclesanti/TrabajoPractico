package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.Marca;
import models.entities.Modelo;

public class ModeloDAOImpl implements ModeloDAO {

    private final EntityManager entityManager;

    public ModeloDAOImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modelo> buscarAll () {
        String consulta = "SELECT m FROM Modelo m";
        TypedQuery<Modelo> query = (TypedQuery<Modelo>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<Modelo> buscarByMarca (Marca marca) {
        try {
            String consulta = "SELECT m FROM Modelo m WHERE m.marca = :marca ORDER BY m.nombre ASC";
            TypedQuery<Modelo> query = (TypedQuery<Modelo>) entityManager.createQuery(consulta);
            query.setParameter("marca", marca);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public List<Modelo> buscarByID(String id) {
        try {
            Integer identificador = Integer.parseInt(id);
            String consulta = "SELECT m FROM Modelo m WHERE p.id = :id";
            TypedQuery<Modelo> query = (TypedQuery<Modelo>) entityManager.createQuery(consulta);
            query.setParameter("id", identificador);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public List<Modelo> buscarByNombre(String nombre) {
        try {
            String consulta = "SELECT m FROM Modelo m WHERE m.nombre = :nombre";
            TypedQuery<Modelo> query = (TypedQuery<Modelo>) entityManager.createQuery(consulta);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return null;
        }
    }
    
    @Override
    public void modificar(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
