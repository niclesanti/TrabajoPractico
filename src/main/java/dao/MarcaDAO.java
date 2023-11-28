/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.entities.Marca;

/**
 *
 * @author GervaMatteoda
 */
public interface MarcaDAO {
    
    void alta(Marca marca);
    List<Marca> buscarAll();
    List<Marca> buscarByID (String id);
    List<Marca> buscarByNombre (String nombre);
    void modificar(Marca marca);
    void baja(int id);
    
}
