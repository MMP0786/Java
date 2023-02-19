import java.util.*;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Yes you are eligible for vote");
        }else{
            
            System.out.println("Not you are Note ligible for vote");
        }

        switch(age){
            case 18:
             System.out.println("Yes you are eligible for vote");
             break;
            case 8:
             System.out.println("Yes you are eligible for vote");
        }
    }
}