/**
 * Created by Muhlestein on 31-Jan-17.
 */
import java.util.*;

public class GrammarFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        //Variables
        String sUserSentence = "";  //This is the original sentence.
        String sCorrectedSentence = ""; //This is the grammatically correct sentence.
        char ch = ' ';  //Temp character holder

        //Ask user for sentence
        System.out.println("Please enter a sentence");
        sUserSentence = in.nextLine();

        //Check Sentence, correct errors, and allow user to enter again
        do
        {
            //Get first character and make it upper case
            ch = sUserSentence.charAt(0);
            ch = Character.toUpperCase(ch);

            sCorrectedSentence = Character.toString(ch);


            //Copy in the rest of the sentence
            sCorrectedSentence = sCorrectedSentence + sUserSentence.substring(1);


            //Check to make sure last character is a punctuation character
            ch = sCorrectedSentence.charAt(sUserSentence.length()-1);

            if(ch != '.' && ch != '?' && ch != '!')
            {
                sCorrectedSentence = sCorrectedSentence + ".";
            }


            //Print corrected Sentence
            System.out.println(sCorrectedSentence);


            //Allow user to quit or enter another sentence
            System.out.println("Enter another sentence or press Q to quit:");
            sUserSentence = in.nextLine();

        } while (!sUserSentence.equalsIgnoreCase("Q"));

    }

}
