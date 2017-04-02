/**
 * Created by Muhlestein on 03-Mar-17.
 */
import java.util.*;

public class Programming_Exercise_20 {

    public static void main (String[] args)
    {
        char[][] connectFourGrid = new char [6][7];
        displayGrid(connectFourGrid);

        playConnectFour(connectFourGrid);
    }


    //plays the game connect four
    //asks user to enter to red or yellow chip
    //game end when there are four color chips in a row (v, H, D)
    public static void playConnectFour(char[][] connectFourGrid)
    {
        Scanner in = new Scanner (System.in);

        boolean gameOver = false;
        boolean playerTurn = true; // reds turn | false = yellow
        int columnPosition = 0;
        char chipColor;

        while(!gameOver)
        {
            if (playerTurn)
            {
                System.out.print("Drop a red disk at column (0 - 6):");
                chipColor = 'R';
            }
            else
            {
                System.out.print("Drop a yellow disk at column (0 - 6):");
                chipColor = 'Y';
            }
            columnPosition = in.nextInt();
            while (columnPosition < 0 || columnPosition > 6)
            {
                System.out.print("Column position must be between 0 and 6");
                columnPosition = in.nextInt();
            }
            playerTurn = !playerTurn;

            if (dropChip(connectFourGrid, columnPosition, chipColor))
            {
                playerTurn = !playerTurn;
            }
            else
            {
                displayGrid(connectFourGrid);

                /*if (gameStatus(connectFourGrid, columnPosition, chipColor));
                {
                    gameOver = true;
                    System.out.println(chipColor + "Won! Game Over!");
                }
                if (checkTie(connectFourGrid))
                {
                    gameOver = true;
                    System.out.println("It's a tie!");
                }*/
            }
        }

    }

    public static boolean checkTie(char[][] connectFourGrid)
    {
        for (int i = 0; i < connectFourGrid[0].length; i++)
        {
            if (connectFourGrid[0][i] == 0)
            {
                return false;
            }

        }

        return true;
    }


    public static boolean gameStatus (char[][] connectFourGrid, int columnPosition, char chipColor)
    {
        int rowPosition = 0;

        for (int i = 0; i < connectFourGrid.length; i++)
        {
            if (connectFourGrid[i][columnPosition] != 0)
            {
                rowPosition = i;
                break;
            }
        }
        if (checkColumn(connectFourGrid, columnPosition, chipColor, rowPosition))
        {
            return true;
        }
        if (checkRow(connectFourGrid, columnPosition, chipColor, rowPosition))
        {
            return true;
        }
        if (checkMajorDiagonal(connectFourGrid, columnPosition, chipColor, rowPosition))
        {
            return true;
        }
        if (checkMinorDiagonal(connectFourGrid, columnPosition, chipColor, rowPosition))
        {
            return true;
        }

        return false;
    }


    public static boolean checkMinorDiagonal(char[][] connectFourGrid, int columnPosition, char chipColor, int rowPosition)
    {
        int chipCounter = 1;

        for(int i = rowPosition + 1, j = columnPosition - 1; i < connectFourGrid.length && j >= 0; i++, j--)
        {
            if (chipColor == connectFourGrid[i][j])
            {
                chipCounter++;
            }
            else
            {
                break;
            }
        }

        if (chipCounter >= 4)
        {
            return true;
        }

        for (int i = rowPosition - 1, j = columnPosition + 1; i >= 0 && j < connectFourGrid[0].length; i--, j--)
        {
            if (chipColor == connectFourGrid[i][j])
            {
                chipCounter++;
            }
            else
            {
                break;
            }
        }

        if (chipCounter >= 4)
        {
            return true;
        }

        return false;
    }


    public static boolean checkMajorDiagonal(char[][] connectFourGrid, int columnPosition, char chipColor, int rowPosition)
    {
        int chipCounter = 1;

        for(int i = rowPosition - 1, j = columnPosition - 1; i >=0 && j >= 0; i--, j--)
        {
            if (chipColor == connectFourGrid[i][j])
            {
                chipCounter++;
            }
            else
            {
                break;
            }
        }

        if (chipCounter >= 4)
        {
            return true;
        }

        for (int i = rowPosition + 1, j = columnPosition + 1; i <connectFourGrid.length && j < connectFourGrid[0].length; i++, j++)
        {
            if (chipColor == connectFourGrid[i][j])
            {
                chipCounter++;
            }
            else
            {
                break;
            }
        }

        if (chipCounter >= 4)
        {
            return true;
        }

        return false;
    }


    public static boolean checkRow(char[][] connectFourGrid, int columnPosition, char chipColor, int rowPosition)
    {
        int chipCounter = 1;

        for (int i = columnPosition - 1; i >= 0; i++)
        {
            if(chipColor == connectFourGrid[rowPosition][i])
            {
                chipCounter++;
            }
            else
            {
                break;
            }
        }

        if (chipCounter >= 4)
        {
            return true;
        }

        for (int i = columnPosition + 1; i < connectFourGrid[0].length; i++)
        {
            if (chipColor == connectFourGrid[rowPosition][i])
            {
                chipCounter++;
            }
            else
            {
                break;
            }
        }

        if(chipCounter >= 4)
        {
            return true;
        }

        return false;
    }


    public static boolean checkColumn(char[][] connectFourGrid, int columnPosition, char chipColor, int rowPosition)
    {
        int chipCounter = 1;

        if ((rowPosition + 4) <= 6)
        {
            for (int i = rowPosition + 1; i <= (rowPosition + 3); i++)
            {
                if (chipColor == connectFourGrid[i][columnPosition])
                {
                    chipCounter++;
                }
                else
                {
                    break;
                }
            }
        }
        if (chipCounter == 4)
        {
            return true;
        }
        return false;
    }


    public static boolean dropChip(char[][] connectFourGrid, int columnPosition, char chipColor)
    {
        for (int i = connectFourGrid.length - 1; i >= 0; i--)
        {
            if(connectFourGrid[i][columnPosition] == 0)
            {
                connectFourGrid[i][columnPosition] = chipColor;
                return false;
            }
        }
        System.out.println("Column full, " + chipColor + " player, try again");
        return true;
    }


    //Displays the display grid
    public static void displayGrid(char[][] connectFourGrid)
    {
        for (int i = 0; i < connectFourGrid.length; i++)
        {
            for (int j = 0; j < connectFourGrid[i].length; j++)
            {
                System.out.print("|" + connectFourGrid[i][j]);
            }
            System.out.println("|");
        }
        for (int i = 0; i < connectFourGrid.length - 3; i++)
        {
            System.out.print("---");
        }
        System.out.println();
    }
}
