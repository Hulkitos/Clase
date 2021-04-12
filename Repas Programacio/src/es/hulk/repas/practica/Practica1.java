package es.hulk.repas.practica;

import java.util.Scanner;

public class Practica1 {

    private static int option;

    protected static Scanner scanner = new Scanner(System.in);
    protected static String text;
    protected static String string = text.toLowerCase();

    public static void display() {
        System.out.println();
        System.out.println("Trii una de les opcions disponibles: ");
        System.out.println();
        System.out.println("1. Introduir un text nou.");
        System.out.println("2. Veure el text actual.");
        System.out.println("3. Comptar el n ́umero de lletres.");
        System.out.println("4. Comptar el n ́umero de paraules.");
        System.out.println("5. N ́umero d’aparicions de cada car`acters.");
        System.out.println("6. Dir el car`acter m ́es repetit i el n ́umero d’aparicions.");
        System.out.println("7. Dir la paraula m ́es repetida i el n ́umero d’aparicions.");
        System.out.println("8. Introduir per teclat un car`acter i dir quantes vegades apareix.");
        System.out.println("9. Introduir per teclat una paraula i dir quantes vegades apareix.");
        System.out.println(" ");
        System.out.println("0. Surt del programa");
        System.out.println(" ");
        System.out.print("Opcio: ");
        option = scanner.nextInt();

        while (option != 0) {
            switch (option) {
                case 1:
                    NewText.newText();
                    break;
                case 2:
                    ShowText.showText();
                    break;
                case 3:
                    CountChars.returnCountedChars();
                    break;
                case 4:
                    CountWords.returnCountWords();
                    break;
                case 5:
                    AppearChars.CountAppearChars();
                    break;
                case 6:
                    RepeatedChar.returnRepeatedChar();
                    break;
                case 7:
                    ReapetedWord.returnRepeatedWord();
                    break;
                default:
                    display();
            }
        }
    }
}