public class Recursion{
    public static void PrintNo(int i,int n, int sum ){
        if(i==6){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum =+i;
        // System.out.println(sum);
        PrintNo(i+1, 5, 0);
        // System.out.println(n);
    }
    // public static void PrintNo(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     PrintNo(n+1);
    //     System.out.println(n);
    // }
    public static void main(String args[]){

        PrintNo(1, 4, 0);
    }
}