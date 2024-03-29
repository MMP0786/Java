
public class Trie1 {
    static class Node{
        Node [] children;
        boolean eow;

       public Node(){
          children = new Node[26];
          for(int i=0; i<26; i++){
            children[i] = null;
          }
          this.eow= false; 
       }
    }

    public static Node root = new Node();

    // insert in trie
    public static void insert(String word){

        Node curr =root;

        for(int i=0; i<word.length(); i++){
        
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }

            if(i==word.length()-1){
                curr.children[idx].eow= true;
            }

            curr = curr.children[idx];
        }

    }

    // Search in trie

    public static boolean search(String key){
        Node curr =root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i)-'a';

            if(curr.children[idx]==null){
                return false;
            }
            // System.out.println(curr.children[idx]);

            if(i==key.length()-1 && curr.children[idx].eow==false){
                return false;
            }

           curr= curr.children[idx];
        }
        return true;
    }

    //  wordbreak
    public static boolean wordbreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i =1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordbreak(secondPart)){
                return true;
            }
        }
        return false;
    }
        public static void main(String args[]) {
        String words[] = {"i", "like", "sam", "samsung", "any"};
        String str = "ilikesamsung";
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        // System.out.println(search("th"));
        // System.out.println(search("their"));
        // System.out.println(search("ther"));

        System.out.println();

        System.out.println(wordbreak(str));


    }
    
}
