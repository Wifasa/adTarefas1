package com.iesteis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main5 {

    public static void main(String[] args) {

        Path ruta = Path.of(args[0]);
        Path resultado = Path.of("marcas.txt");

        Map<String, List<String>> marcas = new HashMap<>();

        try {

            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {

                // Separar marca y modelo
                int espacio = linea.indexOf(' ');

                String marca = linea.substring(0, espacio);
                String modelo = linea.substring(espacio + 1);

                if (!marcas.containsKey(marca)) {
                    marcas.put(marca, new ArrayList<>());
                }

                marcas.get(marca).add(modelo);
            }

            List<String> listaMarcas = new ArrayList<>(marcas.keySet());

            Collections.sort(listaMarcas);

            List<String> salida = new ArrayList<>();

            for (String marca : listaMarcas) {

                List<String> modelos = marcas.get(marca);

                Collections.sort(modelos);

                String linea = marca + ": ";

                for (int i = 0; i < modelos.size(); i++) {

                    linea += modelos.get(i);

                    if (i < modelos.size() - 1) {
                        linea += ", ";
                    }
                }

                salida.add(linea);
            }

            Files.write(resultado, salida);

            System.out.println("Fichero creado: " + resultado);

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}