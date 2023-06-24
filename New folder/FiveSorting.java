public class FiveSorting {
    public static void bubbleSort(int arr []){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                
                    // swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        // printArr(arr);
    }

    public static void printArr(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int arr []){
        for(int i=0; i<arr.length; i++){
            int smallest =i;
            for(int j=i; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i] = temp;
        }
    }
   
    public static void insertionSort(int arr []){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int j= i-1;

            while(j>=0 && curr< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    public static int partision(int arr [], int low, int high){
      int i= low-1;
      int piviot = arr[high];

      for(int j=low; j<high; j++){
        if(arr[j]<piviot){
            i++;
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
    }
    i++;
    int temp = arr[high];
    arr[high]= arr[i];
    arr[i]= temp;
    
    return i;
    }
    public static void QuickSort(int arr [], int low, int high){
        if(low>=high){
            return;
        }
        int pIdx = partision(arr, low, high);
        QuickSort(arr, low, pIdx-1);
        QuickSort(arr, pIdx+1, high);
    }
   
    public static void conquer(int arr[], int start, int mid, int end){
        int idx1 = start;
        int idx2 = mid+1;
        int x=0;
        int merged [] = new int[end-start+1];

        while(idx1<mid && idx2 <end){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2<=end){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=start; j<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
   public static void divide(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid, end);
   }
    public static void main(String args []){
        int arr [] = {1, 5, 2, 3, 6, 0, 4, 8, 9};
        int n= arr.length;
        printArr(arr);
        System.out.println();
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // QuickSort(arr, 0,  arr.length-1);
        divide(arr, 0, n-1);
        printArr(arr);
    }
    
}
