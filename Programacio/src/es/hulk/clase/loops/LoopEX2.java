package es.hulk.clase.loops;

import java.util.Scanner;

public class LoopEX2 {
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueixi un numero: ");
        int i = scanner.nextInt();

        while (i > 0) {
            System.out.print("Introdueixi un numero: ");
            i = scanner.nextInt();
        }
        System.out.println("Negatiu");
    }
}
