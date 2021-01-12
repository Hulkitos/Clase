package es.hulk.clase.practica;

import java.util.Scanner;

public class Practica {

    private static Scanner scan = new Scanner(System.in);
    private static int option;
    private static String string;

    public static void display() {
        System.out.println("");
        System.out.println("Trii una de les opcions disponibles: ");
        System.out.println("");
        System.out.println("1. Introduir un text nou.");
        System.out.println("2. Veure el text actual.");
        System.out.println("3. Comptar el n ́umero de lletres.");
        System.out.println("4. Comptar el n ́umero de paraules.");
        System.out.println("5. N ́umero d’aparicions de cada car`acters.");
        System.out.println("6. Dir el car`acter m ́es repetit i el n ́umero d’aparicions.");
        System.out.println("7. Dir la paraula m ́es repetida i el n ́umero d’aparicions.");
        System.out.println("5. N ́umero d’aparicions de cada car`acters.");
        System.out.println("8. Introduir per teclat un car`acter i dir quantes vegades apareix.");
        System.out.println("9. Introduir per teclat una paraula i dir quantes vegades apareix.");
        System.out.println(" ");
        System.out.print("Opcio: ");
        option = scan.nextInt();

        switch (option) {
            case 1:
                newText();
                break;
            case 2:
                showText();
                break;
            case 3:
                counterText();
            case 4:
                counterWords();
            case 5:

            default:
                System.err.println("Posi una opcio valida");
                display();
                break;
        }
    }

    public static String newText() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introdueix un nou text: ");
        string = scan.nextLine();

        display();

        return string;
    }

    public static void showText() {
        if (string == null) {
            System.out.println("No s'han trobat resultats");
        } else {
            System.out.println(string);
        }
        display();
    }

    public static void counterText() {
        try {
            int counter = 0;

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' ') {
                    counter++;
                }
            }
            System.out.println("Total de lletres: " + counter);
        } catch (NullPointerException exception) {
            System.err.println("Introdueix un text valid");
        }

        display();
    }

    public static void counterWords() {

        try {
            String[] arraystring = string.split(" ");
            int counter = 0;

            for (int i = 0; i < arraystring.length; i++) {
                counter++;
            }

            System.out.println("Numero total de paraules: " + counter);
        } catch (NullPointerException exception) {
            System.err.println("Introdueixi un text");
        }

        display();
    }
}
