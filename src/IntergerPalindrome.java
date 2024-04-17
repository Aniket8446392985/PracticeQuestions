public class IntergerPalindrome
{

    public static void main(String[] args) {
        int num =1234;
        int rem= num%10;
        int rev =0;

        rev =rev * 10 + rem;

        if (num==rev){
            System.out.println("INT palindrome");
        }
        else {
            System.out.println("Not palndrome");
        }

    }

}


