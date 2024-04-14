
import java.util.*;
public class PrintPrimeNo
{
    public static void main (String [] args )

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max limit");
        int MaxLimit = sc.nextInt();

        for (int i = 1 ;i<= MaxLimit; i++)
        {
            int count =0;
            for (int start=1;start <=i;start++)
            {
                if (i%start==0)
                {
                    count++;
                }
            }

            if (count==2)
            {
                System.out.println(i);
            }
        }
    }
}