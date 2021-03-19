package es.hulk.repas.clases;

public class Persona {

    private String nom;
    private int edat;
    private String DNI;
    private String sexe;
    private int telefono;

    public Persona (String nom, int edat, String DNI, String sexe, int telefono) {
        this.nom = nom;
        this.edat = edat;
        this.DNI = DNI;
        this.sexe = sexe;
        this.telefono = telefono;
    }

    public Persona() {

    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void display() {
        System.out.println(nom);
        System.out.println(edat);
        System.out.println(DNI);
        System.out.println(sexe);
        System.out.println(telefono);
    }
}
