package es.hulk.clase.exercisisClasse;

public class Employee extends Person {

    private int id;
    private int sou;
    private int anysPertinencia;

    public Employee(String name, int age, String DNI, String genre, int telephone, int id, int sou, int anysPertinencia) {
        super(name, age, DNI, genre, telephone);
        this.anysPertinencia = anysPertinencia;
        this.id = id;
        this.sou = sou;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setSou (int sou) {
        this.sou = sou;
    }

    public void setAnysPertinencia(int anysPertinencia) {
        this.anysPertinencia = anysPertinencia;
    }

    public int getId(int id) {
        return this.id;
    }

    public int getSou(int sou) {
        return this.sou;
    }

    public int getAnysPertinencia(int anysPertinencia) {
        return this.anysPertinencia;
    }

    public int afegirSou() {

        int sounet = this.sou;

        double percentage = 5;
        double tantPerCent = this.sou * (percentage/100);

        int sounou = (int) tantPerCent + sounet;

        return sounou;
    }

    public void afegirAnys() {
        anysPertinencia++;
    }

    public void display() {
        System.out.println("Nom: " + getName());
        System.out.println("Edat: " + getAge());
        System.out.println("DNI: " + getDNI());
        System.out.println("Genere: " + getGenre());
        System.out.println("Telefono: " + getTelephone());
        System.out.println("Sou: " + sou);
        System.out.println("Sou + 5%: " + afegirSou());
        afegirAnys();
        System.out.println("Anys de pertinencia: " + anysPertinencia);
    }
}
