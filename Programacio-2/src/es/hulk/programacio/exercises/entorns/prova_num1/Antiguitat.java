package es.hulk.programacio.exercises.entorns.prova_num1;

public class Antiguitat {

    private final int anys;
    private final int tipus;
    private final int Antiguitat = 1800;

    private static final int QUADRE = 0;
    private static final int MOBLE = 1;
    private static final int ESCULTURA = 2;

    public Antiguitat(int anys, int tipus) {
        this.anys = anys;
        this.tipus = tipus;
    }

    public int estimacioValor(int valorInicial) {

        if (this.anys >= Antiguitat && this.anys < 1900) {
            valorInicial += 1;
        } else if (this.anys >= 1700 && this.anys < Antiguitat) {
            valorInicial += 2;
        } else {
            valorInicial += 3;
        }

        return valorInicial;
    }

    public int obtenirTipusEstimacio(int valorInicial) {
        switch (getTipus()) {
            case QUADRE:
                valorInicial += 1;
                break;
            case MOBLE:
                valorInicial += 2;
                break;
            case ESCULTURA:
                valorInicial += 3;
                break;
            default:
                break;
        }
        return valorInicial;
    }

    public int getTipus() {
        return this.tipus;
    }

}
