package es.hulk.programacio;

import es.hulk.programacio.clases.Dog;
import es.hulk.programacio.exercises.repas.Revisio1;

public class Programacio {

    public static void main(String[] args) {

        Revisio1.askFourNumbers();

        Dog ca = new Dog("Calvo", 10, "hotdog", 1, "si");
        ca.display();
    }
}
