/**
 * Created by Muhlestein on 20-Mar-17.
 */
import java.util.*;

public class Monopoly
{
    public static void main (String[] args)
    {
        Random r = new Random();

        int die1 = 0;
        int die2 = 0;
        int total = 0;
        int numWins = 0;
        int numLoses = 0;

        for (int i = 0; i < 1000; i++)
        {
            die1 = r.nextInt(6) + 1;
            die2 = r.nextInt(6) + 1;
            total = die1 + die2;

            //Decide whether they win
            if (total == 7 || total == 11)
            {
                numWins++;
            }
            else
            {
                numLoses++;
            }
        }
        System.out.println("You won: " + numWins + " and lost: " + numLoses);
    }
}
