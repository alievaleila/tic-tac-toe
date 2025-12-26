package az.edu.itbrains;

import java.util.Scanner;

import static az.edu.itbrains.TicTacToe.board;
import static az.edu.itbrains.TicTacToe.turn;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
        printBoard();

        while (true) {
            System.out.println(turn + "'s turn. Enter slot number(1-9): ");
            int move = sc.nextInt();
            if (board[move - 1].equals(String.valueOf(move))) {
                board[move - 1] = turn;
            } else {
                System.out.println("Already taken!Try again.");
            }

            printBoard();

            String result = checkWinner();
            if (result != null) {
                if (result.equals("draw")) {
                    System.out.println("It is a draw!");
                } else {
                    System.out.println(result + " wins!");
                }
                break;
            }
            turn = turn.equals("X") ? "X" : "O";
        }
    }

    private static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }


    private static String checkWinner() {
        int[][] wins = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };

        for (int[] w : wins) {
            if (board[w[0]].equals(board[w[1]]) && board[w[1]].equals(board[w[2]])) {
                return board[w[0]];
            }
        }

        for (String s : board) {
            if (s.matches("[1-9]") ){
                return null;
            }
        }
        return "draw";
    }


}
