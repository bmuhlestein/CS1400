/**
 * Created by Muhlestein on 12-Mar-17.
 */
import java.util.*;

public class Calculators
{
    public void compoundInterest (double dPrincipal, Scanner in)
    {

        double dInterestRate = 0.0;
        int iTerm = 0;

        double dUpdatedBalance = 0.0; //calculated balance

        //Get more info
        System.out.println("What is the interest rate?");
        dInterestRate = in.nextDouble();

        System.out.println("What is the term (in years)?");
        iTerm = in.nextInt();

        //Compound the interest for the number of terms
        dUpdatedBalance = dPrincipal;

        for (int i = 1; i <= iTerm; i++)
        {
            dUpdatedBalance = dUpdatedBalance * (1 + dInterestRate);
        }

        System.out.println("$" + dPrincipal + " would be $" + dUpdatedBalance + " after " + iTerm + " years");

    }
}


