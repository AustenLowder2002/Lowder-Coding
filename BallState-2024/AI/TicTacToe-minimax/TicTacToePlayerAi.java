package solutions;

import core_algorithms.Minimax;
import problems.Game;
import problems.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToePlayerAi {
    public static void main(String[] args) {
        int boardSize = 3;
        Game<char[][], int[]> ticTacToeGame = new TicTacToe(boardSize, TicTacToe.Marks.X);
        Minimax<char[][], int[]> minimax = new Minimax<>(ticTacToeGame, true);
        char[][] board = new char[boardSize][boardSize];
        boolean isHumanTurn = true;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (!ticTacToeGame.isTerminal(board)) {
            printBoard(board);

            if (isHumanTurn) {
                System.out.println("Enter row number (1-" + boardSize + "):");
                int row = scanner.nextInt() - 1;
                System.out.println("row:" + row);
                System.out.println("Enter column number (1-" + boardSize + "):");
                int column = scanner.nextInt() - 1;
                System.out.println("col:" + column);

                System.out.println("Before move:");
                printBoard(board);

                // Debug: Print adjusted row and column indices before calling isValidMove
                int adjustedRow = row;
                int adjustedColumn = column;
                System.out.println("Adjusted row: " + adjustedRow);
                System.out.println("Adjusted column: " + adjustedColumn);

                if (isValidMove(row, column, board)) {
                    int[] position = {row, column};
                    board = ticTacToeGame.execute(position, board);
                    System.out.println("After move:");
                    printBoard(board);

                    // Debug: Print the board after executing the move
                    System.out.println("Board after execute:");
                    printBoard(board);

                    if (ticTacToeGame.utility(board) == 1) {
                        System.out.println("Human player wins!");
                        break;
                    }
                    isHumanTurn = false;
                } else {
                    System.out.println("That position is already occupied or out of range. Please try again.");
                }

        } else {
                // AI player's turn
                int[] bestMove = findBestMove(ticTacToeGame, minimax, board);
                board = ticTacToeGame.execute(bestMove.clone(), board);
                board[bestMove[0]][bestMove[1]] = 'O'; // Retain the symbol for the AI player

                if (ticTacToeGame.utility(board) == -1) {
                    System.out.println("AI player wins!");
                    break;
                }
                isHumanTurn = true;
            }

        }

        printBoard(board);
        int utility = ticTacToeGame.utility(board);
        if (utility == 0) {
            System.out.println("It's a draw!");
        }
    }

    private static boolean isValidMove(int row, int column, char[][] board) {
        int adjustedRow = row; // No need to adjust here
        int adjustedColumn = column; // No need to adjust here
        int size = board.length;

        // Debug: Print adjusted row and column indices, as well as the board state
        System.out.println("Adjusted row: " + adjustedRow);
        System.out.println("Adjusted column: " + adjustedColumn);
        System.out.println("Board state:");
        printBoard(board);

        return adjustedRow >= 0 && adjustedRow < size && adjustedColumn >= 0 && adjustedColumn < size && board[adjustedRow][adjustedColumn] == ' ';
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell != ' ' ? cell : "-");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[] findBestMove(Game<char[][], int[]> game, Minimax<char[][], int[]> minimax, char[][] board) {
        List<int[]> availableMoves = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ' ') {
                    availableMoves.add(new int[]{i, j});
                }
            }
        }
        int[] bestMove = minimax.minimaxSearch(board);
        for (int[] move : availableMoves) {
            if (move[0] == bestMove[0] && move[1] == bestMove[1]) {
                return move;
            }
        }
        // This should never happen if the minimax algorithm is implemented correctly,
        // but just in case, return a random move if the best move is not found in available moves.
        return availableMoves.get(new Random().nextInt(availableMoves.size()));
    }
}
