/**
 * Created by Muhlestein on 30-Jan-17.
 */
import java.util.*;

public class StringFun
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        String sentence = "";
        char ch = ' ';

        System.out.println("Please enter a sentence");
        sentence = in.nextLine();

        for (int i = 0; i < sentence.length(); i++)
        {
            ch = sentence.charAt(i);

            if (ch != ' ')
            {
                System.out.print(ch);
            }

        }

        //String word = "Hello";
        //char ch = ' ';
        //ch = word.charAt(0);
        //System.out.println(ch);

    }

}
