/**
 * Created by Muhlestein on 20-Mar-17.
 */
public class Settlers
{
    public static void main (String[] args)
    {
        Dice d = new Dice();
        int total = 0;

        total = d.rollDie(2);

        System.out.println(total);
    }
}
