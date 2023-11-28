package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Datos Poliza
11 -> Porcentaje por Tipo de Cobertura

*/

@Entity
@Table (name = "TipoCobertura")
public class TipoCobertura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "especificacion")
    private String especificacion;
    
    @Column (name = "id_tipoCobertura")
    private Integer id_tipoCobertura = 1;
    
    @OneToMany (mappedBy = "tipoCobertura")
    private List<DatosPoliza> polizas = new ArrayList<>();
    
    // Constructor
    public TipoCobertura() {
    }

    public TipoCobertura(Integer id, String especificacion) {
        this.id = id;
        this.especificacion = especificacion;
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public Integer getId_tipoCobertura() {
        return id_tipoCobertura;
    }

    public void setId_tipoCobertura(Integer id_tipoCobertura) {
        this.id_tipoCobertura = id_tipoCobertura;
    }

    public List<DatosPoliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(List<DatosPoliza> polizas) {
        this.polizas = polizas;
    }
    
}
