/**
 * Created by Muhlestein on 21-Feb-17.
 */
import java.util.ArrayList;

public class ArrayListFun
{
    public static void main (String[] args)
    {

        ArrayList<String> bands = new ArrayList<String>();

        bands.add("The Beatles");
        bands.add("Led Zeppelin");
        bands.add("The Eagles");
        bands.add("Creedence Claerwater Revival");
        bands.add("Queen");

        bands.set(4, "Allman Brothers Band");

        System.out.println(bands);

        bands.remove(3);

        System.out.println(bands);

        bands.add(0, "Justin Beiber");

        System.out.println(bands);

        if (bands.indexOf("The Beatles") != 0)
        {
            System.out.println("your're crazy!");
        }

    }
}
