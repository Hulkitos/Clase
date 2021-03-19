package es.hulk.entorns.prova_num2.impl;

import es.hulk.entorns.prova_num2.Assignatura;

public class Obligatoria extends Assignatura {

    public Obligatoria(int tipus, int credits) {
        super(tipus, credits);
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

    @Override
    public boolean findAlumne(String alumne) {
        return false;
    }
}
