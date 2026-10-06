package com.iesteis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Path ruta = Path.of("src/main/resources/data/palabras.txt");

        Map<Character, Integer> chars = new HashMap<>();

        int nOcur = 0;
        char wantedChar = 'a';

        try {
            String text = Files.readString(ruta).toLowerCase();

            for (int i = 0; i < text.length(); i++) {

                char c = text.charAt(i);

                // Contar carácter
                chars.put(c, chars.getOrDefault(c, 0) + 1);

                // Contar carácter buscado
                if (c == wantedChar) {
                    nOcur++;
                }
            }

            System.out.println(text);
            System.out.println(chars);
            System.out.println("Total '" + wantedChar + "' : " + nOcur);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}