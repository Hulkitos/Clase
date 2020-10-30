package es.hulk.clase.condicionals.ex4;

import java.util.Scanner;

public class IF {

    public static void ifex4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day ==3) {
            System.out.println("Wednsday");
        }
        if (day == 4) {
            System.out.println("Thursday");
        }
        if (day == 5) {
            System.out.println("Friday");
        }
        if (day == 6) {
            System.out.println("Saturday");
        }
        if (day == 7) {
            System.out.println("Sunday");
        }
    }
}
