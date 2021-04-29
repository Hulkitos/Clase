package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

import static es.hulk.buscaminas.tauler.Tauler.*;

public class Bandera extends Caselles{

    private static Caselles[][] bandera;

    public Bandera(boolean isTapada, boolean isBandera, int aroundBomb, boolean isBomb) {
        super(isTapada, isBandera, aroundBomb, isBomb);
    }

    public  Caselles[][] getBandera() {
        return bandera;
    }

    public void setBandera(Caselles[][] bandera) {
        this.bandera = bandera;
    }

    public static boolean setFlag() {
        Scanner scanner = new Scanner(System.in);
        bandera = getTauler();

        Utilities.log("Linees: ");
        int x = scanner.nextInt();

        Utilities.log("Columnes: ");
        int y = scanner.nextInt();

        setTauler(new Caselles[x][y]);
        bandera[x][y].setBandera(true);

        return true;
    }
}