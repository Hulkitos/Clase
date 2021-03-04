package es.hulk.programacio.exercises.clases_subclases.clases;

public class Employee {

    private int emplID;
    private String name;
    private int ssn;
    private float salary;

    public Employee(int emplID, String name, int ssn, float salary) {
        this.emplID = emplID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }


    public void setEmplID(int emplID){this.emplID = emplID;}

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmplID(){return this.emplID;}

    public String getName() {
        return this.name;
    }

    public float getSalary() {
        return this.salary;
    }

    public int grantStock(Employee e){
        return 10;
    }

    public void definirSalari(int percentatge){
       this.salary = ((this.salary*percentatge)/100) + this.salary;
    }


    public String printEmployee(Employee e){

        return "Aquest es un empleat" + grantStock(e);

    }

    public String toString(){
        return "emplID: " + emplID + " " + "Name: " + name + " " + "Ssn: " + ssn + " " + "Salary: " + salary + " ";
    }

}
