package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_UNIDADES_MEDIDAS")
public class UnidadMedida implements Serializable {

    @Id
    @Column(name = "DNICODIGO")
    private Integer id;
    @Column(name = "DSDESCRIPCION")
    private String descripcion;
    @Column(name = "OPMEDIDA_FISICA")
    @Enumerated(EnumType.STRING)
    private MedidaFisica medidaFisica;
    @OneToMany(mappedBy = "unidadMedida")
    private List<Ingrediente> ingredientes;

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

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
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
