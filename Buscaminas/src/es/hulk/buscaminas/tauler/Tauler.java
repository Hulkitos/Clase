package es.hulk.buscaminas.tauler;

import es.hulk.buscaminas.caselles.Bandera;
import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.menus.Menu;
import es.hulk.buscaminas.utils.Utilities;

public class Tauler {

    private static Caselles[][] tauler;
    private static int x;
    private static int y;
    private static boolean isFlag;
    private static boolean isBomb;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Tauler.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Tauler.y = y;
    }

    public static boolean isIsFlag() {
        return isFlag;
    }

    public static void setIsFlag(boolean isFlag) {
        Tauler.isFlag = isFlag;
    }

    public static boolean isIsBomb() {
        return isBomb;
    }

    public static void setIsBomb(boolean isBomb) {
        Tauler.isBomb = isBomb;
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
                    Utilities.log(" [ x ] ");
                    if (isIsFlag()) {
                        setTauler(Bandera.getBandera());
                        Utilities.log(" [ ? ] ");
                    }
                }
                Utilities.logNewLine("");
            }
        } else {
            Utilities.logNewLine("Tauler massa gross");
        }
        Menu.displayInGameMenu();
    }
}
