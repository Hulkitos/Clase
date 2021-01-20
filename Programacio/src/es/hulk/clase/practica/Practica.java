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
                break;
            case 4:
                counterWords();
                break;
            case 5:
                Ex5();
                break;
            case 6:
                repeatedChar();
                break;
            case 0:
                break;
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
            System.err.println("No s'han trobat resultats");
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

    public static void Ex5() {
        int[] numeros = new int[31];
        char[] caracters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', ':', '?', '!'};

        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                    numeros[0]++;
                    break;
                case 'b':
                    numeros[1]++;
                    break;
                case 'c':
                    numeros[2]++;
                    break;
                case 'd':
                    numeros[3]++;
                    break;
                case 'e':
                    numeros[4]++;
                    break;
                case 'f':
                    numeros[5]++;
                    break;
                case 'g':
                    numeros[6]++;
                    break;
                case 'h':
                    numeros[7]++;
                    break;
                case 'i':
                    numeros[8]++;
                    break;
                case 'j':
                    numeros[9]++;
                    break;
                case 'k':
                    numeros[10]++;
                    break;
                case 'l':
                    numeros[11]++;
                    break;
                case 'm':
                    numeros[12]++;
                    break;
                case 'n':
                    numeros[13]++;
                    break;
                case 'o':
                    numeros[14]++;
                    break;
                case 'p':
                    numeros[15]++;
                    break;
                case 'q':
                    numeros[16]++;
                    break;
                case 'r':
                    numeros[17]++;
                    break;
                case 's':
                    numeros[18]++;
                    break;
                case 't':
                    numeros[19]++;
                    break;
                case 'u':
                    numeros[20]++;
                    break;
                case 'v':
                    numeros[21]++;
                    break;
                case 'w':
                    numeros[22]++;
                    break;
                case 'x':
                    numeros[23]++;
                    break;
                case 'y':
                    numeros[24]++;
                    break;
                case 'z':
                    numeros[25]++;
                    break;
                case '.':
                    numeros[26]++;
                    break;
                case ',':
                    numeros[27]++;
                    break;
                case ':':
                    numeros[28]++;
                    break;
                case '?':
                    numeros[29]++;
                    break;
                case '!':
                    numeros[30]++;
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("Numero d'aparicions del caracter " + caracters[0] + ": " + numeros[0]);
        System.out.println("Numero d'aparicions del caracter " + caracters[1] + ": " + numeros[1]);
        System.out.println("Numero d'aparicions del caracter " + caracters[2] + ": " + numeros[2]);
        System.out.println("Numero d'aparicions del caracter " + caracters[3] + ": " + numeros[3]);
        System.out.println("Numero d'aparicions del caracter " + caracters[4] + ": " + numeros[4]);
        System.out.println("Numero d'aparicions del caracter " + caracters[5] + ": " + numeros[5]);
        System.out.println("Numero d'aparicions del caracter " + caracters[6] + ": " + numeros[6]);
        System.out.println("Numero d'aparicions del caracter " + caracters[7] + ": " + numeros[7]);
        System.out.println("Numero d'aparicions del caracter " + caracters[8] + ": " + numeros[8]);
        System.out.println("Numero d'aparicions del caracter " + caracters[9] + ": " + numeros[9]);
        System.out.println("Numero d'aparicions del caracter " + caracters[10] + ": " + numeros[10]);
        System.out.println("Numero d'aparicions del caracter " + caracters[11] + ": " + numeros[11]);
        System.out.println("Numero d'aparicions del caracter " + caracters[12] + ": " + numeros[12]);
        System.out.println("Numero d'aparicions del caracter " + caracters[13] + ": " + numeros[13]);
        System.out.println("Numero d'aparicions del caracter " + caracters[14] + ": " + numeros[14]);
        System.out.println("Numero d'aparicions del caracter " + caracters[15] + ": " + numeros[15]);
        System.out.println("Numero d'aparicions del caracter " + caracters[16] + ": " + numeros[16]);
        System.out.println("Numero d'aparicions del caracter " + caracters[17] + ": " + numeros[17]);
        System.out.println("Numero d'aparicions del caracter " + caracters[18] + ": " + numeros[18]);
        System.out.println("Numero d'aparicions del caracter " + caracters[19] + ": " + numeros[19]);
        System.out.println("Numero d'aparicions del caracter " + caracters[20] + ": " + numeros[20]);
        System.out.println("Numero d'aparicions del caracter " + caracters[21] + ": " + numeros[21]);
        System.out.println("Numero d'aparicions del caracter " + caracters[22] + ": " + numeros[22]);
        System.out.println("Numero d'aparicions del caracter " + caracters[23] + ": " + numeros[23]);
        System.out.println("Numero d'aparicions del caracter " + caracters[24] + ": " + numeros[24]);
        System.out.println("Numero d'aparicions del caracter " + caracters[25] + ": " + numeros[25]);
        System.out.println("Numero d'aparicions del caracter " + caracters[26] + ": " + numeros[26]);
        System.out.println("Numero d'aparicions del caracter " + caracters[27] + ": " + numeros[27]);
        System.out.println("Numero d'aparicions del caracter " + caracters[28] + ": " + numeros[28]);
        System.out.println("Numero d'aparicions del caracter " + caracters[29] + ": " + numeros[29]);
        System.out.println("Numero d'aparicions del caracter " + caracters[30] + ": " + numeros[30]);

        display();
    }

    public static void repeatedChar() {
        char [] lletres;

        int mesRepetida = 0;
        char charMesRepetit = Character.MIN_VALUE;

        lletres = string.toCharArray();

        for(int i=0; i<lletres.length; i++){

            char charActual = lletres[i];
            int counter = 0;

            for (int j =0; j<lletres.length; j++){
                if (lletres[j] == charActual)
                    counter++;
            }

            if(mesRepetida < counter)
            {
                mesRepetida = counter;
                charMesRepetit = charActual;
            }
        }

        System.out.println(charMesRepetit+": Se repite "+mesRepetida);
        System.out.println("El Caracter que es repeteix mes vegades es: " + charMesRepetit + "");

        display();
    }

    public static void repeatedWord() {

    }
}
