public class BitManuplation {
    public static void main(String args[]){
        int n =6; //1100
        int pos =2;
        int bitmask =1<<pos;
        int notBitMask = ~bitmask;

        // if((bitmask & n) ==0){
        //     System.out.println(" zero at positon");
        // }else{
        //     System.out.println(" one at positon");

        // }

            // set action
            int newBit = bitmask | n;
            System.out.println(newBit);
            int newNumber = notBitMask & n;
            // System.out.println(newNumber);
    }
    
}
