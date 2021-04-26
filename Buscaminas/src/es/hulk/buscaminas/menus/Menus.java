package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.tauler.Tauler;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

import static es.hulk.buscaminas.menus.MenuType.*;

public class Menus extends Tauler {

    private String menu;
    private static MenuType type;

    public Menus(int column, int row) {
        super(column, row);
    }

    public static void printMenus() {
        Scanner scanner = new Scanner(System.in);
        int opcio = scanner.nextInt();
        type = MAINMENU;
        switch (type) {
            case MAINMENU:
                switch (opcio) {
                    case 1:
                        setTauler(new Caselles[8][8]);
                        printTauler();
                        type = INGAME;
                        break;
                    case 2:
                        setTauler(new Caselles[16][16]);
                        printTauler();
                        type = INGAME;
                        break;
                    case 3:
                        setTauler(new Caselles[40][40]);
                        printTauler();
                        type = INGAME;
                        break;
                    case 4:
                        type = CUSTOM;
                        break;
                }
                break;
            case CUSTOM:
                Utilities.logNewLine("");
                System.out.println("Tablero personalitzat");
                Utilities.logNewLine("");

                Utilities.log("Trii un tamany per la X: ");
                int x = scanner.nextInt();
                Utilities.log("Trii un tamany per la Y: ");
                int y = scanner.nextInt();
                setTauler(new Caselles[x][y]);
                printTauler();
                break;
            case INGAME:
            case FINSIHED:
        }
    }

    public static void printTitol() {
        Utilities.logNewLine("  ____  _    _  _____  _____          __  __ _____ _   _           _____ ");
        Utilities.logNewLine(" |  _ \\| |  | |/ ____|/ ____|   /\\   |  \\/  |_   _| \\ | |   /\\    / ____|");
        Utilities.logNewLine(" | |_) | |  | | (___ | |       /  \\  | \\  / | | | |  \\| |  /  \\  | (___  ");
        Utilities.logNewLine(" |  _ <| |  | |\\___ \\| |      / /\\ \\ | |\\/| | | | | . ` | / /\\ \\  \\___ \\ ");
        Utilities.logNewLine(" | |_) | |__| |____) | |____ / ____ \\| |  | |_| |_| |\\  |/ ____ \\ ____) |");
        Utilities.logNewLine(" |____/ \\____/|_____/ \\_____/_/    \\_\\_|  |_|_____|_| \\_/_/    \\_\\_____/ ");
        Utilities.logNewLine("                                                                         ");
        Utilities.logNewLine("                                                                         ");
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

}
