/**
 * Created by Muhlestein on 30-Jan-17.
 */
public class UsefulMath
{

    public int square (int number)
    {

        int result = 0;

        result = number * number;

        return result;

    }

    public int power (int num, int pow)
    {

        int result = num;

        for (int i = 1; i < pow; i++)
        {
            result = result * num;
        }

        return result;

    }

}
