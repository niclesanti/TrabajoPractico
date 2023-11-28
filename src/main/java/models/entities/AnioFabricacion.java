package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/*
Año de Fabricación

MN -> Modelo
1N -> Vehiculo

*/

@Entity
@Table(name = "AnioFabricacion")
public class AnioFabricacion implements Serializable {
    
    @Id
    @Column(name = "anioFabricacion")
    private Integer anioFabricacion;

    @ManyToMany(mappedBy = "anioFabricacion", fetch = FetchType.EAGER)
    private List<Modelo> modelos = new ArrayList<>();
    
    @OneToMany(mappedBy = "anioFabricacion", fetch = FetchType.EAGER)
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
    // Constructores
    public AnioFabricacion() {
    }

    public AnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    // Getters & Setters
    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    // Other
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.anioFabricacion);
        hash = 41 * hash + Objects.hashCode(this.modelos);
        hash = 41 * hash + Objects.hashCode(this.vehiculos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnioFabricacion other = (AnioFabricacion) obj;
        if (!Objects.equals(this.anioFabricacion, other.anioFabricacion)) {
            return false;
        }
        if (!Objects.equals(this.modelos, other.modelos)) {
            return false;
        }
        if (!Objects.equals(this.vehiculos, other.vehiculos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnioFabricacion{" + "anioFabricacion=" + anioFabricacion + ", modelos=" + modelos + ", vehiculos=" + vehiculos + '}';
    }
}
