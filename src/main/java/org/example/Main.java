package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VectorHeap<Paciente> emergencias = new VectorHeap<>();
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
            Paciente paciente = emergencias.remove();
            System.out.println(paciente);
        }
    }
}