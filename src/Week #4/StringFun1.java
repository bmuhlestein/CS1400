/**
 * Created by Muhlestein on 30-Jan-17.
 */
public class StringFun1
{

    public static void main (String[] args)
    {

        int iFirstSpace = 0;
        int iSecondSpace = 0;

        String sentence = "I've made a huge mistake";
        String secondWord = "";

        iFirstSpace = sentence.indexOf(' ');
        iSecondSpace = sentence.indexOf(' ', iFirstSpace + 1);
        secondWord = sentence.substring((iFirstSpace + 1), iSecondSpace);

        System.out.println(iFirstSpace);
        System.out.println(iSecondSpace);
        System.out.println("The second word is \"" + secondWord + "\".");

    }

}
