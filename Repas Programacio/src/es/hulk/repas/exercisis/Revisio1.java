package es.hulk.repas.exercisis;

import java.util.Scanner;

public class Revisio1 {

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static boolean multiple(int num1, int num2) {
        int mult = num1 * num2;
        int div = mult % 0;
        if (div != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int countXifres(int num) {
        int xifres = 0;
        if (num <= 9) {
            return 1;
        } else if (num <= 99) {
            return 2;
        } else if (num <= 999) {
            return 3;
        } else if (num <= 9999) {
            return 4;
        } else if (num <= 10000) {
            return 5;
        }
        return xifres;
    }

    public static int menorInvertit(int num) {

        return num;
    }

    public static void daysBetween2Dates() {
        Scanner scanner = new Scanner(System.in);
        int dies = 30;
        int mesos = 12;
        int anys = 2090;

        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int any1 = scanner.nextInt();

        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int any2 = scanner.nextInt();

        int diesAny1 = any1 * 365;
        int diesAny2 = any2 * 365;

        int diesMesos1 = mes1 * 30;
        int diesMesos2 = mes2 * 30;

        int calcul1 = diesAny1 + diesMesos1 + dia1;
        int calcul2 = diesAny2 + diesMesos2 + dia2;

        int calculFinal = calcul1 - calcul2;

        System.out.println(calculFinal);
    }

    public static void dieferenciaHores() {
        Scanner scanner = new Scanner(System.in);
        int minutsSegons = 60;

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int secons = scanner.nextInt();

        int hores = 0;
        int minuts = 0;
        int segons = 0;

        if (hours <= 24 && minutes <= minutsSegons && secons <= minutsSegons) {
            if (segons < minutsSegons) {
                hores++;
            }
            if (hours < minutsSegons) {
                minuts++;
            }
        } else {
            System.out.println("Introdueix una hora correcte");
        }
    }
}
