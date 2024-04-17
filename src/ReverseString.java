public class ReverseString{


    public static String name= "Aniket Ankush Dhawale";
    public static void Reverse_string()
    {
        String[] NameChar=name.split(" ");

        for (int i= NameChar.length-1; i>=0;i--)
        {
            String NameRev=NameChar[i];
            System.out.println(NameRev);
        }
    }

    public static String name1="Prashant Suresh babar";
    public static void StringReverse(){
        String[] StArr=name1.split(" ");

        for (int i= StArr.length-1;i>=0;i--){
            System.out.println(StArr[i]);
        }
    }

    public static String name2="Aniket Ankush Dhawale";
    public static void StringReverseAndWords(){
        String[] AtArr=name2.split(" ");

        for (int i=AtArr.length-1;i>=0;i--){

            //System.out.println(AtArr[i]);
            for (int j=AtArr[i].length()-1;j>=0;j--)
            {
                char ch= AtArr[i].charAt(j);
                System.out.print(ch);
            }
            System.out.print(" ");
        }
    }


    public static String line3 = "hi I lov java as language";
    public static void LargestString()
    {
        String[] ST_AR=line3.split(" ");

        int len;
        int max=0;
        String maxString=null;

        for (int i=0; i<=ST_AR.length-1;i++){

            len=ST_AR[i].length();

            if(len>=max)
            {
                max =len;
                maxString=ST_AR[i];
            }
        }
        System.out.println(maxString+" : "+max);

    }

    public static void main (String []args )
    {
        // Reverse_string();
        // StringReverse();

        // StringReverseAndWords();
        LargestString();
    }



}