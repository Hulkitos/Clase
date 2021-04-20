package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

public class ReapetedWord extends Practica1 {

    public static void returnRepeatedWord() {
        try {
            String string = text.toLowerCase();
            String[] stringArray = string.split("\\W+");
            int counter = 0;
            int max = 0;

            String current = stringArray[0];
            String paraula = stringArray[0];

            for (int i = 0; i < stringArray.length ; i++) {
                if (stringArray[i].equals(current)) {
                    counter++;
                } else {
                    counter = 1;
                    current = stringArray[i];
                }
                if (max < counter) {
                    max = counter;
                    paraula = stringArray[i];
                }
            }

            System.out.println("Paraula mes repetida " + paraula + " amb " + counter + " aparicions");
        } catch (NullPointerException exception) {
            System.err.println("Error: " + exception);
        }

    }

}
