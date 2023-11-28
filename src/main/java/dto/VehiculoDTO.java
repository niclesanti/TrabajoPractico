package dto;

public class VehiculoDTO {
 
    private String motor;
    private String chasis;
    private String patente;
    private String modelo;
    private String anioFabricacion;
    private String localidad;
    private String marca;
    
    // Constructores - Getters - Setters
    public VehiculoDTO() {
    }

    public VehiculoDTO(String motor, String chasis, String patente, String modelo, String anioFabricacion, String localidad, String marca) {
        this.motor = motor;
        this.chasis = chasis;
        this.patente = patente;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.localidad = localidad;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
}
