package es.hulk.clase.scanner;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c = sc.nextFloat();

        System.out.println(c + "Cº a Fº");

        double divisio = (double) 9/c;
        double resultado = divisio+32;

        System.out.println("F = " + resultado);
    }
}
