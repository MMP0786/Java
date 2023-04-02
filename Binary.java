public class Binary {
    public static void main(String[] args) {
        int arr []= {2, 4, 5, 41, 110};
        System.out.println(Binary(arr, 41));
        System.out.println("dlsljdls");
    }
    public static int Binary(int arr[], int a){
      int start =0;
      int end = arr.length-1;

      while(start<=end){
        int mid = start +(end-start)/2;

        if(arr[mid]==a){
            return mid;
        }

        if(arr[mid]<a){
            start= mid+1;
        }else{
            end = mid-1;
        }
      }
      return -1;
    }
}
