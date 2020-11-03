package es.hulk.clase.arrays;

import java.util.Scanner;

public class Ex4 {
    public static void Exercise() {
        int ARRAY_LENGHT = 5;
        int[] numbers = new int[ARRAY_LENGHT];
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero: ");
        numbers[0] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[1] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[2] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[3] = scan.nextInt();

        System.out.print("Numero: ");
        numbers[4] = scan.nextInt();

        int suma = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];

        System.out.println(suma);
    }
}
