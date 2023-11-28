/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.entities.Localidad;
import models.entities.Provincia;

/**
 *
 * @author GervaMatteoda
 */
public interface LocalidadDAO {
    
    void alta(Localidad localidad);
    List<Localidad> buscarAll ();
    List<Localidad> buscarByProvincia (Provincia provincia);
    List<Localidad> buscarByID (String id);
    List<Localidad> buscarByNombre (String nombre);
    void modificar(Localidad localidad);
    void baja(int id);
    
}
