import java.util.*;

public class Solution {
    public static void main(String[] args){


       
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // int c =0;
        // int a =0;
        // int b =1;
        // if(n>1){

        //     System.out.println(a+"\n"+b);

        //     for(int x =1; x<=n; x++){

        //         c = a+b;
        //         a=b;
        //         b=c;
        //         System.out.println(c);
        //     }
        // }

        // while(n1!= n2){
        //     System.out.println("hello2");
        //     if(n1>n2){
        //         n1 = n1-n2;
        //     }else{
        //         n2= n2-n1;
        //     }
        // }
        // System.out.println("Gcd of two no : "+ n2);
            // if(n2>n1){

            //     for(int a =1; a<=n2; a++ ){
            //         if(n1%a==0 && n2%a==0){
            //             System.out.println(a);
            //         }
            //     }
            // }

            // Gcd and Lcm
            // int newN1= n1;
            // int newN2= n2;
            // while(n1%n2!=0){
            //     int rem = n1%n2;
            //     n1= n2;
            //     n2 = rem;
                
                
            // }
            // int lcm = (newN1*newN2)/n2;
            // System.out.println("Gcd of the no : "+ n2);
            // System.out.println("Lcm of the no : "+ lcm);
        

            // fabrocci series 

            // int a = 0;
            // int b= 1;
            // int temp =0;
            // System.out.println(a+" "+b);
            // if(n1>1){
            //     for(int x =1; x<= n1; x++){

            //         temp = a+b;
            //         a= b;
            //         b=temp; 
            //         System.out.println(temp);
            //     }
            // }
            int res=1;
            for(int x=1; x<=n2; x++){
                res = res*n1;

            }
            System.out.println(res);
        }
}
