import java.util.*;

public class Mastercheck
{
    // Array list
    // this is a list with indexing
    // this accepts uplicate inputs
    // this has sequencing

    public static void main(String[] args) {
        // Arraylist

        ArrayList ARL= new ArrayList(12);
        ARL.add(0,12);
        ARL.add(1,"Aniket");

       // iterating the arraylist using iterator

        Iterator itr= ARL.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }



        // Linked list

        LinkedList ll= new LinkedList();

        for(int i=0 ;i<=10;i++)
        {
            ll.add(i);
        }

        ll.forEach(e->{
            System.out.println(e);
        });



        // SET
        // these are collections that do not accept the duplicates
        // there are 2 type of set
        // HashSet and :inked Hash set and TreeSet

        // HashSet

        Set se= new HashSet();
        se.add(0);
        se.add(1);
        se.add("Set added");
        se.add(1);
        System.out.println("**********************************************************");

        for (Object ab:se)
        {
            System.out.println(ab);
        }



        // Trying tree set
        Set ts= new TreeSet();
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(5);
        ts.add(7);
        System.out.println(" _____________________________________");

        ts.forEach(value->{
            System.out.println(value);
        });


        // MAP
        // there are 2 type of it HASH map and Tree map


        Map<String, Integer> map= new HashMap<>();

        map.put("aniket",29);
        map.put("mrunal", 26);
        System.out.println(" _____________________________________");

        System.out.println(map.containsValue(26));

        map.forEach((key,value)->
        {
            System.out.print(key+" "+": ");
            System.out.println(value);
        });


        // iterating map of map

        Map<Integer, HashMap> hm= new HashMap<>();

        hm.put(0,(HashMap) map);
        System.out.println(" _____________________________________");

        hm.forEach((key,value)->{
            value.forEach((key1,value1)->
            {
                System.out.println(value1);
            });
        });

    }

}
