import java.util.Scanner;

/**
 * Created by Muhlestein on 13-Jan-17.
 */
public class IfElseFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        //Variable
        int age = 0;

        System.out.println("How old are you?");
        age = in.nextInt();

        if (age >= 39)
        {
            System.out.println("You're over the hill!");
        }
        else
        {
            System.out.println("Working your way up the hill");
        }


    }

}
