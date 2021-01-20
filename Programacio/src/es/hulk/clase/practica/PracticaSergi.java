package es.hulk.clase.practica;

import java.util.Scanner;

public class PracticaSergi {

    private static Scanner scan = new Scanner(System.in);
    private static String string;


    public static void practica1() {

        System.out.println(" ");
        System.out.println("    1. Introduir un text nou.");
        System.out.println("    2. Veure el text actual.");
        System.out.println("    3. Comptar el numero de lletres.");
        System.out.println("    4. Comptar el numero de paraules.");
        System.out.println("    5. Numero d’aparicions de cada caracters.");
        System.out.println("    6. Dir el caracter mes repetit i el numero d’aparicions.");
        System.out.println("    7. Dir la paraula mes repetida i el numero d’aparicions.");
        System.out.println("    8. Introduir per teclat un caracter i dir quantes vegades apareix.");
        System.out.println("    9. Introduir per teclat una paraula i dir quantes vegades apareix.");
        System.out.println(" ");
        int opcion = scan.nextInt();

        switch (opcion) {
            case 0:
                break;
            case 1:
                Ex1();
                practica1();
                break;
            case 2:
                Ex2();
                break;
            case 3:
                Ex3();
                break;
            case 4:
                Ex4();
                break;
            case 5:
                Ex5();
                break;
            case 6:
                Ex6();
                break;
            case 7:
                Ex7();
                break;
            case 8:
                Ex8();
                break;
            case 9:
                Ex9();
                break;
            default:
                practica1();
                break;
        }


    }

    public static String Ex1() {

        System.out.println("Has elegit el metode 1 introdueix un text nou: ");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();

        practica1();

        return string;
    }

    public static void Ex2() {
        System.out.println(string);

        practica1();

    }

    public static void Ex3() {
        int contador = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                contador++;
            }
        }
        System.out.println("El numero de lletres es de " + contador);

        practica1();
    }

    public static void Ex4() {
        String ArrayStrings[] = string.split(" ");
        int contador = 0;

        for (int i = 0; i < ArrayStrings.length; i++) {
            contador++;
        }

        System.out.println("El numero de paraules es de " + contador);

        practica1();
    }

    public static void Ex5() {
        int[] contadorLletres = new int[32];
        char[] lletres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?',
                '!', ':'};
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                    contadorLletres[0]++;
                    break;
                case 'b':
                    contadorLletres[1]++;
                    break;
                case 'c':
                    contadorLletres[2]++;
                    break;
                case 'd':
                    contadorLletres[3]++;
                    break;
                case 'e':
                    contadorLletres[4]++;
                    break;
                case 'f':
                    contadorLletres[5]++;
                    break;
                case 'g':
                    contadorLletres[6]++;
                    break;
                case 'h':
                    contadorLletres[7]++;
                    break;
                case 'i':
                    contadorLletres[8]++;
                    break;
                case 'j':
                    contadorLletres[9]++;
                    break;
                case 'k':
                    contadorLletres[10]++;
                    break;
                case 'l':
                    contadorLletres[11]++;
                    break;
                case 'm':
                    contadorLletres[12]++;
                    break;
                case 'n':
                    contadorLletres[13]++;
                    break;
                case 'ñ':
                    contadorLletres[14]++;
                    break;
                case 'o':
                    contadorLletres[15]++;
                    break;
                case 'p':
                    contadorLletres[16]++;
                    break;
                case 'q':
                    contadorLletres[17]++;
                    break;
                case 'r':
                    contadorLletres[18]++;
                    break;
                case 's':
                    contadorLletres[19]++;
                    break;
                case 't':
                    contadorLletres[20]++;
                    break;
                case 'u':
                    contadorLletres[21]++;
                    break;
                case 'v':
                    contadorLletres[22]++;
                    break;
                case 'w':
                    contadorLletres[23]++;
                    break;
                case 'x':
                    contadorLletres[24]++;
                    break;
                case 'y':
                    contadorLletres[25]++;
                    break;
                case 'z':
                    contadorLletres[26]++;
                    break;
                case '.':
                    contadorLletres[27]++;
                    break;
                case ',':
                    contadorLletres[28]++;
                    break;
                case '?':
                    contadorLletres[29]++;
                    break;
                case '!':
                    contadorLletres[30]++;
                    break;
                case ':':
                    contadorLletres[31]++;
                    break;
            }
        }

        for (int i = 0; i < contadorLletres.length; i++) {
            if (contadorLletres[i] >= contadorLletres[i]) {
                System.out.println("El caracter més repetit es " + lletres[i] + " i té " + contadorLletres[i] + "lletres");
            }
        }
    }

    public static void Ex6() {
        int[] contadorLletres = new int[32];
        char[] lletres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?',
                '!', ':'};
        int paraulaMesRepetida = 0;
        int caracterMesRepetit = 0;
        int aparicio = 0;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                    contadorLletres[0]++;
                    break;
                case 'b':
                    contadorLletres[1]++;
                    break;
                case 'c':
                    contadorLletres[2]++;
                    break;
                case 'd':
                    contadorLletres[3]++;
                    break;
                case 'e':
                    contadorLletres[4]++;
                    break;
                case 'f':
                    contadorLletres[5]++;
                    break;
                case 'g':
                    contadorLletres[6]++;
                    break;
                case 'h':
                    contadorLletres[7]++;
                    break;
                case 'i':
                    contadorLletres[8]++;
                    break;
                case 'j':
                    contadorLletres[9]++;
                    break;
                case 'k':
                    contadorLletres[10]++;
                    break;
                case 'l':
                    contadorLletres[11]++;
                    break;
                case 'm':
                    contadorLletres[12]++;
                    break;
                case 'n':
                    contadorLletres[13]++;
                    break;
                case 'ñ':
                    contadorLletres[14]++;
                    break;
                case 'o':
                    contadorLletres[15]++;
                    break;
                case 'p':
                    contadorLletres[16]++;
                    break;
                case 'q':
                    contadorLletres[17]++;
                    break;
                case 'r':
                    contadorLletres[18]++;
                    break;
                case 's':
                    contadorLletres[19]++;
                    break;
                case 't':
                    contadorLletres[20]++;
                    break;
                case 'u':
                    contadorLletres[21]++;
                    break;
                case 'v':
                    contadorLletres[22]++;
                    break;
                case 'w':
                    contadorLletres[23]++;
                    break;
                case 'x':
                    contadorLletres[24]++;
                    break;
                case 'y':
                    contadorLletres[25]++;
                    break;
                case 'z':
                    contadorLletres[26]++;
                    break;
                case '.':
                    contadorLletres[27]++;
                    break;
                case ',':
                    contadorLletres[28]++;
                    break;
                case '?':
                    contadorLletres[29]++;
                    break;
                case '!':
                    contadorLletres[30]++;
                    break;
                case ':':
                    contadorLletres[31]++;
                    break;
            }
        }


        for (int i = 0; i < contadorLletres.length; i++) {
            if (contadorLletres[i] >= contadorLletres[i + 1]) {
                paraulaMesRepetida = contadorLletres[i];
                caracterMesRepetit = lletres[i];
            }
        }

        System.out.println("El caracter més repetit es " + paraulaMesRepetida + " i té " + caracterMesRepetit + " lletres");


    }

    public static void Ex7() {

    }

    public static void Ex8() {

    }

    public static void Ex9() {

    }
}
