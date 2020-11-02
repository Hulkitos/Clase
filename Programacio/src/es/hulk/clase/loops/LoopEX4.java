package es.hulk.clase.loops;

import java.util.Scanner;

public class LoopEX4 {
    public static void ex4() {
        Scanner sc = new Scanner(System.in);
        int num;
        int rest;

        System.out.print("Introdueixi un numero: ");
        num = sc.nextInt();
        rest = num % 2;

        for (int i = 2; rest == num % 2; ) {
            if (rest == 0) {
                System.out.println(num + " SI es multiple de 2");
                break;
            } else {
                System.out.println(num + " NO es multiple de 2");
                System.out.println(" ");
                System.out.print("Introdueixi un numero: ");
                num = sc.nextInt();
            }
        }
    }
}
