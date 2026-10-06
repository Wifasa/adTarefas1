package com.iesteis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej1 {
    static void main(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert ls route (default = Current route): ");
            String ruta = scanner.nextLine();
            ProcessBuilder builder = new ProcessBuilder("powershell.exe", "ls", ruta);
            builder.redirectErrorStream(true);
            Process proceso = builder.start();

            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            proceso.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
