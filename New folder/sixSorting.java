public class sixSorting {
    public static void main(String args []){

        int num [] = {5, 4, 2, 7, 3};

        // Bubble Sort

        // int temp;
        // for(int i =0; i<num.length; i++){
        //     for(int j=0; j<num.length-i-1; j++){
        //         if(num[j]> num[j+1]){
        //             temp = num[j];
        //             num[j]= num[j+1];
        //             num[j+1]= temp;
        //         }
        //     }
        // }

        // Selecion Sort

        for(int i=0; i<num.length-1; i++ ){
            int smallest = i;
            for(int j=i+1; j<num.length; j++){
                if(num[smallest]> num[j]){
                    smallest =j;
                }
            }
            int temp = num[smallest];
            num[smallest]= num[i];
            num[i]= temp;

        }
        for(int i =0; i<num.length; i++){
            System.out.println(num[i] +" At Index : "+ i);
        }
    }
    
}
