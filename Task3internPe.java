import java.util.Scanner;

public class Task3internPe {
    private static char[] board = new char[9];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
    }

    private static void printBoard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    private static void playGame() {
        boolean gameEnded = false;

        while (!gameEnded) {
            int position = getPlayerMove();
            board[position] = currentPlayer;
            printBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (checkDraw()) {
                System.out.println("It's a draw!");
                gameEnded = true;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    private static int getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int position;

        while (true) {
            System.out.print("Player " + currentPlayer + ", enter a position (1-9): ");
            position = scanner.nextInt() - 1;

            if (position < 0 || position >= 9 || board[position] != ' ') {
                System.out.println("Invalid move. Try again.");
            } else {
                break;
            }
        }

        return position;
    }

    private static boolean checkWin() {

        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
                (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
                (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
                (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
                (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
                (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
                (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
                (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    private static boolean checkDraw() {
        for (int i = 0; i < 9; i++) {
            if (board[i] == ' ') {
                return false;
            }
        }
        return true;
    }
}
