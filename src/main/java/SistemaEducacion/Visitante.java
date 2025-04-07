package SistemaEducacion;

import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String cedula, String nombre, String apellido, String contacto,
                     String correoElectronico, List<Direccion> direccion,
                     String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(cedula, nombre, apellido, contacto, correoElectronico, direccion);
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void method() {
        // Implementación pendiente
    }
}
