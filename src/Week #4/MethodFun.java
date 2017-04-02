/**
 * Created by Muhlestein on 29-Jan-17.
 */
import java.util.*;

public class MethodFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        int blah = 0;
        //int squaredNumber = 0;

        System.out.println("What number would you like squared?");
        blah = in.nextInt();

        //squaredNumber = sqauare(blah);  can use this instead of calling it in the print statement

        System.out.println("The result is " + square(blah));
        //System.out.println("The result is " + squaredNumber);

    }

    public static int square (int number)
    {

        int result = 0;

        result = number * number;

        return result;

    }

}
