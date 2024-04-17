public class Fatcorial {

    // factorial is multiplication all before numbers of any number


    public static int factorial (int n)
    {
        if (n==0 || n==1){
            return n;
        }
        else {return ( n * factorial(n-1));}
    }

    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }


}
