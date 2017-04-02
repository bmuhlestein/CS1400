/**
 * Created by Muhlestein on 29-Mar-17.
 */
public class BrandonFirstNational
{

    public static void main (String[] args)
    {
        BankAccount b1 = new BankAccount("Brandon", 12345);
        BankAccount b2 = new BankAccount("JoHanna", 67890);

        b1.deposit(50);
        b1.withdraw(20);

        b2.deposit(1000000);

        System.out.println(b1.getBalance());

        System.out.println(b2.getBalance());

    }

}
