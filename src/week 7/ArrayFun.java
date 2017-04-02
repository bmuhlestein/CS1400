/**
 * Created by Muhlestein on 21-Feb-17.
 */
public class ArrayFun
{

    public static void main (String[] args)
    {

        String[][] students = new String[10][2];

        students[0][0] = "Michael";
        students[0][1] = "Bluth";

        students[1][0] = "Lindsey";
        students[1][1] = "Bluth";

        students[2][0] = "Gob";
        students[2][1] = "Bluth";

        students[3][0] = "George Michael";
        students[3][1] = "Bluth";

        students[4][0] = "Maeby";
        students[4][1] = "Bluth";

        students[5][0] = "Tobias";
        students[5][1] = "Bluth";

        students[6][0] = "Buster";
        students[6][1] = "Bluth";

        students[7][0] = "George";
        students[7][1] = "Bluth";

        students[8][0] = "Lucille";
        students[8][1] = "Bluth";

        students[9][0] = "Lucille 2";
        students[9][1] = "Bluth";

        for (int i = 0; i < students.length; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                if(j == 0)
                {
                    System.out.print(students[i][j] + " ");
                }
                if(j == 1)
                {
                    System.out.println(students[i][j]);
                }

            }
        }

    }
}
