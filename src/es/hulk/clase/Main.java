package es.hulk.clase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi;
        double h;
        double d;
        double volum;

        pi = 3.14;
        h = sc.nextDouble();
        d = sc.nextDouble();

        // V = pi * r2 * h

        double radi = d / 2;
        double radielevat = radi*radi;
        volum = pi*radielevat*h;

        System.out.println("El volum de un cilindre amb altura " + h + " i amb diametre " + d + " te un volum de " + volum);
    }
}
