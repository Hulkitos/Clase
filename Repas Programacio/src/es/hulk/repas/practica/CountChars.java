package es.hulk.repas.practica;

public class CountChars extends Practica1 {

    public static void returnCountedChars() {
        int counter = 0;
        for (int i = 0; i <= text.length(); i++) {
            counter++;
        }
        System.out.println("La frase te un total " + counter + " lletres");
    }

}
