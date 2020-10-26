package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Num3: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Numero major es: " + num1);
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("Son iguals: " + num1 + num2 + num3);
        } else if (num1 < num2 && num1 < num3) {
            System.out.println("Numero menor es: " + num1);
        }
    }
}
