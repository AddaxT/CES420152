package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_INGREDIENTES")
public class Ingrediente implements Serializable {

    @Id
    @Column(name = "DSEAN13")
    private String ean13;
    @Column(name = "DSDESCRIPCION")
    private String descripcion;
    @Column(name = "NMVALOR_UNITARIO")
    private Double valorUnitario;
    @ManyToOne
    @JoinColumn(name = "DNICATEGORIA")
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "DNICODIGO_UNIDAD_MEDIDA")
    private UnidadMedida unidadMedida;
    @ManyToMany
    @JoinTable(name = "TGF_INGREDIENTE_PLATOS",
            joinColumns = @JoinColumn(name = "DSEAN13"),
            inverseJoinColumns = @JoinColumn(name = "DNICODIGO_PLATO"))
    private List<Plato> platos;

    public Ingrediente() {
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.ean13);
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
        final Ingrediente other = (Ingrediente) obj;
        return Objects.equals(this.ean13, other.ean13);
    }
}
