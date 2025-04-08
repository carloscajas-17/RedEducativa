package SistemaGestion;

import java.util.List;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula, String nombre, String apellido, String contacto,
                      String correoElectronico, List<Direccion> direccion, String carrera) {
        super(cedula, nombre, apellido, contacto, correoElectronico, direccion);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void method() {
        // Implementación pendiente
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
