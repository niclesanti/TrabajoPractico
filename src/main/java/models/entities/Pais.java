package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Provincia

*/

@Entity
@Table (name = "Pais")
public class Pais implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "pais")
    private List<Provincia> provincias = new ArrayList<>();
    
    // Constructores
    public Pais() {
    }

    public Pais(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Pais(Integer id, String nombre, List<Provincia> provincia) {
        this.id = id;
        this.nombre = nombre;
        this.provincias = provincia;
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Provincia> getProvincia() {
        return provincias;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(List<Provincia> provincia) {
        this.provincias = provincia;
    }    
}
