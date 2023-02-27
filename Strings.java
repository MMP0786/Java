import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
      String name = "Mohd";
      String nme= new String("M");
      Scanner sc = new Scanner(System.in);
      String tname = "Mzhd";
      String sname= "Musharraf";
      String fullName = name.concat(sname);

      StringBuilder sb = new StringBuilder("Mohd");
      
        System.out.println(sb.insert(4, "Mus"));
        System.out.println(sb.delete(4, 6));

    //   1. concate
    //   2.charAt()
    //   3.compareTo
    //   4. substring
    // insert, delete, append


    // System.out.println(fullName.substring(0, 5));
    // System.out.println(name.compareTo(tname));
    //   System.out.println(name+" "+ sname);
    // System.out.println(name.concat(" "+sname));

    // for(int i=0; i<fullName.length(); i++){
    //     System.out.println(fullName.charAt(i));
    // }
    }
}
