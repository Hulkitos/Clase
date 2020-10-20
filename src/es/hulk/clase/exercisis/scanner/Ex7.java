package es.hulk.clase.exercisis.scanner;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int aux;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Valor inicial de a = " + a);
        System.out.println("Valor inicial de b = " + b);
        System.out.println("   ");

        //resultat = a = 10 i b = 5

        aux = a;
        a = b;
        b = aux;

        System.out.println("Valor intercanviat de a = " + a);
        System.out.println("Valor intercanviat de b = " + b);
    }
}
