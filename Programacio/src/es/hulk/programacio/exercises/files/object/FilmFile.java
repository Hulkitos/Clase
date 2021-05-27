package es.hulk.programacio.exercises.files.object;

import java.io.*;

public class FilmFile {

    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;

    public FilmFile(String file) throws IOException {
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectInputStream = new ObjectInputStream(new FileInputStream(file));
    }

    public void writeFilm(Film film) throws IOException {
        objectOutputStream.writeObject(film);
    }

    public Film readFilm() throws ClassNotFoundException, IOException {
        return (Film) objectInputStream.readObject();
    }


    public void close() throws IOException {
        objectInputStream.close();
        objectOutputStream.close();
    }

}
