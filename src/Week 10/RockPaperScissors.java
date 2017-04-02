/********************************
 *
 * RockPaperScissors.java
 * Created by Muhlestein on 23-Mar-17.
 *
 * This class helps facilitates options within the RPS Game via GUI
 *
 *******************************/
import javax.swing.*;
import java.util.*;

public class RockPaperScissors
{

    public String getUserChoice()
    {
        String userChoice = "";

        userChoice = JOptionPane.showInputDialog("Please Select Rock, Paper, or Scissors");

        return userChoice;
    } // END getUserChoice Method


    public String getCPUChoice()
    {
        Random r = new Random();

        int iCPUSelection = 0;
        String cpuChoice = "";

        iCPUSelection = r.nextInt(3) + 1;

        if(iCPUSelection == 1)
        {
            cpuChoice = "Rock";
        }
        if(iCPUSelection == 2)
        {
            cpuChoice = "Paper";
        }
        if(iCPUSelection == 3)
        {
            cpuChoice = "Scissors";
        }

        return cpuChoice;
    }// END getCPUChoice Method


    public String pickWinner(String userChoice, String cpuChoice)
    {
        String winner = "";

        if ((userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("scissors")) ||
                (userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("rock")) ||
                (userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("paper")))
        {
            winner = "User";
        }
        if ((userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("paper")) ||
                (userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("scissors")) ||
                (userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("rock")))
        {
            winner = "Computer";
        }
        if ((userChoice.equalsIgnoreCase("rock") && cpuChoice.equalsIgnoreCase("rock")) ||
                (userChoice.equalsIgnoreCase("paper") && cpuChoice.equalsIgnoreCase("paper")) ||
                (userChoice.equalsIgnoreCase("scissors") && cpuChoice.equalsIgnoreCase("scissors")))
        {
            winner = "Tie";
        }

        return winner;
    }// END pickWinner Method

}
