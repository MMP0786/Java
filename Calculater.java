import java.util.*;

public class Calculater{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        String symbol = Sc.next();


        switch(symbol){
            case "+":
            System.out.print(a+b);
            break;
            case "-":
            System.out.print(a-b);
            break;
            case "*":
            System.out.print(a*b);
            break;
            case "/":
            System.out.print(a/b);
            break;
            case "%":
            System.out.print(a%b);
            break;
            default: System.out.println("Provid valid symbol");

        }
    }
}