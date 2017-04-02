/**************************************************************
 *
 * BrandonMuhlesteinOperation7.java
 * Created by Muhlestein on 21-Feb-17.
 *
 *
 * This program plays Yahtzee.
 *
 ***************************************************************/
import java.util.*;

public class BrandonMuhlesteinOperation7
{

    private static Scanner in = new Scanner (System.in);
    private static Random r = new Random();
    private static int[] dice = new int[5];
    private static int[] counts = new int[6];
    private static int iNumberOfReRolls = 2;

    public static void main (String[] args)
    {

        //Variables
        int iDiceIndex = 0;


        //Welcome to the game
        System.out.println("Welcome to the game of Yahtzee!\n");
        System.out.println("Here is your first roll.");


        //Generates the die rolls method
        diecreation(dice);


        //Generates the die re-roll method
        diereroll(dice);


        //Generates the Cheater mode method
        cheatermode(dice);


        //Array for counting the number of dice per value.
        for (int i = 0; i < counts.length; i++)
        {
            counts[i] = 0;
        }


        //count up the values
        for (int i = 0; i < dice.length; i++)
        {
            iDiceIndex = dice[i] - 1;
            counts[iDiceIndex]++;
        }


        //Prints the results
        System.out.println("\nHere are how many times each number was rolled.");
        for (int i = 0; i < counts.length; i++)
        {
            System.out.println("The number of " + (i + 1) + "'s is : " + counts[i]);
        }


        //Indicate the ranking
        System.out.println();
        yahtzeeRanking(counts);


    } //end main

    //This method is used to create the die roll and to print their values
    private static void diecreation(int dice[])
    {
        //Generated the die roll
        for (int i = 0; i < dice.length; i++)
        {
            dice[i] = r.nextInt(6) + 1;
        }


        //Print die values
        for (int i = 0; i < dice.length; i++)
        {
            System.out.println("Dice #" + (i + 1) + ": " + dice[i] + " ");
        }
    }//end diecreation method


    //This method is used for the re-rolling of the die
    private static void diereroll(int dice[])
    {
        //Setup two rounds of re-rolling
        System.out.println("\nYou will have the chance to re-roll a total of two times.");

        for (int i = 0; i < iNumberOfReRolls; i++)
        {
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
            if(sDieOne.equalsIgnoreCase("yes"))
            {
                dice[0] = r.nextInt(6) + 1;
            }
            if(sDieTwo.equalsIgnoreCase("yes"))
            {
                dice[1] = r.nextInt(6) + 1;
            }
            if(sDieThree.equalsIgnoreCase("yes"))
            {
                dice[2] = r.nextInt(6) + 1;
            }
            if(sDieFour.equalsIgnoreCase("yes"))
            {
                dice[3] = r.nextInt(6) + 1;
            }
            if(sDieFive.equalsIgnoreCase("yes"))
            {
                dice[4] = r.nextInt(6) + 1;
            }


            //Prints the results of the die after the re-roll
            System.out.println("\nThe results of the re-roll are: ");
            System.out.println("Dice #1: " + dice[0]);
            System.out.println("Dice #2: " + dice[1]);
            System.out.println("Dice #3: " + dice[2]);
            System.out.println("Dice #4: " + dice[3]);
            System.out.println("Dice #5: " + dice[4] + "\n");
        }//end re-roll for loop
    }// end diereroll method


    //This method is for the cheater mode
    private static void cheatermode(int dice[])
    {
        //Generates the cheater mode
        System.out.println("Would you like to enter the cheater mode? \"yes\" or \"no\"");
        String sCheaterMode = in.nextLine();

        if (sCheaterMode.equalsIgnoreCase("yes"))
        {
            System.out.println("This mode allows you enter your own values for each die in order to obtain Yahtzee!");
            System.out.println("Enter value (1 to 6) for dice #1");
            dice[0] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #2");
            dice[1] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #3");
            dice[2] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #4");
            dice[3] = in.nextInt();
            System.out.println("Enter value (1 to 6) for dice #5");
            dice[4] = in.nextInt();

            //Prints the results of the die after entering cheater mode
            System.out.println("\nThe results from the cheater mode are: ");
            System.out.println("Dice #1: " + dice[0]);
            System.out.println("Dice #2: " + dice[1]);
            System.out.println("Dice #3: " + dice[2]);
            System.out.println("Dice #4: " + dice[3]);
            System.out.println("Dice #5: " + dice[4] + "\n");
        }
    }//end cheatermode method


    //This method is for determining the ranking/score of the Yahtzee game
    private static void yahtzeeRanking(int counts[])
    {
        //String Builder
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < dice.length; i++)
        {
            ab.append(dice[i]);
        }
        String cd = ab.toString();
        //System.out.println(cd);


        //Placeholder
        String testNum = cd;


        //Determining appropriate ranking
        boolean stop = false;
        for(int ranking = 0; ranking < 7; ranking++)
        {

            if (stop)
            {
                break;
            }
                switch (ranking)
                {
                    //Determining Yahtzee
                    case 0:
                        for (int i = 0; i < counts.length; i++)
                        {
                            if (counts[i] == 5)
                            {
                                System.out.println("Congrats! You got YAHTZEE!!!!");
                                stop = true;
                            }
                        }
                        break;

                    //Determining Large Straight
                    case 1:
                        if (testNum.matches("12345"))
                        {
                            System.out.println("Awesome a Large Straight!");
                            stop = true;
                        }
                        if (testNum.matches("23456"))
                        {
                            System.out.println("Awesome a Large Straight!");
                            stop = true;
                        }
                        break;

                    //Determine Small Straight
                    case 2:
                        boolean smallStraight = false;
                        if (testNum.matches("1234\\d"))
                        {
                            smallStraight = true;
                        }
                        if (testNum.matches("2345\\d"))
                        {
                            smallStraight = true;
                        }
                        if (testNum.matches("3456\\d"))
                        {
                            smallStraight = true;
                        }
                        if (testNum.matches("\\d1234"))
                        {
                            smallStraight = true;
                        }
                        if (testNum.matches("\\d2345"))
                        {
                            smallStraight = true;
                        }
                        if (testNum.matches("\\d3456"))
                        {
                            smallStraight = true;
                        }
                        if (smallStraight)
                        {
                            System.out.println("A Small Straight isn't bad!");
                            stop = true;
                        }
                        break;

                    //Determining Four of a kind
                    case 3:
                        for (int i = 0; i < counts.length; i++)
                        {
                            if (counts[i] == 4)
                            {
                                System.out.println("Woot Woot, 4 of a kind!");
                                stop = true;
                            }
                        }
                        break;

                    //Determine Full House
                    case 4:
                        boolean threes = false;
                        boolean twos = false;
                        for (int i = 0; i < counts.length; i++) {
                            if (counts[i] == 3) {
                                threes = true;
                                break;
                            }
                        }
                        for (int i = 0; i < counts.length; i++)
                        {
                            if (counts[i] == 2) {
                                twos = true;
                                break;
                            }
                        }
                        if (threes == true && twos == true)
                        {
                            System.out.println("Sweet, a Full House!");
                            stop = true;
                            break;
                        }
                        break;

                    //Determining Three of a kind
                    case 5:
                        for (int i = 0; i < counts.length; i++)
                        {
                            if (counts[i] == 3)
                            {
                                System.out.println("3 of a kind! It could be worse.");
                                stop = true;
                                break;
                            }
                        }
                        break;

                    default:
                        System.out.println("Chance, there is always next time.");
                        stop = true;
                        break;

                }//end switch

        }//end for loop

    }//end yahtzeeRanking method

} //end BrandonMuhlesteinOperation7 class
