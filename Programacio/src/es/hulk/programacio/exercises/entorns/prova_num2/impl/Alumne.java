package es.hulk.programacio.exercises.entorns.prova_num2.impl;

import es.hulk.programacio.exercises.entorns.prova_num2.Assignatura;

public class Alumne extends Assignatura {

    public Alumne(String[] alumnes) {
        super(alumnes);
    }

    @Override
    public double getPreu() {
        return 0;
    }

    public boolean findAlumne(String alumne) {
        int i = 0;
        String alumneAux = getAlumnes()[i];

        while (i < getAlumnes().length) {
            if (alumne.equals(alumneAux)) {
                return true;
            }
            i++;
        }
        return false;
    }

}
