package tictactoe;

import java.util.Random;

class ComputerMoveAgainstHuman {

    protected String level;
    protected Grid grid;
    protected Random random;
    
    public ComputerMoveAgainstHuman(String level) {
        this.level = level;
        this.grid = new Grid();
        this.random = new Random();
    }

    public void setComputerLevel(String level) {
        this.level = level;
    }
    public String getComputerMove() {
        return this.level;
    }

    public void computerMove(char xOrY) {

        System.out.printf("Making move level \"%s\"", getComputerMove());

        Random random = new Random();
        int x = random.nextInt(3 - 1 + 1) + 1;
        int y = random.nextInt(3 - 1 + 1) + 1;

        while (grid.grid[x - 1][y - 1] != ' ') {
            x = random.nextInt(3 - 1 + 1) + 1;
            y = random.nextInt(3 - 1 + 1) + 1;
        }

        grid.grid[x - 1][y - 1] = xOrY;
        grid.displayGrid();
    }
}
class ComputerMediumLevel extends ComputerMoveAgainstHuman {

    protected MediumPlayGround mediumPlayGround;
    protected MediumGrid mediumGrid;

    public ComputerMediumLevel() {

        super("medium");
        this.mediumPlayGround = new MediumPlayGround(this);
        this.mediumGrid = new MediumGrid();
    }

    public ComputerMediumLevel(String level) {

        super(level);
        this.mediumGrid = new MediumGrid();
        this.mediumPlayGround = new MediumPlayGround(this);
    }

    @Override
    public void computerMove(char xOrY) {

        System.out.printf("Making move level \"%s\"\n", getComputerMove());

        Random random = new Random();
        mediumPlayGround.gameStatus();

        if (!checkDiagnols(xOrY) || !checkLines(xOrY)) {

            int x = random.nextInt(3 - 1 + 1) + 1;
            int y = random.nextInt(3 - 1 + 1) + 1;

            while (grid.grid[x - 1][y - 1] != ' ') {

                x = random.nextInt(3 - 1 + 1) + 1;
                y = random.nextInt(3 - 1 + 1) + 1;
            }

            grid.grid[x - 1][y - 1] = xOrY;
        }
        grid.displayGrid();
    }

    public boolean checkDiagnols(char xOrY) {

        if (mediumGrid.checkRightToLeftDiagonal() == '1') {
            grid.grid[1][1] = xOrY;
            return true;
        } else if (mediumGrid.checkRightToLeftDiagonal() == '2') {
            grid.grid[2][0] = xOrY;
            return true;
        } else if (mediumGrid.checkRightToLeftDiagonal() == '0') {
            grid.grid[0][2] = xOrY;
            return true;
        } else if (mediumGrid.checkLeftToRightDiagonal() == '1') { //
            grid.grid[1][1] = xOrY;
            return true;
        } else if (mediumGrid.checkLeftToRightDiagonal() == '2') {
            grid.grid[2][2] = xOrY;
            return true;
        } else if (mediumGrid.checkLeftToRightDiagonal() == '0') {
            grid.grid[0][0] = xOrY;
            return true;
        }
        return false;
    }
    public boolean checkLines(char xOrY) {
        if (mediumGrid.checkTopLine() == '1') {
            grid.grid[0][1] = xOrY;
            return true;
        } else if (mediumGrid.checkTopLine() == '2') {
            grid.grid[0][2] = xOrY;
            return true;
        } else if (mediumGrid.checkTopLine() == '0') {
            grid.grid[0][0] = xOrY;
            return true;
        } else if (mediumGrid.checkCenterLine() == '1') { //
            grid.grid[1][1] = xOrY;
            return true;
        } else if (mediumGrid.checkCenterLine() == '2') {
            grid.grid[1][2] = xOrY;
            return true;
        } else if (mediumGrid.checkCenterLine() == '0') {
            grid.grid[1][0] = xOrY;
            return true;
        } else if (mediumGrid.checkLeftLine() == '1') { //
            grid.grid[1][0] = xOrY;
            return true;
        } else if (mediumGrid.checkLeftLine() == '2') {
            grid.grid[2][0] = xOrY;
            return true;
        } else if (mediumGrid.checkLeftLine() == '0') {
            grid.grid[0][0] = xOrY;
            return true;
        } else if (mediumGrid.checkRightLine() == '1') { //
            grid.grid[1][2] = xOrY;
            return true;
        } else if (mediumGrid.checkRightLine() == '2') {
            grid.grid[2][2] = xOrY;
            return true;
        } else if (mediumGrid.checkRightLine() == '0') {
            grid.grid[0][2] = xOrY;
            return true;
        }
        return false;
    }
}
class ComputerHardLevel extends ComputerMediumLevel {

    public ComputerHardLevel(String level) {
        super(level);
    }

    @Override
    public void computerMove(char xOrY) {

        System.out.printf("Making move level \"%s\"\n", getComputerMove());

        Random random = new Random();
        int x = random.nextInt(3 - 1 + 1) + 1;
        int y = random.nextInt(3 - 1 + 1) + 1;

        while (grid.grid[x - 1][y - 1] != ' ') {
            x = random.nextInt(3 - 1 + 1) + 1;
            y = random.nextInt(3 - 1 + 1) + 1;
        }

        grid.grid[x - 1][y - 1] = xOrY;
        grid.displayGrid();
    }
}