package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.menus.MenuType;
import es.hulk.buscaminas.utils.Utilities;

import javax.rmi.CORBA.Util;
import java.util.Scanner;

import static es.hulk.buscaminas.tauler.Tauler.getTauler;
import static es.hulk.buscaminas.tauler.Tauler.printTauler;

public class Bandera {

    private static Caselles[][] bandera;
    private static boolean isBandera;

    public static void insertBanders() {
        Scanner scanner = new Scanner(System.in);
        bandera = getTauler();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        isBandera = true;
        for (int i = 0; i < bandera.length; i++) {
            for (int j = 0; j < bandera[i].length; j++) {
                if (i == x && j == y) {
                    Utilities.log(" ( ? ) ");
                } else {
                    Utilities.log(" ( x ) ");
                }
            }
            Utilities.logNewLine("");
        }
        MenuType type = MenuType.INGAME;
    }
}