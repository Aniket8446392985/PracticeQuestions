import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;


public class CodeAskedInSapient {
    public static void main(String[] args)
        {

            List<String> colours = new ArrayList<>();
            colours.add("Red&Pink");
            colours.add("Red&Pink");
            colours.add("Green&Red");
            colours.add("Black&White");
            colours.add("White&Pink");
            colours.add("Pink&Blue");

            String totalLine="";
            for(String colo:colours)
            {
                String[] onecolour=colo.split("&");
                for(int i=0;i<=onecolour.length-1;i++)
                {
                    totalLine=totalLine+" "+onecolour[i];
                }
            }
            System.out.println(totalLine);


            String [] star=totalLine.trim().split(" ");
            Set<String> unique= new HashSet<>();

            for(String oneByone: star)
            {
                unique.add(oneByone);
            }

            for(String one:unique)
            {
                int count=0;
                for(int j=0;j<=star.length-1;j++)
                {
                    if(one.equalsIgnoreCase(star[j]))
                    {
                        count++;
                    }
                }
                System.out.println("colour is : "+ one + " its count is: "+count) ; System.out.println("colour is : "+ one + " its count is: "+count) ;
            }

        }

/*

        // 2nd code reverse the every string in following string

            String fullName="Aniket Ankush Dhawale";
            String[] name= fullName.trim().split(" ");
            String revLine="";

            for(String word: name)
            {
                String revWord="";
                for(int i=word.length()-1;i>=0;i--)
                {
                    //System.out.print(word.charAt(i));
                    revWord=revWord+word.charAt(i);
                }
                revLine=revLine+" "+revWord;
            }
            System.out.print(revLine);*/


    }
