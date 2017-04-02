/**
 * Created by Muhlestein on 28-Mar-17.
 */
public class Sailor
{

    //Properties
    private int energy = 100;
    private int x = 500;
    private int y = 500;


    //Methods
    public void setEnergy (int e)
    {
        this.energy = e;
    }

    public int getEnergy ()
    {
        return this.energy;
    }

    public void setX (int x)
    {
        this.x = x;
    }

    public int getX ()
    {
        return this.x;
    }

    public void setY (int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return this.y;
    }

    public void hit (int damage)
    {
        energy = energy - damage;
    }

}
