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
            // int num1 = sc.nextInt();
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

        // Boolean flag = false;
        // for(int i=2; i<num1; i++){
        //     if((num1%i==0)){
        //         flag = true;
        //         break;
        //     }
        // }
        // if(flag){

        //     System.out.println("not prime");
        // }else{
        //     System.out.println("No is  a prime");
        // }
        int num1 =5;
        // int p =11;
        for (int i=1; i<=num1; i++){ // rows 
            // for(int j=0; j<num1-i; j++){
            //     System.out.print(" ");
            // }
            for(int j =1; j<=num1-i; j++){   //clos
                // if((i+j)%2==0){
                    System.out.print(" ");
                // }else{
                }
            for(int j =i; j>=1; j--){
                    System.out.print(j);
                // if(i==1 || j==0 || j==num1 || i==num1){
                    // p = j;
                    // p +=1;
                }
                for(int j =2; j<=i; j++){   //clos
                    // if((i+j)%2==0){
                        if(j==1){
                            System.out.print(" ");
                        // }else{
                        }
                            System.out.print(j);
                        }
            System.out.println();
        }


    }
}