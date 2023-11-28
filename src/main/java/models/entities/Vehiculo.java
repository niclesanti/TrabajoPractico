package models.entities;

import java.io.Serializable;
import javax.persistence.*;

/*

11 -> Datos Poliza
N1 -> Localidad
N1 -> Año de Fabricación
N1 -> Modelo

*/

@Entity
@Table (name = "Vehiculo")
public class Vehiculo implements Serializable{

    @Id
    @Column (name = "patente")
    private String patente;
    
    @Column (name = "motor")
    private String motor;
    
    @Column (name = "chasis")
    private String chasis;
    
    @ManyToOne()
    @JoinColumn (name = "id_modelo")
    private Modelo modelo;
    
    @ManyToOne()
    @JoinColumn (name = "id_localidad")
    private Localidad localidad;
    
    @ManyToOne()
    @JoinColumn (name = "anio_anioFabricacion")
    private AnioFabricacion anioFabricacion;
    
    @OneToOne(mappedBy = "vehiculo")
    private DatosPoliza datosPoliza;
    
    // Constructores
    public Vehiculo() {
    }

    public Vehiculo(String patente, String motor, String chasis, Modelo modelo, Localidad localidad, AnioFabricacion anioFabricacion, DatosPoliza datosPoliza) {
        this.patente = patente;
        this.motor = motor;
        this.chasis = chasis;
        this.modelo = modelo;
        this.localidad = localidad;
        this.anioFabricacion = anioFabricacion;
        this.datosPoliza = datosPoliza;
    }
    
    // Getters & Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public AnioFabricacion getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(AnioFabricacion anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public DatosPoliza getDatosPoliza() {
        return datosPoliza;
    }

    public void setDatosPoliza(DatosPoliza datosPoliza) {
        this.datosPoliza = datosPoliza;
    }    
}
