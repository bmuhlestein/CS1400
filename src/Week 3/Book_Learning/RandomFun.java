/**
 * Created by Muhlestein on 14-Jan-17.
 */
import java.util.Random;

public class RandomFun
{

    public static void main (String[] args)
    {

        Random r = new Random();

        int number = 0;

        number = r.nextInt(10) + 1;

        System.out.println(number);

    }

}
