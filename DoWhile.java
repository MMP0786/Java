import java.util.*;
public class DoWhile {

    public static int  powerOfInteger(int a, int power){
        int res=1;
        for(int i=1; i<=power; i++){
            res = res*a;
        }
        return res;
    }
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int power = sc.nextInt();

        powerOfInteger(num, power);

        // boolean prime =true;

        // for(int i=2; i<num/2; i++){
        //     if(num%i==0){
        //         prime = false;
        //     }
        // }
        // if(num==1){
        //     System.out.println("1 is niether prime nor composite");
        // }else if(num==0){
        //     System.out.println("0 or less than zero not a prime nor composite");
        // }else if(prime){
        //     System.out.println(" The no is not Prime");
        // }else{
        //     System.out.println(" The no is Prime");

        // }




        // int input;

        // do{
        //     if(num>90){
        //         System.out.println("Excellent");
        //     }else if(num>80 && num< 90){
        //         System.out.println("Too good");
        //     }else if(num<80 ){
        //         System.out.println(" Ok ");
        //     }else{
        //         System.out.println("Provide valid no");
        //     }
        //     input = sc.nextInt();
        // }
        // while(input ==1);
        
    }
}
