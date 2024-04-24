import java.util.*;
import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ModifiedSecondLargestString
{
    public static void Second_llw(String line, int nthLatgest)
        {
            String[] st_ar=line.split(" ");
            int wordLength=0;
            String word="";
            int j=0;
            Map<Integer,String> map=new HashMap<>();
            int iterate= st_ar.length;

            for (int i = 0; i <= iterate - 1; i++)
            {
                wordLength = st_ar[i].length();
                map.put(wordLength, st_ar[i]);

                if (wordLength > j) {
                    j = wordLength;
                    word = st_ar[i];
                }
            }

            System.out.println("longest word is : "+ word);
            System.out.println("its length is  :" + j);


            String xlargestword="";
            int xlargestwordLength = 0;
            int count =0;
            int xLargest=nthLatgest;

            for(int k=1;k<=map.size()+1;k++)
            {
                if(map.containsKey(j-k))
                {
                    xlargestword= map.get(j-k);
                    xlargestwordLength=j-k;
                    count++;
                    if(count==(xLargest-1))
                    {
                        System.out.println("Second longest word is :"+xlargestword+" and its length is :" +xlargestwordLength);
                        break;
                    }
                }
            }
        }
        public static void main (String[] args)
        {
            Second_llw("aniket is a nice guy", 3);

        }


}
