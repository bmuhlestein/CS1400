/**
 * Created by Muhlestein on 13-Jan-17.
 */
import java.util.Scanner;

public class IfFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);

        //Variable
        int age = 0;

        System.out.println("How old are you?");
        age = in.nextInt();

        if (age == 25)
        {
            System.out.println("This is my favorite age!");
        }

    }

}
