package es.hulk.programacio.exercises.entorns.prova_num2.impl;

//preu = credits * 21 + 10;

import es.hulk.programacio.exercises.entorns.prova_num2.Assignatura;

public class Troncal extends Assignatura {

    public Troncal(int codi, String assignatura, int tipus, int credits, String[] alumnes) {
        super(codi, assignatura, tipus, credits, alumnes);
    }

    @Override
    public double getPreu() {
        return getCredits() * 21 + 10;
    }
}
