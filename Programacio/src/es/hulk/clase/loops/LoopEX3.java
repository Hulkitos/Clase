package es.hulk.clase.loops;

import java.util.Scanner;

public class LoopEX3 {
    public static void ex3() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introdueixi un numero: ");
        int num = scan.nextInt();

        while (num != 0) {
            System.out.print("Introdueixi un numero: ");
            num = scan.nextInt();
        }
        if (num == 0) {
            System.out.println("Numero 0");
        } else {
            System.out.print("Introdueixi un numero: ");
            num = scan.nextInt();
        }
    }
}
