package es.hulk.clase.loops;

import java.util.Scanner;

public class LoopEX5 {
    public static void Exercise() {
        Scanner scanner = new Scanner(System.in);

        int n;
        int contador = 0;

        do {
            System.out.println("Introdueix un numero: ");
            n = scanner.nextInt();
            contador++;
        } while (n >= 0);
        if (n < 0) {
            System.out.println("Has introduït " + contador + " numeros");
        }
    }
}
