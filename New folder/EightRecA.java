// import bank.ccount;
public class EightRecA{ 

    // public static void printPer(String str, String per){
    //     if(str.length()==0){
    //         System.out.println(per);
    //         return;
    //     }
    //     for(int i=0; i<str.length(); i++){
    //         char currChar = str.charAt(i);

    //         String newStr =str.substring(0, i) + str.substring(i+1);
    //         printPer(newStr, per+currChar);
    //     }
    // }

    // public static int countPath(int i, int j, int m, int n){
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }
    //     if(i==n || j==m){
    //         return 0;
    //     }
    //     // for down
    //   int down =  countPath(i+1, j, m, n);

    //     // for right
    //    int right= countPath(i, j+1, m, n);

    //    return down +right;
    // }

    // public static int placeTiles(int n, int m){
    //     if(n<m){
    //         return 1;
    //     }
    //     if(n==2 && m==2){
    //         return 2;
    //     }
    //     // for vertical
    //    int vertical= placeTiles(n-m, m);

    //     // for Horijontal
    //     int Horijontal = placeTiles(n-1, m);

    //     return vertical + Horijontal;
    // }

    public static int guestCall(int n){
        if(n<=1){
            return 1;
        }
        int way1 =guestCall(n-1);

        int way2 =(n-1)*guestCall(n-2);
        return way1 +way2;
    }
    public static void main(String args []){
        // System.out.println("this is ");
        // printPer("abc", "");
        // System.out.println(countPath(0, 0, 3, 3));
        // System.out.println(placeTiles(3, 2));
        // System.out.println(guestCall(4));
    }
}