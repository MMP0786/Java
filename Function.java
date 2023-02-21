import java.util.*;
public class Function {
    public static void printName(String name, String sName){
        System.out.println(name + " " + sName);
        return ;
    }

    public static int averageThreeNo(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static int averageThreeNo(int n){
        int sum =0;
        for(int x =1; x<=n; x++){
            if(x%2==1){
                sum +=x;
            }
        }
        return sum;
    }

    public static int printFact(int a){
        if(a ==0 ){
            return 1;
        // }else if(a<0){
        //     System.out.println("invalid");
        //     return;
        //     String c = "nagative no does not exist fact";
        //     return c;
        }else{

            int fac =1;
            for(int b=1; b<=a; b++){
                fac *=b;
            }
            return fac;
        }
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int b = sc.nextInt();
        // int res=  printFact(5);
        // System.out.println("the fac of the no :" +res);
        System.out.println(averageThreeNo(n));
    }
    
}
