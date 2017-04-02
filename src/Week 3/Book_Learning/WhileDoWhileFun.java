/**
 * Created by Muhlestein on 14-Jan-17.
 */
import java.util.Scanner;

public class WhileDoWhileFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        //Variables
        double height = 0;
        String input = "";

        do {
            //Ask users for information
            System.out.println("How tall are you in inches?");
            height = in.nextDouble();


            //Check to see if height is valid
            while (height < 0.0)
            {
                System.out.println("That is not a valid height. Try again.");
                height = in.nextDouble();
            }

            System.out.println("Valid Height.  Thank you.");

            //Flush the buffer
            in.nextLine();

            System.out.println("Press Q to quit, or any other key to continue");
            input = in.nextLine();

        } while (!input.equalsIgnoreCase("Q"));

    }

}
