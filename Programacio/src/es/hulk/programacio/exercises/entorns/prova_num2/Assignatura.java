package es.hulk.programacio.exercises.entorns.prova_num2;

public abstract class Assignatura {

    private int codi;
    private String assignatura;
    private int tipus;
    private int credits;
    private String[] alumnes;

    public Assignatura(int codi, String assignatura, int tipus, int credits, String[] alumnes) {
        this.codi = codi;
        this.assignatura = assignatura;
        this.tipus = tipus;
        this.credits = credits;
        this.alumnes = alumnes;
    }

    public Assignatura(int tipus, int credits) {
        this.tipus = tipus;
        this.credits = credits;
    }

    public abstract double getPreu();

    public boolean findAlumne(String alumne) {
        int i = 0;
        String alumneAux = alumnes[i];

        while (i < alumnes.length) {
            if (alumne.equals(alumneAux)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public int getTipus() {
        return this.tipus;
    }

    public int getCredits() {
        return credits;
    }

}
