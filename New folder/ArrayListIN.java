import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIN {
    public static void main(String args[]){

    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(5);
    list.add(0,6);

    int ele =list.get(1);
    list.set(1,4);

    // int rmv = list.remove(2);
    // System.out.println("rmv "+ rmv);

    
    Collections.sort(list);
    // Collection.sort(list);
    for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));
    }
    }
}
