package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.tauler.Tauler;

public class Bandera extends Caselles {

    public Bandera(boolean isTapada, boolean isBandera, int aroundBomb, boolean isBomb) {
        super(isTapada, isBandera, aroundBomb, isBomb);
    }

    public void insertBanders() {
        Tauler.getTauler();

    }
}
