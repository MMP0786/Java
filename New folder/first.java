import java.util.*;
public class first{
    public static void main(String[] args) {
        
        System.out.println("Enter 1st number");
    Scanner sc = new Scanner(System.in);
    // int num1 = sc.nextInt();
    // System.out.println("Enter 2nd number");
    // int num2 = sc.nextInt();
    // System.out.println("Enter Symbol");
    // String sign = sc.next();

    //  String name = "Musharraf";
    //  int age = 2;

    //  if(age>20){
    //     System.out.println("Age greater than 20");
    //  }else{
    //     System.out.println("not greater ");
    //  }
    // const sc = Scanner.

    // switch(sign){
    //     case "+": {
    //         System.out.println(num1 + num2);
    //         break;
    //     }
    //     case "-": {
    //         System.out.println(num1 + num2);
    //         break;
    //     }
    //     case "*": {
    //         System.out.println(num1 * num2);
    //         break;
    //     }
    //     case "/": {
    //         System.out.println(num1 / num2);
    //         break;
    //     }
    //     default :{
    //         System.out.println("this is default");
    //     }
    // }

    //  for(int i=0; i<num1; i++){
    //     if(i%2==0){
    //         System.out.print(i+" ");
    //     }
    //  }
        // int input ;
        // do{
        //     System.out.println("Enter no");
            int num1 = sc.nextInt();
        //     if(num1>90){
        //         System.out.println("exellent");
        //     }else if(num1>80 && num1< 90){
        //         System.out.println("Too good");
        //     }else{
        //         System.out.println("nothing");
        //     }
        //     System.out.println("please press 1 to continue or 0");
        //     input = sc.nextInt();
        // }
        // while(input ==1);

        Boolean flag = false;
        for(int i=2; i<num1; i++){
            if((num1%i==0)){
                flag = true;
                break;
            }
        }
        if(flag){

            System.out.println("not prime");
        }else{
            System.out.println("No is  a prime");
        }
        
    }
}