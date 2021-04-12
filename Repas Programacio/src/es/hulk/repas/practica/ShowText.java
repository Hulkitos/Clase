package es.hulk.repas.practica;

public class ShowText extends Practica1 {

    public static void showText() {
        if (text.toLowerCase() == null) {
            System.out.println("No s'ha introduit cap text");
        } else {
            System.out.println("El text es: " + text.toLowerCase());
        }
        Practica1.display();
    }

}
