package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.tauler.Tauler;

import java.util.Scanner;

public class Bandera extends Tauler{

    private static Caselles[][] bandera;

    public static Caselles[][] getBandera() {
        return bandera;
    }

    public static void setBandera(Caselles[][] bandera) {
        Bandera.bandera = bandera;
    }

    public static void setFlag() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        bandera = new Caselles[x][y];
        Tauler.setIsFlag(true);
        Tauler.printTauler();
    }

/*    public static void insertBanders() {
        Scanner scanner = new Scanner(System.in);
        bandera = getTauler();

        Utilities.log("Trii la fila on vol posar la bandera: ");
        int x = scanner.nextInt();

        Utilities.log("Trii la columna on vol posar la bandera");
        int y = scanner.nextInt();

        for (int i = 0; i < bandera.length; i++) {
            for (int j = 0; j < bandera[i].length; j++) {
                if (i == x - 1 && j == y - 1) {
                    Utilities.log(" [ ? ] ");
                } else {
                    Utilities.log(" [ x ] ");
                }
            }
            Utilities.logNewLine("");
        }
        Menu.displayInGameMenu();
    }*/
}