package es.hulk.programacio.exercises.files.ex3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FilmFileOut {

    private ObjectOutputStream objectOutputStream;

    public FilmFileOut(String file) throws IOException {
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
    }

    public void writeFilm(Film film) throws IOException {
        objectOutputStream.writeObject(film);
    }

    public void close() throws IOException {
        objectOutputStream.close();
    }

}
