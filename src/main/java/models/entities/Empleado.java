package models.entities;

import java.io.Serializable;
import javax.persistence.*;

/*

11 -> Domicilio
N1 -> Tipo de Documento

*/

@Entity
@Table (name = "Empleado")
public class Empleado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "numeroDocumento")
    private String numeroDocumento;
    
    @Column(name = "clave")
    private String clave;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoEmpleado")
    private TipoEmpleadoEnum tipoEmpleado;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipoDocumento")
    private TipoDocumento tipoDocumento;
    
    //Constructores
    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apellido, String numeroDocumento, String clave, TipoEmpleadoEnum tipoEmpleado, Domicilio domicilio, TipoDocumento tipoDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.clave = clave;
        this.tipoEmpleado = tipoEmpleado;
        this.domicilio = domicilio;
        this.tipoDocumento = tipoDocumento;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public TipoEmpleadoEnum getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleadoEnum tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
}