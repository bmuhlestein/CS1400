/**
 * Created by Muhlestein on 12-Mar-17.
 */
import java.util.*;

public class Account
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        Calculators c = new Calculators();

        double dBalance = 0.0;

        System.out.println("What amount is in the account?");
        dBalance = in.nextDouble();

        c.compoundInterest(dBalance, in);

    }
}
