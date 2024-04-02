public class FibinachiSequence {

    public static void main (String[] args){

        int last=1;
        int mid=1;
        int next;
        System.out.println(last);
        System.out.println(mid);
        for (int i=1; i<=15; i++)
        {
            next = mid+last;
            System.out.println(next);
            last=mid;
            mid =next;
        }

    }

}
