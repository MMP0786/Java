public class sorting {
    // bubbleSort
        public static void bubuleSort(int arr []){
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-i-1; j++){
                    if(arr[j]>arr[j+1]){
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    
                }
            }
            printArr(arr);
        }

        // selection sort
        public static void selectionSort(int arr []){
            for(int i=0; i<arr.length; i++){
                int smallest =i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[smallest]<arr[j]){
                        smallest = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
            printArr(arr);
        }

        // insertion sort

        public static void insertionSort(int arr []){

            for(int i=1; i<arr.length; i++){
                int curr = arr[i];
                int j =i-1;
                while(j>=0 && curr < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = curr;
            }
        printArr(arr);
        }


//    iterating the arr
    public static void printArr(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // mergeSort
   public static void conquer(int arr[], int si, int mid, int end){
    int newArr [] = new int[end-si +1];

    int idx1 = si;
    int idx2 = mid+1;
    int x=0;
    while(idx1<=mid && idx2<=end){
        if(arr[idx1]<=arr[idx2]){
            newArr[x++] =arr[idx1++];
        }else{
            newArr[x++] =arr[idx2++];
        }
    }
    while(idx1<=mid){
            newArr[x++] =arr[idx1++];
    }
    while(idx2<=end){
            newArr[x++] =arr[idx2++];
    }

    for(int i=0, j=si; i<newArr.length-1; i++, j++){
        arr[j] = newArr[i];
    }

   }
    
   
    public static void divide(int arr [], int si, int end){
        if(si>=end){
            return;
        }
        int mid = si+ (end-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, end);
        conquer(arr, si, mid, end);
    }


    // QuickSort
    public static int partision(int arr[], int low, int high){
        int piviot = arr[high];
        int i= low-1;

        for(int j=low; j<high; j++){
            if(arr[j]< piviot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = piviot;
        arr[high]= temp;

        return i;
    }

    public static void QuickSort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int pIdx = partision(arr, low, high);
        QuickSort(arr, low, pIdx-1);
        QuickSort(arr, pIdx+1, high);
    }
    public static void main(String args[]){
        int arr [] ={2, 1, 4, 0, 10, 3, 7,8};
        printArr(arr);

        System.out.println();

        // bubuleSort(arr);
        // selectionSort(arr);
        // System.out.println();
        // insertionSort(arr);

        // divide(arr, 0, arr.length-1);
        // printArr(arr);

        System.out.println("QuickSort");
        QuickSort(arr, 0, arr.length-1);
        printArr(arr);
    
    }
}
