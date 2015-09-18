package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_PLATOS")
public class Plato implements Serializable {

    @Id
    @Column(name = "DNICODIGO_PLATO")
    private Integer id;
    @Column(name = "DSNOMBRE")
    private String descripcion;
    @Column(name = "NMVALOR")
    private Double valor;
    @ManyToMany(mappedBy = "platos")
    private List<Ingrediente> ingredientes;
    @OneToMany(mappedBy = "plato")
    private List<Detalle> detalles;

    public Plato() {
    }

    public Plato(Integer id, String descripcion, Double valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Plato other = (Plato) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Plato{" + "id=" + id + ", descripcion=" + descripcion + ", valor=" + valor + '}';
    }
}
