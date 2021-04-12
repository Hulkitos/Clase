package es.hulk.repas.practica;

public class ShowText extends Practica1 {

    public static void showText() {
        if (text == null) {
            System.out.println("No s'ha introduit cap text");
        } else {
            System.out.println("El text es: " + text);
        }
        Practica1.display();
    }

}
