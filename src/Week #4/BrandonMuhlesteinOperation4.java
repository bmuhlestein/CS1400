/**************************************************************
 *
 * BrandonMuhlesteinOperation4.java
 * Created by Muhlestein on 31-Jan-17.
 *
 *
 * This program converts words entered by the user to "pig latin".
 *
 ***************************************************************/
import java.util.*;

public class BrandonMuhlesteinOperation4
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        //Variables
        String sUserInput = "";  //User input
        String sTranslated = "";  //Translated output
        char ch = ' ';  //Place holder


        //Welcome of the translator
        System.out.println("Welcome ot the Pig Latin Translator!");


        //Ask user for input
        System.out.println("\nPlease enter the word you would like translated into pig latin: ");
        sUserInput = in.nextLine();


        do
        {
            //Get first character and evaluate it for either a vowel or constant
            ch = sUserInput.charAt(0);


            //If the first character is a vowel.
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            {
                sTranslated = sUserInput + "way";
            }
            //If the first character is not a vowel.
            else
            {
                sTranslated = sUserInput.substring(1) + ch;
                do
                {
                    ch = sTranslated.charAt(0);

                    if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                    {
                        sTranslated = sTranslated + "ay";
                    }
                    else
                    {
                        sTranslated = sTranslated.substring(1) + ch;
                    }

                }while(ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U');
            }


            //Print translated word
            System.out.println("The translated word is: " + sTranslated);


            //Allow user to quit or enter another sentence
            System.out.println("\nEnter another word to be translated or press Q to quit:");
            sUserInput = in.nextLine();

        }while (!sUserInput.equalsIgnoreCase("Q"));

    } //End of main

} //End of BrandonMuhlesteinOperation4 class
