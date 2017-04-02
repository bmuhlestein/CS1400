/**************************************************************
 *
 * BrandonMuhlesteinOperation5.java
 * Created by Muhlestein on 07-Feb-17.
 *
 *
 * This program plays the "Rock, Paper, Scissors" game.
 *
 ***************************************************************/
import java.util.*;


public class BrandonMuhlesteinOperation5
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);
        Random r = new Random ();


        //Variables
        int iNumberOfRounds = 0;
        String sPlayersItem = "";
        int iComputersItem = 0;
        String sComputersItemConfirmed = "";
        int iPlayerWins = 0;
        int iComputerWins = 0;


        // Welcome to the game
        System.out.println("Welcome to the Rock, Paper, Scissors game!\n");


        //Ask player for the number of rounds
        System.out.println("How many rounds would you like to play?:");
        iNumberOfRounds = in.nextInt();

        while (iNumberOfRounds % 2 == 0) //Even number
        {
            System.out.println("The number of rounds must be an odd number.  Please enter another number.");
            iNumberOfRounds = in.nextInt();
        }

        //Flush the buffer
        in.nextLine();


        //Play the game for the number of games selected by the user
        for(int i = 1; i <= iNumberOfRounds; i++)
        {

            //Ask user for selection
            System.out.println("Please enter item: Rock, Paper, or Scissors");
            sPlayersItem = in.nextLine();


            //Check for "Spock"
            while (sPlayersItem.equalsIgnoreCase("spock"))
            {
                System.out.println("Spock is the ultimate, but maintains an unfair advantage and is, therefore, not allowed.  Please try again.");
                sPlayersItem = in.nextLine();
            }


            //Check for valid input
            while (!sPlayersItem.equalsIgnoreCase("rock") && !sPlayersItem.equalsIgnoreCase("paper") && !sPlayersItem.equalsIgnoreCase("scissors"))
            {
                System.out.println("Sorry, \"" + sPlayersItem + "\" is not valid.  Please enter again.");
                sPlayersItem = in.nextLine();
            }


            //Generate Computers selection
            iComputersItem = r.nextInt(3) + 1;


            //Determine what the computer played
            switch (iComputersItem)
            {
                case 1: sComputersItemConfirmed = "Rock";
                    break;
                case 2: sComputersItemConfirmed = "Paper";
                    break;
                case 3: sComputersItemConfirmed = "Scissors";
                    break;
            }


            //Decide winner of the round
            if ((sPlayersItem.equalsIgnoreCase("rock") && sComputersItemConfirmed.equalsIgnoreCase("scissors")) ||
                    (sPlayersItem.equalsIgnoreCase("paper") && sComputersItemConfirmed.equalsIgnoreCase("rock")) ||
                    (sPlayersItem.equalsIgnoreCase("scissors") && sComputersItemConfirmed.equalsIgnoreCase("paper")))
            {
                System.out.println("Player Wins!  The computer had " + sComputersItemConfirmed + "\n");
                iPlayerWins++;
            }
            if ((sPlayersItem.equalsIgnoreCase("rock") && sComputersItemConfirmed.equalsIgnoreCase("paper")) ||
                    (sPlayersItem.equalsIgnoreCase("paper") && sComputersItemConfirmed.equalsIgnoreCase("scissors")) ||
                    (sPlayersItem.equalsIgnoreCase("scissors") && sComputersItemConfirmed.equalsIgnoreCase("rock")))
            {
                System.out.println("Computer Wins. The computer had " + sComputersItemConfirmed + "\n");
                iComputerWins++;
            }
            if ((sPlayersItem.equalsIgnoreCase("rock") && sComputersItemConfirmed.equalsIgnoreCase("rock")) ||
                    (sPlayersItem.equalsIgnoreCase("paper") && sComputersItemConfirmed.equalsIgnoreCase("paper")) ||
                    (sPlayersItem.equalsIgnoreCase("scissors") && sComputersItemConfirmed.equalsIgnoreCase("scissors")))
            {
                System.out.println("Tie.  Please enter again.\n");
                iNumberOfRounds++;
            }

        } // End for loop

        //Print game details
        System.out.println("\nNumber of Player wins: " + iPlayerWins);
        System.out.println("Number of Computer Wins: " + iComputerWins);

        if (iPlayerWins > iComputerWins)
        {
            System.out.println("\nThe player wins the game!");
        }
        if (iPlayerWins < iComputerWins)
        {
            System.out.println("\nThe computer wins the game.");
        }

    }// End main

}// End BrandonMuhlesteinOperation5 class
