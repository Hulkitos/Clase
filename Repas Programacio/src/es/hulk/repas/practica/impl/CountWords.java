package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

public class CountWords extends Practica1 {

    public static void returnCountWords() {
        String[] arraystring = text.split("\\W+");
        int counter = 0;

        for (int i = 0; i < arraystring.length; i++) {
            counter++;
        }
        System.out.println("La frase te un total de " + counter + " paraules");

        Practica1.display();
    }

}
