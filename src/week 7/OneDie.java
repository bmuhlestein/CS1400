/**
 * Created by Muhlestein on 21-Feb-17.
 */
import java.util.*;

public class OneDie
{
    public static void main (String[] args)
    {

        Random r = new Random();

        int[] tally = new int[7];

        int roll = 0;
        int numRolls = 100;
        int numAstrekes = 0;

        //Simulate the roll of the die for 100 times
        for (int i = 1; i < numRolls; i++)
        {
            //"roll" the die
            roll = r.nextInt(6) + 1;

            tally[roll]++;

        }

        for (int i = 1; i < tally.length; i++)
        {
            numAstrekes = 100 * tally[i] / numRolls;

            System.out.println(i + ": " + numAstrekes);
        }

    }
}
