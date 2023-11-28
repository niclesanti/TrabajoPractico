package models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/*

N1 -> Pago
N1 -> Poliza

*/

@Entity
@Table (name = "Cuota")
public class Cuota implements Serializable{
    
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
    @JoinColumn(name = "numeroRecibo_pago")
    private Pago pago;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "ultimoDiaDePago")
    private Date ultimoDiaDePago;
    
    @Column(name = "importeOriginal")
    private Float importeOriginal;
    
    @Column(name = "importeActual")
    private Float importeActual;
    
    //Constructores
    public Cuota() {
    }

    public Cuota(Integer id, DatosPoliza datosPoliza, Pago pago, Date ultimoDiaDePago, Float importeOriginal, Float importeActual) {
        this.id = id;
        this.datosPoliza = datosPoliza;
        this.pago = pago;
        this.ultimoDiaDePago = ultimoDiaDePago;
        this.importeOriginal = importeOriginal;
        this.importeActual = importeActual;
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

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Date getUltimoDiaDePago() {
        return ultimoDiaDePago;
    }

    public void setUltimoDiaDePago(Date ultimoDiaDePago) {
        this.ultimoDiaDePago = ultimoDiaDePago;
    }

    public Float getImporteOriginal() {
        return importeOriginal;
    }

    public void setImporteOriginal(Float importeOriginal) {
        this.importeOriginal = importeOriginal;
    }

    public Float getImporteActual() {
        return importeActual;
    }

    public void setImporteActual(Float importeActual) {
        this.importeActual = importeActual;
    }
    
}