package es.hulk.repas.exercisis;

import java.util.Scanner;

public class Bucles {

    private static final Scanner scan = new Scanner(System.in);

    public static void printNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void stopNegativInt() {
        int num = scan.nextInt();

        while (num > 0) {
            num = scan.nextInt();
        }
        System.out.println("Negatiu");
    }

    public static void stopOnZero() {
        int num = scan.nextInt();

        while (num != 0) {
            num = scan.nextInt();
        }
        System.out.println("Stopped on " + num);
    }

    public static void stopOnMultiple() {
        int num = scan.nextInt();
        int mult = 2;
        int rest = num % mult;

        for (int i = 0; i < mult; i++) {
            if (rest != 0) {
                num = scan.nextInt();
            }
        }
        System.out.println("Numero multiple");
    }

    public static void stopOnNegative() {
        int num = scan.nextInt();
        int counter = 0;

        while (num > 0) {
            counter++;
            num = scan.nextInt();
        }
        System.out.println("Numero Negatiu");
        System.out.println(counter + " numeros positius introduits.");
    }

    public static void sumaEnters() {
        int num = scan.nextInt();
        int aux = num;

        while (num != 0) {
            num = scan.nextInt();
            aux += num;
        }
        System.out.println(aux);
    }

    public static void averageCalculator() {
        double num = scan.nextInt();
        double aux = num;
        double counter = 0;

        while (num != 0) {
            num = scan.nextInt();
            aux += num;
            counter++;
        }

        double average = aux / counter;
        System.out.println(counter);
        System.out.println(aux);
        System.out.println(average);
    }

    public static void searchIntSenar() {
        int num = scan.nextInt();
    }

}
