package es.hulk.programacio.exercises.clases_subclases.clases;

import es.hulk.programacio.exercises.clases_subclases.interfacesClases.Management;

public class Administrator extends Employee implements Management {

    private int emplID;
    private String name;
    private int ssn;
    private float salary;

    public Administrator(int emplID, String name, int ssn, float salary) {
        super(emplID, name, ssn, salary);
        this.emplID = emplID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    private String planificaciar;
    private String contractar;

    public void plan() {
    System.out.println("Se ha passat la planificació correctament");

    }

    public void hire(Employee e) {
        System.out.println("L'administrador : "+ "emplID: " + this.emplID + " " + "Name: " + this.name + " " + "Ssn: " + this.ssn + " " + "Salary: " + this.salary + " ");
        System.out.println("El nou empleat es : "+ e.toString());
    }

    //public void setName(String name) {this.name = name;}
    //public String getName() {return this.name;}
    @Override
    public String toString() {
        return super.toString();
    }

    public String printEmployee(Employee e) {

        return "Aquest es un empleat" + grantStock(e);

    }

    @Override
    public int grantStock(Employee e) {

        return 10;
    }

}
