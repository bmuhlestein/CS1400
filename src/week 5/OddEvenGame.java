/**
 * Created by Muhlestein on 05-Feb-17.
 */
import java.util.*;
import java.util.Random;

public class OddEvenGame
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        Random r = new Random ();


        //Variables
        int iNumberOfGames = 0;
        String sUserCall = "";
        int iUserThrow = 0;
        int iComputerChoice = 0;
        int iComputerRandomNumber = 0; //Temp variable
        int iUserWins = 0;
        int iComputerWins = 0;
        int iThrowTotal = 0;
        boolean isOdd = false;


        //Welcome to the game
        System.out.println("Welcome to the Odd/Even game!\n");


        //Ask user for the number of rounds they would like to play
        System.out.println("How many rounds would you like to play?:");
        iNumberOfGames = in.nextInt();


        //Flush the buffer
        in.nextLine();


        //Play the game for the number of games selected by the user
        for(int i = 1; i <= iNumberOfGames; i++)
        {
            //Ask user for their call "odd" or "even"
            System.out.println("Call it: Odd or Even");
            sUserCall = in.nextLine();


            //Check for valid entry
            while (!sUserCall.equalsIgnoreCase("odd") && !sUserCall.equalsIgnoreCase("even"))
            {
                System.out.println("Sorry, that is not a valid choice.  Please try again.");
                sUserCall = in.nextLine();
            }


            //Ask user for their throw "odd" or "even"
            System.out.println("Throw it: Odd = 1 or Even = 2");
            iUserThrow = in.nextInt();

            while (iUserThrow != 1 && iUserThrow != 2)
            {
                System.out.println("You need to select a 1 or 2.  Try again.");
                iUserThrow = in.nextInt();
            }

            //Flush the buffer
            in.nextLine();


            //Randomly pick the computers choice
            iComputerRandomNumber = r.nextInt(2)+1;

            System.out.println("Computer threw a " + iComputerChoice);


            iThrowTotal = iUserThrow + iComputerChoice;

            if (iThrowTotal == 2 || iThrowTotal == 4)
            {
                isOdd = false;
            }
            if (iThrowTotal == 3)
            {
                isOdd = true;
            }


            //Decide winner of the round
            if ((sUserCall.equalsIgnoreCase("odd") && isOdd) || (sUserCall.equalsIgnoreCase("even") && !isOdd))
            {
                System.out.println("User Wins!");
                iUserWins++;
            }
            if ((sUserCall.equalsIgnoreCase("even") && isOdd) || (sUserCall.equalsIgnoreCase("odd") && !isOdd))
            {
                System.out.println("Computer Wins.");
                iComputerWins++;
            }

        }//end of for loop

        //Print Results
        System.out.println("The number of User wins: " + iUserWins);
        System.out.println("The number of Computer wins: " + iComputerWins);

        if (iUserWins > iComputerWins)
        {
            System.out.println("You win!");
        }
        if (iUserWins < iComputerWins)
        {
            System.out.println("Computer Wins.");
        }

    }//end of main


}//end of class
