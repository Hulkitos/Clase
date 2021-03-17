package es.hulk.repas.clases.impl;

import es.hulk.repas.clases.Persona;

public class Alumne extends Persona {

    private int[] notes;

    public Alumne(int[] notes, String nom, int edat, String DNI, String sexe, int telefono) {
        super(nom, edat, DNI, sexe, telefono);
        this.notes = notes;
    }

    @Override
    public void display() {
        System.out.println(getNom());
        System.out.println(getEdat());
        System.out.println(getDNI());
        System.out.println(getSexe());
        System.out.println(getTelefono());
        System.out.println(notes);
    }
}
