/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.entities.Empleado;
import org.hibernate.Session;

/**
 *
 * @author GervaMatteoda
 */
public class ProductorDAOImpl implements ProductorDAO {
    
    private Session sesion;
    
    @Override
    public List<Empleado> buscar(String usuario) {
        return null;
    }
    
}
