import java.util.*;

public class second {
    // public static int multiply(int a, int b){
    //     return a*b;
    // }

    public static int powerOf(int x, int n) {
        int res =1;
        for(int i=1; i<=n; i++){
            res *=x;
        }
        return res;
    }

    public static void GreatestDivisor(int a, int b){
        int res = a%b;
        while(res!=0){
            a =b;
            b= res; 
            res = a%b;
        }
        System.out.println(b);
        // return b;
    }
    
    public static void fabacciSeries(int a){
        System.out.println(0);
        System.out.println(1);
        int b= 0, c=1, d;

        for(int i=1; i<=a-2; i++){
            d = b+c;
            b= c;
            c=d;
            System.out.println(d);
        }
    }

    public static void main(String [] args) {
       int a = powerOf(2, 5);

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Rows Size : ");
       int rows = sc.nextInt();
       System.out.println("Enter Cols Size : ");
       int cols = sc.nextInt();

       int num [][]= new int[rows][cols];

       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            num[i][j]= i+j;

        }
       }
       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(num[i][j] ==4)
            System.out.println("index is : "+ i +"th rows "+ j + "th cols");

        }
       }


    //    for(int i =0; i<num.length; i++){
    //     System.out.println(num[i]);
    //    }

    //    fabacciSeries(7);
    //    System.out.println(a);
    // System.out.println("this is sout1");
    // System.out.println();
        // GreatestDivisor(10,12);
    //    System.out.println("this is sout2");
        // sumOfn(5);
        
        // System.out.println(multiply(5, 7));
        // factorial(10);
        // int i=1;
        // do{

        //     System.out.println("this is sout");
        //     i++;
        // }
        // while(i>=1);
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt()
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

