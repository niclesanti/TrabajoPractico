package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Cliente

*/

@Entity
@Table (name = "CondicionIVA")
public class CondicionIVA implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "especificacion")
    private String especificacion;
    
    @OneToMany(mappedBy = "condicionIVA")
    private List<Cliente> clientes = new ArrayList<>();
    
    // Constructores
    public CondicionIVA() {
    }

    public CondicionIVA(Integer id, String especificacion) {
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
        
}
