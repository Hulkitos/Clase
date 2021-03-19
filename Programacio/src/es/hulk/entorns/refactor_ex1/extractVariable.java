package es.hulk.entorns.refactor_ex1;

import java.util.Scanner;

public class extractVariable {

    private static final Scanner scanner = new Scanner(System.in);
    private static int elements_index = 10;
    private static double pi = 3.14;
    private static double radi = 4;

    public static boolean aceptableAge(int age) {
        if (age < 18) {
            return true;
        }
        return false;
    }

    public static double circumferenceArea() {
        return pi * (radi * radi);
    }

    public static double circumferenceVolume() {
        return pi * (radi * radi) * 5;
    }

    public static void elementsNumbers() {
        int[] elements = new int[elements_index];

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
            System.out.println(elements[i]);
        }
    }

    public static void charSearcher() {
        int counter = 0;
        boolean yFound = false;

        for (int i = 0; i < "lorem ipsum".length(); i++) {
            if ("lorem ipsum".charAt(i) == 'y') {
                yFound = true;
            }
            if (yFound && "lorem ipsum".charAt(i) == 'x') {
                counter++;
            }
        }

        System.out.println("Número d'aparicions del caràcter 'x' " + "després de la primera 'y': " + counter);
    }

}
