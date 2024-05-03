public class SecondLongestStringCustomizable
{
    public static void largestString()
    {

        String line= "java mava is";
        String[] wrd= line.split(" ");

        for(int i=0;i<=wrd.length-1;i++)
        {
            int count=0;
            for(int j=0;j<=wrd.length-1;j++)
            {
                if(wrd[i].length()>=wrd[j].length())
                {
                    count++;
                }
            }
            if(count==wrd.length)
            {
                System.out.println("longest word is "+ wrd[i]);
                System.out.println("and its length is: "+ wrd[i].length());
            }
        }
    }
    public static void main(String[] args)
    {
        largestString();
    }
}