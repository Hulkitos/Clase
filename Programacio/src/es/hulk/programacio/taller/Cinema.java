package es.hulk.programacio.taller;

public class Cinema {

    private String name;
    private int nsales;
    private Pelicula[] pelicules;

    public Cinema(Pelicula[] pelis, int nsales, Pelicula[] pelicules) {
        this.name = name;
        this.nsales = nsales;
        this.pelicules = pelicules;
    }

    public Pelicula peliculaMesLlarga() {
        int duracio = 0;
        Pelicula pelicula = new Pelicula("", 0, "");
        for (int i = 0; i < this.pelicules.length; i++) {
            if (this.pelicules[i].getDuration() > duracio) {
                duracio = (int) this.pelicules[i].getDuration();
                pelicula = this.pelicules[i];
            }
        }
        return pelicula;
    }
}
