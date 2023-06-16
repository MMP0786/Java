import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String args[])  {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(6);
        set.add(5);
        set.add(1);

        if(set.contains(2)){
            System.out.println("founded");
        }else{
            System.out.println("Not fonded");
        }

        set.remove(4);

        Iterator It = set.iterator();

        while(It.hasNext()){
            System.out.print(It.next() + " ");
        }
        System.out.println();
        System.out.println(set);

    }
    
}
