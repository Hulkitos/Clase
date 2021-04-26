package es.hulk.buscaminas.tauler;

import es.hulk.buscaminas.caselles.Caselles;

import java.util.Scanner;

public class Tauler {

    private int column;
    private int row;
    private static Caselles[][] tauler;

    public Tauler(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public static Caselles[][] getTauler() {
        return tauler;
    }

    public static void setTauler(Caselles[][] tauler) {
        Tauler.tauler = tauler;
    }
}
