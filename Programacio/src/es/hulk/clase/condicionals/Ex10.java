package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex10 {
    public static void ifex10() {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age < 65) {
            System.out.println("No es major d'edat");
         } else {
            System.out.println("Si es major d'edat");
        }
    }
}
