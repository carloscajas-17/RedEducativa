package SistemaGestion;


import Enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {


    private Persona persona;
    private GregorianCalendar fechaEntrada;
    private Rol rol;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "persona=" + persona +
                ", fechaEntrada=" + fechaEntrada +
                ", rol=" + rol +
                '}';
    }
}

