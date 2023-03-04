public class Recursion {
    public static void PrintNo(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }
        // int new_fact = n
        fact *= n;
        PrintNo(n - 1, fact);
        
    }

    // public static void PrintNo(int i, int sum, int n ){
    // if(i==n){
    // sum+=i;
    // System.out.println(sum);
    // return;
    // }
    // sum+=i;
    // // System.out.println(sum);
    // PrintNo(i+1, sum, n);
    // }
    // public static void PrintNo(int n){
    // if(n==6){
    // return;
    // }
    // System.out.println(n);
    // PrintNo(n+1);
    // System.out.println(n);
    // }
    public static void main(String args[]) {

        PrintNo(5, 1);
    }
}