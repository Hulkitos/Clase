package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.menus.Menu;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;
import static es.hulk.buscaminas.tauler.Tauler.getTauler;

public class Bandera {

    private static Caselles[][] bandera;

    public static void insertBanders() {
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
        Menu.printInGameMenu();
    }
}