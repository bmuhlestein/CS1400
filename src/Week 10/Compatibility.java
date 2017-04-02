import javax.swing.*;

/**
 * Created by Muhlestein on 23-Mar-17.
 */
import javax.swing.*;
import java.awt.*;

public class Compatibility
{

    private JFrame mainWindow;
    private JLabel lblName1;
    private JLabel lblName2;
    private JTextField txtName1;
    private JTextField txtName2;
    private JButton btnCheck;
    private JLabel lblResults;

    public Compatibility()
    {
        createContents();

        mainWindow.setVisible(true);
    }

    private void createContents()
    {
        mainWindow = new JFrame();

        mainWindow.setSize(600,400);
        mainWindow.setTitle("Check Your Compatibility!");
        mainWindow.setDefaultCloseOperation(mainWindow.EXIT_ON_CLOSE);
        mainWindow.setLayout(new FlowLayout());

        lblName1 = new JLabel("Enter Name #1");
        lblName2 = new JLabel("Enter Name #2");
        txtName1 = new JTextField(15);
        txtName2 = new JTextField(15);
        btnCheck = new JButton("Check Compatibility");
        lblResults = new JLabel("");

        mainWindow.add(lblName1);
        mainWindow.add(txtName1);
        mainWindow.add(lblName2);
        mainWindow.add(txtName2);
        mainWindow.add(btnCheck);
        mainWindow.add(lblResults);
    }

}
