/**
 * Created by Muhlestein on 25-Feb-17.
 */
import java.util.*;

public class Operation7
{
    private static Scanner in = new Scanner (System.in);
    private static Random r = new Random();
    private static int[] iNumberOfDie = new int[5];
    private static int[] iValueCountOfDie = new int[6];
    private static int iDiceIndex = 0;

    public static void main (String[] args)
    {
        System.out.println("Welcome to the Yahtzee game!\n");

        System.out.println("Here is your first roll.");

        //Generated the die roll
        for (int i = 0; i < iNumberOfDie.length; i++)
        {
            iNumberOfDie[i] = r.nextInt(6) + 1;
        }

        //Print die values
        for (int i = 0; i < iNumberOfDie.length; i++)
        {
            System.out.println("Dice #" + (i + 1) + ": " + iNumberOfDie[i] + " ");
        }

        //Generate the re-roll
        //Setup two rounds of re-rolling
        System.out.println("\nYou will have the chance to re-roll a total of two times.");

        for (int i = 0; i < 2; i++) {
            //Asks user if they want to re-roll the die
            System.out.println("\nPlease indicate whether you would like to re-roll each dice with a \"yes\" or a \"no\"");
            System.out.println("Re-roll dice #1?");
            String sDieOne = in.nextLine();
            System.out.println("Re-roll dice #2?");
            String sDieTwo = in.nextLine();
            System.out.println("Re-roll dice #3?");
            String sDieThree = in.nextLine();
            System.out.println("Re-roll dice #4?");
            String sDieFour = in.nextLine();
            System.out.println("Re-roll dice #5?");
            String sDieFive = in.nextLine();


            //Re-Rolls the selected die
            if (sDieOne.equalsIgnoreCase("yes")) {
                iNumberOfDie[0] = r.nextInt(6) + 1;
            }
            if (sDieTwo.equalsIgnoreCase("yes")) {
                iNumberOfDie[1] = r.nextInt(6) + 1;
            }
            if (sDieThree.equalsIgnoreCase("yes")) {
                iNumberOfDie[2] = r.nextInt(6) + 1;
            }
            if (sDieFour.equalsIgnoreCase("yes")) {
                iNumberOfDie[3] = r.nextInt(6) + 1;
            }
            if (sDieFive.equalsIgnoreCase("yes")) {
                iNumberOfDie[4] = r.nextInt(6) + 1;
            }


            //Prints the results of the die after the re-roll
            System.out.println("\nThe results of the re-roll are: ");
            System.out.println("Dice #1: " + iNumberOfDie[0]);
            System.out.println("Dice #2: " + iNumberOfDie[1]);
            System.out.println("Dice #3: " + iNumberOfDie[2]);
            System.out.println("Dice #4: " + iNumberOfDie[3]);
            System.out.println("Dice #5: " + iNumberOfDie[4] + "\n");
        }

        //Generates the cheater mode
        System.out.println("Would you like to enter the cheater mode? \"yes\" or \"no\"");
        String sCheaterMode = in.nextLine();

        if (sCheaterMode.equalsIgnoreCase("yes"))
        {
            System.out.println("This mode allows you enter your own values for each die in order to obtain Yahtzee!");
            System.out.println("Enter value (1 to 6) for dice #1");
            iNumberOfDie[0] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #2");
            iNumberOfDie[1] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #3");
            iNumberOfDie[2] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #4");
            iNumberOfDie[3] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #5");
            iNumberOfDie[4] = in.nextInt();

            //Prints the results of the die after entering cheater mode
            System.out.println("\nThe results from the cheater mode are: ");
            System.out.println("Dice #1: " + iNumberOfDie[0]);
            System.out.println("Dice #2: " + iNumberOfDie[1]);
            System.out.println("Dice #3: " + iNumberOfDie[2]);
            System.out.println("Dice #4: " + iNumberOfDie[3]);
            System.out.println("Dice #5: " + iNumberOfDie[4] + "\n");
        }

        //Array for counting the number of dice per value.
        for (int i = 0; i < iValueCountOfDie.length; i++)
        {
            iValueCountOfDie[i] = 0;
        }


        //count up the values
        for (int i = 0; i < iNumberOfDie.length; i++)
        {
            iDiceIndex = iNumberOfDie[i] - 1;
            iValueCountOfDie[iDiceIndex]++;
        }


        //Prints the results
        System.out.println("\nHere are how many times each number was rolled.");
        for (int i = 0; i < iValueCountOfDie.length; i++)
        {
            System.out.println("The number of " + (i + 1) + "'s is: " + iValueCountOfDie[i]);
        }

        //Game results
        //String Builder (if needed)
        StringBuilder strValueCountOfDie = new StringBuilder();
        for (int i = 0; i < iNumberOfDie.length; i++)
        {
            strValueCountOfDie.append(iNumberOfDie[i]);
        }
        String strValue = strValueCountOfDie.toString();
        System.out.println("\nThe string equivalent is " + strValue + "\n");


        boolean stop = false;
        for(int ranking = 0; ranking < 4; ranking++)
        {
            if(stop)
            {
                break;
            }
            switch (ranking)
            {
                //Determining Yahtzee
                case 0:
                    for (int i = 0; i < iValueCountOfDie.length; i++)
                    {
                        if (iValueCountOfDie[i] == 5)
                        {
                            System.out.println("YAHTZEE!!!!");
                            stop = true;
                        }
                    }
                    break;
                //Determining Large Straight
                case 1:
                    if (strValue.equals("12345") || strValue.equals("23456"))
                    {
                        System.out.println("Large Straight");
                        stop = true;
                    }
                    break;
                //Determining Small Straight
                case 2:
                    boolean smallStraight = false;
                    if (strValue.equals("1234\\d"))
                    {
                        smallStraight = true;
                    }
                    if (strValue.equals("2345\\d"))
                    {
                        smallStraight = true;
                    }
                    if (strValue.equals("3456\\d"))
                    {
                        smallStraight = true;
                    }
                    if (strValue.equals("\\d1234"))
                    {
                        smallStraight = true;
                    }
                    if (strValue.equals("\\d2345"))
                    {
                        smallStraight = true;
                    }
                    if (strValue.equals("\\d3456"))
                    {
                        smallStraight = true;
                    }
                    if (smallStraight)
                    {
                        System.out.println("Small Straight");
                        stop = true;
                    }
                    break;
                //Determine 4 of a kind
                case 3:
                    for (int i = 0; i < iValueCountOfDie.length; i++)
                    {
                        if (iValueCountOfDie[i] == 4)
                        {
                            System.out.println("4 of a kind!");
                            stop = true;
                        }
                    }
                    break;

            }//End Switch
            break;

        }//End loop

    }//End main

}//End class
