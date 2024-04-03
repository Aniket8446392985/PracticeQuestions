import java.util.*;
public class StringPalindrome
{

    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the word");
        String Word = sc.nextLine();

        StringBuffer st = new StringBuffer(Word);
        StringBuffer st1= new StringBuffer(Word);

        if (st.toString().equalsIgnoreCase(st1.reverse().toString()))
        {
            System.out.println("The word is palindrome");
        }
        else
        {
            System.out.println("WORD IS NOT PALINDROME");
        }

    }
}
