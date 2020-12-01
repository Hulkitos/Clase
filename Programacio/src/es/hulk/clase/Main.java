package es.hulk.clase;

import es.hulk.clase.practica.Alumne;
import es.hulk.clase.practica.Professor;

public class Main {

    public static void main(String[] args) {
        Professor profe = new Professor("Calvo", 30, "78654789a", "Masculi", 6989898, "Matematiques");
        Alumne alumati = new Alumne("Sergi Rivero Galan", 18, "8767878b", "Femeni", 971675578, new int[]{4, 5, 6, 9, 10});

        profe.display();
        System.out.println("--------------------------------");
        alumati.display();
    }
}
