package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class ProgramaAtencionEmergenciasJavaCollections {

    public static void main(String[] args) {
        PriorityQueue<Paciente> emergencias = new PriorityQueue<>();
        String archivo = "pacientes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    String sintoma = datos[1].trim();
                    char codigoEmergencia = datos[2].trim().charAt(0);
                    emergencias.add(new Paciente(nombre, sintoma, codigoEmergencia));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Orden de atención de pacientes:");
        while (!emergencias.isEmpty()) {
            Paciente paciente = emergencias.poll();
            System.out.println(paciente);
        }
    }
}
