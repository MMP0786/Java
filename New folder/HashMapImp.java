import java.util.*;
public class HashMapImp {
   static class HashMap<K, V>{
    private class Node{
        K key;
        V value;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
     private int n;
     private int N;
     private LinkedList<Node> bucket [];

     @SuppressWarnings("unchecked")
    public HashMap(){
        this.N = 4;
        this.bucket = new LinkedList[4];
        for(int i=0; i<4; i++){
            this.bucket[i]= new LinkedList<>();
        }
    }
    
    private int searchInLL(K key, int bi){
        LinkedList<Node> ll = bucket[bi];

        for(int i=0; i<ll.size(); i++){
            if(ll.get(i).key == key){
                return i;
            }
        }
        return -1;
    }

    private int hashFuction(K key){
        int bi = key.hashCode();
        return Math.abs(bi) % N;
    }


    // Add
    public void put(K key, V value){
     int bi = hashFuction(key);
     int di = searchInLL(key, bi);

     if(di==-1){
        bucket[bi].add(new Node(key, value));
        n++;
    }else{
        Node data = bucket[bi].get(di);
        data.value = value;
    }

    double lamda = (double)n/N;
    if(lamda> 2.0){
        rehash(); 
    }
    }

    // contain
    public boolean containsKey(K key){

        return false;
    }
   }
    public static void main(String args[]){

    }
}
