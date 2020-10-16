package es.hulk.clase.scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros enteros: (Uno debajo del otro)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(" ");
        System.out.println("("+ a +" * (" + b + " + 2) * 10");
        int suma = b+2;
        System.out.println(a + " * " + suma + " * 10");
        System.out.println(a + " * " + suma + " * 10");
        int mult = a*suma*10;
        System.out.println("El resultat es: " + mult);
    }
}
