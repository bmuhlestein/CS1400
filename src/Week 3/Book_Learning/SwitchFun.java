import java.util.Scanner;

/**
 * Created by Muhlestein on 14-Jan-17.
 */
import java.util.Scanner;

public class SwitchFun
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        int age = 0;

        System.out.println("Please enter your age");
        age = in.nextInt();

        switch (age)
        {
            case 16:
                System.out.println("Congratulations! You can drive!");
                break;
            case 21:
                System.out.println("Congratulations! You can gamble!");
                break;
            case 25:
                System.out.println("Congratulations! You can rent a car!");
                break;
            default:
                System.out.println("Wow....Boring age.");
        }

    }

}
