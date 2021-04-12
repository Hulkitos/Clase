package es.hulk.repas.practica;

public class NewText extends Practica1 {

    public static String newText() {
        System.out.print("Introdueix una frase: ");
        text = scanner.nextLine();

        Practica1.display();

        return text.toLowerCase();
    }
}
