package es.hulk.clase.practica;

import es.hulk.clase.exercisisClasse.Person;

public class Professor extends Person {

    private String especialitat;

    public Professor(String name, int age, String DNI, String genre, int telephone, String especialitat) {
        super(name, age, DNI, genre, telephone);
        this.especialitat = especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public String getEspecialitat(String especialitat) {
        return this.especialitat;
    }

    public void display() {
        System.out.println("Nom: " + getName());
        System.out.println("Edat: " + getAge());
        System.out.println("DNI: " + getDNI());
        System.out.println("Genre: " + getGenre());
        System.out.println("Telefono: " + getTelephone());
        System.out.println("Especialitat: " + this.especialitat);
    }
}
