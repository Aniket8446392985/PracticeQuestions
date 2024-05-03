import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class teste
{
        public static void main(String[] args) {

            String Line="Java is a Programming Programming language";

            String[] star=Line.split(" ");

            Set<String> set= new HashSet<>();
            for(int i=0 ;i<= star.length-1;i++)
            {
                set.add(star[i]);
            }
            String[] uniq=set.toArray(new String[0]);

            for(int j=0;j<= uniq.length-1;j++)
            {
                int count=0;
                for(int k =0 ; k<=star.length-1;k++)
                {
                    if(uniq[j].equals(star[k]))
                    {
                        count++;
                    }
                }
                System.out.print(uniq[j] +"");
                System.out.print(count+" ");
            }

        }
}
