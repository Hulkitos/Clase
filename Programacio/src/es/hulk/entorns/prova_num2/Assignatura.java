package es.hulk.entorns.prova_num2;

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

    public Assignatura(String[] alumnes) {
        this.alumnes = alumnes;
    }

    public abstract double getPreu();

    public abstract boolean findAlumne(String alumne);

    public int getCredits() {
        return credits;
    }

    public String[] getAlumnes() {
        return alumnes;
    }
}
