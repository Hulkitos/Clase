package es.hulk.clase.arrays;

import java.util.Scanner;

public class Ex2 {
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

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }
}
