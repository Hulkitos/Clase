package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex3 {

    public static void ifex3() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Es major es " + a);
        } else if (a < b) {
            System.out.println("Es menor es " + a);
        } else {
            System.out.println("Iguals");
        }
    }
}
