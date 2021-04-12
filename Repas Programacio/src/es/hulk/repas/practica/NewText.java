package es.hulk.repas.practica;

import java.util.Scanner;

public class NewText extends Practica1 {

    private static Scanner scanner = new Scanner(System.in);

    public static String newText() {
        System.out.print("Introdueix una frase: ");
        text = scanner.nextLine();

        Practica1.display();

        return text.toLowerCase();
    }
}
