package dto;

public class CuotaDTO {
 
    private String ultimoDiaPago;
    private Float importeOriginal;
    private Float importeActual;
    
    // Constructores - Getters - Setters
    public CuotaDTO() {
    }

    public CuotaDTO(String ultimoDiaPago, Float importeOriginal, Float importeActual) {
        this.ultimoDiaPago = ultimoDiaPago;
        this.importeOriginal = importeOriginal;
        this.importeActual = importeActual;
    }

    public String getUltimoDiaPago() {
        return ultimoDiaPago;
    }

    public void setUltimoDiaPago(String ultimoDiaPago) {
        this.ultimoDiaPago = ultimoDiaPago;
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
