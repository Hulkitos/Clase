package es.hulk.clase.scanner;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int suma = a + b;
        int resta = a - b;
        int mult = a * b;
        double divisio = (double) a / b;

        System.out.println(" ");
        System.out.println("La suma de a i b es de " + suma);
        System.out.println("La resta de a i b es de " + resta);
        System.out.println("La multiplicacio de a i b es de " + mult);
        System.out.println("La divisio de a i b es de " + divisio);
    }

}
