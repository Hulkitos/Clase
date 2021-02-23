package es.hulk.programacio.exercises.clases_subclases.clases;

public class Director extends Manager {
    private float Presupost;

    public Director(int emplID, String name, int ssn, float salary, String Departament, float Presupost) {
        super(emplID, name, ssn, salary, Departament);
        this.Presupost = Presupost;

    }

    public void setPresupost(float Presupost) {
        this.Presupost = Presupost;
    }

    public float getPresupost() {
        return this.Presupost;
    }

    public String toString() {
        super.toString();
        //System.out.println("Presupost:" + Presupost);

        return super.toString() + "Presupost: " + Presupost;
    }

    public String printEmployee(Employee e) {

        return "Aquest es un empleat" + grantStock(e);

    }

    public int grantStock(Employee e) {

        return 1000;
    }

}
