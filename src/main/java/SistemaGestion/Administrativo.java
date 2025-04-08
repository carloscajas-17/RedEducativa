package SistemaGestion;

import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(String cedula, String nombre, String apellido, String contacto,
                          String correoElectronico, List<Direccion> direccion,
                          List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, contacto, correoElectronico, direccion);
        this.cargos = cargos;
        this.responsabilidades = responsabilidades;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }

    public void method() {
        // Implementación pendiente
    }
}
