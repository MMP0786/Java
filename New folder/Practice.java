public class Practice {
    public static void Conquire(int [] num, int si, int end, int mid){
        int [] merged = new int[end-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x =0;

        while(idx1<=mid && idx2 <=end){
            if(num[idx1]< num[idx2]){
                merged[x++] = num[idx1++];
            }else{
                
                merged[x++] = num[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = num[idx1++];

        }
        while(idx2<= end){
            merged[x++] = num[idx2++];

        }
        for(int i=0, j= si; i<merged.length; i++, j++){
            num[j] =merged[i];
        }

    }
    public static void Divide(int [] num, int si, int end){
        if(si>=end){
            return;
        }
        int mid = si +(end -si)/2;
        Divide(num, si, mid);
        Divide(num, mid+1, end);
        Conquire(num, si, end,  mid);
    }
    public static void main(String args[]){
        int num []= {12, 34, 23,9,30};

        Divide(num, 0, num.length-2);
        // for(int i=1; i<num.length; i++){
        //     int j= i-1;
        //     int current =num[i];
        //     while(j>=0 && current <num[j]){
        //         num[j+1]= num[j];
        //         j--; 
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
                // }
        //         int temp = current;
        //         current = num[j+1];
        //         num[j+1]= temp;
        // }
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
