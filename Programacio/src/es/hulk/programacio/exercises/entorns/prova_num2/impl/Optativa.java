package es.hulk.programacio.exercises.entorns.prova_num2.impl;

import es.hulk.programacio.exercises.entorns.prova_num2.Assignatura;

public class Optativa extends Assignatura {

    public Optativa(int tipus, int credits) {
        super(tipus, credits);
    }

    @Override
    public double getPreu() {
        return getCredits() * 21 + 15;
    }
}
