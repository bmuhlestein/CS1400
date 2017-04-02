/**
 * Created by Muhlestein on 26-Feb-17.
 */
import java.util.*;

public class LinePlot {

    private int oldX = 0;
    private int oldY = 0;

    public void plotSegment (int x, int y)
    {
        System.out.println("New segment = (" + oldX + "," + oldY + ") - (" + x + "," + y + ")");
        oldX = x;
        oldY = y;
    }

    public static void main (String[] args)
    {
        Scanner stdIn = new Scanner (System.in);
        LinePlot line = new LinePlot ();
        String xStr, yStr;
        int x, y;

        System.out.print("Enter x & y coordinates (q to quit): ");
        xStr = stdIn.next();
        while (!xStr.equalsIgnoreCase("q"))
        {
            yStr = stdIn.next();
            try
            {
                x = Integer.parseInt(xStr);
                y = Integer.parseInt(yStr);
                line.plotSegment (x, y);
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Invalid entry: " + xStr + " " + yStr + "\nMust enter integer space integer.");
            }
            System.out.print("Enter x & y coordinates (q to quite): ");
            xStr = stdIn.next();
        }
    }
}
