public class QuickSort {

    public static int partition(int arr [], int low, int high){
        int pivot =arr[high];
        int i= low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;

                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;

            }
        }
        i++;
        int temp= arr[i];
        arr[i]= arr[high];
        arr[high]= temp;
        return i;

    }

    public static void QuickSort1(int arr [], int low, int high){
        if(low<high){
            int pidx = partition(arr, low, high);
            QuickSort1(arr, low, pidx-1);
            QuickSort1(arr, pidx+1, high);
        }    
    }
    public static void main(String args []){
        int num []= {12, 34, 23,9,30};
        int hi =num.length-1;

        QuickSort1(num, 0, hi);

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
    
}
