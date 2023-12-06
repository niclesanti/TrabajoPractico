package dao;

import dto.ClienteDTO;
import java.util.Collections;
import models.entities.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import messages.Util;

public class ClienteDAOImpl implements ClienteDAO {
    
    private final EntityManager entityManager;
    
    public ClienteDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void alta(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /*public List<Cliente> buscarAll () {
        String consulta = "SELECT c FROM Cliente c";
        TypedQuery<Cliente> query = (TypedQuery<Cliente>) entityManager.createQuery(consulta);
        return query.getResultList();
    }*/
    //NROCLIENTE NOMBRE APELLIDO DNI TIPODOC 
    
    public List<Cliente> buscar(ClienteDTO cDTO){
       String consulta = "SELECT * FROM Cliente c WHERE 1=1"; //ver si se concatena con otra tabla
        
       if(cDTO.getNroCliente()!=0 ){ //revisar que sea vacia o nula
           String nro = String.valueOf(cDTO.getNroCliente());
           consulta.concat(" AND ");
           consulta.concat(nro);
           consulta.concat(" = c.nroCliente"); //atributo de la tabla ver que este bien escrito
       }
       
       if(cDTO.getNombre()!= null){
           consulta.concat(" AND ");
           consulta.concat(cDTO.getNombre());
           consulta.concat(" = c.nombre"); //atributo de la tabla ver que este bien escrito
       }
       
       if(cDTO.getApellido()!= null){
           consulta.concat(" AND ");
           consulta.concat(cDTO.getApellido());
           consulta.concat(" = c.apellido"); //atributo de la tabla ver que este bien escrito
       }
       
       if(cDTO.getTipoDoc()!= null){
           consulta.concat(" AND ");
           consulta.concat(cDTO.getTipoDoc());
           consulta.concat(" = c.tipoDoc"); //atributo de la tabla ver que este bien escrito
       }
       
       if(cDTO.getNroDoc()!= null){
           consulta.concat(" AND ");
           consulta.concat(cDTO.getNombre());
           consulta.concat(" = c.nroDoc"); //atributo de la tabla ver que este bien escrito
       }
    
       TypedQuery<Cliente> query = (TypedQuery<Cliente>) entityManager.createQuery(consulta);
       return query.getResultList();
    }
    
    
    
    /*@Override
    public List<Cliente> buscarByID(String id) {
        try {
            Integer identificador = Integer.parseInt(id);
            String consulta = "SELECT c FROM Cliente c WHERE c.numeroCliente = :id";
            TypedQuery<Cliente> query = (TypedQuery<Cliente>) entityManager.createQuery(consulta);
            query.setParameter("id", identificador);
            return query.getResultList();
        } catch (Exception e) {
            Util.mensajeError("Error", "Ha ocurrido un error: " + e.getMessage());
            return Collections.emptyList();
        }
    }*/

    @Override
    public void modificar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baja(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}