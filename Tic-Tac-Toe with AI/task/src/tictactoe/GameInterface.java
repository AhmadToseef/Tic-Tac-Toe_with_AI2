package tictactoe;

import java.util.Scanner;

public class GameInterface {

    protected final Scanner scanner;
    protected PlayGround playGround;
    protected Grid grid;
    protected MediumGrid mediumGrid;
    protected MediumPlayGround mediumPlayGround;
    protected ComputerMediumLevel computerMediumLevel;
    protected ComputerMoveAgainstHuman computerMoveAgainstHuman;

    public GameInterface() {

        this.playGround = new PlayGround();
        this.scanner = new Scanner(System.in);
        this.grid = new Grid();
        this.computerMoveAgainstHuman = new ComputerMoveAgainstHuman("easy");
    }

    public void start() {

        System.out.print("Input command: ");
        String[] commands = scanner.nextLine().split(" ");

        if (commands[0].equals("exit")) {
            System.exit(0);
        }

        while (commands.length < 3) {

            System.out.println("Bad parameters!");
            System.out.print("Input command: ");
            commands = scanner.nextLine().split(" ");

            if (commands[0].equals("exit")) {
                System.exit(0);
            }
        }
        grid.displayGrid();
        menu(commands);

    }

    protected void menu(String ...arg) {

        if (arg.length == 3) {

            if (arg[1].equals("easy") && arg[2].equals("easy")) {

                while (true) {
//                    this.playGround.computerMove('X');
                    computerMoveAgainstHuman.computerMove('X');
                    this.playGround.gameStatus();
//                    this.playGround.computerMove('O');
                    computerMoveAgainstHuman.computerMove('O');
                    this.playGround.gameStatus();
                }
            } else if (arg[1].equals("easy") && arg[2].equals("user")) {

                while (true) {

//                    this.playGround.computerMove('X');
                    computerMoveAgainstHuman.computerMove('X');
                    this.playGround.gameStatus();
                    this.playGround.gettingCoordinates();
                    this.playGround.gameStatus();
                }
            } else if (arg[1].equals("user") && arg[2].equals("easy")) {

                while (true) {

                    this.playGround.gettingCoordinates();
                    this.playGround.gameStatus();
//                    this.playGround.computerMove('O');
                    computerMoveAgainstHuman.computerMove('O');
                    this.playGround.gameStatus();
                }
            } else if (arg[1].equals("user") && arg[2].equals("user")) {

                while (true) {

                    this.playGround.gettingCoordinates();
                    this.playGround.gameStatus();
                    this.playGround.gettingCoordinates();
                    this.playGround.gameStatus();
                }
            }
        }
    }
}

class MediumGameInterface extends GameInterface {

    public MediumGameInterface() {

        super.mediumGrid = new MediumGrid();
        super.mediumPlayGround = new MediumPlayGround(new ComputerMediumLevel());
        super.computerMediumLevel = new ComputerMediumLevel();
    }

    public void start() {

        System.out.print("Input command: ");
        String[] commands = scanner.nextLine().split(" ");

        if (commands[0].equals("exit")) {
            System.exit(0);
        }

        while (commands.length < 3) {

            System.out.println("Bad parameters!");
            System.out.print("Input command: ");
            commands = scanner.nextLine().split(" ");

            if (commands[0].equals("exit")) {
                System.exit(0);
            }
        }

        grid.displayGrid();
        menu(commands);

    }

    @Override
    protected void menu(String ...arg) {
        if (arg.length == 3) {


            if (arg[1].equals("medium") && arg[2].equals("medium")) {

                while (true) {
//                    this.playGround.computerMove('X');

                    computerMediumLevel.computerMove('X');
                    this.mediumPlayGround.gameStatus();
//                    this.playGround.computerMove('O');
                    computerMediumLevel.computerMove('O');
                    this.mediumPlayGround.gameStatus();
                }
            } else if (arg[1].equals("medium") && arg[2].equals("user")) {
                while (true) {
//                    this.playGround.computerMove('X');
                    computerMediumLevel.computerMove('X');
                    this.mediumPlayGround.gameStatus();
                    this.mediumPlayGround.gettingCoordinates();
                    this.mediumPlayGround.gameStatus();
                }
            } else if (arg[1].equals("medium") && arg[2].equals("easy")) {

                while (true) {

                    this.mediumPlayGround.gettingCoordinates();
                    this.mediumPlayGround.gameStatus();
//                    this.playGround.computerMove('O');
                    this.mediumPlayGround.gameStatus();
                }
            } else if (arg[1].equals("user") && arg[2].equals("medium")) {

                while (true) {

                    this.mediumPlayGround.gettingCoordinates();
                    this.mediumPlayGround.gameStatus();
//                    this.mediumPlayGround.gettingCoordinates();
                    computerMediumLevel.computerMove('O');
                    this.mediumPlayGround.gameStatus();
                }
            } else {
                super.menu(arg);
            }
        }
    }
}
