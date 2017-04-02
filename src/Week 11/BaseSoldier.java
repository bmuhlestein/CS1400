/**
 * Created by Muhlestein on 29-Mar-17.
 */
public class BaseSoldier
{

    private int energy = 100;
    private int x = 0;
    private int y = 0;

    public void setEnergy(int e)
    {
        if (e > 100)
        {
            System.out.println("Sorry -- invalid number");
        }
        else
        {
            this.energy = e;
        }
    }

    public int getEnergy()
    {
        return this.energy;
    }

}
