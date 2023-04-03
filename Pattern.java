import java.util.*;

public class Pattern{
 public static void main(String[] args){
    // int m=5;
    int n =4;
    
    // for(int a=m; a>=1; a--){
    //   for(int b=0; b<=a; b++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // for(int a=1; a<=5; a++){
    //   for(int b=1; b<=4; b++){
    //     if(a==1 || b==1 || a==5|| b==4){

    //       System.out.print("*");
    //     }
    //     else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

 
    for(int i=n; i<=1; i--){
      for(int j=1; j<=2*(i-1); j++){
        System.out.print(" *");
      }
      for(int j =1; j<=n-i; j++){
        if(j<=2|| i==1|| i==n|| i/2!=0)
        System.out.print("*");
      }
    }
System.out.println();
   
 }
}