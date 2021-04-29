package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.caselles.Bandera;
import es.hulk.buscaminas.caselles.Bombes;
import es.hulk.buscaminas.caselles.Caselles;
import es.hulk.buscaminas.tauler.Tauler;
import es.hulk.buscaminas.utils.Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu extends Tauler {

    private static Scanner scanner = new Scanner(System.in);

    public Menu(int x, int y) {
        super(x, y);
    }


    public static void printTitol() {
        Utilities.logNewLine("  ____  _    _  _____  _____          __  __ _____ _   _           _____ ");
        Utilities.logNewLine(" |  _ \\| |  | |/ ____|/ ____|   /\\   |  \\/  |_   _| \\ | |   /\\    / ____|");
        Utilities.logNewLine(" | |_) | |  | | (___ | |       /  \\  | \\  / | | | |  \\| |  /  \\  | (___  ");
        Utilities.logNewLine(" |  _ <| |  | |\\___ \\| |      / /\\ \\ | |\\/| | | | | . ` | / /\\ \\  \\___ \\ ");
        Utilities.logNewLine(" | |_) | |__| |____) | |____ / ____ \\| |  | |_| |_| |\\  |/ ____ \\ ____) |");
        Utilities.logNewLine(" |____/ \\____/|_____/ \\_____/_/    \\_\\_|  |_|_____|_| \\_/_/    \\_\\_____/ ");
        Utilities.logNewLine("                                                                         ");
    }

    public static void display() {
        try {
            printTitol();
            Utilities.logNewLine("Trii una de les seguents opcions");
            Utilities.logNewLine("");
            Utilities.logNewLine("1 - Principiant (Tauler 8x8 amb 10 mines");
            Utilities.logNewLine("2 - Normal (Tauler 16x16 amb 40 mines)");
            Utilities.logNewLine("3 - Dificil (Tauler 16x30 amb 99 mines");
            Utilities.logNewLine("4 - Personalitzat (Tauler maxim 200x200 amb x mines maxim");
            Utilities.logNewLine("");
            Utilities.logNewLine("5 - Surtir del programa");
            Utilities.logNewLine("");
            Utilities.log("Trii una de les opcions: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            while (option != 5) {
                switch (option) {
                    case 1:
                        Tauler ez = new Tauler(8,8);
                        ez.createTauler();
                        ez.printTauler();
                        break;
                    case 2:
                        Tauler normal = new Tauler(16,16);
                        normal.createTauler();
                        normal.printTauler();
                        break;
                    case 3:
                        Tauler hard = new Tauler(16,30);
                        hard.createTauler();
                        hard.printTauler();
                        break;
                    case 4:
                        Utilities.logNewLine("");
                        System.out.println("Tauler personalitzat");
                        Utilities.logNewLine("");

                        Utilities.log("Trii un numero de files: ");
                        int x = scanner.nextInt();
                        Utilities.log("Trii un numero de columnes: ");
                        int y = scanner.nextInt();

                        Tauler custom = new Tauler(x,y);
                        custom.createTauler();
                        custom.printTauler();
                        break;
                    case 5:
                        exit();
                        break;
                }
                displayInGameMenu();
            }
        } catch (InputMismatchException exception) {
            display();
        }
    }

    public static void displayInGameMenu() {
        Utilities.logNewLine("");
        Utilities.logNewLine("Trii una opcio");
        Utilities.logNewLine("");
        Utilities.logNewLine("1 - Posar una bandera");
        Utilities.logNewLine("2 - Llevar Bandera");
        Utilities.logNewLine("3 - Destapa tauler");
        Utilities.logNewLine("");
        Utilities.logNewLine("4 - Tornar al menu principal");
        Utilities.logNewLine("");
        Utilities.log("Seleccioni una de les opcions: ");
        int option = scanner.nextInt();
        while (option != 4) {
            switch (option) {
                case 1:
                    Tauler tauler = new Tauler();
                    tauler.posarBandera();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    display();
                    break;
            }
            displayInGameMenu();
        }
    }

    public static void exit() {
        Utilities.logNewLine("Has sortit del pograma");
    }
}
