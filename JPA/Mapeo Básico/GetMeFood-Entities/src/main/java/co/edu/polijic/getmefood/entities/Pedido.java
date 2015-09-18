package co.edu.polijic.getmefood.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_PEDIDOS")
public class Pedido implements Serializable {

    @TableGenerator(name = "PedGen",
            table = "TGF_SEQ",
            pkColumnName = "GEN_KEY",
            valueColumnName = "GEN_VALUE",
            pkColumnValue = "PED_CON",
            initialValue = 1,
            allocationSize = 1
    )
    @Id
    @Column(name = "NMCONSECUTIVO")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "PedGen")
    private Integer consecutivo;
    @Column(name = "FEPEDIDO")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Transient
    private BigDecimal total;
    @Column(name = "DSDIRECCION")
    private String direccion;
    @Column(name = "DSTELEFONO")
    private String telefono;
    @OneToMany(mappedBy = "pedido")
    private List<Detalle> detalles;
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "DNIDOCUMENTO_CLIENTE"),
        @JoinColumn(name = "OPTIPO_DOCUMENTO_CLIENTE")
    })
    private Cliente cliente;
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "DNIDOCUMENTO_EMPLEADO"),
        @JoinColumn(name = "OPTIPO_DOCUMENTO_EMPLEADO")
    })
    private Empleado digita;

    public Pedido() {
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getDigita() {
        return digita;
    }

    public void setDigita(Empleado digita) {
        this.digita = digita;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.consecutivo);
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
        final Pedido other = (Pedido) obj;
        return Objects.equals(this.consecutivo, other.consecutivo);
    }

    @Override
    public String toString() {
        return "Pedido{" + "consecutivo=" + consecutivo + ", fecha=" + fecha + ", total=" + total + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
