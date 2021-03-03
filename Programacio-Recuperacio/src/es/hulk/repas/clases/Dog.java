package es.hulk.repas.clases;

public class Dog {

    private String nom;
    private int edat;
    private String raça;
    private int nvacunes;
    private boolean pedigri;


    public Dog (String nom, int edat, String raça, int nvacunes, boolean pedigri) {
        this.nom = nom;
        this.edat = edat;
        this.raça = raça;
        this.nvacunes = nvacunes;
        this.pedigri = pedigri;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void setNvacunes(int nvacunes) {
        this.nvacunes = nvacunes;
    }

    public void setPedigri(boolean pedigri) {
        this.pedigri = pedigri;
    }

    public String getNom() {
        return this.nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public String getRaça() {
        return this.raça;
    }

    public int getNvacunes() {
        return this.nvacunes;
    }

    public boolean isPedigri() {
        return this.pedigri;
    }

    public void display() {
        System.out.println(nom);
        System.out.println(edat);
        System.out.println(raça);
        System.out.println(pedigri);
        System.out.println(nvacunes);
    }
}
