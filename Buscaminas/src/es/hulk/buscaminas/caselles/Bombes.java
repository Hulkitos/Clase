package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.tauler.Tauler;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

public class Bombes {

    private static Caselles[][] bomba;
    private static boolean isBomb;

    public static void insertBombs() {
        bomba = Tauler.getTauler();
        Caselles[] myVal = bomba[(int) Math.floor(bomba.length * Math.random())];

        int x = (int) Math.random();
        int y = (int) Math.random();


        for (int i = 0; i < bomba.length; i++) {
            for (int j = 0; j < bomba[i].length; j++) {
                if (i == x - 1 && j == y - 1) {
                    Utilities.log(" ( bomb ) ");
                } else {
                    Utilities.log(" ( x ) ");
                }
            }
            Utilities.logNewLine("");
        }
    }

}
