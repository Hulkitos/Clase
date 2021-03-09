package es.hulk.programacio.exercises.entorns.prova_num2.impl;

import es.hulk.programacio.exercises.entorns.prova_num2.Assignatura;

public class Obligatoria extends Assignatura {

    public Obligatoria(int codi, String assignatura, int tipus, int credits, String[] alumnes) {
        super(codi, assignatura, tipus, credits, alumnes);
    }

    @Override
    public double getPreu() {
        double preu = 0;
        if (getCredits() == 3) {
            preu = getCredits() * 21;
        }
        if (getCredits() == 6) {
            preu = getCredits() * 10;
        }
        if (getCredits() > 6) {
            preu = getCredits() * 5;
        }
        return preu;
    }

}
