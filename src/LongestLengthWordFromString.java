public class LongestLengthWordFromString
{
    public static void llw(String line)
    {
        String[] st_arr=line.split(" ");
        int j=0;
        String word="";
        for(int i=0;i<=st_arr.length-1;i++)
        {
            int Word_Length=st_arr[i].length();
            if(Word_Length>j)
            {
                j=Word_Length;
                word =st_arr[i];
            }
        }
        System.out.println("Longest word is "+"'"+ word+"'" +" and its length is "+ j);
    }
    public static void main (String[] args){
        llw("java is good language than any other programming language");
    }
}
