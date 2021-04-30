package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.tauler.Board;
import es.hulk.buscaminas.utils.Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu extends Board {

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
                        Board ez = new Board(8,8);
                        ez.createBoard();
                        ez.printBoard();
                        displayInGameMenu(ez);
                        break;
                    case 2:
                        Board normal = new Board(16,16);
                        normal.createBoard();
                        normal.printBoard();
                        displayInGameMenu(normal);
                        break;
                    case 3:
                        Board hard = new Board(16,30);
                        hard.createBoard();
                        hard.printBoard();
                        displayInGameMenu(hard);
                        break;
                    case 4:
                        Utilities.logNewLine("");
                        System.out.println("Tauler personalitzat");
                        Utilities.logNewLine("");

                        Utilities.log("Trii un numero de files: ");
                        int x = scanner.nextInt();
                        Utilities.log("Trii un numero de columnes: ");
                        int y = scanner.nextInt();

                        Board custom = new Board(x,y);
                        custom.createBoard();
                        custom.printBoard();
                        displayInGameMenu(custom);
                        break;
                    case 5:
                        exit();
                        break;
                }
            }
        } catch (InputMismatchException exception) {
            display();
        }
    }

    public static void displayInGameMenu(Board type) {
        Utilities.logNewLine("");
        Utilities.logNewLine("Trii una opcio");
        Utilities.logNewLine("");
        Utilities.logNewLine("1 - Posar una bandera");
        Utilities.logNewLine("2 - Llevar Bandera");
        Utilities.logNewLine("3 - Destapa Casella");
        Utilities.logNewLine("");
        Utilities.logNewLine("4 - Tornar al menu principal");
        Utilities.logNewLine("");
        Utilities.log("Seleccioni una de les opcions: ");
        int option = scanner.nextInt();
        while (option != 4) {
            switch (option) {
                case 1:
                    type.putFlag();
                    break;
                case 2:
                    type.removeFlag();
                    break;
                case 3:
                    type.removePlug();
                    break;
                case 4:
                    display();
                    break;
            }
            displayInGameMenu(type);
        }
    }

    public static void exit() {
        Utilities.logNewLine("Has sortit del pograma");
    }
}
