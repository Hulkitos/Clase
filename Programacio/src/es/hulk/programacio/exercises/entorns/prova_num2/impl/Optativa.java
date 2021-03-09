package es.hulk.programacio.exercises.entorns.prova_num2.impl;

import es.hulk.programacio.exercises.entorns.prova_num2.Assignatura;

public class Optativa extends Assignatura {

    private double preu;

    public Optativa(int codi, String assignatura, int tipus, int credits, String[] alumnes) {
        super(codi, assignatura, tipus, credits, alumnes);
    }

    @Override
    public double getPreu() {
        return getCredits() * 21 + 15;
    }
}
