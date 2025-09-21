package Arrays;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameWon = false;

        displayBoard();

        for (int turn = 0; turn < 9 && !gameWon; turn++) {
            System.out.println("Player " + currentPlayer + ", choose your position (1-9):");
            int position = scanner.nextInt();

            if (!placeMark(currentPlayer, position)) {
                System.out.println("Invalid move, try again.");
                turn--;
                continue;
            }

            displayBoard();

            if (checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    public static void displayBoard() {
        System.out.println();
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print((cell == ' ' ? '.' : cell) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean placeMark(char player, int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (position < 1 || position > 9 || board[row][col] != ' ') {
            return false;
        }

        board[row][col] = player;
        return true;
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}