package es.hulk.repas.clases.impl;

import es.hulk.repas.clases.Persona;

public class Profesor extends Persona {

    private String especialitat;

    public Profesor(String especialitat, String nom, int edat, String DNI, String sexe, int telefono) {
        super(nom, edat, DNI, sexe, telefono);
        this.especialitat = especialitat;
    }

    @Override
    public void display() {
        System.out.println(getNom());
        System.out.println(getEdat());
        System.out.println(getDNI());
        System.out.println(getSexe());
        System.out.println(getTelefono());
        System.out.println(especialitat);
    }
}
