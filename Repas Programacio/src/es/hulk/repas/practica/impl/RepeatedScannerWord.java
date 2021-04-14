package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

import java.util.Scanner;

public class RepeatedScannerWord extends Practica1 {

    public static void RepeatedScannerWord() {
        Scanner scanner = new Scanner(System.in);
        String string = text.toLowerCase();
        String word = scanner.nextLine();
        String[] wordArray = string.split("\\W+");
        int counter = 0;

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == word) {
                counter++;
            }
        }
        System.out.println("La paraula: " + word + " es repeteix " + counter);
    }

}
