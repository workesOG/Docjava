package grundprogrammering.iteration;

// Opgave 41
public class TicTacToe {
    int[][] board = {
        { 1, 2, 1 },
        { 2, 1, 0 },
        { 0, 0, 2 }
    };

    public String[] toPrint() {
        String[] lines = new String[3];
        for (int i = 0; i < board.length; i++) {
            lines[i] = getLetter(board[i][0]);
            lines[i] += getLetter(board[i][1]);
            lines[i] += getLetter(board[i][2]);
        }
        return lines;
    }

    public String getLetter(int value) {
        switch (value) {
            case 1:
                return "X";
            case 2:
                return "O";
            default:
                return " ";
        }
    }
}
