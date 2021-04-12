package es.hulk.repas.practica;

public class AppearChars extends Practica1 {

    private static char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int maxchars = chars.length;
    private static int[] numeros = new int[chars.length];

    public static void CountAppearChars() {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < maxchars; j++) {
                if (text.charAt(i) == chars[j]) {
                    numeros[j]++;
                    System.out.println("Caracter: " + chars[j] +
                            " | Aparicions: " + numeros[j] +
                            " | Valor I = " + i);
                }
            }
        }
        Practica1.display();
     }

}