package es.hulk.programacio.exercises.files.buffer;

import java.io.IOException;
import java.util.Scanner;

public class Exercici1Main {

    private static Scanner sc;
    private static final int NUM_FILMS = 3;

    public static void main(String[] args) throws IOException {

        FilmFile filmFile = new FilmFile("films.txt");

        for (int i = 0; i < NUM_FILMS; i++) {
            Film film = keyboardRead();
            filmFile.writeFilm(film);
        }

        for (int i = 0; i < NUM_FILMS; i++) {
            Film film = filmFile.readFilm();
            System.out.println(film);
        }

    }

    public static Film keyboardRead() {
        sc = new Scanner(System.in);
        Film film = new Film();

        System.out.println("\nIntroduce film data:");
        System.out.print("Film name: ");
        film.setName(sc.nextLine());
        System.out.print("Film director: ");
        film.setDirector(sc.nextLine());
        System.out.print("Release year: ");
        film.setYear(sc.nextInt());

        return film;
    }

}
