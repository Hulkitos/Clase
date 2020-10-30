package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex6 {

    public static void ifex6() {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        if (nota == 0 || nota == 1 || nota == 2 || nota == 3 || nota == 4 ) {
            System.out.println("Insuficient");
        } else if (nota == 5) {
            System.out.println("Suficient");
        } else if (nota == 6) {
            System.out.println("Be");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Excelent");
        }
    }
}
