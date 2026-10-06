package com.iesteis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        Path ruta = Path.of(args[0]);

        try {

            List<String> lineas = Files.readAllLines(ruta);

            String correctas = lineas.get(0);

            for (int i = 1; i < lineas.size(); i++) {

                String linea = lineas.get(i);

                // Buscar el primer espacio
                int espacio = linea.indexOf(' ');

                String codigo = linea.substring(0, espacio);
                String respuestas = linea.substring(espacio + 1);

                double nota = 0;

                for (int j = 0; j < correctas.length(); j++) {

                    char correcta = correctas.charAt(j);
                    char respuesta = respuestas.charAt(j);

                    if (respuesta == ' ') {
                        // En blanco: 0 puntos

                    } else if (respuesta == correcta) {
                        // Correcta: +0,5
                        nota += 0.5;

                    } else {
                        // Incorrecta: -0,15
                        nota -= 0.15;
                    }
                }

                System.out.println(codigo + " -> " + nota);
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
