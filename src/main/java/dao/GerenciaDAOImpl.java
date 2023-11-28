package dao;

import java.util.List;
import models.entities.Empleado;
import org.hibernate.Session;

public class GerenciaDAOImpl implements GerenciaDAO {

    private Session sesion;
    
    @Override
    public List<Empleado> buscar(String usuario) {
        return null;
    }
}
