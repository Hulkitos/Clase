package es.hulk.programacio.exercises.files.ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FilmFileIn {

    private ObjectInputStream objectInputStream;

    public FilmFileIn(String file) throws IOException {
        objectInputStream = new ObjectInputStream(new FileInputStream(file));
    }

    public Film readFilm() throws ClassNotFoundException, IOException {
        Object o = objectInputStream.readObject();
        return (Film) o;
    }

    public void close() throws IOException {
        objectInputStream.close();
    }

}
