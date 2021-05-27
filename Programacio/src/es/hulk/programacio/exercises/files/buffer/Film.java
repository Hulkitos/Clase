package es.hulk.programacio.exercises.files.buffer;

public class Film {

    private String name;
    private String director;
    private int year;

    public Film(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Film() {}

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
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

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                '}';
    }
}
