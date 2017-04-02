/**************************************************************
 *
 * BrandonMuhlesteinOperation8.java
 * Created by Muhlestein on 02-Mar-17.
 *
 *
 * This program plays Connect Four.
 *
 ***************************************************************/
import java.util.*;

public class BrandonMuhlesteinOperation8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        //Variables
        String sPlayerName = "";
        String sPlayerColor;
        char cPlayerColor;
        char cComputerColor;

        //Beginning of the program
        System.out.println("Welcome to Connect Four\n");
        System.out.println("Please enter your name: ");
        sPlayerName = in.nextLine();
        System.out.println("What color would you like to be? R = Red or Y = Yellow");
        sPlayerColor = in.nextLine();

        while(!(sPlayerColor.equalsIgnoreCase("r") || sPlayerColor.equalsIgnoreCase("y")))
        {
            System.out.println("Please enter either an R or a Y");
            sPlayerColor = in.nextLine();
        }

        String sUpperPlayerColor = sPlayerColor.toUpperCase(); //Converts user input to upper case
        if(sUpperPlayerColor.equals("R"))
        {
            cPlayerColor = sUpperPlayerColor.charAt(0);
            cComputerColor = 'Y';
        }
        else
        {
            cPlayerColor = sUpperPlayerColor.charAt(0);
            cComputerColor = 'R';
        }


        //Create array for the game board and display the board
        char [][] cConnectFourBoard = new char [6][7];
        displayBoard(cConnectFourBoard);


        //Create method for playing the game
        playConnectFour(cConnectFourBoard, sPlayerName, cPlayerColor, cComputerColor);

    }//End main method


    /*****
    * Method for playing the game
    *****/
    private static void playConnectFour(char [][] cConnectFourBoard, String sPlayerName, char cPlayerColor, char cComputerColor)
    {
        Scanner in = new Scanner (System.in);
        Random r = new Random();

        boolean bGameOver = false;
        boolean bPlayerName = Boolean.valueOf(sPlayerName);
        bPlayerName = true;
        int iColumnPosition = 0;
        int iComputerColumn = 0;
        char cTokenColor;
        boolean error = false;

        while(!bGameOver)
        {
            if (bPlayerName)
            {
                System.out.print("\n\nWhich column would you like to drop your token (0 - 6)? ");
                cTokenColor = cPlayerColor;

                do
                {
                    error = false;
                    try
                    {
                        iColumnPosition = in.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        error = true;
                        System.out.println("Please enter a whole number as you can't have half columns in connect four!");

                        //Flush the buffer
                        in.nextLine();
                    }
                }while (error);

            }
            else
            {
                iComputerColumn = r.nextInt(7);
                cTokenColor = cComputerColor;
                iColumnPosition = iComputerColumn;
            }

            while (iColumnPosition < 0 || iColumnPosition > 6)
            {
                System.out.print("The column number needs to be between 0 and 6. ");
                iColumnPosition = in.nextInt();
            }
            bPlayerName = !bPlayerName;

            if (dropToken(cConnectFourBoard, iColumnPosition, cTokenColor))
            {
                bPlayerName = !bPlayerName;
            }
            else
            {
                displayBoard(cConnectFourBoard);

                if (gameStatus(cConnectFourBoard, iColumnPosition, cTokenColor))
                {
                    bGameOver = true;
                    System.out.println("\n" + cTokenColor + " Won! Game Over.");
                }
                if(checkTie(cConnectFourBoard))
                {
                    bGameOver = true;
                    System.out.println("\nIt's a tie!");
                }

            }

        }// End While loop

    }//End playConnectFour method


    /*****
    * Method for displaying the game board
    * Creates upper and lower borders and title for board
    *****/
    private static void displayBoard(char [][] cConnectFourBoard)
    {
        System.out.println();
        for (int i = 0; i < cConnectFourBoard.length - 2; i++)
        {
            System.out.print("--");
        }
        System.out.println("\nConnect Four Game Board");
        for (int i = 0; i < cConnectFourBoard.length - 2; i++)
        {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < cConnectFourBoard.length; i++)
        {
            for (int j = 0; j < cConnectFourBoard[i].length; j++)
            {
                System.out.print("|" + cConnectFourBoard[i][j]);
            }
            System.out.println("|");
        }
        for (int i = 0; i < cConnectFourBoard.length - 2; i++)
        {
            System.out.print("--");
        }
    }//End displayBoard method


    /*****
    * Method for dropping the token on the board
    ******/
    private static boolean dropToken(char [][] cConnectFourBoard, int iColumnPosition, char cTokenColor)
    {
        for (int i = cConnectFourBoard.length - 1; i >= 0; i--)
        {
            if(cConnectFourBoard[i][iColumnPosition] == 0)
            {
                cConnectFourBoard[i][iColumnPosition] = cTokenColor;
                return false;
            }
        }
        System.out.println("Column full, " + cTokenColor + " player, try again");
        return true;
    }


    /*******
    * Method for identifying the connect four
    *******/
    private static boolean gameStatus(char[][] cConnectFourBoard, int iColumnPosition, char cTokenColor)
    {
        int iRowPosition = 0;

        for (int i = 0; i < cConnectFourBoard.length; i++)
        {
            if (cConnectFourBoard[i][iColumnPosition] != 0)
            {
                iRowPosition = i;
                break;
            }
        }
        if (checkColumn(cConnectFourBoard, iColumnPosition, cTokenColor, iRowPosition))
        {
            return true;
        }
        if (checkRow(cConnectFourBoard, iColumnPosition, cTokenColor, iRowPosition))
        {
            return true;
        }
        if (checkDiagonal(cConnectFourBoard, iColumnPosition, cTokenColor, iRowPosition))
        {
            return true;
        }
        return false;
    }


    /*******
    * Method for determining if there are four tokens on the diagonals
    *******/
    private static boolean checkDiagonal(char[][] cConnectFourBoard, int iColumnPosition, char cTokenColor, int iRowPosition)
    {
        int iChipCounter = 1;

        //Checking for minor diagonals
        for (int i = iRowPosition + 1, j = iColumnPosition - 1; i < cConnectFourBoard.length && j >= 0; i++, j--)
        {
            if (cTokenColor == cConnectFourBoard[i][j])
            {
                iChipCounter++;
            }
            else
            {
                break;
            }
        }
        if (iChipCounter == 4)
        {
            return true;
        }
        for (int i = iRowPosition - 1, j = iColumnPosition + 1; i >=0 && j < cConnectFourBoard[0].length; i--, j--)
        {
            if (cTokenColor == cConnectFourBoard[i][j])
            {
                iChipCounter++;
            }
            else
            {
                break;
            }
        }
        if (iChipCounter == 4)
        {
            return true;
        }

        //Checking for major diagonals
        for (int i = iRowPosition - 1, j = iColumnPosition - 1; i >= 0 && j >= 0; i--, j--)
        {
            if (cTokenColor == cConnectFourBoard[i][j])
            {
                iChipCounter++;
            }
            else
            {
                break;
            }
        }
        if (iChipCounter >= 4)
        {
            return true;
        }
        for (int i = iRowPosition + 1, j = iColumnPosition + 1; i < cConnectFourBoard.length && j < cConnectFourBoard[0].length; i++, j++)
        {
            if (cTokenColor == cConnectFourBoard[i][j])
            {
                iChipCounter++;
            }
            else
            {
                break;
            }
        }
        if (iChipCounter >= 4)
        {
            return true;
        }
        return false;
    }


    /******
    * Method for determining if there are four tokens in a row
    ******/
    private static boolean checkRow(char [][] cConnectFourBoard, int iColumnPosition, char cTokenColor, int iRowPosition)
    {
        int iChipCounter = 1;

        for (int i = iColumnPosition - 1; i >= 0; i--)
        {
            if (cTokenColor == cConnectFourBoard[iRowPosition][i])
            {
                iChipCounter++;
            } else
                {
                break;
            }
        }
        if (iChipCounter >= 4)
        {
            return true;
        }
        for (int i = iColumnPosition + 1; i < cConnectFourBoard[0].length; i++)
        {
            if (cTokenColor == cConnectFourBoard[iRowPosition][i])
            {
                iChipCounter++;
            } else
            {
                break;
            }
        }
        if (iChipCounter >= 4)
        {
            return true;
        }
        return false;
    }


    /********
    * Method for determining four tokens in a column.
    *********/
    private static boolean checkColumn (char[][] cConnectFourBoard, int iColumnPosition, char cTokenColor, int iRowPosition)
    {
        int iChipCounter = 1;

        if ((iRowPosition + 4) <= 6)
        {
            for (int i = iRowPosition + 1; i <= (iRowPosition + 3); i++)
            {
                if (cTokenColor  == cConnectFourBoard[i][iColumnPosition])
                {
                    iChipCounter++;
                }
                else
                {
                    break;
                }
            }
        }
        if (iChipCounter == 4)
        {
            return true;
        }
        return false;
    }


    /*******
    * Method for determining if the board is complete full indicating a tie.
    *******/
    private static boolean checkTie(char [][] cConnectFourBoard)
    {
        for (int i = 0; i < cConnectFourBoard[0].length; i++)
        {
            if (cConnectFourBoard[0][i] == 0)
            {
                return false;
            }
        }
        return true;
    }


}//End BrandonMuhlesteinOperation8 class
