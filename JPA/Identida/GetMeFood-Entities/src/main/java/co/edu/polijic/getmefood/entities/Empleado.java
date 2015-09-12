package co.edu.polijic.getmefood.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_EMPLEADOS")
public class Empleado extends Persona {

    private String cargo;
    private Date fechaIngreso;
    private Date fechaRetiro;

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

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + ", fechaIngreso=" + fechaIngreso + ", fechaRetiro=" + fechaRetiro + '}';
    }
}
