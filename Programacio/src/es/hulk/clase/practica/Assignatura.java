package es.hulk.clase.practica;

public class Assignatura {

    private String name;
    private String[] students;

    public Assignatura(String name, String[] students) {
        this.name = name;
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getName(String name) {
        return this.name;
    }

    public String[] getStudents(String[] notes) {
        return this.students;
    }
}
