// public class Recursion {

// // fabacci series

//     public static void fabacci(int n, int a, int b){
//         if(n==0){
//             return ;
//         }
//         // System.out.println(a);
//         int c = a+b;
//         System.out.println(a);
//         fabacci(n-1, b, c);

//     }
// // With log n complaxcity

//     public static int PowerFn(int x, int n){
//         if(x==0){
//             return 0;
//         }
//         if(n==0){
//             return 1;
//         }
//     if(n%2==0){
//         return PowerFn(x, n/2) * PowerFn(x, n/2);
//         // return new_x;
//     }else{
//        return PowerFn(x, n/2) * PowerFn(x, n/2)*;
//         // return new_x;

//     }

//     }

// //  with O(n) complaxcity

//     // public static int PowerFn(int x, int n){
//     //     if(x==0){
//     //         return 0;
//     //     }
//     //     if(n==0){
//     //         return 1;
//     //     }
//     //     // System.out.println(x);
//     //     int new_x = PowerFn(x, n-1);
//     //     new_x = x*new_x;
//     //     return new_x;

//     // }

//     // public static void PrintNo(int n, int fact) {
//     //     if (n == 0) {
//     //         System.out.println(fact);
//     //         return;
//     //     }
//     //     // int new_fact = n
//     //     fact *= n;
//     //     PrintNo(n - 1, fact);
        
//     // }

//     // public static void PrintNo(int i, int sum, int n ){
//     // if(i==n){
//     // sum+=i;
//     // System.out.println(sum);
//     // return;
//     // }
//     // sum+=i;
//     // // System.out.println(sum);
//     // PrintNo(i+1, sum, n);
//     // }
//     // public static void PrintNo(int n){
//     // if(n==6){
//     // return;
//     // }
//     // System.out.println(n);
//     // PrintNo(n+1);
//     // System.out.println(n);
//     // }
//     public static void main(String args[]) {

//         // System.out.println(PowerFn(2, 5));
//     //   fabacci(7, 0, 1);
//         // System.out.println(outPut);
//         // PrintNo(5, 1);
//     }
// }