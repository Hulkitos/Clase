package es.hulk.repas.practica;

public class ReapetedWord extends Practica1 {

    public static void returnRepeatedWord() {
        String[] stringArray = text.split("\\W+");
        int counter = 1;
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
        Practica1.display();
    }

}
