package es.hulk.repas.practica;

public class AppearChars extends Practica1 {

    private static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int maxchars = chars.length;
    private static int[] numeros = new int[chars.length];

    public static void CountAppearChars() {
        String string = text.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < maxchars; j++) {
                if (string.charAt(i) == chars[j]) {
                    numeros[j]++;
                    System.out.println("Caracter: " + chars[j] +
                            " | Aparicions: " + numeros[j]);
                }
            }
        }
        Practica1.display();
     }

}