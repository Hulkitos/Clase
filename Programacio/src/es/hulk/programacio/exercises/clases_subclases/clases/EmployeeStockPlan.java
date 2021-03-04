package es.hulk.programacio.exercises.clases_subclases.clases;

import java.util.Random;

public class EmployeeStockPlan{

    public int grantStock(Employee e) {
        Random random = new Random();
        return random.nextInt(9) + e.grantStock(e);


    }

}
