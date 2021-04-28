package es.hulk.buscaminas.tauler;

import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.menus.Menu;
import es.hulk.buscaminas.utils.Utilities;

public class Tauler {

    private int column;
    private int row;
    private static Caselles[][] tauler;

    public Tauler(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public static Caselles[][] getTauler() {
        return tauler;
    }

    public static void setTauler(Caselles[][] tauler) {
        Tauler.tauler = tauler;
    }

    public static void printTauler() {
        Utilities.clear();

        if (tauler.length <= 200) {
            for (Caselles[] caselles : tauler) {
                for (int j = 0; j < caselles.length; j++) {
                    Utilities.log(" [ x ] ");
                }
                Utilities.logNewLine("");
            }
        } else {
            Utilities.logNewLine("Tauler massa gross");
        }
        Menu.printInGameMenu();
    }
}
