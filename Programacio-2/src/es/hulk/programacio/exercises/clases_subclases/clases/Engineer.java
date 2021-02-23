package es.hulk.programacio.exercises.clases_subclases.clases;

public class Engineer extends Employee {

    public Engineer(int emplID, String name, int ssn, float salary) {
        super(emplID, name, ssn, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public int grantStock(Employee e) {
        return 10;
    }

    public String printEmployee(Employee e) {

        return "Aquest es un empleat" + grantStock(e);

    }
}