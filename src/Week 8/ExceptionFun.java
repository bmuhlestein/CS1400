/**
 * Created by Muhlestein on 02-Mar-17.
 */
import java.util.*;


public class ExceptionFun {

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        int shoeSize;
        boolean error = false;

        String[] placesMyOfficeIsHotterThan = {"Molten Lava", "The Sun", "Texas in July", "The Cornballer", "Hell"};

        System.out.println("What is your shoe size?");

        do
        {
            try
            {
                error = false;

                shoeSize = in.nextInt();

                System.out.println("My office is hot.  How hot is it?");
                System.out.println("It is hotter than...");

                for (int i = 0; i <= 5; i++)
                {
                    System.out.println(placesMyOfficeIsHotterThan[i]);
                }
            }
            catch (InputMismatchException e)
            {
                error = true;
                System.out.println("Invalid input, please enter a whole number:");

                //Flush the buffer
                in.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Whoops! Looks like you went out of bounds");
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }while(error);

    }
}
