package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

import java.util.Scanner;

public class RepeatedScannerChar extends Practica1 {

    public static void RepeatedScannerChar() {
        Scanner scanner = new Scanner(System.in);
        String string = text.toLowerCase();
        char scan = scanner.next().charAt(0);
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == scan) {
                counter++;
            }
        }
        System.out.println("Numero de aparicions del caracter: " + scan + " amb un total de " + counter + " repeticions");
    }
}
