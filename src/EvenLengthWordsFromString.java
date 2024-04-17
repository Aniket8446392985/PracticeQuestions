import java.util.ArrayList;
import java.util.Arrays;

public class EvenLengthWordsFromString
{
    public static String line= "This is a java language";

    //// method to find Even Words Using Array
    public static void EvenWordsUsingArray ()
    {
        String[] words=line.split(" ");
        int i=0;
        String[] EvWords = new String[words.length];

        for (String wrd:words)
        {
            if (wrd.length()%2==0)
            {
                EvWords[i]=wrd;
                i++;
            }
        }

        String EW= new String(Arrays.toString(EvWords));
        System.out.println(EW);
    }


// method to find Even Words Using LIst
    public static void EvenWordsUsingLIst ()
    {
        String[] words=line.split(" ");
        int i=0;
        ArrayList<String> EvWords= new ArrayList<>();
        // String[] EvWords = new String[words.length];

        for (String wrd:words)
        {
            if (wrd.length()%2==0)
            {
                EvWords.add(i,wrd);
                //EvWords[i]=wrd;
                i++;
            }
        }

        String EW= new String(String.valueOf(EvWords));
        System.out.println(EW);
    }
    public static void main(String[] args)
    {
        EvenWordsUsingArray();
        EvenWordsUsingLIst();
    }

    
}
