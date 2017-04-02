/**
 * Created by Muhlestein on 29-Jan-17.
 */
import java.util.*;

public class MoreMethodFun
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println(power(3,3));
        System.out.println(power(5,3));

    }

    public static int power (int num, int pow)
    {

        int result = num;

        for (int i = 1; i < pow; i++)
        {
            result = result * num;
        }

        return result;

    }

}
