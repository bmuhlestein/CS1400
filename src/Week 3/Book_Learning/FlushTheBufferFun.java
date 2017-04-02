/**
 * Created by Muhlestein on 13-Jan-17.
 */
import java.util.*;

public class FlushTheBufferFun
{

    public static void main (String[] args)
    {

        Scanner in = new Scanner (System.in);


        //Variables
        String name = "";
        double gpa = 0;
        String year = "";

        //Get info from student
        System.out.println("Please enter your name");
        name = in.nextLine();

        System.out.println("What is your GPA");
        gpa = in.nextDouble();

        //Flush the buffer
        in.nextLine();

        System.out.println("What year are you in school?");
        year = in.nextLine();

        System.out.println("Print Something");

    }

}
