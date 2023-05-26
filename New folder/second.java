import java.util.*;

public class second {
    // public static int multiply(int a, int b){
    //     return a*b;
    // }

    public static int powerOf(int x, int n) {
        x=1;
        for(int i=0; i<=n; i++){
            x *=n;
        }
        return x;
    }
    
    public static void main(String [] args) {
        // sumOfn(5);
        
        // System.out.println(multiply(5, 7));
        // factorial(10);
        // int i=1;
        // do{

        //     System.out.println("this is sout");
        //     i++;
        // }
        // while(i>=1);
        Scanner sc = new Scanner(System.in);
    }
    public static void factorial(int a) {
        if(a==1){
            System.out.println("factorial is 1");
        }else{
            int b =1;
            for(int i=1; i<=a; i++){
                b *=i;
            }
            System.out.println("factorial of given no is : " + b);
        }

    }
    public static void sumOfn(int n) {
        int zero =0;
        int positve =0;
        int negative = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=n; i++){
            System.out.println("Enter no: ");
            int a = sc.nextInt();
            if(a==0){
                zero++;
            }else if(a>0){
                positve++;
            }else{
                negative++;
            }
        }
        System.out.println("negative no is : "+ negative);
        System.out.println("zero no is : "+ zero);
        System.out.println("Positve no is : "+ positve);
    }
};

