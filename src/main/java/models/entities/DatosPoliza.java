package models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/*

11 -> Vehiculo
1N -> Persona
1N -> Cuotas
N1 -> Tipo de Cobertura
N1 -> Poliza

*/

@Entity
@Table (name = "DatosPoliza")
@IdClass(DatosPolizaID.class)
public class DatosPoliza implements Serializable {
    
    @Id
    @ManyToOne()
    @JoinColumn(name = "numeroPoliza_poliza")
    private Poliza poliza;
    
    @Id
    @Temporal(TemporalType.DATE)
    @Column (name = "fechaModificacionInicio")
    private Date fechaModificacionIncio;
    
    @Id
    @Temporal(TemporalType.DATE)
    @Column (name = "fechaModificacionFin")
    private Date fechaModificacionFin;
    
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "patente_vehiculo")
    private Vehiculo vehiculo;
    
    @OneToMany (mappedBy = "datosPoliza", cascade = CascadeType.ALL)
    private List<Cuota> cuotas = new ArrayList<>();
    
    @OneToMany (mappedBy = "datosPoliza", cascade = CascadeType.ALL)
    private List<Persona> hijos = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn (name = "id_tipoCobertura")
    private TipoCobertura tipoCobertura;
            
    @Enumerated(EnumType.STRING)
    @Column(name = "numeroSiniestros")
    private NumeroSiniestrosEnum numeroSiniestros;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "formaPago")
    private FormaPagoEnum formaPago;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estadoPoliza")
    private EstadoPolizaEnum estadoPoliza;
    
    @Column (name = "sumaAsegurada")
    private Integer sumaAsegurada;
    
    @Column (name = "kmPorAnio")
    private Integer kmPorAnio;
    
    @Column (name = "guardaGarage")
    private boolean guardaGarage;
    
    @Column (name = "alarma")
    private boolean alarma;
    
    @Column (name = "dispositivoRastreo")
    private boolean dispositivoRastreo;
    
    @Column (name = "tuercaAntirrobo")
    private boolean tuercaAntirrobo;
    
    @Column (name = "noRenovar")
    private boolean noRenovar;
    
    @Temporal(TemporalType.DATE)
    @Column (name = "fechaInicioVigencia")
    private Date fechaInicioVigencia;
    
    @Temporal(TemporalType.DATE)
    @Column (name = "fechaFinVigencia")
    private Date fechaFinVigencia;
    
    @Temporal(TemporalType.DATE)
    @Column (name = "fechaRenovacion")
    private Date fechaRenovacion;
    
    @Column (name = "montoTotal")
    private Integer montoTotal;
    
    // Constructores
    public DatosPoliza() {
    }

    public DatosPoliza(Poliza poliza, Date fechaModificacionIncio, Date fechaModificacionFin, Vehiculo vehiculo, List<Cuota> cuotas, List<Persona> hijos, NumeroSiniestrosEnum numeroSiniestros, FormaPagoEnum formaPago, EstadoPolizaEnum estadoPoliza, Integer sumaAsegurada, Integer kmPorAnio, boolean guardaGarage, boolean alarma, boolean dispositivoRastreo, boolean tuercaAntirrobo, boolean noRenovar, Date fechaInicioVigencia, Date fechaFinVigencia, Date fechaRenovacion, Integer montoTotal) {
        this.poliza = poliza;
        this.fechaModificacionIncio = fechaModificacionIncio;
        this.fechaModificacionFin = fechaModificacionFin;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
        this.hijos = hijos;
        this.numeroSiniestros = numeroSiniestros;
        this.formaPago = formaPago;
        this.estadoPoliza = estadoPoliza;
        this.sumaAsegurada = sumaAsegurada;
        this.kmPorAnio = kmPorAnio;
        this.guardaGarage = guardaGarage;
        this.alarma = alarma;
        this.dispositivoRastreo = dispositivoRastreo;
        this.tuercaAntirrobo = tuercaAntirrobo;
        this.noRenovar = noRenovar;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaRenovacion = fechaRenovacion;
        this.montoTotal = montoTotal;
    }
    
    // Getters & Setters
    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Date getFechaModificacionIncio() {
        return fechaModificacionIncio;
    }

    public void setFechaModificacionIncio(Date fechaModificacionIncio) {
        this.fechaModificacionIncio = fechaModificacionIncio;
    }

    public Date getFechaModificacionFin() {
        return fechaModificacionFin;
    }

    public void setFechaModificacionFin(Date fechaModificacionFin) {
        this.fechaModificacionFin = fechaModificacionFin;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public List<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(List<Persona> hijos) {
        this.hijos = hijos;
    }

    public NumeroSiniestrosEnum getNumeroSiniestros() {
        return numeroSiniestros;
    }

    public void setNumeroSiniestros(NumeroSiniestrosEnum numeroSiniestros) {
        this.numeroSiniestros = numeroSiniestros;
    }

    public FormaPagoEnum getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPagoEnum formaPago) {
        this.formaPago = formaPago;
    }

    public EstadoPolizaEnum getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(EstadoPolizaEnum estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public Integer getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Integer sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public Integer getKmPorAnio() {
        return kmPorAnio;
    }

    public void setKmPorAnio(Integer kmPorAnio) {
        this.kmPorAnio = kmPorAnio;
    }

    public boolean isGuardaGarage() {
        return guardaGarage;
    }

    public void setGuardaGarage(boolean guardaGarage) {
        this.guardaGarage = guardaGarage;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public boolean isDispositivoRastreo() {
        return dispositivoRastreo;
    }

    public void setDispositivoRastreo(boolean dispositivoRastreo) {
        this.dispositivoRastreo = dispositivoRastreo;
    }

    public boolean isTuercaAntirrobo() {
        return tuercaAntirrobo;
    }

    public void setTuercaAntirrobo(boolean tuercaAntirrobo) {
        this.tuercaAntirrobo = tuercaAntirrobo;
    }

    public boolean isNoRenovar() {
        return noRenovar;
    }

    public void setNoRenovar(boolean noRenovar) {
        this.noRenovar = noRenovar;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
}
