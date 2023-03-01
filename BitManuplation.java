public class BitManuplation {
    public static void main(String args[]){
        int n =5; //0101
        int pos =0;
        int bitmask =1<<pos;
        int notBitMask = ~bitmask;

        int newNum = notBitMask & n;
        System.out.println(newNum);

        // if((bitmask & n) ==0){
        //     System.out.println(" zero at positon");
        // }else{
        //     System.out.println(" one at positon");

        // }

            // set action
            // int newBit = bitmask | n;
            // System.out.println(newBit);

            // clear action
            int newNumber = notBitMask & n;
            // System.out.println(newNumber);
    }
    
}
