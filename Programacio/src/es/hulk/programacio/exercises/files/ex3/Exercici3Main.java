package es.hulk.programacio.exercises.files.ex3;

import java.io.IOException;
import java.util.Scanner;

public class Exercici3Main {

    private static final int NUM_FILMS = 3;
    private static Scanner sc;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FilmFileOut filmFileOut = new FilmFileOut("films.txt");
        Genre file;

        for (int i = 0; i < NUM_FILMS; i++) {
            Film film = keyboardRead();
            filmFileOut.writeFilm(film);
        }
        filmFileOut.close();

        FilmFileIn filmFileIn = new FilmFileIn("films.txt");
        for (int i = 0; i < NUM_FILMS; i++) {
            Film film = filmFileIn.readFilm();
            file = film.getGenre();
            FilmFileOut genreFileOut = new FilmFileOut(file + ".txt");
            genreFileOut.writeFilm(film);
            genreFileOut.close();
        }
        filmFileIn.close();

    }

    public static Film keyboardRead() {
        sc = new Scanner(System.in);
        Film film = new Film();

        System.out.println("\nIntroduce film data:");
        System.out.print("Film name: ");
        film.setName(sc.nextLine());
        System.out.print("Film director: ");
        film.setDirector(sc.nextLine());
        System.out.println("Film genre: ");
        film.setGenre(readGenre());
        System.out.print("Release year: ");
        film.setYear(sc.nextInt());

        return film;
    }

    public static Genre readGenre() {
        System.out.println("[1] - Action\n" +
                "[2] - Autor\n" +
                "[3] - SciFi\n" +
                "[4] - Comedy\n" +
                "[5] - Drama\n" +
                "[6] - Police\n" +
                "[7] - Horror\n");

        sc = new Scanner(System.in);
        int option = 0;
        Genre genre = Genre.ACTION;
        do {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    genre = Genre.ACTION;
                    break;
                case 2:
                    genre = Genre.AUTOR;
                    break;
                case 3:
                    genre = Genre.SCIFI;
                    break;
                case 4:
                    genre = Genre.COMEDY;
                    break;
                case 5:
                    genre = Genre.DRAMA;
                    break;
                case 6:
                    genre = Genre.POLICE;
                    break;
                case 7:
                    genre = Genre.HORROR;
                    break;
                default:
                    System.out.println("Wrong option");
            }
        } while (option < 1 || option > 7);
        return genre;
    }
}
