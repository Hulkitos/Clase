package es.hulk.buscaminas.tauler;

import java.util.Scanner;

public class Tauler {

    private static String[][] taula = new String[0][];

    public Tauler(String[][] taula) {
        this.taula = taula;
    }

    public static void printTaula() {
        Scanner scanner = new Scanner(System.in);
        int opcio = scanner.nextInt();
        switch (opcio) {
            case 1:
                taula = new String[8][8];
            case 2:
                taula = new String[16][16];
            case 3:
                taula = new String[40][40];
            case 4:
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                taula = new String[x][y];
        }
    }

}
