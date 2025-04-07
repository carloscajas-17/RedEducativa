package SistemaEducacion;

import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Docente(String cedula, String nombre, String apellido, String contacto,
                   String correoElectronico, List<Direccion> direccion,
                   List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(cedula, nombre, apellido, contacto, correoElectronico, direccion);
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    public void method() {
        // Implementación pendiente
    }
}

