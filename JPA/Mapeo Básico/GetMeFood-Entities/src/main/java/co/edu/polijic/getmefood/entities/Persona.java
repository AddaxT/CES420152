package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author AddaxT
 */
@MappedSuperclass
public class Persona implements Serializable {

    @EmbeddedId
    private PersonaPK personaPK;
    @Column(name = "DSNOMBRE")
    private String nombre;

    public Persona() {
    }

    public Persona(String documento, TipoDocumento tipoDocumento, String nombre) {
        this.personaPK = new PersonaPK(documento, tipoDocumento);
        this.nombre = nombre;
    }

    public PersonaPK getPersonaPK() {
        return personaPK;
    }

    public void setPersonaPK(PersonaPK personaPK) {
        this.personaPK = personaPK;
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
        hash = 29 * hash + Objects.hashCode(this.personaPK);
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
        return Objects.equals(this.personaPK, other.personaPK);
    }

    @Override
    public String toString() {
        return "Persona{" + "personaPK=" + personaPK + ", nombre=" + nombre + '}';
    }
}
