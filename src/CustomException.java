public class CustomException extends Exception

{
    public CustomException(String message)
    {
        super(message);
    }
    public static void main(String[] args) {
        int age =17;
        try{
        if (age>=18)
        {
            System.out.println("you are eligivle for voting");
        }
        throw new CustomException("this is custom exception");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }



}
