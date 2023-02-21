// import java.io.Console;
import java.util.*;;

public class Loop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        int sum =0;
        for(int a =0; a<=n; a++){
            sum +=a;
        }
        System.out.println(sum);

        // now work with the while loop
        int a =0;
        while(a<11){
            System.out.println(a*n);
            a++;
        }

        int b=0;
        do{
        System.out.println("Hello");
            b++;
            
        }
        while(b<5);
        
    }
    
}
