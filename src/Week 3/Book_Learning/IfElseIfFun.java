/**
 * Created by Muhlestein on 13-Jan-17.
 */
import java.util.Scanner;

public class IfElseIfFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        int age = 0;

        System.out.println("How old are you?");
        age = in.nextInt();

        if (age < 21)
        {
            System.out.println("Go back to preschool");
        }
        else if (age >= 100)
        {
            System.out.println("Go back to the rest home!");
        }
        else
        {
            System.out.println("Come on in.....and bring your money!");
        }

    }

}
