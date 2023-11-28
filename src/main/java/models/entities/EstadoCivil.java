package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Persona
1N -> Cliente

*/

@Entity
@Table (name = "EstadoCivil")
public class EstadoCivil implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "especificacion")
    private String especificacion;
    
    @OneToMany(mappedBy = "estadoCivil")
    private List<Persona> personas = new ArrayList<>();
    
    @OneToMany(mappedBy = "estadoCivil")
    private List<Cliente> clientes = new ArrayList<>();
    
    // Constructores
    public EstadoCivil() {
    }

    public EstadoCivil(Integer id, String especificacion) {
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

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
