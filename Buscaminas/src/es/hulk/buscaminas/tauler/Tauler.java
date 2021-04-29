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

    public void printTauler() {
        if (tauler.length <= 200) {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    tauler[i][j] = new Caselles();
                    if (tauler[i][j].isBandera()) {
                        Utilities.log(" [ ? ] ");
                        return;
                    }
                    Utilities.log(" [ * ] ");

                }
                Utilities.logNewLine("");
            }
        } else {
            Utilities.logNewLine("Tauler massa gross");
        }
    }

    public void posarBandera() {
        Scanner scanner = new Scanner(System.in);

        Utilities.log("Linees: ");
        int x = scanner.nextInt();

        Utilities.log("Columnes: ");
        int y = scanner.nextInt();

        tauler[x][y].setBandera(true);
        printTauler();
    }

}
