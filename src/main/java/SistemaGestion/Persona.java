package SistemaGestion;

import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String contacto;
    private String correoElectronico;
    private List<Direccion> direccion;

    public Persona(String cedula, String nombre, String apellido, String contacto,
                   String correoElectronico, List<Direccion> direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(List<Direccion> direccion) {
        this.direccion = direccion;
    }

    public void method() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", contacto='" + contacto + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}

