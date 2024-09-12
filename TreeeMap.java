import java.util.*;
public class TreeeMap {
    public static void main(String[] args) {
        
        Map<Integer,String> treemap=new TreeMap<>();
        treemap.put(1,"sandeep");
        treemap.put(3,"saep");
        treemap.put(2,"eep");
        Map<Integer,String> treemap2=new TreeMap<>();
        treemap.put(4,"ndeep");
        treemap.put(5,"sep");
        treemap.put(6,"ep");
         treemap.putAll(treemap2);
        //printing treemap
        System.out.println(treemap);

        //particular key
        System.out.println(treemap.get(3));

        //remove
       // treemap.remove(2);
        //System.out.println(treemap);

        //iterate and get values
        for(Map.Entry<Integer,String> entries:treemap.entrySet() )
        {
            System.out.println(entries.getKey()  +" "+entries.getValue());
        }

        //first and last key
        System.out.println(treemap.containsKey(5));
        System.out.println(treemap.containsValue("sandeep"));


        
    }
    
}
