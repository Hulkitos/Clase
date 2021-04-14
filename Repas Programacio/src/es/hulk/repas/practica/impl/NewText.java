package es.hulk.repas.practica.impl;

import es.hulk.repas.practica.Practica1;

import java.util.Scanner;

public class NewText extends Practica1 {

    public static String newText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix una frase: ");
        text = scanner.nextLine();

        return text.toLowerCase();
    }
}
