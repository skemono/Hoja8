package org.example;

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String descripcionSintoma;
    private char codigoEmergencia;

    public Paciente(String nombre, String descripcionSintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.descripcionSintoma = descripcionSintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcionSintoma() {
        return descripcionSintoma;
    }

    public char getCodigoEmergencia() {
        return codigoEmergencia;
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        // Comparar pacientes según su código de emergencia
        return Character.compare(this.codigoEmergencia, otroPaciente.codigoEmergencia);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Síntoma: " + descripcionSintoma + ", Prioridad: " + codigoEmergencia;
    }
}
