package es.hulk.buscaminas.caselles;

public class Caselles {

    private boolean isTapada;
    private static boolean isBandera = false;
    private int aroundBomb;
    private boolean isBomb;

    public Caselles(boolean isTapada, boolean isBandera, int aroundBomb, boolean isBomb) {
        this.isTapada = isTapada;
        this.isBandera = isBandera;
        this.aroundBomb = aroundBomb;
        this.isBomb = isBomb;
    }

    public boolean isTapada() {
        return isTapada;
    }

    public void setTapada(boolean tapada) {
        isTapada = tapada;
    }

    public static boolean isBandera() {
        return isBandera;
    }

    public void setBandera(boolean bandera) {
        isBandera = bandera;
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
