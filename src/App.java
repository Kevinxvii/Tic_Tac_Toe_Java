
import java.util.Scanner;

public class App {

    // private static final char[][] empty = '-';

    private static char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
    };

    private static char currentPlayer = 'X';

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean gamerunning = true;


        while (gamerunning) {
            printBoard();
            System.out.println("Giocatore " + currentPlayer + ", inserisci la riga e la colonna (0-2 separati da spazio):");
            int player1 = 0;
            int player2 = 0;

            int riga, colonna;

            while (true) {
                riga = scanner.nextInt();
                colonna = scanner.nextInt();
                if (isValidMove(riga, colonna)) {
                    break;
                } else {
                    System.out.println("mossa non valida");
                }

            }

            board[riga][colonna] = currentPlayer;

            if (checkwin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gamerunning = false;

            } else if (isboardfull()) {
                printBoard();
                System.out.println("Pareggio");
                gamerunning = false;
            } else {
                cambiaplayer();
            }
        }

        if (gamerunning == false) {
            // System.exit(0);
            scanner.close();
            return;
        }
    }

    private static void cambiaplayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static void printBoard() {
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-----------");
        }
    }

    private static boolean isValidMove(int riga, int colonna) {
        return riga >= 0 && riga < 3 && colonna >= 0 && colonna < 3 && board[riga][colonna] == ' ';
    }

    private static boolean checkwin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    private static boolean isboardfull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
