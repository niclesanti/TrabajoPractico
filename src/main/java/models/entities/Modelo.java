package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/*

11 -> Estadistica de Robo
1N -> Vehiculo
N1 -> Marca
NM -> Año de Fabricación

*/

@Entity
@Table (name = "Modelo")
public class Modelo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nombre")
    private String nombre;
    
    @ManyToOne()
    @JoinColumn (name = "id_marca")
    private Marca marca;
    
    @Column(name="id_estadisticaRobo")
    private Integer id_estadisticaRobo = 1;
    
    @OneToMany(mappedBy = "modelo")
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
    @ManyToMany()
    @JoinTable (name = "modelo_anio",
            joinColumns = {@JoinColumn(name = "id_modelo")},
            inverseJoinColumns = {@JoinColumn(name= "anio_anioFabricacion")})
    private List<AnioFabricacion> anioFabricacion = new ArrayList<>();
    
    // Constructor
    public Modelo() {
    }

    public Modelo(Integer id, String nombre, Marca marca) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<AnioFabricacion> getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(List<AnioFabricacion> anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }    
}
