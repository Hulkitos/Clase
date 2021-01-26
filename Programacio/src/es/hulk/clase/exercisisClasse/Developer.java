package es.hulk.clase.exercisisClasse;

import java.util.ArrayList;

public class Developer extends Employee {

    private ArrayList<String> tasks;

    public Developer(String name, int age, String DNI, String genre, int telephone, int id, int sou, int anysPertinencia) {
        super(name, age, DNI, genre, telephone, id, sou, anysPertinencia);
    }
}
