package es.hulk.repas.exercisis;

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
        }
        if (num <= 99) {
            return 2;
        }
        if (num <= 999) {
            return 3;
        }
        if (num <= 9999) {
            return 4;
        }
        if (num <= 10000) {
            return 5;
        }
        return 6;
    }

}
