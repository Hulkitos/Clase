package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

public class AppearChars extends Practica1 {

    private static char[] chars = "abcdefghijklmnopqrstuvwxyz.,?!:".toCharArray();
    private static int maxchars = chars.length;
    private static int[] numeros = new int[chars.length];

    public static void CountAppearChars() {
        String string = text.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < maxchars; j++) {
                if (string.charAt(i) == chars[j]) {
                    numeros[j]++;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                if (numeros[i] >= numeros[i]) {
                    System.out.println("Caracter: " + chars[i] + " | Aparicions: " + numeros[i]);
                }
            }
        }
    }
}