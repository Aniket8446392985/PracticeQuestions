public class IncrementalAndDecrementalOperators {


    public static void main(String[] args)
    {
         for(int i=10;i>=0;i--){
             System.out.println(i);
             int j=i--;
             System.out.println("value of j is " +j);
         }
    }

}
