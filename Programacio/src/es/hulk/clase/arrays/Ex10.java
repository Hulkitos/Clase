package es.hulk.clase.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void Exercise() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Numeros: ");
        int num = scan.nextInt();

        while (num != 0) {
            if (num > 1) {
                System.out.print("Numeros: ");
                num = scan.nextInt();
                list.add(num);
            } else {
                System.out.print("Numeros: ");
                num = scan.nextInt();
            }
        }
        System.out.println(list);
        System.out.println("Numero 0, bucle aturat");
    }
}
