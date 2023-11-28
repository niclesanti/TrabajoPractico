package models.entities;

import java.io.Serializable;
import javax.persistence.*;

/*

11 -> Empleado
11 -> Cliente
N1 -> Localidad

*/

@Entity
@Table (name = "Domicilio")
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_localidad")
    private Localidad localidad;
    
    @Column(name = "calle")
    private String calle;
    
    @Column(name = "piso")
    private Integer numero;
    
    @Column(name = "numero")
    private Integer piso;
    
    @Column(name = "codigoPostal")
    private String codigoPostal;
    
    @Column(name = "departamento")
    private String departamento;
    
    @OneToOne (mappedBy = "domicilio")
    private Empleado empleados;
    
    @OneToOne (mappedBy = "domicilio")
    private Cliente clientes;
    
    //Constructores
    public Domicilio() {
    }

    public Domicilio(int id, Localidad localidad, String calle, Integer numero, Integer piso, String codigoPostal, String departamento, Empleado empleados, Cliente clientes) {
        this.id = id;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.codigoPostal = codigoPostal;
        this.departamento = departamento;
        this.empleados = empleados;
        this.clientes = clientes;
    }
    
    // Setters & Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    
}