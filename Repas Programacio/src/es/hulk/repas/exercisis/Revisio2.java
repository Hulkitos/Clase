package es.hulk.repas.exercisis;

import java.util.Scanner;

public class Revisio2 {

    public static void toHoursMinutesSeconds() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int h = n / 3600;
        int m = ((n - h * 3600)/60);
        int s = n-(h * 3600 + m * 60);

        System.out.println("Hores: " + h + " | Minuts: " + m + " | Segons: " + s);
    }


    public static void calculateTraingleEquilater() {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int p = l * 3;
        double a = (Math.sqrt(p) / 4) * Math.pow(l, 2);
        float b = Math.round(a);

        System.out.println("Perimetro: " + p + " | Area: " + b);
    }

    public static void getCompteBanc(double money, double mesosInteresos) {
        int a = 10;

        double calcul = a / mesosInteresos;
        double total = money - calcul;

        System.out.println("Total: " + total);
        System.out.println("Calcul: " + calcul);
    }
}
