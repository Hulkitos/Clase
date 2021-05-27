package es.hulk.programacio.exercises.files.ex3;

import java.io.Serializable;

public class Film implements Serializable {
    private String name;
    private String director;
    private int year;
    private Genre genre;

    public Film(String name, String director, Genre genre, int year) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    public Film() {}

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}