

/**
 * Created by Muhlestein on 30-Jan-17.
 */
import java.util.Scanner;

public class MoreMethodFun1
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);
        UsefulMath um = new UsefulMath ();

        int num = 0;

        System.out.println("What number would you like to square?");
        num = in.nextInt();

        System.out.println(um.power(2,5));
        System.out.println(um.square(num));

    }


}
