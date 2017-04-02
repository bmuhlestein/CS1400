/**
 * Created by Muhlestein on 03-Mar-17.
 */

import java.util.*;

public class TicTacToe1 {
    static char[][] gameboard = new char[3][3];

    public static void printBoard() {
        System.out.println(" " + gameboard[0][0]
                + " | " + gameboard[0][1]
                + " | " + gameboard[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameboard[1][0]
                + " | " + gameboard[1][1]
                + " | " + gameboard[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameboard[2][0]
                + " | " + gameboard[2][1]
                + " | " + gameboard[2][2]);
    }

    public static void main(String[] args) {


        Scanner stdIn = new Scanner(System.in);
        int player = 1;
        boolean somebodyWon = false;

        printBoard();

        do {
            System.out.print("Enter a row (1 to 3) and column (1 to 3) separated by a space: ");
            int row = stdIn.nextInt();
            int col = 0;
            // checks to see if buffer still contains an int before assign col a value from the buffer
            if (stdIn. hasNextInt() == true) {
                col = stdIn.nextInt();
            }
            if (!(gameboard[row-1][col-1] == 'X' || gameboard[row-1][col-1] == 'O')) {
                //we're ok!  The space is open

                if (player == 1) {
                    gameboard[row-1][col-1] = 'X';
                } else {
                    gameboard[row-1][col-1] = 'O';
                }

                printBoard();

                //check for a winner

                //row
                for (row = 0; row < 3; row++) {
                    if (gameboard[row][col-1] != 0
                            && gameboard[row][0] == gameboard[row][1]
                            && gameboard[row][0] == gameboard[row][2]) {
                        System.out.println("Player " + player + " wins");
                        somebodyWon = true;
                    }
                }

                //column
                for (int c = 0; c < 3; c++) {
                    if (gameboard[0][c] != 0
                            && gameboard[0][c] == gameboard[1][c]
                            && gameboard[0][c] == gameboard[2][c]) {
                        System.out.println("Player " + player + " wins");
                        somebodyWon = true;
                    }
                }
                //diagonal top left to bottom right
                if (gameboard[0][0] != 0
                        && gameboard[0][0] == gameboard[1][1]
                        && gameboard[0][0] == gameboard[2][2]) {
                    System.out.println("Player " + player + " wins");
                    somebodyWon = true;
                }
                //diagonal top right to bottom left
                if (gameboard[0][2] != 0
                        && gameboard[0][2] == gameboard[1][1]
                        && gameboard[0][2] == gameboard[2][0]) {
                    System.out.println("Player " + player + " wins");
                    somebodyWon = true;
                }


                //Go to the next player
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            } else {
                System.out.println("You boogerface!  That spot is taken.");
            }
        } while(!somebodyWon);
    }//End Main



}// End Class
