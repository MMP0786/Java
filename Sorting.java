public class Sorting {
    public static void main( String args[]){


        // bubble sort
int number[] = {8, 7, 4, 9, 1,10};
        // for(int i=0; i<number.length-1; i++){
        //     for(int j=0; j<number.length-1-i; j++){
        //         if(number[j]> number[j+1]){
        //             int temp = number[j];
        //             number[j] =number[j+1];
        //             number[j+1]= temp;
        //         }

        //     }
        // }

        // insertion Short
        for(int i=0; i<number.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<number.length; j++){
                if(number[smallest] > number[j]){
                    smallest =j;

                }
                // swap
            }
            int temp = number[smallest];
            number[smallest]= number[i];
            number[i]= temp;
        }


        for(int i=0; i<number.length; i++){

            System.out.println(number[i]);
        }
    }
}