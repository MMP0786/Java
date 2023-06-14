public class QueueWithCir {
   static class Queue{
        static int size;
        static int arr[];
        static int front= -1;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        
        public static boolean isEmpty(){
            return rear ==-1 && front ==-1;
        }

        public static boolean isFull(){
            if(front == rear+1){
                return true;
            }
            return false;
        }

        // Add Queue
        public static void Add(int data){
            if(isFull()){
                return;
            }
            rear = (rear+1)%size;
            arr[rear]= data;
            return;
        }

        // Remove in Queue

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];
            // for single node
            if(front == rear){
                rear = front =-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
    }
    public static void Main(String args[]){

        
    }
}
