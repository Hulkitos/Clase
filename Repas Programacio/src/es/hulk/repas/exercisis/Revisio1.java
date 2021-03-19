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

    public static void countXifres(int num) {

    }


}
