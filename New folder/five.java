public class five {
    public static void main(String [] args){
        // int a = 6;
        // byte b = 011;
        // int pos = 2; //0000
        // int bit= 1<<pos;
        // int c =  ~bit | a;
        // System.out.println(c);

        name(5);
    }
    public static void name(int n) {
        // int sum =0;
        if(n==0){
            return;
        }
        System.out.println(n);
        // sum +=n;
        name(n-1);
    }
}
