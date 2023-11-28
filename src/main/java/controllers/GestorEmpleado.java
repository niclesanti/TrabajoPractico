package controllers;

import dao.EmpleadoDAOImpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.entities.Empleado;

public class GestorEmpleado {
    
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("PersistenciaTP");
    EntityManager manager = managerFactory.createEntityManager();
    private EmpleadoDAOImpl empleadoImpl;
    
    
    public List<Empleado> iniciarSesion (String usuario, String clave) {
        empleadoImpl = new EmpleadoDAOImpl(manager);
        return empleadoImpl.buscarByUsuarioClave(usuario, clave);
    }
}
