package es.hulk.clase.practica;

import es.hulk.clase.exercisisClasse.Person;

import java.util.Arrays;

public class Alumne extends Person {
    
    private int[] notes;

    public Alumne(String name, int age, String DNI, String genre, int telephone, int[] notes) {
        super(name, age, DNI, genre, telephone);
        this.notes = notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public int[] getNotes(int[] notes) {
        return this.notes;
    }

    public double mitjanaNotes() {
        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        return total / (double)notes.length;
    }

    public void display() {
        System.out.println("Nom: " + getName());
        System.out.println("Edat: " + getAge());
        System.out.println("DNI: " + getDNI());
        System.out.println("Genere: " + getGenre());
        System.out.println("Telefono: " + getTelephone());
        System.out.println("Notes: " + Arrays.toString(notes));
        System.out.println("Mitjana Notes: " + mitjanaNotes());
    }
}
