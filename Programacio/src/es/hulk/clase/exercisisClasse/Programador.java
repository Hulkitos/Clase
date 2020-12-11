package es.hulk.clase.exercisisClasse;

import java.util.ArrayList;

public class Programador extends Empleat {

    private ArrayList<String> tasks;

    public Programador(String name, int age, String DNI, String genre, int telephone, int id, int sou, int anysPertinencia) {
        super(name, age, DNI, genre, telephone, id, sou, anysPertinencia);
    }
}
