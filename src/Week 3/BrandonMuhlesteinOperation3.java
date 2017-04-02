/**************************************************************
 *
 * BrandonMuhlesteinOperation3.java
 * Created by Muhlestein on 15-Jan-17.
 *
 *
 * This program plays a Higher/Lower game
 *
 ***************************************************************/
import java.util.*;

public class BrandonMuhlesteinOperation3
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);
        Random r = new Random();


        //Variables
        int gameLower = 1;
        int gameHigher = 100;
        int userGuess = 0;
        int numberOfGuesses = 0;
        int guessResult = 0;
        String defaultOrCustom = "";


        //Start of game
        System.out.println("Welcome to the Higher / Lower game!\n");
        System.out.println("Would you like to use the default range (1 to 100) or use a custom range?  Use \"Y\" for default and \"N\" for custom:");
        defaultOrCustom = in.nextLine();


        //Check for valid input
        while (!defaultOrCustom.equalsIgnoreCase("Y") && !defaultOrCustom.equalsIgnoreCase("N"))
        {
            System.out.println("Invalid selection, please select Y or N");
            defaultOrCustom = in.nextLine();
        }


        //Setting up custom setting
        if (defaultOrCustom.equalsIgnoreCase("N"))
        {
            System.out.println("\nPlease enter your lower range:");
            gameLower = in.nextInt();
            System.out.println("Please enter your higher range:");
            gameHigher = in.nextInt();
        }


        //Generate Random number
        guessResult = r.nextInt(gameHigher) + 1;


        do
        {
            //Get users guess
            System.out.println("\nPlease enter a number between " + gameLower + " and " + gameHigher + ".");
            userGuess = in.nextInt();


            //Check for valid guess
            while (!(userGuess >= gameLower && userGuess <= gameHigher))
            {
                System.out.println("Invalid guess.  Please enter a number between " + gameLower + " and " + gameHigher + ".");
                userGuess = in.nextInt();
            }


            //Count guesses
            numberOfGuesses++;


            //Check and print results
            if (userGuess > guessResult)
            {
                System.out.println("That guess is too high.");
            }
            if (userGuess < guessResult)
            {
                System.out.println("That guess is too low.");
            }


            //Flush the buffer
            in.nextLine();

        } while (userGuess != guessResult);


        //Results of the game
        System.out.println("\nThe number was " + guessResult + "!  You guessed correctly!  It took you " + numberOfGuesses + " guesses.");

    }//End main

}//End BrandonMuhlesteinOperation3 class
