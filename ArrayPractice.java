import java.util.*;
public class ArrayPractice{
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // int num = sc.nextInt();

    int number [] = {1002, 24, 36, 34, 442};

    // int number [] = new int[num];
    // // number[0]= 12;
    // // number[2]= 22;
    // // number[1]= 32;

    // for(int a=0; a<num; a++){
    //    number[a] = sc.nextInt();
    // }

    int min=Integer.MIN_VALUE ; int max =Integer.MAX_VALUE;
    for(int a=0; a<number.length; a++){
        if(max>number[a]){
            max = number[a];
        }
        if(min<number[a]){
            min = number[a];
        }
    }
    System.out.println("min : "+ min + " And Max : "+ max );

    // int search = sc.nextInt();

    // for(int a =0; a<num; a++){
    //     if(number[a]==search){
    //         System.out.println("given no is present at index : "+ a);
    //     }
    // }
 }
}