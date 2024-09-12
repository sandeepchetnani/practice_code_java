import java.util.*;
public class HashMaps {

    public static void main(String[] args) {
     
        Map<Integer,String> hashmaps=new HashMap<>();    
        hashmaps.put(1,"sandeep");
        hashmaps.put(2,"ndeep");
        hashmaps.put(3,"sdeep");
        hashmaps.put(4,"seep");
        System.out.println(hashmaps);
        System.out.println(hashmaps.get(1));
       System.out.println(hashmaps.containsKey(4)); 
        hashmaps.remove(1);
        System.out.println(hashmaps);

        for(HashMap.Entry<Integer,String> maps : hashmaps.entrySet())
        {
            System.out.println(maps.getKey() +" "+maps.getValue());
        }

    }
}
