package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatosPolizaDTO {
 
    private String nombreCliente;
    private String numeroCliente;
    
    private String numeroSiniestro;
    private String formaPago;
    private String estadoPoliza;
    private String tipoCobertura;
    
    private Date inicioVigencia;
    private Date finVigencia;
    
    private boolean guardaGarage;
    private boolean alarma;
    private boolean dispositivoRastreo;
    private boolean tuercaAntirrobo;
    
    private String kmAnio;
    private float importeDescuento;
    private float premio;
    private String sumaAsegurada;
    private float montoTotal;
    
    List<HijoDTO> hijos = new ArrayList<>();
    
    // Constructores - Getters - Setters
    public DatosPolizaDTO() {
    }

    public DatosPolizaDTO(String nombreCliente, String numeroCliente, String numeroSiniestro, String formaPago, String estadoPoliza, boolean guardaGarage, boolean alarma, boolean dispositivoRastreo, boolean tuercaAntirrobo, String kmAnio, String sumaAsegurada, float montoTotal) {
        this.nombreCliente = nombreCliente;
        this.numeroCliente = numeroCliente;
        this.numeroSiniestro = numeroSiniestro;
        this.formaPago = formaPago;
        this.estadoPoliza = estadoPoliza;
        this.guardaGarage = guardaGarage;
        this.alarma = alarma;
        this.dispositivoRastreo = dispositivoRastreo;
        this.tuercaAntirrobo = tuercaAntirrobo;
        this.kmAnio = kmAnio;
        this.sumaAsegurada = sumaAsegurada;
        this.montoTotal = montoTotal;
    }

    
    
    public List<HijoDTO> getHijos() {
        return hijos;
    }

    public void setHijos(List<HijoDTO> hijos) {
        this.hijos = hijos;
    }
    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroSiniestro() {
        return numeroSiniestro;
    }

    public void setNumeroSiniestro(String numeroSiniestro) {
        this.numeroSiniestro = numeroSiniestro;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(String estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
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

    public String getKmAnio() {
        return kmAnio;
    }

    public void setKmAnio(String kmAnio) {
        this.kmAnio = kmAnio;
    }

    public float getImporteDescuento() {
        return importeDescuento;
    }

    public void setImporteDescuento(float importeDescuento) {
        this.importeDescuento = importeDescuento;
    }

    public float getPremio() {
        return premio;
    }

    public void setPremio(float premio) {
        this.premio = premio;
    }
    
    

    public String getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(String sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFinVigencia() {
        return finVigencia;
    }

    public void setFinVigencia(Date finVigencia) {
        this.finVigencia = finVigencia;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    
    
}
