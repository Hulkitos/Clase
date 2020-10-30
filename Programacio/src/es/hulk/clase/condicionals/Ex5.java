package es.hulk.clase.condicionals;

import java.util.Scanner;

public class Ex5 {

    public static void ifex5() {
        Scanner scanner = new Scanner(System.in);
        int hora = scanner.nextInt();

        if (hora == 8 || hora == 9 || hora == 10 || hora == 11 || hora == 12) {
            System.out.println("mati");
        } else if (hora == 13 || hora == 14 || hora == 15 || hora == 16 || hora == 17 ) {
            System.out.println("migdia");
        } else if (hora == 18 || hora == 19 || hora == 20) {
            System.out.println("horabaixa");
        } else if (hora == 21 || hora == 22 || hora == 23) {
            System.out.println("vespre");
        }
    }
}
