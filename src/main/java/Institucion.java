import java.util.GregorianCalendar;

public class Institucion {
    private String idOficial;
    private String nombre;
    private GregorianCalendar fechaDeInicio;
    private String rol;

    public Institucion(String idOficial, String nombre, GregorianCalendar fechaDeInicio, String rol) {
        this.idOficial = idOficial;
        this.nombre = nombre;
        this.fechaDeInicio = fechaDeInicio;
        this.rol = rol;
    }

    public String getIdOficial() {
        return idOficial;
    }

    public void setIdOficial(String idOficial) {
        this.idOficial = idOficial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(GregorianCalendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void method() {
        // Implementación pendiente
    }
}