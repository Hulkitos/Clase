package es.hulk.buscaminas.tauler;

import es.hulk.buscaminas.caselles.Box;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Random;
import java.util.Scanner;

public class Board {

    private static Box[][] board;

    public Board(int x, int y) {
        board = new Box[x][y];
    }

    public Box[][] getBoard() {
        return board;
    }

    public void setBoard(Box[][] board) {
        Board.board = board;
    }

    public void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Box();
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].isFlag()) {
                    Utilities.log(" [ ? ] ");
                } else if (!board[i][j].isPlugged()) {
                    Utilities.log(" [ - ] ");
                } else if (board[i][j].isBomb()) {
                    Utilities.log(" [ b ] ");
                } else {
                    Utilities.log(" [ x ] ");
                }
            }
            Utilities.logNewLine("");
        }
    }

    public void putFlag() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        board[x-1][y-1].setFlag(true);
        printBoard();
    }

    public void removeFlag(int x, int y) {
        if (board[x-1][y-1].isFlag()) {
            board[x-1][y-1].setFlag(false);
        } else {
            Utilities.logNewLine("No pots llevar una bandera a una casella on no esta asignada");
        }
    }

    public void putBombs(int mines) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int x = random.nextInt();
        int y = random.nextInt();


    }

    public void removePlug() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        board[x-1][y-1].setPlugged(false);
        printBoard();
    }
}
