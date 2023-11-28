package models.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

11 -> Domicilio de Riesgo
1N -> Domicilio
N1 -> Provincia

*/

@Entity
@Table(name="Localidad")
public class Localidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name =" id_domicilioRiesgo")
    private Integer id_domicilioRiesgo = 1;
    
    @OneToMany(mappedBy = "localidad")
    private List<Vehiculo> vehiculos  = new ArrayList<>();
    
    //Constructores
    public Localidad() {
    }
    
    public Localidad(Integer id, Provincia provincia, String nombre, List<Vehiculo> vehiculos) {
        this.id = id;
        this.provincia = provincia;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    
    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_domicilioRiesgo() {
        return id_domicilioRiesgo;
    }

    public void setId_domicilioRiesgo(Integer id_domicilioRiesgo) {
        this.id_domicilioRiesgo = id_domicilioRiesgo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}