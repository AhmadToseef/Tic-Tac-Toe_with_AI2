package tictactoe;

public class Grid {
    // property or Attribute
    protected int countX = 0;
    protected int countO = 0;
    protected final int GRID_SIZE = 3;
    static char[][] grid;
    protected String cells = "_________";

    public Grid() { // constructor
        grid = new char[GRID_SIZE][GRID_SIZE];
        int k = 0;
        int j = 0;

        // i am going to create 2d array using without nested loop;
        for (int i = 0; i < this.cells.length(); i++) {

            this.grid[j][k] = this.cells.charAt(i) == '_' ? ' ' : this.cells.charAt(i);

            if (k == GRID_SIZE - 1) {
                k = 0;
                if (j < GRID_SIZE - 1) {
                    j += 1;
                }
                continue;
            }
            ++k;
        }
    }

    public static void displayGrid() {

        String line = "---------";
        System.out.println(line);
        System.out.printf("| %s %s %s |\n", grid[0][0], grid[0][1], grid[0][2]);
        System.out.printf("| %s %s %s |\n", grid[1][0], grid[1][1], grid[1][2]);
        System.out.printf("| %s %s %s |\n", grid[2][0], grid[2][1], grid[2][2]);
        System.out.println(line);

    }

    public void countX_and_YCoordinates() {
        countO = 0;
        countX = 0;
        for (int i = 0; i < this.GRID_SIZE; i++) {
            for (int j = 0; j < this.GRID_SIZE; j++) {
                if (grid[i][j] == 'O') {
                    this.countO++;
                } else if (grid[i][j] == 'X') {
                    this.countX++;
                }
            }
        }
    }

