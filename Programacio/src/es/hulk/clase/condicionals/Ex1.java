package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex1 {

    public static void ifex1() {
        Scanner scan = new Scanner(System.in);

        int num;

        num = scan.nextInt();

        if (num > 0 ) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

}
