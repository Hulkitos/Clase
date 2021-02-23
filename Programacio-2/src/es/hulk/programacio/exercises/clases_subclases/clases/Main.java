package es.hulk.programacio.exercises.clases_subclases.clases;


public class Main {

    public static void main(String[] args) {
        Employee e = new Employee(2,"Manolo",13001,1003);
        Manager m = new Manager(2,"Sergio",13131,1313,"Oficina");
        Director d = new Director(3,"Toni",1111,1213, "Oficina",2500);
        Engineer en = new Engineer(1,"Pepe",13001,1003);
        Administrator a = new Administrator(1,"Pepe",13001,1003);



       /* a.addEmployee(c);
        a.addEmployee(e);

        a.printStaffDetails(a);*/
        // e.grantStock(e);
/*
        EmployeeStockPlan test = new EmployeeStockPlan();
        test.grantStock(e);

        test.grantStock(m);

        test.grantStock(d);

        test.grantStock(en);

        test.grantStock(a);

        System.out.println("L'empleat te el seguent valor :  " + test.grantStock(e));
        System.out.println("El manager te el seguent valor :  " + test.grantStock(m));
        System.out.println("El director te el seguent valor :  " +test.grantStock(d));
        System.out.println("l'Engineer te el seguent valor :  " +test.grantStock(en));
        System.out.println("L'administrador te el seguent valor :  " +test.grantStock(a));*/


        m.hire(e);





    }

}

