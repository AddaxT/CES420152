package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author AddaxT
 */
@Embeddable
public class DetallePk implements Serializable {

    @Column(name = "NMCONSECUTIVO")
    private Integer consecutivo;
    @Column(name = "NMLINEA")
    private Integer linea;

    public DetallePk() {
    }

    public DetallePk(Integer consecutivo, Integer linea) {
        this.consecutivo = consecutivo;
        this.linea = linea;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Integer getLinea() {
        return linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.consecutivo);
        hash = 59 * hash + Objects.hashCode(this.linea);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetallePk other = (DetallePk) obj;
        if (!Objects.equals(this.consecutivo, other.consecutivo)) {
            return false;
        }
        return Objects.equals(this.linea, other.linea);
    }

    @Override
    public String toString() {
        return "DetallePk{" + "consecutivo=" + consecutivo + ", linea=" + linea + '}';
    }
}
