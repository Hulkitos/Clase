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

        if (dia1 <= dies && dia2 <= dies && mes1 <= mesos && mes2 <= mesos && any1 <= anys && any2 <= anys) {
            System.out.println("Correcte");
        } else {
            System.out.println("Incorrecte");
        }
    }
}
