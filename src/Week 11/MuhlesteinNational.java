/*********************************************************
 *
 * Brandon Muhlestein Operation #11
 * Created by Muhlestein on 29-Mar-17.
 *
 *
 * This program is for banking at MuhlesteinNational
 *
 *******************************************************/
import java.util.*;

public class MuhlesteinNational {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Variables
        String sAccountHoldersName = "";
        int iAccountHoldersNumber = 0;
        int iAccountHolderSelection = 0;
        double dWithdrawAmount = 0;


        //Welcome to the bank
        System.out.println("Welcome to MuhlesteinNational Bank!");


        //Ask user for name and account number of their choice
        System.out.println("\nPlease enter your name: ");
        sAccountHoldersName = in.nextLine();

        System.out.println("Please enter the account number of your choice: ");
        iAccountHoldersNumber = in.nextInt();


        //Create a BankAccount instance
        BankAccount a1 = new BankAccount(sAccountHoldersName, iAccountHoldersNumber);


        //Loop for what they would like to do
        do
        {
            //User selects what to do.
            System.out.println("\nWhat would you like to do: \n" +
                    "\t1) Make a Deposit\n" +
                    "\t2) Make a Withdrawal\n" +
                    "\t3) Print Account Information\n" +
                    "\t4) Quit");
            iAccountHolderSelection = in.nextInt();


            while (iAccountHolderSelection != 1 && iAccountHolderSelection != 2 && iAccountHolderSelection != 3 && iAccountHolderSelection != 4)
            {
                System.out.println("Invalid option, please select again:");
                iAccountHolderSelection = in.nextInt();
            }// end while loop


            if(iAccountHolderSelection == 1)
            {
                System.out.println("\nEnter the amount you would like to Deposit: ");
                a1.deposit(in.nextDouble());
            }
            if (iAccountHolderSelection == 2)
            {
                System.out.println("\nEnter the amount you would like to Withdraw: ");
                dWithdrawAmount = in.nextDouble();


                if(dWithdrawAmount > a1.getBalance())
                {
                    System.out.println("Insufficient funds - Account currently has: $" + a1.getBalance());
                    System.out.println("Please enter a new amount to withdraw: ");
                    a1.withdraw(in.nextInt());
                }
            }
            if (iAccountHolderSelection == 3)
            {
                System.out.println("\nAccount Holders Name: " + a1.getName() + " \n" +
                        "Account Number: " + a1.getAccountNum() + " \n" +
                        "Account Balance: $" + a1.getBalance());
            }

        }while(iAccountHolderSelection != 4);

        System.out.println("Thank you for your business!");

    }//End main class

}//End MuhlesteinNational class