    public char checkLeftToRightDiagonal() {
        countX = 0;
        countO = 0;
        for (int i = 0; i < this.GRID_SIZE; i++) {
            for (int j = i; j < i + 1; j++) {
                if (grid[i][j] == 'X') {
                    ++countX;
                } else if (grid[i][j] == 'O') {
                    ++countO;
                }
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    public char checkRightToLeftDiagonal() {
        countX = 0;
        countO = 0;
        for (int i = 0; i < this.GRID_SIZE; i++) {
            for (int j = this.GRID_SIZE - 1 - i; j > this.GRID_SIZE - 2 - i; j--) {
                if (this.grid[i][j] == 'X') {
                    this.countX++;
                } else if (this.grid[i][j] == 'O') {
                    this.countO++;
                }
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    public char checkTopLine() {
        countX = 0;
        countO = 0;
        for (int i = 0; i < this.GRID_SIZE; i++) {
            if (this.grid[0][i] == 'X') {
                this.countX++;
            } else if (this.grid[0][i] == 'O') {
                this.countO++;
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    public char checkCenterLine() {
        countX = 0;
        countO = 0;
        for (int i = 0; i < this.GRID_SIZE; i++) {
            if (grid[1][i] == 'X') {
                ++countX;
            } else if (grid[1][i] == 'O') {
                ++countO;
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    public char checkLeftLine() {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < 1; i++) {
            if (grid[i][i] == 'X') {
                ++countX;
            } else if (grid[i][i] == 'O') {
                ++countO;
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    protected char checkRightLine() {
        int countX = 0;
        int countO = 0;
        for (int i = 2; i < 3; i++) {
            if (grid[i][i] == 'X') {
                ++countX;
            } else if (grid[i][i] == 'O') {
                ++countO;
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    protected char checkBottomLine() {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < GRID_SIZE; i++) {
            if (grid[2][i] == 'X') {
                ++countX;
            } else if (grid[2][i] == 'O') {
                ++countO;
            }
        }
        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
    }

    protected int getCountX() {
        return countX;
    }

    protected void setCountX(int countX) {
        this.countX = countX;
    }

    protected int getCountO() {
        return countO;
    }

    protected void setCountO(int countO) {
        this.countO = countO;
    }
}

class MediumGrid extends Grid {

    public MediumGrid() {
        super();
    }

    @Override
    public char checkLeftToRightDiagonal() {
//        countX = 0;
//        countO = 0;
//        for (int i = 0; i < this.GRID_SIZE; i++) {
//            for (int j = i; j < i + 1; j++) {
//                if (grid[i][j] == 'X') {
//                    ++countX;
//                } else if (grid[i][j] == 'O') {
//                    ++countO;
//                }
//            }
//        }
//        return countO == 3 ? 'O' : countX == 3 ? 'X' : ' ';
        System.out.println("I am here");

        if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == ' ') {
            return '2';
        } else if (grid[1][1] == 'X' && grid[2][2] == 'X' && grid[0][0] == ' ') {
            return '0';
        } else if (grid[0][0] == 'X' && grid[2][2] == 'X' && grid[1][1] == ' ') {
            return '1';
        } else if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == ' ') {
            return '2';
        } else if (grid[1][1] == 'O' && grid[2][2] == 'O' && grid[0][0] == ' ') {
            return '0';
        } else if (grid[0][0] == 'O' && grid[2][2] == 'O' && grid[1][1] == ' ') {
            return '1';
        } else {
            return ' ';
        }
    }

    @Override
    public char checkRightToLeftDiagonal() {

        if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == ' ') {
            return '2';
        } else if (grid[1][1] == 'X' && grid[2][0] == 'X' && grid[0][2] == ' ') {
            return '0';
        } else if (grid[0][2] == 'X' && grid[2][0] == 'X' && grid[1][1] == ' ') {
            return '1';
        } else if (grid[0][2] == 'O' && grid[1][1] == 'O'  && grid[2][0] == ' ') {
            return '2';
        } else if (grid[1][1] == 'O' && grid[2][0] == 'O' && grid[0][2] == ' ') {
            return '0';
        } else if (grid[0][2] == 'O' && grid[2][0] == 'O'  && grid[1][1] == ' ') {
            return '1';
        } else {
            return ' ';
        }
    }

    @Override
    public char checkTopLine() {

        if (grid[0][0] == 'X' && grid[0][1] == 'X') {
            return '2';
        } else if (grid[1][1] == 'X' && grid[2][2] == 'X') {
            return '0';
        } else if (grid[0][0] == 'X' && grid[0][2] == 'X') {
            return '1';
        } else if (grid[0][0] == 'O' && grid[0][1] == 'O') {
            return '2';
        } else if (grid[1][1] == 'O' && grid[2][2] == 'O') {
            return '0';
        } else if (grid[0][0] == 'O' && grid[0][2] == 'O') {
            return '1';
        } else {
            return ' ';
        }
    }

    @Override
    protected char checkRightLine() {

        if (grid[0][2] == 'X' && grid[1][2] == 'X') {
            return  '2';
        } else if (grid[1][2] == 'X' && grid[2][2] == 'X') {
            return '0';
        } else if (grid[0][2] == 'X' && grid[2][2] == 'X') {
            return '1';
        } else if (grid[0][2] == 'O' && grid[1][2] == 'O') {
            return  '2';
        } else if (grid[1][2] == 'O' && grid[2][2] == 'O') {
            return '0';
        } else if (grid[0][2] == 'O' && grid[2][2] == 'O') {
            return '1';
        } else {
            return ' ';
        }
    }

    @Override
    public char checkCenterLine() {

        if (grid[1][0] == 'X' && grid[1][1] == 'X') {
            return '2';
        } else if (grid[1][1] == 'X' && grid[1][2] == 'X') {
            return '0';
        } else if (grid[1][0] == 'X' && grid[1][2] == 'X') {
            return '1';
        } else if (grid[1][0] == 'O' && grid[1][1] == 'O') {
            return '2';
        } else if (grid[1][1] == 'O' && grid[1][2] == 'O') {
            return '0';
        } else if (grid[1][0] == 'O' && grid[1][2] == 'O') {
            return '1';
        } else {
            return ' ';
        }
    }


    @Override
    public char checkLeftLine() {
        if (grid[0][0] == 'X' && grid[1][0] == 'X') {
            return '2';
        } else if (grid[1][0] == 'X' && grid[2][0] == 'X') {
            return '0';
        } else if (grid[0][0] == 'X' && grid[2][0] == 'X') {
            return '1';
        } else if (grid[0][0] == 'O' && grid[1][0] == 'O') {
            return '2';
        } else if (grid[1][0] == 'O' && grid[2][0] == 'O') {
            return '0';
        } else if (grid[0][0] == 'O' && grid[2][0] == 'O') {
            return '1';
        } else {
            return ' ';
        }
    }
}
