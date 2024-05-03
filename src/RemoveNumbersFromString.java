public class RemoveNumbersFromString {

    public static void main(String[] args) {
        String line="Aniket6987ankush789 dhawale879";
        char [] ch=line.toCharArray();
        String nonNUM="";
        for(int i=0;i<=ch.length-1;i++)
        {
            if(!Character.isDigit(ch[i]))
            {
                nonNUM=nonNUM+ch[i];
            }
        }
        System.out.println(nonNUM);
    }
}
