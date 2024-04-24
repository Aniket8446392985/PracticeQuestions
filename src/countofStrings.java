import java.util.HashSet;
import java.util.Set;

public class countofStrings {

    public static void main(String[] args) {

        String line = "java is a programming language language";
        String[] words=line.split(" ");
        Set<String> set= new HashSet<>();

        for (int i=0;i<=words.length-1;i++)
        {
            set.add(words[i]);
        }

        String[] star= set.toArray(new String[0]);

        for(int j=0;j<=star.length-1;j++)
        {
            int count=0;
            for(int k=0;k<=words.length-1;k++)
            {
                if(star[j].equalsIgnoreCase(words[k]))
                {
                    count++;
                }
            }
            System.out.print(star[j]);
            System.out.println(count);
        }
    }

    }
