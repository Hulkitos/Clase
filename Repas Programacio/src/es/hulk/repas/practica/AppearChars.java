package es.hulk.repas.practica;

public class AppearChars extends Practica1 {

    private static char[] array = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int[] numeros;

    public static void CountAppearChars() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Caracter: " + array[i] + " | Aparicions: " + numeros[i]);
            }
        }
    }

}