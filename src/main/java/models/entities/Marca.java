package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Modelo

*/

@Entity
@Table (name = "Marca")
public class Marca implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @Column (name = "nombre")
    private String nombre;
    
    @OneToMany (mappedBy = "marca")
    private List<Modelo> modelos  = new ArrayList<>();
    
    // Constructores
    public Marca() {
    }

    public Marca(int id, String nombre, List<Modelo> modelos) {
        this.id = id;
        this.nombre = nombre;
        this.modelos = modelos;
    }
    
    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
