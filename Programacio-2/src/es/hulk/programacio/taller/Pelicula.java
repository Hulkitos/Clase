package es.hulk.programacio.taller;

public class Pelicula {

    private String title;
    private int duration;
    private String director;

    public Pelicula(String title, int duration, String director) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }
}
