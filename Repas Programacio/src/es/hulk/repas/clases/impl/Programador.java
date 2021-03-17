package es.hulk.repas.clases.impl;

import es.hulk.repas.clases.Empleat;

import java.util.ArrayList;

public class Programador extends Empleat {

    ArrayList<String> tasks = new ArrayList<String>();

    public Programador(int codi, double sou, int antiguitat, String name, int age, String DNI, String genre, int telephone) {
        super(codi, sou, antiguitat, name, age, DNI, genre, telephone);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void completeTask(String task) {
        this.tasks.remove(task);
    }

    public void showTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i);
        }
    }
}
