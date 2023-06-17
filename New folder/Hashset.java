import java.util.*;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Map;
// import java.util.Set;

public class Hashset {
    public static void main(String args[])  {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bangluru", 80);
        map.put("mumbai", 40);
        map.put("chinese", 90);
        map.put("saharanpur", 30);


        System.out.println(map);

        if(map.containsKey("mumbai")){
            System.out.println("found");
        }else{
            System.out.println("Not Found");
        }

        System.out.println(map.get("mumbai"));

        // int arr [] = {12, 34, 45};
        // for(int val: arr){
        //     System.out.println(val);
        // }

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();

        for(String key: keys){
            System.out.println(key+ " "+ map.get(key));
        }
        // HashSet<Integer> set = new HashSet<>();
        // set.add(2);
        // set.add(6);
        // set.add(5);
        // set.add(1);

        // if(set.contains(2)){
        //     System.out.println("founded");
        // }else{
        //     System.out.println("Not fonded");
        // }

        // set.remove(4);

        // Iterator It = set.iterator();

        // while(It.hasNext()){
        //     System.out.print(It.next() + " ");
        // }
        // System.out.println();
        // System.out.println(set);

    }
    
}
