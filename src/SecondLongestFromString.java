import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class SecondLongestFromString {

        public static void Second_llw(String line)
        {
            String[] st_ar=line.split(" ");
            int wordLength=0;
            String word="";
            int j=0;
            Map<Integer,String> map=new HashMap<>();

            for(int i=0;i<=st_ar.length-1;i++)
            {
                wordLength=st_ar[i].length();
                map.put(wordLength,st_ar[i]);

                if(wordLength>j)
                {
                    j=wordLength;
                    word=st_ar[i];
                }
            }

            System.out.println("longest word is : "+ word);
            System.out.println("its length is  :" + j);

            String second="";
            int SecondLenghth = 0;
            for(int k=1;k<=map.size()+1;k++)
            {
                if(map.containsKey(j-k))
                {
                    second= map.get(j-k);
                    SecondLenghth=j-k;
                    System.out.println(second+ ":" +SecondLenghth);
                    break;
                }
            }
        }
        public static void main (String[] args) {
            Second_llw("aniket is good human being");

        }


}
