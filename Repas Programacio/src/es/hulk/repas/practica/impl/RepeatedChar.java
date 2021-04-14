package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

public class RepeatedChar extends Practica1 {

    private static char[] chars = "abcdefghijklmnopqrstuvwxyz.,?!:".toCharArray();
    private static int maxchars = chars.length;
    private static int[] numeros = new int[chars.length];

    public static void returnRepeatedChar() {
        char[] lletres = text.toCharArray();

        int mesRepetida = 0;
        char charMesRepetit = Character.MIN_VALUE;

        for (int i = 0; i < lletres.length; i++) {

            char charActual = lletres[i];
            int counter = 0;

            for (int j = 0; j < lletres.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (lletres[j] == charActual) {
                        if (charActual == chars[k]) {
                            counter++;
                        }
                    }
                }
            }

            if (mesRepetida < counter) {
                mesRepetida = counter;
                charMesRepetit = charActual;
            }
        }

        System.out.println(charMesRepetit + ": Se repite " + mesRepetida);
    }

}
