/************************************************************************
 *
 * BrandonMuhlesteinOperation2.java
 * Created by Muhlestein on 13-Jan-17.
 *
 * This program determines retirement age
 *
 ************************************************************************/

import java.util.Scanner;

public class BrandonMuhlesteinOperation2
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        //Variables
        String sBirthMonth = "";
        int iBirthDay = 0;
        int iBirthYear = 0;
        String sUsersName = "";
        int iRetirementYear = 0;


        //Purpose of Program
        System.out.println("The purpose of this program is to identify the year someone can retire.");


        //Ask user for information
        System.out.println("\nPlease enter your first and last name: ");
        sUsersName = in.nextLine();
        System.out.print("\nPlease enter the month you where born in: ");
        sBirthMonth = in.nextLine();
        System.out.print("Please enter the day you where born: ");
        iBirthDay = in.nextInt();
        System.out.print("Please enter the year you where born in: ");
        iBirthYear = in.nextInt();


        //Calculations
        iRetirementYear = (iBirthYear + 67);


        //Print
        System.out.println("\nThe earliest " + sUsersName + " can retire is: " + sBirthMonth + " " + iBirthDay + ", " + iRetirementYear);

    }//end main

}//end class BrandonMuhlesteinOperation2
