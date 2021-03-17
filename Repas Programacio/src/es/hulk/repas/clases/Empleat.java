package es.hulk.repas.clases;

import es.hulk.programacio.clases.Person;

public class Empleat extends Person {

    private double sou;
    private int antiguitat;
    private int id;

    public Empleat(int codi, double sou, int antiguitat, String name, int age, String DNI, String genre, int telephone) {
        super(name, age, DNI, genre, telephone);
        this.sou = sou;
        this.antiguitat = antiguitat;
        this.id = id;
    }

    public static double sumSou(double sou) {
        double percantatge = 5 % sou;
        double sumaSou = percantatge + sou;

        return sumaSou;
    }

    public static int moreAnys(int antiguitat) {
        return antiguitat++;
    }
}
