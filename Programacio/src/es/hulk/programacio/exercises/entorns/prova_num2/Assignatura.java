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

    public abstract double getPreu();

    public boolean findAlumne(String alumne) {
        int i = 0;
        String alumneAux = alumnes[i];
        boolean found = false;
        while (i < alumnes.length && !found) {
            if (alumne.equals(alumneAux)) {
                found = true;
            }
            i++;
        }
        return found;
    }

    public int getTipus() {
        return this.tipus;
    }

    public int getCredits() {
        return credits;
    }

}
