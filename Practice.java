import java.util.*;
public class Practice {
    public static void primeNo(int a){
        boolean isPrime = true;

        for(int i=2; i<a/2; a++){
            if(a%i==0){
                isPrime = true;
                break;
            }
        }
        if(isPrime){
            System.out.println("No is not prime");

        }else{
            System.out.println("no is prime");
            
        }
    }
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        primeNo(a);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // String op = sc.next();
        // int b = sc.nextInt();


        // switch(op){
        //     case "+":
        //     System.out.println(a+b);
        //     break;
        //     case "-":
        //     System.out.println(a-b);
        //     break;
        //     default:
        //     System.out.println("Invalid");
        // }



    }
    
}
