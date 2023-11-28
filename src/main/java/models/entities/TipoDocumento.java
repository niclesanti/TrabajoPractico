package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Cliente
1N -> Empleado

*/

@Entity
@Table (name = "TipoDocumento")
public class TipoDocumento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "especificacion")
    private String especificacion;
    
    @OneToMany(mappedBy = "tipoDocumento")
    private List<Cliente> clientes = new ArrayList<>();
    
    @OneToMany(mappedBy = "tipoDocumento")
    private List<Empleado> empleados = new ArrayList<>();
    
    // Constructores 
    public TipoDocumento() {
    }

    public TipoDocumento(Integer id, String especificacion) {
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }    
}
