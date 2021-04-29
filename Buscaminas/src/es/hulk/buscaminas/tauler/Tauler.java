package es.hulk.buscaminas.tauler;

import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

public class Tauler extends Caselles {

    private static Caselles[][] tauler;

    public Tauler(int x, int y) {
        tauler = new Caselles[x][y];
    }

    public Tauler() {

    }

    public Caselles[][] getTauler() {
        return tauler;
    }

    public void setTauler(Caselles[][] tauler) {
        Tauler.tauler = tauler;
    }

    public void createTauler() {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                tauler[i][j] = new Caselles();
            }
        }
    }

    public void printTauler() {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    if (tauler[i][j].isBandera()) {
                        Utilities.log(" [ ? ] ");
                    } else {
                        Utilities.log(" [ * ] ");
                    }
                }
                Utilities.logNewLine("");
            }
    }

    public void posarBandera() {
        Scanner scanner = new Scanner(System.in);

        Utilities.log("Fila: ");
        int x = scanner.nextInt();

        Utilities.log("Columnes: ");
        int y = scanner.nextInt();

        tauler[x][y].setBandera(true);
        printTauler();
    }

}
