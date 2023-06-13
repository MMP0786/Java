public class QueueImp{
    static class Queue{
        static int size;
        static int rear=-1;
        static int arr[];

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear ==-1;
        }


        // EnQueue
        public static void Add(int data){
            if(rear== size-1){
                System.out.println("Queue is full");
                return;
            }
            
            rear++;
            arr[rear] = data;

        }

        // Dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];

            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(5);

        q.Add(10);
        q.Add(12);
       System.out.println( q.remove());
    }
}