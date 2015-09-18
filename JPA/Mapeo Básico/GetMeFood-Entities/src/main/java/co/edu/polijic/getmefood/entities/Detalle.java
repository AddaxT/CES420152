package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_DETALLE_PEDIDOS")
public class Detalle implements Serializable {

    @EmbeddedId
    private DetallePk detallePk;
    @Column(name = "NMCANTIDAD")
    private Integer cantidad;
    @Column(name = "DSOBSERVACIONES")
    private String observaciones;
    @Column(name = "NMSUBTOTAL")
    private BigDecimal subtotal;
    @ManyToOne
    @JoinColumn(name = "DNICODIGO_PLATO")
    private Plato plato;
    @ManyToOne
    @JoinColumn(name = "NMCONSECUTIVO")
    private Pedido pedido;

    public Detalle() {
    }

    public Detalle(DetallePk detallePk, Integer cantidad, String observaciones, BigDecimal subtotal) {
        this.detallePk = detallePk;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.subtotal = subtotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public DetallePk getDetallePk() {
        return detallePk;
    }

    public void setDetallePk(DetallePk detallePk) {
        this.detallePk = detallePk;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.detallePk);
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
        final Detalle other = (Detalle) obj;
        return Objects.equals(this.detallePk, other.detallePk);
    }

    @Override
    public String toString() {
        return "Detalle{" + "detallePk=" + detallePk + ", cantidad=" + cantidad + ", observaciones=" + observaciones + ", subtotal=" + subtotal + '}';
    }
}
