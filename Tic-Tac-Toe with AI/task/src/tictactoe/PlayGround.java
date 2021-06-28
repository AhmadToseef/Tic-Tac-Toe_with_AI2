package tictactoe;

import java.util.Random;
import java.util.Scanner;


public class PlayGround {
    Scanner scanner;
    Random random;
    Grid grid;

    public PlayGround() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.grid = new Grid();
    }

//    public void computerMove(char xOrY) {
//        System.out.println("Making move level \"easy\"");
//        Random random = new Random();
//        int x = random.nextInt(3 - 1 + 1) + 1;
//        int y = random.nextInt(3 - 1 + 1) + 1;
//        while (grid.grid[x - 1][y - 1] != ' ') {
//            x = random.nextInt(3 - 1 + 1) + 1;
//            y = random.nextInt(3 - 1 + 1) + 1;
//        }
//        grid.grid[x - 1][y - 1] = xOrY;
//        grid.displayGrid();
//    }

    public void gettingCoordinates() {

        while (true) {
            System.out.print("Enter the coordinates: ");
            try {
                int xCoordinate = Integer.parseInt(scanner.next());
                int yCoordinate = Integer.parseInt(scanner.next());
                if (checkingCoordinates(xCoordinate - 1, yCoordinate - 1)) {
                    grid.displayGrid();
                    gameStatus();
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
        }
    }

    public void gameStatus() {
        if (grid.checkLeftToRightDiagonal() == 'X' || grid.checkRightToLeftDiagonal() == 'X') {
            System.out.println("X wins");
            System.exit(0);
        } else if (grid.checkTopLine() == 'X' || grid.checkBottomLine() == 'X') {
            System.out.println("X wins");
            System.exit(0);
        } else if (grid.checkRightLine() == 'X' || grid.checkLeftLine() == 'X' || grid.checkCenterLine() == 'X') {
            System.out.println("X wins");
            System.exit(0);
        } else if (grid.checkLeftToRightDiagonal() == 'O' || grid.checkRightToLeftDiagonal() == 'O') {
            System.out.println("O wins");
            System.exit(0);
        } else if (grid.checkTopLine() == 'O' || grid.checkBottomLine() == 'O') {
            System.out.println("O wins");
            System.exit(0);
        } else if (grid.checkRightLine() == 'O' || grid.checkLeftLine() == 'O' || grid.checkCenterLine() == 'O') {
            System.out.println("O wins");
            System.exit(0);
        } else {
            checkDrawOrGameNotFinished();
        }
    }

    public void checkDrawOrGameNotFinished() {
        grid.countX_and_YCoordinates();
        if (grid.getCountX() + grid.getCountO() == 9) {
            System.out.println("Draw");
            System.exit(0);
        }
    }

    public boolean checkingCoordinates(int xCoordinate, int yCoordinate) {

        grid.countX_and_YCoordinates();
        if (xCoordinate > 2 || yCoordinate > 2) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        } else if (grid.grid[xCoordinate][yCoordinate] != ' ') {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        } else if (grid.getCountX() > grid.getCountO()) {
            grid.grid[xCoordinate][yCoordinate] = 'O';
            return true;
        } else if (grid.getCountO() > grid.getCountX()) {
            grid.grid[xCoordinate][yCoordinate] = 'X';
            return true;
        } else if (grid.getCountX() == grid.getCountO()) {
            grid.grid[xCoordinate][yCoordinate] = 'X';
            return true;
        }
        return false;
    }
}

class MediumPlayGround extends PlayGround {

    public MediumGrid mediumGrid;
    public ComputerMediumLevel mediumLevel;

    public MediumPlayGround(ComputerMediumLevel computerMediumLevel) {

        this.mediumGrid = new MediumGrid();
        this.mediumLevel = computerMediumLevel;
    }
}