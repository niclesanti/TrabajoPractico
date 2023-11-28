package dao;

import java.util.List;
import models.entities.TipoDocumento;

public interface TipoDocumentoDAO {

    List<TipoDocumento> buscar();
    List<TipoDocumento> buscar(Integer id);
    
}