package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

public class CountWords extends Practica1 {

    public static void returnCountWords() {
        try {
            String[] arraystring = text.split("\\W+");
            int counter = 0;

            for (int i = 0; i < arraystring.length; i++) {
                counter++;
            }
            System.out.println("La frase te un total de " + counter + " paraules");
        } catch (NumberFormatException exception) {
            System.err.println("Error: " + exception);
        } catch (NullPointerException exception) {
            System.err.println("Error: " + exception);
        }

    }

}
