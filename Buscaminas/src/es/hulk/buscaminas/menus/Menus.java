package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.tauler.Tauler;

import java.util.Scanner;

import static es.hulk.buscaminas.menus.MenuType.CUSTOM;
import static es.hulk.buscaminas.menus.MenuType.MAINMENU;

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
                    case 2:
                        setTauler(new Caselles[16][16]);
                    case 3:
                        setTauler(new Caselles[40][40]);
                    case 4:
                        type = CUSTOM;
                }
            case CUSTOM:
                System.out.println("Custom Tablero");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                setTauler(new Caselles[x][y]);
            case INGAME:
            case FINSIHED:
        }
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

}
