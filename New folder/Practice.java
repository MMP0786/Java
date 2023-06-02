public class Practice {
    public static void main(String args[]){
        int num []= {12, 34, 23,9,30};

        for(int i=1; i<num.length; i++){
            int j= i-1;
            int current =num[i];
            while(j>=0 && current <num[j]){
                num[j+1]= num[j];
                j--; 
            // int smallest =i;
            // for(int j=i+1; j<num.length; j++){


                // if(num[smallest]>num[j]){
                //     smallest =j;
                // }
                // if(num[j]>num[j+1]){
                    // int temp = num[j];
                    // num[j] = num[j+1];
                    // num[j+1]= temp;
                    // }
                }
                int temp = current;
                current = num[j+1];
                num[j+1]= temp;
        }
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
