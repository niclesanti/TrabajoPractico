package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;
import models.entities.Empleado;

public class EmpleadoDAOImpl implements EmpleadoDAO {

    private final EntityManager entityManager;
    
    public EmpleadoDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Buscar Usuario para Iniciar Sesion -> Lista Vacía (No existe usuario)
    
    @Override
    public List<Empleado> buscarAll (){
        String consulta = "SELECT e FROM Empleado e";
        TypedQuery<Empleado> query = (TypedQuery<Empleado>) entityManager.createQuery(consulta);
        return query.getResultList();
    }
    
    @Override
    public List<Empleado> buscarByUsuarioClave (String usuario, String clave) {
        try {
            Integer id = Integer.parseInt(usuario);
            String consulta = "SELECT e FROM Empleado e WHERE e.id = :id AND e.clave = :clave";
            TypedQuery<Empleado> query = (TypedQuery<Empleado>) entityManager.createQuery(consulta);
            query.setParameter("id", id);
            query.setParameter("clave", clave);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return null;
        }
    }
}