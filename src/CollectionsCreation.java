import java.util.*;

public class CollectionsCreation
{

    public static void main(String[] args) {

// create arraylist
        ArrayList<String> als=new ArrayList<>();
        als.add("ankush");
        als.set(0,"aniket");
        als.add("dhawale");
        als.get(0);


// Create linked list
        LinkedList<String> ll= new LinkedList<>();
        ll.add("1st added");
        ll.set(0,"2nd value added");
        ll.get(0);

// Create Vector
        Vector<String> vs= new Vector<>();
        vs.add("0th vector");
        vs.set(0,"1st vector");
        vs.get(0);


//Create Set
        Set<String> ss= new HashSet<>();
        ss.add("1st set value added");
        ss.add("2nd assed in hash set");


// Create LinkedHashset

        Set<String> lhs =new LinkedHashSet<>();
        lhs.add("linked hash set 1st parame added");
        lhs.add("l=LHS 2nd param added");


// Create a TreeSet from sortedset interface
        SortedSet<String>  sorset=new TreeSet<>();
        sorset.add("bharat");
        sorset.add("america");


        System.out.println(als);
        System.out.println(ll);
        System.out.println(vs);
        System.out.println(ss);
        System.out.println(lhs);
        System.out.println(sorset);

    }
}
