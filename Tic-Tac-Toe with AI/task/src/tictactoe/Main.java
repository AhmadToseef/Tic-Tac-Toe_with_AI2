package tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static int countX = 0; // take counting of X symbols in grid or Game
    static int countO = 0; // take counting of O symbols in grid or Game
    static final int GRID_SIZE = 3; // defining game grid size
    static char[][] grid; // Game grid itself

    public static void main(String[] args) {

        MediumGameInterface gameInterface = new MediumGameInterface();
        gameInterface.start();
    }
}

