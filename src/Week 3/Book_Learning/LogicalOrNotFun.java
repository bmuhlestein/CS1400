/**
 * Created by Muhlestein on 14-Jan-17.
 */
import java.util.Scanner;

public class LogicalOrNotFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        String name = "";
        int age = 0;

        //Ask user to enter name and age
        System.out.println("Please enter your name");
        name = in.nextLine();

        System.out.println("How old are you?");
        age = in.nextInt();;

        //Decide whether this person is dateable
        if ((age < 40 && age > 18) || name.equals("Brad Pitt"))  //! = not
        {
            System.out.println("I will date you.");
        }
        else
        {
            System.out.println("Sorry, your out of luck.");
        }

    }

}
