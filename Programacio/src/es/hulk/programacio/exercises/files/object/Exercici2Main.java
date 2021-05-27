package es.hulk.programacio.exercises.files.object;

import java.io.IOException;
import java.util.Scanner;

public class Exercici2Main {

    private static final int NUM_FILMS = 2;
    private static Scanner sc;

    public static void main(String[] args) throws ClassNotFoundException, IOException {

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
