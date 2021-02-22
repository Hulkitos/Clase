package es.hulk.clase.entorns.refactor_ex1;

import es.hulk.clase.exercisisClasse.Person;

import java.util.Scanner;

public class extractMethod {

    private static Scanner scanner = new Scanner(System.in);
    private static int [] elements = new int[5];

    public static void displayPerson(Person persona) {
        System.out.println("Dades de la persona: ");
        System.out.println("Nom: "  + persona.getName());
        System.out.println("Edat: " + persona.getAge());
    }

    public static void displayArray() {

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        System.out.println("Els números introduïts són:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }

    public static void avgWords() {
        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }

        double average = (double)sum / elements.length;
        System.out.println("La suma és: " + average);
    }

    public static String inverseString(String frase) {
        String paraulaActualInversa = "";
        String paraulaMesLlargaInversa = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActualInversa = frase.charAt(i) + paraulaActualInversa;
            } else {
                if (paraulaActualInversa.length() > paraulaMesLlargaInversa.length()) {
                    paraulaMesLlargaInversa = paraulaActualInversa;
                }
                paraulaActualInversa = "";
            }
        }
        return paraulaMesLlargaInversa;
    }

    public static String searchNewString(String frase) {
        String paraulaActual = "";
        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActual = frase.charAt(i) + paraulaActual;
            } else {
                novaFrase += paraulaActual + ' ';
                paraulaActual = "";
            }
        }
        return novaFrase;
    }
}
