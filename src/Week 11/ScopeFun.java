/**
 * Created by Muhlestein on 28-Mar-17.
 */
public class ScopeFun
{

    public static String name = "";

    public static void main (String[] args)
    {

        name = "Cole";

        int number = 5;

        System.out.println(isOdd(number));
    }

    public static boolean isOdd (int num)
    {

        boolean odd = false;

        System.out.println(name);

        if (num % 2 == 1)
        {
            odd = true;
        }

        return odd;

    }


}
