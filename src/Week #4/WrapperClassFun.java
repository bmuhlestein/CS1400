/**
 * Created by Muhlestein on 30-Jan-17.
 */
import java.util.*;

public class WrapperClassFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        String input = "";
        int iAdultAge = 0;
        String output = "";


        System.out.println("Please enter the year you were born");
        input = in.nextLine();

        //iAdultAge = Integer.parseInt(input) + 18;   // Wrapper class
        // iAdultAge = (int) Double.parseDouble(input) + 18;
        // output = Integer.toString(iAdultAge);

        System.out.println(iAdultAge);

    }

}
