package com.iesteis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Ej2 {
    static void main(){
        Path ruta = Path.of("src/main/resources/data/palabras.txt");
        Map<Character, Integer> chars = new HashMap<>();
        Integer nOcur = 0;
        char wantedChar = 'a';
        try {
            String text = Files.readAllLines(ruta).toString().trim();
            for (int i = 0; i <  text.length(); i++){
                chars.put(text.toLowerCase().charAt(i), Optional.ofNullable(chars.get(i)).orElse(0) + 1);
                if(text.toLowerCase().charAt(i) == wantedChar){
                    nOcur += 1;
                }
            }
            System.out.println(text);
            System.out.println(chars);
            System.out.println("Total '" + wantedChar + "' : " + nOcur );


        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
