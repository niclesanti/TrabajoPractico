package models.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class DatosPolizaID implements Serializable {
    
    private int poliza;
    private Date fechaModificacionIncio;
    private Date fechaModificacionFin;

    // Constructores
    public DatosPolizaID() {
    }

    public DatosPolizaID(int poliza, Date fechaModificacionIncio, Date fechaModificacionFin) {
        this.poliza = poliza;
        this.fechaModificacionIncio = fechaModificacionIncio;
        this.fechaModificacionFin = fechaModificacionFin;
    }
    
    // Getters & Setters
    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
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
    
    // Equals & HashCode -> @Override
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.poliza);
        hash = 67 * hash + Objects.hashCode(this.fechaModificacionIncio);
        hash = 67 * hash + Objects.hashCode(this.fechaModificacionFin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DatosPolizaID other = (DatosPolizaID) obj;
        if (!Objects.equals(this.poliza, other.poliza)) {
            return false;
        }
        if (!Objects.equals(this.fechaModificacionIncio, other.fechaModificacionIncio)) {
            return false;
        }
        if (!Objects.equals(this.fechaModificacionFin, other.fechaModificacionFin)) {
            return false;
        }
        return true;
    }
    
}