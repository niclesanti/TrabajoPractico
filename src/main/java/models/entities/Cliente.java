package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

11 -> Domicilio
N1 -> Condición de IVA
N1 -> Tipo de Documento
N1 -> Estado Civil
1N -> Poliza

*/

@Entity
@Table (name = "Cliente")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_persona")
    private int id_persona;
    
    @Column (name = "numeroCliente", unique = true)
    private int numeroCliente;
    
    @Column (name = "nombre")
    private String nombre;
    
    @Column (name = "apellido")
    private String apellido;
    
    @Column (name = "numeroDocumento")
    private String numeroDocumento;
    
    @Column(name = "cuil")
    private String cuil;
    
    @Column(name = "anioDeRegistro")
    private Integer anioDeRegistro;
    
    @Column(name = "mail")
    private String mail;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "categoriaCliente")
    private CategoriaClienteEnum categoriaCliente;
    
    @Column(name = "profesion")
    private String profesion;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipoDocumento")
    private TipoDocumento tipoDocumento;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_condicionIVA")
    private CondicionIVA condicionIVA;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estadoCivil")
    private EstadoCivil estadoCivil;
    
    @OneToMany(mappedBy = "cliente")
    private List<Poliza> polizas = new ArrayList();
    
    // Constructores
    public Cliente() {
    }

    public Cliente(int id_persona, int numeroCliente, String nombre, String apellido, String numeroDocumento, String cuil, Integer anioDeRegistro, String mail, CategoriaClienteEnum categoriaCliente, String profesion, Domicilio domicilio, TipoDocumento tipoDocumento, CondicionIVA condicionIVA, EstadoCivil estadoCivil) {
        this.id_persona = id_persona;
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.cuil = cuil;
        this.anioDeRegistro = anioDeRegistro;
        this.mail = mail;
        this.categoriaCliente = categoriaCliente;
        this.profesion = profesion;
        this.domicilio = domicilio;
        this.tipoDocumento = tipoDocumento;
        this.condicionIVA = condicionIVA;
        this.estadoCivil = estadoCivil;
    }
    
    // Getters & Setters
    
    public boolean addPoliza (Poliza poliza) {
        if (!polizas.contains(poliza)){
            polizas.add(poliza);
            poliza.setCliente(this);
            return true;
        } else {
            return false;
        }
    }
    
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
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

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public Integer getAnioDeRegistro() {
        return anioDeRegistro;
    }

    public void setAnioDeRegistro(Integer anioDeRegistro) {
        this.anioDeRegistro = anioDeRegistro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public CategoriaClienteEnum getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(CategoriaClienteEnum categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
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

    public CondicionIVA getCondicionIVA() {
        return condicionIVA;
    }

    public void setCondicionIVA(CondicionIVA condicionIVA) {
        this.condicionIVA = condicionIVA;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(List<Poliza> polizas) {
        this.polizas = polizas;
    }
    
}