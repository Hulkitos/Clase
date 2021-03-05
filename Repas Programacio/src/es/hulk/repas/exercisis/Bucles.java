package es.hulk.repas.exercisis;

import java.util.Scanner;

public class Bucles {

    public static void printNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void stopNegativInt() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num > 0) {
            System.out.println(num);
            num = scan.nextInt();
        }
        System.out.println("Negatiu");
    }

    public static void stopOnZero() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num != 0) {
            System.out.println(num);
            num = scan.nextInt();
        }
        System.out.println("Stopped on " + num);
    }
}
