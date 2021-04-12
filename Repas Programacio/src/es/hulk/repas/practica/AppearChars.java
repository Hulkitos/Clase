package es.hulk.repas.practica;

public class AppearChars extends Practica1 {

    private static char[] array = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int[] numeros = new int[array.length];

    public static void CountAppearChars() {
        int counter = 0;
        for (int i = 0; i <= text.length(); i++) {
            for (int j = 0; i < array.length; j++) {
                for (int k = 0; k < numeros.length; k++) {
                    System.out.println("Aparicions de Caracter: " + array[j] + " amb un total de " + numeros[k] + " vegades");
                }
            }
        }
        Practica1.display();
     }

}