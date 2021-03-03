package es.hulk.repas.exercisis;

import java.util.Scanner;

public class Condicionals {

    private static final Scanner scanner = new Scanner(System.in);

    public static void ex1() {
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Negatiu");
        } else {
            System.out.println("Positiu");
        }
    }
}
