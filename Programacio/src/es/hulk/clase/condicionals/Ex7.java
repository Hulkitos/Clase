package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex7 {
    public static void ifex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mes: ");
        int mes = scanner.nextInt();

        System.out.print("Any: ");
        int any = scanner.nextInt();

        if (dia <= 30 || mes <= 12 || any <= 2060) {
            System.out.println("La data es correcte");
        } else {
            System.out.println("La data no es correcte");
        }
    }
}
