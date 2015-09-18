package co.edu.polijic.getmefood.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_EMPLEADOS")
public class Empleado extends Persona {

    @Column(name = "DSCARGO")
    private String cargo;
    @Column(name = "FEINGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "FERETIRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRetiro;
    @OneToMany(mappedBy = "digita")
    private List<Pedido> pedidos;

    public Empleado() {
    }

    public Empleado(String cargo, Date fechaIngreso, Date fechaRetiro, String documento, TipoDocumento tipoDocumento, String nombre) {
        super(documento, tipoDocumento, nombre);
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", fechaIngreso=" + fechaIngreso + ", fechaRetiro=" + fechaRetiro + '}';
    }
}
