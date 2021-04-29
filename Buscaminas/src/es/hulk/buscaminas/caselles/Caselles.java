package es.hulk.buscaminas.caselles;

import es.hulk.buscaminas.utils.Utilities;

public class Caselles {

    private boolean isTapada;
    protected boolean isBandera;
    private int aroundBomb;
    private boolean isBomb;

    public Caselles(boolean isTapada, boolean isBandera, int aroundBomb, boolean isBomb) {
        this.isTapada = isTapada;
        this.isBandera = isBandera;
        this.aroundBomb = aroundBomb;
        this.isBomb = isBomb;
    }

    public Caselles() {

    }

    public boolean isTapada() {
        return isTapada;
    }

    public void setTapada(boolean tapada) {
        isTapada = tapada;
    }

    public void setBandera(boolean bandera) {
        isBandera = bandera;
    }

    public boolean isBandera() {
        return isBandera;
    }


    public int getAroundBomb() {
        return aroundBomb;
    }

    public void setAroundBomb(int aroundBomb) {
        this.aroundBomb = aroundBomb;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }
}
