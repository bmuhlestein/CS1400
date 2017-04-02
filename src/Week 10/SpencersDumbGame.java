/**
 * Created by Muhlestein on 20-Mar-17.
 */
public class SpencersDumbGame
{
    public static void main (String[] args)
    {
        int total = 0;

        int numWins = 0;
        int numLoses = 0;

        Dice d = new Dice();

        //Simulate the roll of the dice 1,000 times
        for (int i = 1; i <= 1000; i++)
        {
            //Roll the die
            total = d.rollDie(2);

            //Deciding the outcome
            if (total == 7 || total == 11)
            {
                numWins++;
            }
            else
            {
                numLoses++;
            }
        }
        System.out.println("Wins: " + numWins + ", Loses: " + numLoses);
    }
}
