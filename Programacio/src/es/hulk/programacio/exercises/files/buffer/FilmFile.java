package es.hulk.programacio.exercises.files.buffer;

import java.io.*;

public class FilmFile {

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public FilmFile(String file) throws IOException {
        this.bufferedReader = new BufferedReader(new FileReader(file));
        this.bufferedWriter = new BufferedWriter(new FileWriter(file));
    }

    public Film readFilm() throws IOException {
        Film film = new Film();
        film.setName(bufferedReader.readLine());
        film.setDirector(bufferedReader.readLine());
        film.setYear(Integer.parseInt(bufferedReader.readLine()));
        return film;
    }

    public void writeFilm(Film film) throws IOException {
        bufferedWriter.write(film.getName() + "\n");
        bufferedWriter.flush();
        bufferedWriter.write(film.getDirector() + "\n");
        bufferedWriter.flush();
        bufferedWriter.write(film.getYear() + "\n");
        bufferedWriter.flush();
    }

    public void close() throws IOException {
        bufferedWriter.close();
        bufferedReader.close();
    }

}
