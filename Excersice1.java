import java.util.*;

public class Excersice1 {

    public static int greaterNo(int a, int b) {
        if (a > b) {
            System.out.println("greater no : " + a);
            return a;
        } else {
            System.out.println("greater no : " + b);
            return b;
        }
    }
    // fabacci series with java

    public static int Fab(int a){
        int fab=0;
        for(int b=0; b<=a; b++){

            fab +=b;
            int pre =fab;
            System.out.println(fab);
        }
        return fab;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        Fab(a);
        // int b = sc.nextInt();

        // greaterNo(a, b);
        // System.out.println(greaterNo(a, b));
    }
}
