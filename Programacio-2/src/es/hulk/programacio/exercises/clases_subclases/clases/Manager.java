package es.hulk.programacio.exercises.clases_subclases.clases;

import es.hulk.programacio.exercises.clases_subclases.interfacesClases.Management;

public class Manager extends Employee implements Management {
    private String Departament;
    Employee[] employees;
    int numEmployees;


    public Manager(int emplID, String name, int ssn, float salary, String Departament) {
        super(emplID, name, ssn, salary);
        this.Departament = Departament;
        employees = new Employee[20];
        numEmployees = 0;

    }


    private String planificacioMesGenerica;
    private String contractarDepartament;

    public void plan() {
        System.out.println("Se ha passat la planificació correctament");
    }

    public void hire(Employee e) {
       if (addEmployee(e)){
                      plan();
       }else {
           System.out.println("ERROR");
       }

    }


    public void setDepartament(String Departament) {
        this.Departament = Departament;
    }

    public int findEmployee(Employee e) {
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getEmplID() == e.getEmplID()) {
                return i;
            }
        }
        return -1;
    }

    public boolean addEmployee(Employee e) {
        if (findEmployee(e) == -1 && numEmployees < 20) {
            employees[numEmployees] = e;
            numEmployees++;

            return true;
        }

        return false;
    }

    public boolean removeEmployee(Employee e) {

        Employee[] aux = new Employee[20];

        boolean eliminat = false;

        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].equals(e)) {
                eliminat = true;
            } else {
                aux[i] = employees[i];
            }
        }
        employees = aux;

        return eliminat;
    }

    public void printStaffDetails(Manager manager) {
        System.out.println("");
        System.out.println("El manager té la següent informació : " + manager.toString());
        System.out.println("");
        System.out.println("A continuació la llista de emplets assignats al manager : ");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(employees[i].toString());
        }

    }


    public String getDepartament() {
        return this.Departament;
    }

    @Override
    public int grantStock(Employee e) {
        return 100;
    }
    @Override
    public String printEmployee(Employee e) {
        return "Aquest es un empleat" + grantStock(e);

    }


    @Override
    public String toString() {
        super.toString();
        //System.out.println("Presupost:" + Presupost);

        return super.toString() + "Departament: " + Departament + " ";
    }

}
