package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/*

N1 -> DatosPoliza
N1 -> EstadoCivil

*/

@Entity
@Table (name = "Persona")
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumns({
        @JoinColumn(name = "numeroPoliza_poliza", referencedColumnName = "numeroPoliza"),
        @JoinColumn(name = "fechaModificacionInicio", referencedColumnName = "fechaModificacionInicio"),
        @JoinColumn(name = "fechaModificacionFin", referencedColumnName = "fechaModificacionFin")
    })
    private DatosPoliza datosPoliza;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_EstadoCivil")
    private EstadoCivil estadoCivil;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private SexoEnum sexo;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FechaNacimiento")
    private Date fechaNacimiento;
    
    //Constructores
    public Persona() {
    }

    public Persona(Integer id, DatosPoliza datosPoliza, EstadoCivil estadoCivil, SexoEnum sexo, Date fechaNacimiento) {
        this.id = id;
        this.datosPoliza = datosPoliza;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DatosPoliza getDatosPoliza() {
        return datosPoliza;
    }

    public void setDatosPoliza(DatosPoliza datosPoliza) {
        this.datosPoliza = datosPoliza;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}