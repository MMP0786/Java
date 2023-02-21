import java.io.Console;
import java.lang.Thread.State;
import java.util.*;
public class Solution {

    
    public static void main(String[] args){


       
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int c =0;
        int a =0;
        int b =1;
        if(n>1){

            System.out.println(a+"\n"+b);

            for(int x =1; x<=n; x++){

                c = a+b;
                a=b;
                b=c;
                System.out.println(c);
            }
        }

        
        }
}
