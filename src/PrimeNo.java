import javax.swing.*;
import java.util.*;
public class PrimeNo
{

    // code to check the prime no
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number: " );
        int num= sc.nextInt();
        int count=0;

        for(int i= 1; i<=num; i++)
        {
            if (num%i==0)
            {
                count++;
            }
        }
        if (count==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("No is not prime");
        }
    }


}
