package es.hulk.clase.loops;

import java.util.Scanner;

public class LoopEX1 {
    public static void exercise() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digues un numero: ");
        int num = scan.nextInt();

        for (int i = 0 ; i < num; i++) {
            System.out.println(i);
        }
    }
}
