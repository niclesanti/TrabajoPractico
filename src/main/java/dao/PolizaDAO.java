/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.entities.Poliza;

/**
 *
 * @author GervaMatteoda
 */
public interface PolizaDAO {
    
    void alta(Poliza modelo);
    List<Poliza> buscar();
    void modificar(Poliza modelo);
    void baja(int id);
    
}
