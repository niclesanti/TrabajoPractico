package models.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Localidad
N1 -> Pais

*/

@Entity
@Table(name="Provincia")
public class Provincia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "id_pais")
    private Pais pais;
    
    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy = "provincia")
    private List<Localidad> localidades  = new ArrayList<>();
    
    //Constructores
    public Provincia() {
    }

    public Provincia(Integer id, Pais pais, String nombre, List<Localidad> localidades) {
        this.id = id;
        this.pais = pais;
        this.nombre = nombre;
        this.localidades = localidades;
    }
    
    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pais getId_pais() {
        return pais;
    }

    public void setId_pais(Pais id_pais) {
        this.pais = id_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }
}