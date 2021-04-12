package es.hulk.repas.practica;

public class RepeatedScannerWord extends Practica1 {

    public static void RepeatedScannerWord() {
        String word = scanner.nextLine();
        String[] wordArray = string.split("\\W+");
        int counter = 0;

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == word) {
                counter++;
            }
        }
        System.out.println("La paraula: " + word + " es repeteix " + counter);
    }

}
