package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

import static es.hulk.buscaminas.tauler.Tauler.*;

public class Bandera extends Caselles{

    private static Caselles[][] bandera;
    private static int x;
    private static int y;

    public Bandera(boolean isTapada, boolean isBandera, int aroundBomb, boolean isBomb) {
        super(isTapada, isBandera, aroundBomb, isBomb);
    }

    public  Caselles[][] getBandera() {
        return bandera;
    }

    public void setBandera(Caselles[][] bandera) {
        this.bandera = bandera;
    }

    public static void setFlag() {
        Scanner scanner = new Scanner(System.in);
        bandera = getTauler();

        Utilities.log("Linees: ");
        int x = scanner.nextInt();

        Utilities.log("Columnes: ");
        int y = scanner.nextInt();

        if (!getTauler()[x][y].isBandera) {
            getTauler()[x][y].setBandera(true);
        }
    }
}