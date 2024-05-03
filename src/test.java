public class test {
    public static void main (String[] args)
    {
        String line="java is a good programming language";

        String [] sa= line.split(" ");

        for(int i =0; i<=sa.length-1;i++)
        {
            int count=0;
            for(int j=0;j<=sa.length-1;j++)
            {
                if(sa[i].length()>=sa[j].length())
                {
                    count++;
                }
            }
            if (count==sa.length)
            {
                System.out.println("longest element is :"+ sa[i] + " its length is :" + sa[i].length());
            }
        }
    }

}
