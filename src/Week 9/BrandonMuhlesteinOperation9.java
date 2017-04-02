/**************************************************************
 *
 * BrandonMuhlesteinOperation9.java
 * Created by Muhlestein on 13-Mar-17.
 *
 *
 * This program Encrypts or Decrypts a file based on the user's needs.
 *
 ***************************************************************/
import java.util.*;
import java.io.*;

public class BrandonMuhlesteinOperation9
{

    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        String sUserFileName = "";
        String sUsersNeeds = ""; //This will hold the value of either Encrypt or Decrypt
        boolean error = false;
        File f;
        Scanner fileIn;
        ArrayList<String> words = new ArrayList<String>();
        //ArrayList<Character> individualCharacters = new ArrayList<>();
        char c = ' ';


        //Welcome to the program
        System.out.println("This program allows you to either encrypt or decrypt text files.\n");


        //Ask for file and build new file object
        System.out.println("Please enter the file path name that you would like encrypt or decrypt: ");


        do {

            try {
                error = false;


                sUserFileName = in.nextLine();


                //Build the file and attached the scanner
                f = new File(sUserFileName);
                fileIn = new Scanner(f);


                //Ask for encrypting or decrypting
                System.out.println("\nWould you like to Encrypt or Decrypt the file? ");
                sUsersNeeds = in.nextLine();

                while (!(sUsersNeeds.equalsIgnoreCase("encrypt") || sUsersNeeds.equalsIgnoreCase("decrypt"))) {
                    System.out.println("Please indicate either encrypt or decrypt.\n");
                    sUsersNeeds = in.nextLine();
                }


                //If Statement for encrypting a file
                if (sUsersNeeds.equalsIgnoreCase("encrypt")) {
                    encrypted(fileIn, words, c);
                }
                //If Statement for decrypting a file
                if (sUsersNeeds.equalsIgnoreCase("decrypt")) {
                    decrypted(fileIn, words, c);
                }

            } catch (FileNotFoundException e)
            {
                error = true;
                System.out.println("Please enter a valid file path name.");
            }
        }while (error);

    }//End main method


    /**********
     * Method for making a file encrypted
     **********/
    private static void encrypted(Scanner fileIn, ArrayList<String> words, char c)
    {
        try
        {
            PrintWriter fileOut = new PrintWriter("Encrypted.txt");
            StringBuilder str = new StringBuilder();

            while (fileIn.hasNextLine()) {
                words.add(fileIn.nextLine());
            }

            //Converting ArrayList to string
            for (String s : words) {
                str.append(s);
            }


            //Loop for changing string to char and changing to "encrypted" characters
            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                c++;
                fileOut.print(c);
            }

            fileOut.close();

            System.out.println("\nThe file has been encrypted to \"Encrypted.txt\".  " +
                    "\nTo find the file, first look at where your IDE saves the files.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Please enter a valid file path name.");
        }
    }//End of encrypt method


    /*******
     * Method for decrypting a file back to normal
     *******/
    private static void decrypted(Scanner fileIn, ArrayList<String> words, char c)
    {
        try
        {
            PrintWriter fileOut = new PrintWriter("Decrypted.txt");
            StringBuilder str = new StringBuilder();

            while (fileIn.hasNextLine()) {
                words.add(fileIn.nextLine());
            }

            //Converting ArrayList to string
            for (String s : words) {
                str.append(s);
            }


            //Loop for changing string to char and changing back normal characters
            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                c--;
                fileOut.print(c);
            }

            fileOut.close();

            System.out.println("\nThe file has been decrypted to \"Decrypted.txt\".  " +
                    "\nTo find the file, first look at where your IDE saves the files.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Please enter a valid file path name.");
        }
    }//End of decrypting method

}//End BrandonMuhlesteinOperation9 class
