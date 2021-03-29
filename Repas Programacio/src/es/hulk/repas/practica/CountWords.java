package es.hulk.repas.practica;

public class CountWords extends Practica1 {

    public static void returnCountWords() {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                counter--;
            }
            if (text.charAt(i) == ',') {
                counter--;
            }
            if (text.charAt(i) == '.') {
                counter--;
            }
            if (text.charAt(i) == ';') {
                counter--;
            }
            String[] strings = text.split(" ");
            for (int j = 0; i < strings.length; i++) {
                counter++;
            }
        }
        System.out.println("La frase te un total de " + counter + " paraules");
    }

}
