package co.edu.polijic.getmefood.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author AddaxT
 */
@Entity
@Table(name = "TGF_CLIENTES")
public class Cliente extends Persona {

    private String correo;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String correo, String telefono, String direccion, String documento, TipoDocumento tipoDocumento, String nombre) {
        super(documento, tipoDocumento, nombre);
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
