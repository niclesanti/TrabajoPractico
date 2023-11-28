package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/*

1N -> Datos Poliza
N1 -> Cliente

*/

@Entity
@Table (name = "Poliza")
public class Poliza implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    
    @Column (name = "numeroPoliza")
    private long numeroPoliza;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "id_persona_cliente")
    private Cliente cliente;
    
    @OneToMany(mappedBy = "poliza")
    private List<DatosPoliza> datosPolizas = new ArrayList();
    
    //Constructores
    public Poliza() {
    }

    public Poliza(Integer id, long numeroPoliza, Cliente cliente) {
        this.id = id;
        this.numeroPoliza = numeroPoliza;
        this.cliente = cliente;
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(long numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DatosPoliza> getDatosPolizas() {
        return datosPolizas;
    }

    public void setDatosPolizas(List<DatosPoliza> datosPolizas) {
        this.datosPolizas = datosPolizas;
    }
    
}