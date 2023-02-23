import java.util.*;
public class ArrayPractice{
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int number [] = new int[num];
    // number[0]= 12;
    // number[2]= 22;
    // number[1]= 32;

    for(int a=0; a<num; a++){
       number[a] = sc.nextInt();
    }

    // int sum =0;
    // for(int a=0; a<num; a++){
    //     sum +=number[a];
    // }
    // System.out.println(sum);

    int search = sc.nextInt();

    for(int a =0; a<num; a++){
        if(number[a]==search){
            System.out.println("given no is present at index : "+ a);
        }
    }
 }
}