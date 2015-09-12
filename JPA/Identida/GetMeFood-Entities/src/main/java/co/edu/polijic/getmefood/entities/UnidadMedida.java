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
@Table(name = "TGF_UNIDADES_MEDIDAS")
public class UnidadMedida implements Serializable {

    @Id
    private Integer id;
    private String descripcion;
    private MedidaFisica medidaFisica;

    public UnidadMedida() {
    }

    public UnidadMedida(Integer id, String descripcion, MedidaFisica medidaFisica) {
        this.id = id;
        this.descripcion = descripcion;
        this.medidaFisica = medidaFisica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MedidaFisica getMedidaFisica() {
        return medidaFisica;
    }

    public void setMedidaFisica(MedidaFisica medidaFisica) {
        this.medidaFisica = medidaFisica;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final UnidadMedida other = (UnidadMedida) obj;
        return Objects.equals(this.id, other.id);
    }
}
