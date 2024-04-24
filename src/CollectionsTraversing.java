import java.util.HashMap;
import java.util.*;

public class CollectionsTraversing
{
    public static void main(String[] args)
    {
       Set <String> set= new HashSet<>();
       set.add("aniket");
       set.add("ankush");
       set.add("Dhawale");

       Iterator<String> itr= set.iterator();
       while(itr.hasNext())
       {
           String setwords= itr.next();
           System.out.println(setwords);
       }
        System.out.println("===========================================");

       ArrayList arl= new ArrayList();
       arl.add("1st");
       arl.add("2nd");
       arl.add('T');
       arl.add(4);

       ListIterator litr =arl.listIterator(arl.size());

       while(litr.hasPrevious()){
           System.out.println(litr.previous());
       }
        System.out.println("---------------------------------------------------");

// user for each method to tarvese set
       Set net= new HashSet();
       net.addAll(arl);

       net.forEach(e->{
           System.out.println(e);
       });
        System.out.println("---------------------------------------------------");


        // iterating mapa using for each loop

        Map<String,Integer> map1= new HashMap<>();
        map1.put("Java",2000);
        map1.put("python",1500);
        map1.put("c#",1000);

        map1.forEach((key,value)->{
            System.out.println(key + "="+ value);
        });
        System.out.println("---------------------------------------------------");

        // iterating linked hash map

        Map maplin=new LinkedHashMap();
        maplin.putAll(map1);

        maplin.put("aniket", 100000);
        maplin.put("ankush", 200000);

        maplin.forEach((key1, value1)->{
            System.out.println(key1+ " "+ value1);
        });
        System.out.println("---------------------------------------------------");


        // iterating Treemaps

        Map tm= new TreeMap();
        tm.putAll(maplin);

        tm.forEach((key2, value2)->{

            System.out.println(key2+" "+value2);

        });

    }

}
