public class StringAndSpecificReverse
{
    //public static String Line="Java is 123 good";
    public static void StringRev(String line ,String Excluded)
    {
        String[] words=line.split(" ");
        String rev="";

        for(int i=0;i<=words.length-1;i++)
        {
            String rev_word="";
            String words1=words[i];
            if(words1.contains(Excluded))
            {
                rev_word=Excluded;
            }
            else
                for(int j=words1.length()-1;j>=0;j--)
                {
                    rev_word=rev_word +""+ words1.charAt(j);
                }
            rev=rev+" "+rev_word;
        }
        System.out.println(rev);
    }


    public static void main (String [] args)
    {
        StringRev("Aniket is very good","is");
    }

}
