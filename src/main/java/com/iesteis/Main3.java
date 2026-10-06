package com.iesteis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        Path ruta = Path.of(args[0]);

        try {

            List<String> lineas = Files.readAllLines(ruta);

            switch (args[1]) {

                case "asc":
                    Collections.sort(lineas);
                    break;

                case "asc_non_case":
                    Collections.sort(lineas, String.CASE_INSENSITIVE_ORDER);
                    break;

                case "desc":
                    Collections.sort(lineas, Collections.reverseOrder());
                    break;

                case "desc_non_case":
                    Collections.sort(lineas,
                            Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
                    break;
            }

            String nombre = ruta.getFileName().toString();

            int punto = nombre.lastIndexOf('.');

            String nombreResultado = nombre.substring(0, punto)
                    + "_" + args[1]
                    + nombre.substring(punto);

            Path resultado = ruta.resolveSibling(nombreResultado);

            Files.write(resultado, lineas);

            System.out.println("Fichero creado: " + resultado);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}