package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_PERSONAS")
public class Persona implements Serializable {

    @Id
    private String documento;
    private TipoDocumento tipoDocumento;
    private String nombre;

    public Persona() {
    }

    public Persona(String documento, TipoDocumento tipoDocumento, String nombre) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.documento);
        hash = 53 * hash + Objects.hashCode(this.tipoDocumento);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return this.tipoDocumento == other.tipoDocumento;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + '}';
    }
}
