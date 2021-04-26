package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

import static es.hulk.buscaminas.tauler.Tauler.getTauler;

public class Bandera {

    private static Caselles[][] bandera;
    private static boolean isBandera;

    public static void insertBanders() {
        Scanner scanner = new Scanner(System.in);
        bandera = getTauler();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Utilities.log(" ( ? ) ");
                isBandera = true;
            }
            Utilities.logNewLine("");
        }
    }
}