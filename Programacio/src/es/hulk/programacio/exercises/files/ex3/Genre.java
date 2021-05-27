package es.hulk.programacio.exercises.files.ex3;

public enum Genre {

    ACTION("action"), AUTOR("autor"), SCIFI("science fiction"), COMEDY("comedy"), DRAMA("drama"),
    POLICE("police"), HORROR("horror");

    private String genre;

    private Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }
}
