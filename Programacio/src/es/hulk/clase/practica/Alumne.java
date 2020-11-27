package es.hulk.clase.practica;

public class Alumne {

    private String name;
    private int id;
    private int[] notes;

    public Alumne(String name, int id, int[] notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public String getName(String name) {
        return this.name;
    }

    public int getId(int id) {
        return this.id;
    }

    public int[] getNotes(int[] notes) {
        return this.notes;
    }
}
