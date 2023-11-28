package dao;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.Vehiculo;

public class VehiculoDAOImpl implements VehiculoDAO {

    private final EntityManager entityManager;
    
    public VehiculoDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    
    @Override
    public void alta(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> buscarAll() {
        String consulta = "SELECT v FROM Vehiculo v ORDER BY v.patente ASC";
        TypedQuery<Vehiculo> query = (TypedQuery<Vehiculo>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<Vehiculo> buscarByPatente(String patente) {
        try {
            String consulta = "SELECT v FROM Vehiculo v WHERE v.patente = :patente ORDER BY v.patente ASC";
            TypedQuery<Vehiculo> query = (TypedQuery<Vehiculo>) entityManager.createQuery(consulta);
            query.setParameter("patente", patente);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<Vehiculo> buscarByChasis(String chasis) {
         try {
            String consulta = "SELECT v FROM Vehiculo v WHERE v.chasis = :chasis ORDER BY v.chasis ASC";
            TypedQuery<Vehiculo> query = (TypedQuery<Vehiculo>) entityManager.createQuery(consulta);
            query.setParameter("chasis", chasis);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public List<Vehiculo> buscarByMotor(String motor) {
        try {
            String consulta = "SELECT v FROM Vehiculo v WHERE v.motor = :motor ORDER BY v.motor ASC";
            TypedQuery<Vehiculo> query = (TypedQuery<Vehiculo>) entityManager.createQuery(consulta);
            query.setParameter("motor", motor);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public void modificar(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
