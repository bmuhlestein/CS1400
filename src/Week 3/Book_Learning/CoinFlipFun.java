/**
 * Created by Muhlestein on 15-Jan-17.
 */
import java.util.*;

public class CoinFlipFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);
        Random r = new Random();


        //Variables
        int userPick = 0; //1 for Heads, 2 for Tails
        int flipResult = 0; //1 for Heads, 2 for Tails
        int numberOfFlips = 0;
        int numberOfWins = 0;
        String playAgain = ""; //Y or N


        //Play the game while the user continues to say yes
        do
        {
            //Getting user Selection
            System.out.println("Please select 1 for Heads or 2 for Tails");
            userPick = in.nextInt();


            //Check for valid input
            while (userPick != 1 && userPick != 2)
            {
                System.out.println("Invalid input. Please select 1 for Heads or 2 for Tails");
                userPick = in.nextInt();
            }


            //Simulate coin flip and increase the count of games
            flipResult = r.nextInt(2) + 1;
            numberOfFlips++;

            if (flipResult == 1)
            {
                System.out.println("It was heads!");
            }
            if (flipResult == 2)
            {
                System.out.println("It was tails!");
            }


            //Check and print results
            if (userPick == flipResult)
            {
                System.out.println("You Win!");
                numberOfWins++;
            }
            else
            {
                System.out.println("You Loss");
            }


            //Clear the buffer
            in.nextLine();


            //Ask user to play again
            System.out.println("Please again: Y or N?");
            playAgain = in.nextLine();


            //Check for valid input
            while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"))
            {
                System.out.println("Invalid input.  Try Again, Y or N?");
                playAgain = in.nextLine();
            }

        } while (playAgain.equalsIgnoreCase("Y"));

        //Print game results
        System.out.println("You won " + numberOfWins + " out of " + numberOfFlips + " games.");
        System.out.println("That's " + (((double) numberOfWins / numberOfFlips) * 100) + "%!");

    }

}
