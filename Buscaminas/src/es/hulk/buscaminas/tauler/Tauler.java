package es.hulk.buscaminas.tauler;

import es.hulk.buscaminas.caselles.Bandera;
import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.menus.Menu;
import es.hulk.buscaminas.utils.Utilities;

public class Tauler extends Caselles{

    private static Caselles[][] tauler;

    public Tauler(boolean isTapada, boolean isBandera, int aroundBomb, boolean isBomb) {
        super(isTapada, isBandera, aroundBomb, isBomb);
    }

    public static Caselles[][] getTauler() {
        return tauler;
    }

    public static void setTauler(Caselles[][] tauler) {
        Tauler.tauler = tauler;
    }

    public static void printTauler() {
        if (tauler.length <= 200) {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    tauler[i][j] = new Caselles();
                    Utilities.log(" [ * ] ");
                    if (tauler[i][j].isBandera()) {
                        Bandera.setFlag();
                        Utilities.log(" [ ? ] ");
                    }
                }
                Utilities.logNewLine("");
            }
        } else {
            Utilities.logNewLine("Tauler massa gross");
        }
    }
}
