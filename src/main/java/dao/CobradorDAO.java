/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.entities.Empleado;

/**
 *
 * @author GervaMatteoda
 */
public interface CobradorDAO {
    
    List<Empleado> buscar(String usuario);
    
}
