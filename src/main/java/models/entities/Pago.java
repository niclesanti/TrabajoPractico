package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/*

1N -> Cuota
N1 - Empleado (Cobrador de Seguros)

*/

@Entity
@Table (name = "Pago")
public class Pago implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "numeroRecibo")
    private Integer numeroRecibo;
    
    @Column(name = "monto")
    private Float monto;
    
    @Column(name = "premio")
    private Float premio;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fechaPago")
    private Date fechaPago;
    
    @OneToMany(mappedBy = "pago")
    private List<Cuota> cuotas = new ArrayList();
    
    @ManyToOne
    @JoinColumn (name = "id_empleadoCobrador")
    private Empleado empelado;
    
    //Constructores
    public Pago() {
    }

    public Pago(Integer numeroRecibo, Float monto, Float premio, Date fechaPago, Empleado empelado) {
        this.numeroRecibo = numeroRecibo;
        this.monto = monto;
        this.premio = premio;
        this.fechaPago = fechaPago;
        this.empelado = empelado;
    }

    // Getters & Setters
    public Integer getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(Integer numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Float getPremio() {
        return premio;
    }

    public void setPremio(Float premio) {
        this.premio = premio;
    }

    public Date getFecha() {
        return fechaPago;
    }

    public void setFecha(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public Empleado getEmpelado() {
        return empelado;
    }

    public void setEmpelado(Empleado empelado) {
        this.empelado = empelado;
    }
    
}