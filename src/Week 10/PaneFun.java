/**
 * Created by Muhlestein on 23-Mar-17.
 */
import javax.swing.JOptionPane;

public class PaneFun
{

    public static void main (String[] args)
    {
        String favTeam = "";

        //Show message box
        JOptionPane.showMessageDialog(null, "Hi");

        //Show input box
        favTeam = JOptionPane.showInputDialog(null, "What is your favorite team?");

        JOptionPane.showMessageDialog(null, favTeam + " is a good team!");

        //Show confirm box
        JOptionPane.showConfirmDialog(null, "Best videos ever?");
    }

}
